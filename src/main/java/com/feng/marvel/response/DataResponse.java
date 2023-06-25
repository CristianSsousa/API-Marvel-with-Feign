package com.feng.marvel.response;

import java.util.List;

public class DataResponse {
	
	private List<ResultsResponse> results;

	public List<ResultsResponse> getResults() {
		return results;
	}

	public void setResults(List<ResultsResponse> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "DataResponse [results=" + results + "]";
	}
	
	
	
	
	
}
