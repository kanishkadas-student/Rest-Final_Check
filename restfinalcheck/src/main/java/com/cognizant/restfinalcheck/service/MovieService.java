package com.cognizant.restfinalcheck.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restfinalcheck.dao.MovieDao;
import com.cognizant.restfinalcheck.exception.MovieNotFoundException;
import com.cognizant.restfinalcheck.model.Movie;

@Service
public class MovieService {

	private static Logger LOGGER=LoggerFactory.getLogger(MovieService.class);
	
	@Autowired
	private MovieDao movieDao; 
	

	public List<Movie> getMovieListCustomer(){
		LOGGER.info("START: getMovieListCustomer()");
		LOGGER.info("END: getMovieListCustomer()");
		return movieDao.getMovieListCustomer();
	}

	public void modifyMovie(Movie movie) throws MovieNotFoundException {
		LOGGER.info("START: modifyMovie()");
		movieDao.modifyMovie(movie);
		LOGGER.info("END: modifyMovie()");
	}

	public Movie getMovie(long movieId) throws MovieNotFoundException {
		LOGGER.info("START: getMovie()");
		LOGGER.info("END: getMovie()");
		return movieDao.getMovie(movieId);
	}
}
