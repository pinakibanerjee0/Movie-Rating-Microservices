package com.pinaki.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinaki.rating.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{

	//custom method
	List<Rating> findByUserId(String uId);
	List<Rating> findByMovieId(String mId);

}
