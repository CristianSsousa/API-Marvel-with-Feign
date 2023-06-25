package com.feng.marvel.responses;

import java.util.List;

public class CharactersResponse {
	
	private String copyright;
	
	private String attributionText;

	
	private DataResponse data;


	public String getCopyright() {
		return copyright;
	}


	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}


	public String getAttributionText() {
		return attributionText;
	}


	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}


	public DataResponse getData() {
		return data;
	}


	public void setData(DataResponse data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "CharactersResponse [copyright=" + copyright + ", attributionText=" + attributionText + ", data=" + data
				+ "]";
	}

	 
   
	 
}
