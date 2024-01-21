package com.pinaki.movie.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinaki.movie.entity.Movie;
import com.pinaki.movie.exception.ResourceNotFoundException;
import com.pinaki.movie.repositories.MovieRepositories;
import com.pinaki.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepositories movieRepo;

	@Override
	public Movie saveMovie(Movie m) {
		m.setMId(UUID.randomUUID().toString());
		return movieRepo.save(m);
	}

	@Override
	public Movie getMovie(String mId) {

		return movieRepo.findById(mId).orElseThrow(
				() -> new ResourceNotFoundException("Movie with given id " + mId + " is not found on server !!"));
	}

	@Override
	public List<Movie> getAllMovie() {
		return movieRepo.findAll();
	}

	@Override
	public Movie updateMovieDetails(Movie u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteMovie(String uId) {
		// TODO Auto-generated method stub
		return null;
	}

}
