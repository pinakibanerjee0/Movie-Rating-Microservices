package com.pinaki.rating.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinaki.rating.entity.Rating;
import com.pinaki.rating.exception.ResourceNotFoundException;
import com.pinaki.rating.repository.RatingRepository;
import com.pinaki.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	private RatingRepository repo;

	@Override
	public Rating saveRating(Rating r) {
		r.setRId(UUID.randomUUID().toString());
		return repo.save(r);
	}

	@Override
	public Rating getRating(String rId) {
		return repo.findById(rId).orElseThrow(
				() -> new ResourceNotFoundException("Rating with given id " + rId + " is not found on server !!"));
	}

	@Override
	public List<Rating> getAllRating() {
		return repo.findAll();
	}

	@Override
	public Rating updateRatingDetails(Rating r) {
		return null;
	}

	@Override
	public String deleteRating(String rId) {
		try {
			repo.deleteById(rId);
			return "Rating Deleted Sucessfully";
		} catch (Exception e) {
			return "Rating Deletion Failed";
		}
		
	}

	@Override
	public List<Rating> getRatingByUserId(String uId) {
		return (List<Rating>)repo.findByUserId(uId);
	}

	@Override
	public List<Rating> getRatingByMovieId(String mId) {
		return (List<Rating>)repo.findByMovieId(mId);
	}

}
