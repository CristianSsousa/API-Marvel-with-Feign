package com.feng.marvel.responses;

import java.util.List;

public class ResultsResponse {
	private int id;
	private String name;
	
	private ThumbnailsResponse thumbnail;
	
	private comicsResponse comics;

	private seriesResponse series;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ThumbnailsResponse getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(ThumbnailsResponse thumbnail) {
		this.thumbnail = thumbnail;
	}

	public comicsResponse getComics() {
		return comics;
	}

	public void setComics(comicsResponse comics) {
		this.comics = comics;
	}

	public seriesResponse getSeries() {
		return series;
	}

	public void setSeries(seriesResponse series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "ResultsResponse [id=" + id + ", name=" + name + ", thumbnail=" + thumbnail + ", comics=" + comics
				+ ", series=" + series + "]";
	}
	
	
	
	
	
	
	
	
	
}
