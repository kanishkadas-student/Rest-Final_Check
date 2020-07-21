package com.cognizant.restfinalcheck.dao;

import java.util.List;

import com.cognizant.restfinalcheck.exception.MovieNotFoundException;
import com.cognizant.restfinalcheck.model.Movie;

public interface MovieDao {

	public List<Movie> getMovieListCustomer();
	public void modifyMovie(Movie movie) throws MovieNotFoundException;
	public Movie getMovie(long movieId) throws MovieNotFoundException;
}
