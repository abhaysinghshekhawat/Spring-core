package com.as.services;

import java.util.List;

import com.as.entity.Movie;

public interface IMovieMgmtService {

	String registerMovie(Movie movie);
	List<Movie> registerMovies(List<Movie> movies);
	long countMovies();
	List<Movie> getAllMovies();
	List<Movie> findAllMoviesById(List<Integer> ids);
	Movie updateMovie(Integer mid, String mname, String year, Integer rating);
}
