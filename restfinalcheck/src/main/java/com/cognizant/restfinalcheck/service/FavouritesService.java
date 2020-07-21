package com.cognizant.restfinalcheck.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restfinalcheck.dao.FavouritesDao;
import com.cognizant.restfinalcheck.exception.MovieNotFoundException;
import com.cognizant.restfinalcheck.model.Movie;

@Service
public class FavouritesService {

private static Logger LOGGER=LoggerFactory.getLogger(FavouritesService.class);
	
	@Autowired
	private FavouritesDao favDao;
	
	public void addToFavourites(String userid, long movieId) throws MovieNotFoundException {
		LOGGER.info("START: addToFavourites()");
		favDao.addToFavourites(userid, movieId);
		LOGGER.info("END: addToFavourites()");
	}
	
	public List<Movie> getAllFavouritesMovies(String userid) {
		LOGGER.info("START: getAllFavouritesMovies()");
		LOGGER.info("END: getAllFavouritesMovies()");
		return favDao.getAllFavouritesMovies(userid);
	}
	
	public void removeFromFavourites(String userid, long movieId) throws MovieNotFoundException {
		LOGGER.info("START: removeFromFavourites()");
		favDao.removeFromFavourites(userid, movieId);
		LOGGER.info("END: removeFromFavourites()");
	}
	
	public long gettotalFavourites(String userid) {
		LOGGER.info("START: gettotalFavourites()");
		LOGGER.info("END: gettotalFavourites()");
		return favDao.gettotalFavourites(userid);
	}
}
