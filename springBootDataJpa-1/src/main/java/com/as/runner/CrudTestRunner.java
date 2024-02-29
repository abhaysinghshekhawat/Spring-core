package com.as.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.as.entity.Movie;
import com.as.services.IMovieMgmtService;

@Component
public class CrudTestRunner implements CommandLineRunner {

	@Autowired
	IMovieMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
		Movie m = new Movie();
		/*
		String[] movies = new String[] {"Deadshot"};
		List<Movie> list = new ArrayList<>();
		for(String movie : movies) {
			Movie util = new Movie();
			util.setMname(movie);
			util.setRating((int)Math.random()*5 + 1);
			util.setYear(String.valueOf(2000 + (int)Math.random()*20 + 1));
			list.add(util);
		} 
		m.setMid(1);
		List<Movie> res = service.registerMovies(list);
		long moviesCount = service.countMovies();
		System.out.println("moviesCount:: " + moviesCount);
		
		// get all the movies;
		List<Movie> movs = service.getAllMovies();
		System.out.println("all movies:: " + movs);
		*/
		// get movies with given id;
		Integer[] arrays = new Integer[] { 2,3,4,null};
		
		List<Movie> ms = service.findAllMoviesById(new ArrayList<>(Arrays.asList(arrays)));
		System.out.println("movides for the given id:: " + ms);
		
		/*
		m = service.updateMovie(103, "Gadar", null, 5);
		System.out.println("updated movie: " + m);
		*/
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
