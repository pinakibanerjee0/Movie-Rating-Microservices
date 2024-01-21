package com.pinaki.user.service.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pinaki.user.service.entities.Movie;

@FeignClient(name = "MOVIE-SERVICE")
public interface MovieService {
	
	@GetMapping("/movie/{mId}")
	Movie getMovieById(@PathVariable String mId);
}
