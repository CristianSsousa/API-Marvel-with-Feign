package com.feng.marvel.response;

public class UrlsResponse {
	private String type;
	private String url;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "UrlsResponse [type=" + type + ", url=" + url + "]";
	}
	
	
	
}	
