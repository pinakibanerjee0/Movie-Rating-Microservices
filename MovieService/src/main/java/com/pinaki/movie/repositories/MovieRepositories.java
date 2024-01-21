package com.pinaki.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinaki.movie.entity.Movie;

public interface MovieRepositories extends JpaRepository<Movie, String>{

}
