package com.cognizant.restfinalcheck.model;

import java.util.Date;

public class Movie {

	private long id;
	private String title;
	private String boxOffice;
	private boolean active;
	private Date dateOfLaunch;
	private String genre;
	private Boolean hasTeaser;
	
	public Movie() {
		super();
	}

	public Movie(long id, String title, String boxOffice, boolean active, Date dateOfLaunch, String genre,
			Boolean hasTeaser) {
		super();
		this.id = id;
		this.title = title;
		this.boxOffice = boxOffice;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.genre = genre;
		this.hasTeaser = hasTeaser;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Boolean getHasTeaser() {
		return hasTeaser;
	}

	public void setHasTeaser(Boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}

	@Override
	public String toString() {
		return String.format("%-3d %-20s %-15s %-8b %-30s %-18s %-15b", id, title, boxOffice, active, dateOfLaunch,
				genre, hasTeaser);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Movie other = (Movie) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
}
