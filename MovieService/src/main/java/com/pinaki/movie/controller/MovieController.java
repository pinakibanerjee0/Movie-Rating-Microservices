package com.pinaki.movie.controller;

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

import com.pinaki.movie.entity.Movie;
import com.pinaki.movie.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@PostMapping("/createMovie")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie m){
		return new ResponseEntity<>(service.saveMovie(m), HttpStatus.OK);		
	}
	
	@GetMapping("/{mId}")
	public  ResponseEntity<Movie> getMovie(@PathVariable String mId){
		return new ResponseEntity<>(service.getMovie(mId),HttpStatus.OK);
	}
	@GetMapping("/geAllMovieList")
	public  ResponseEntity<List<Movie>> getAllMovies(){
		return new ResponseEntity<>(service.getAllMovie(),HttpStatus.OK);

	}

}
