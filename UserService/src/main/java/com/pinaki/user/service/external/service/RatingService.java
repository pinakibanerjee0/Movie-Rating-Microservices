package com.pinaki.user.service.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pinaki.user.service.entities.Rating;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
	@GetMapping("/rating/getRatingByUserId/{uId}")
	List<Rating> getRatingByUserId(@PathVariable String uId);
}
