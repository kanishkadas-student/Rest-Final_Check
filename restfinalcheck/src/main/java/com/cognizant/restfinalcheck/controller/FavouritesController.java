package com.cognizant.restfinalcheck.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.restfinalcheck.exception.MovieNotFoundException;
import com.cognizant.restfinalcheck.model.Movie;
import com.cognizant.restfinalcheck.service.FavouritesService;

@RestController
@RequestMapping("/favourites")
public class FavouritesController {

private static Logger LOGGER=LoggerFactory.getLogger(FavouritesController.class);
	
	@Autowired
	private FavouritesService favouritesService;
	
	@PostMapping("/{userId}/{movieId}")
	public void addToFavourites(@PathVariable String userId, @PathVariable long movieId) throws MovieNotFoundException {
		LOGGER.info("START: addToFavourites()");
		favouritesService.addToFavourites(userId, movieId);
		LOGGER.info("END: addToFavourites()");
	}
	
	@GetMapping("/{userId}")
	public List<Movie> getAllFavouritesMovies(@PathVariable String userId) {
		LOGGER.info("START: getAllFavouritesMovies()");
		LOGGER.info("END: getAllFavouritesMovies()");
		return favouritesService.getAllFavouritesMovies(userId);
	}
	
	@DeleteMapping("/{userId}/{movieId}")
	public void removeFromFavourites(@PathVariable String userId, @PathVariable long movieId) throws MovieNotFoundException {
		LOGGER.info("START: removeFromFavourites()");
		favouritesService.removeFromFavourites(userId, movieId);
		LOGGER.info("END: removeFromFavourites()");
	}
	
	@GetMapping("/favlist/{userId}")
	public long gettotalFavourites(@PathVariable String userId) {
		LOGGER.info("START: gettotalFavourites()");
		LOGGER.info("END: gettotalFavourites()");
		return favouritesService.gettotalFavourites(userId);
	}
}
