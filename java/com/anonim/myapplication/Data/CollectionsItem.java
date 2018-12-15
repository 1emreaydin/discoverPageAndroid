package com.anonim.myapplication.Data;

import com.google.gson.annotations.SerializedName;

public class CollectionsItem{

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("share_url")
	private String shareUrl;

	@SerializedName("start")
	private String start;

	@SerializedName("logo")
	private Logo logo;

	@SerializedName("definition")
	private String definition;

	@SerializedName("end")
	private Object end;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public void setCover(Cover cover){
		this.cover = cover;
	}

	public Cover getCover(){
		return cover;
	}

	public void setShareUrl(String shareUrl){
		this.shareUrl = shareUrl;
	}

	public String getShareUrl(){
		return shareUrl;
	}

	public void setStart(String start){
		this.start = start;
	}

	public String getStart(){
		return start;
	}

	public void setLogo(Logo logo){
		this.logo = logo;
	}

	public Logo getLogo(){
		return logo;
	}

	public void setDefinition(String definition){
		this.definition = definition;
	}

	public String getDefinition(){
		return definition;
	}

	public void setEnd(Object end){
		this.end = end;
	}

	public Object getEnd(){
		return end;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
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
			"CollectionsItem{" + 
			"cover = '" + cover + '\'' + 
			",share_url = '" + shareUrl + '\'' + 
			",start = '" + start + '\'' + 
			",logo = '" + logo + '\'' + 
			",definition = '" + definition + '\'' + 
			",end = '" + end + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}