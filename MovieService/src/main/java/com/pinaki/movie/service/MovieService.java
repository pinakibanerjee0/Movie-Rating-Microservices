package com.pinaki.movie.service;

import java.util.List;

import com.pinaki.movie.entity.Movie;

public interface MovieService {
	// Create
	Movie saveMovie(Movie m);

	// Read
	Movie getMovie(String mId);

	List<Movie> getAllMovie();

	// Update
	Movie updateMovieDetails(Movie m);

	// Delete
	String deleteMovie(String mId);
}
