package com.feng.marvel.response;

import java.util.List;


public class ResultsResponse {
	private Long id;
	private String title;
	
	private List<UrlsResponse>urls;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<UrlsResponse> getUrls() {
		return urls;
	}

	public void setUrls(List<UrlsResponse> urls) {
		this.urls = urls;
	}

	@Override
	public String toString() {
		return "ResultsResponse [id=" + id + ", title=" + title + ", urls=" + urls + "]";
	}

	
}
