package com.as.repository;

import org.springframework.data.repository.CrudRepository;

import com.as.entity.Movie;

public interface IMovieRepository extends CrudRepository<Movie, Integer> {

}
