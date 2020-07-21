package com.cognizant.restfinalcheck.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.restfinalcheck.exception.MovieNotFoundException;
import com.cognizant.restfinalcheck.model.Movie;

public class MovieDaoCollectionImpl implements MovieDao{

	private static List<Movie> movieList = new ArrayList<Movie>();
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieDaoCollectionImpl.class);
	
	@SuppressWarnings("unchecked")
	public MovieDaoCollectionImpl() {
		// TODO Auto-generated constructor stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("movie.xml");
		movieList = context.getBean("movies",ArrayList.class);
		LOGGER.info("Movie:{}",movieList);
	}
	

	@Override
	public List<Movie> getMovieListCustomer() {
		// TODO Auto-generated method stub
		return movieList;
	}

	@Override
	public void modifyMovie(Movie movie) throws MovieNotFoundException {

		LOGGER.info("Start: modifyMovie()");
		for(int i=0; i<movieList.size(); i++) {
			if(movieList.get(i).equals(movie)) {
				movieList.set(i, movie);
				break;
			}
		}
		LOGGER.info("End: modifyMovie()");
	}

	@Override
	public Movie getMovie(long movieId) throws MovieNotFoundException {
		
		LOGGER.info("Start: getMovie()");
		Movie movie =  null;
		for(int i=0; i<movieList.size(); i++) {
			if(movieList.get(i).getId() == movieId) {
				movie = movieList.get(i);
				break;
			}
		}
		LOGGER.info("End: getMovie()");
		return movie;
	}

}
