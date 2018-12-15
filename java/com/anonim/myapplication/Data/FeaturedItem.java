package com.anonim.myapplication.Data;

import com.google.gson.annotations.SerializedName;

public class FeaturedItem{

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("sub_title")
	private String subTitle;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	public void setCover(Cover cover){
		this.cover = cover;
	}

	public Cover getCover(){
		return cover;
	}

	public void setSubTitle(String subTitle){
		this.subTitle = subTitle;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"FeaturedItem{" + 
			"cover = '" + cover + '\'' + 
			",sub_title = '" + subTitle + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}