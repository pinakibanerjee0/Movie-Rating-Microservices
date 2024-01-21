package com.pinaki.rating.service;

import java.util.List;

import com.pinaki.rating.entity.Rating;

public interface RatingService {

	// Create
	Rating saveRating(Rating r);

	// Read
	Rating getRating(String rId);	
	List<Rating> getRatingByUserId(String uId);
	List<Rating> getRatingByMovieId(String mId);


	List<Rating> getAllRating();

	// Update
	Rating updateRatingDetails(Rating r);

	// Delete
	String deleteRating(String rId);

}
