package com.pinaki.user.service.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pinaki.user.service.entities.Rating;
import com.pinaki.user.service.entities.User;
import com.pinaki.user.service.exception.ResourceNotFoundException;
import com.pinaki.user.service.external.service.MovieService;
import com.pinaki.user.service.external.service.RatingService;
import com.pinaki.user.service.repsitories.UserRepositories;
import com.pinaki.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositories userRepo;

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private MovieService movieService;
	@Autowired
	private RatingService ratingService;

	@Override
	public User saveUser(User u) {
		u.setUid(UUID.randomUUID().toString());
		return userRepo.save(u);
	}

	@Override
	public User getUser(String uId) {

		User user = userRepo.findById(uId).orElseThrow(
				() -> new ResourceNotFoundException("User with given id " + uId + " is not found on server !!"));
		// String getRatingByUserId = "http://RATING-SERVICE/rating/getRatingByUserId/" + uId;
		// String getMovieById = "http://MOVIE-SERVICE/movie/";

		List<Rating> ratings = /* Arrays.stream( */
				ratingService.getRatingByUserId(uId)
				// restTemplate.getForObject(getRatingByUserId, Rating[].class)).toList()
				.stream().map(rating -> {
					// api call to Movie service to get the Movie
					rating.setMovie(movieService.getMovieById(rating.getMovieId())
					/* restTemplate.getForObject(getMovieById + rating.getMovieId(), Movie.class) */);
					// return rating
					return rating;
				}

				).collect(Collectors.toList());
		// ratings.get(0).setMovie(null);
		user.setRatings(ratings);

		return user;
	}

	@Override
	public List<User> getAllUser() {

		return userRepo.findAll();
	}

	@Override
	public User updateUserDetails(User u) {

		return null;
	}

	@Override
	public String deleteUser(String uId) {

		return null;
	}

}
