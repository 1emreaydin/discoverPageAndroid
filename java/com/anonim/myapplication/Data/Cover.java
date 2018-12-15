package com.anonim.myapplication.Data;

import com.google.gson.annotations.SerializedName;

public class Cover{

	@SerializedName("thumbnail")
	private Thumbnail thumbnail;

	@SerializedName("width")
	private int width;

	@SerializedName("medium")
	private Medium medium;

	@SerializedName("url")
	private String url;

	@SerializedName("height")
	private int height;

	public void setThumbnail(Thumbnail thumbnail){
		this.thumbnail = thumbnail;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setMedium(Medium medium){
		this.medium = medium;
	}

	public Medium getMedium(){
		return medium;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Cover{" + 
			"thumbnail = '" + thumbnail + '\'' + 
			",width = '" + width + '\'' + 
			",medium = '" + medium + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}