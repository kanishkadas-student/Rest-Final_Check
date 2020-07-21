package com.cognizant.restfinalcheck.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.restfinalcheck.exception.MovieNotFoundException;
import com.cognizant.restfinalcheck.model.Favourites;
import com.cognizant.restfinalcheck.model.Movie;

public class FavouritesDaoCollectionImpl implements FavouritesDao {

	private static final Logger LOGGER= LoggerFactory.getLogger(FavouritesDaoCollectionImpl.class);
	private static Map<String, Favourites> favItems=new HashMap<String, Favourites>();
	
	@Override
	public void addToFavourites(String userid, long movieId) throws MovieNotFoundException {

		LOGGER.info("Start: addToFavourites()");
		
		MovieDao movieDao = new MovieDaoCollectionImpl();
		Movie movie = movieDao.getMovie(movieId);
		if(favItems.containsKey(userid)) {
			Favourites fav = favItems.get(userid);
			List<Movie> movieList = fav.getMovieList();
			movieList.add(movie);
			fav.setMovieList(movieList);
			fav.setTotalfavourites(fav.getTotalfavourites()+1);
			favItems.put(userid, fav);
		}else {
			Favourites fav = new Favourites();
			List<Movie> movieList = new ArrayList<Movie>();
			movieList.add(movie);
			fav.setMovieList(movieList);
			fav.setTotalfavourites(fav.getTotalfavourites());
			favItems.put(userid, fav);
		}
		LOGGER.info("End: addToFavourites()");
		
	}

	@Override
	public List<Movie> getAllFavouritesMovies(String userid) {
		
		LOGGER.info("START: getAllFavouritesMovies()");
		Favourites fav=favItems.get(userid);
		LOGGER.info("END: getAllFavouritesMovies()");
		return fav.getMovieList();
	}

	@Override
	public void removeFromFavourites(String userid, long movieId) throws MovieNotFoundException {
		LOGGER.info("START: removeFromFavourites()");
		MovieDao movieDao=new MovieDaoCollectionImpl();
		Movie movie=movieDao.getMovie(movieId);
		
		
		Favourites fav=favItems.get(userid);
		List<Movie> movieList=fav.getMovieList();
		movieList.remove(movie);
		fav.setMovieList(movieList);
		fav.setTotalfavourites(fav.getTotalfavourites()-1);
		favItems.put(userid, fav);
		LOGGER.info("END: removeFromFavourites()");
	}

	@Override
	public long gettotalFavourites(String userid) {
		LOGGER.info("START: gettotalFavourites()");
		Favourites fav=favItems.get(userid);
		LOGGER.info("START: gettotalFavourites()");
		return fav.getTotalfavourites();
	}

}
