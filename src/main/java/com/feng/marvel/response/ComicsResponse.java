package com.feng.marvel.response;

public class ComicsResponse {
	
	private String copyright;
	private String attributionHTML;
	
	private DataResponse data;

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getAttributionHTML() {
		return attributionHTML;
	}

	public void setAttributionHTML(String attributionHTML) {
		this.attributionHTML = attributionHTML;
	}

	public DataResponse getData() {
		return data;
	}

	public void setData(DataResponse data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ComicsResponse [copyright=" + copyright + ", attributionHTML=" + attributionHTML + ", data=" + data
				+ "]";
	}

	
	
	
	
}
