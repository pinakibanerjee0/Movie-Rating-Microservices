package com.pinaki.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinaki.rating.entity.Rating;
import com.pinaki.rating.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService service;

	@PostMapping("/createRating")
	public ResponseEntity<Rating> createRating(@RequestBody Rating r) {
		return new ResponseEntity<>(service.saveRating(r), HttpStatus.CREATED);
	}

	@GetMapping("/{rId}")
	public ResponseEntity<Rating> getRating(@PathVariable String rId) {
		return new ResponseEntity<>(service.getRating(rId), HttpStatus.OK);
	}

	@GetMapping("/getRatingList")
	public ResponseEntity<List<Rating>> getAllRatings() {
		return new ResponseEntity<>(service.getAllRating(), HttpStatus.OK);

	}

	@GetMapping("/getRatingByUserId/{uId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String uId) {
		return new ResponseEntity<>(service.getRatingByUserId(uId), HttpStatus.OK);

	}

	@GetMapping("/getRatingByMovieId/{mId}")
	public ResponseEntity<List<Rating>> getRatingByMovieId(@PathVariable String mId) {
		return new ResponseEntity<>(service.getRatingByMovieId(mId), HttpStatus.OK);

	}
}
