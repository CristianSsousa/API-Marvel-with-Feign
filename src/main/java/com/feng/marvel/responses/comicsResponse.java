package com.feng.marvel.responses;

import java.util.List;

public class comicsResponse {
	private List<itemsReponse> items;

	public List<itemsReponse> getItems() {
		return items;
	}

	public void setItems(List<itemsReponse> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "comicsResponse [items=" + items + "]";
	}

	
	
	
}
