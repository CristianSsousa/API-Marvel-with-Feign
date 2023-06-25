package com.feng.marvel.responses;

import java.util.List;

public class seriesResponse {
	private List<itemsReponse> items;

	public List<itemsReponse> getItems() {
		return items;
	}

	public void setItems(List<itemsReponse> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "seriesResponse [items=" + items + "]";
	}
	
	
}
