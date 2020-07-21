package com.cognizant.restfinalcheck.dao;

import java.util.List;

import com.cognizant.restfinalcheck.exception.MovieNotFoundException;
import com.cognizant.restfinalcheck.model.Movie;

public interface FavouritesDao {

public void addToFavourites(String userid, long movieId) throws MovieNotFoundException;
	
	public List<Movie> getAllFavouritesMovies(String userid);
	
	public void removeFromFavourites(String userid, long movieId) throws MovieNotFoundException;
	
	public long gettotalFavourites(String userid);
}
