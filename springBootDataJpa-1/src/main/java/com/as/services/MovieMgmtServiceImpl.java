package com.as.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.entity.Movie;
import com.as.repository.IMovieRepository;

@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {

	@Autowired // injects the dynamically generated proxy class object
	private IMovieRepository repo;
	
	@Override
	public String registerMovie(Movie movie) {
		System.out.println("InMemoryProxyClassName:: " + repo.getClass().getName() + " Implementing interfaces:: "+ Arrays.toString(repo.getClass().getInterfaces()));
		System.out.println("movie object before saving to database:: " + movie);
		Movie m = repo.save(movie); // whatever comes after saving the object will comes with the ID value
		System.out.println("movie object after saving to database:: " + m);
		return "movie is registered with the id:: " + m.getMid();
	}

	@Override
	public List<Movie> registerMovies(List<Movie> movies) {
		// TODO Auto-generated method stub
		List<Movie> savedMovies = (List<Movie>)repo.saveAll(movies);
		System.out.println("movies saved succesfully");
		return savedMovies;
		//return null;
	}

	@Override
	public long countMovies() {
		// TODO Auto-generated method stub
		long res = repo.count();
		return  res;
	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return (List<Movie>)repo.findAll();
	}

	@Override
	public List<Movie> findAllMoviesById(List<Integer> ids) {
		// TODO Auto-generated method stub
		for(int i=0; i<ids.size(); i++) {
			if(ids.get(i) == null) {
				System.out.println("ids contains one or other value as null");
				return null;
			}
		}
		return (List<Movie>) repo.findAllById(ids);
	}

	@Override
	public Movie updateMovie(Integer mid, String mname, String year, Integer rating) {
		// TODO Auto-generated method stub
		Optional<Movie> opt = repo.findById(mid);
		if(opt.isPresent()) {
			Movie mv = opt.get();
			if(!"".equals(mname) && null != mname) mv.setMname(mname);
			if(!"".equals(year) && null != year) mv.setYear(year);
			if(null != rating) mv.setRating(rating);
			
			return repo.save(mv);
		}else {
			throw new IllegalArgumentException("id not found ");
		}
		//return null;
	}

	
}
