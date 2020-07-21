package com.cognizant.restfinalcheck.model;

import java.util.List;

public class Favourites {

	private List<Movie> movieList;
	private long totalfavourites;
	
	public Favourites() {
		super();
	}

	public Favourites(List<Movie> movieList, long totalfavourites) {
		super();
		this.movieList = movieList;
		this.totalfavourites = totalfavourites;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	public long getTotalfavourites() {
		return totalfavourites;
	}

	public void setTotalfavourites(long totalfavourites) {
		this.totalfavourites = totalfavourites;
	}

	@Override
	public String toString() {
		return "Favourites [movieList=" + movieList + ", totalfavourites=" + totalfavourites + "]";
	}
}
