package com.feng.marvel.responses;

public class ThumbnailsResponse {
	private String path;
	private String extension;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	@Override
	public String toString() {
		return "ThumbnailsResponse [path=" + path + ", extension=" + extension + "]";
	}

	
	
	
	
}
