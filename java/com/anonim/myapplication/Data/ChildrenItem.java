package com.anonim.myapplication.Data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChildrenItem{

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("children")
	private List<Object> children;

	@SerializedName("parent_id")
	private int parentId;

	@SerializedName("name")
	private String name;

	@SerializedName("parent_category")
	private ParentCategory parentCategory;

	@SerializedName("logo")
	private Logo logo;

	@SerializedName("id")
	private int id;

	@SerializedName("order")
	private int order;

	public void setCover(Cover cover){
		this.cover = cover;
	}

	public Cover getCover(){
		return cover;
	}

	public void setChildren(List<Object> children){
		this.children = children;
	}

	public List<Object> getChildren(){
		return children;
	}

	public void setParentId(int parentId){
		this.parentId = parentId;
	}

	public int getParentId(){
		return parentId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setParentCategory(ParentCategory parentCategory){
		this.parentCategory = parentCategory;
	}

	public ParentCategory getParentCategory(){
		return parentCategory;
	}

	public void setLogo(Logo logo){
		this.logo = logo;
	}

	public Logo getLogo(){
		return logo;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setOrder(int order){
		this.order = order;
	}

	public int getOrder(){
		return order;
	}

	@Override
 	public String toString(){
		return 
			"ChildrenItem{" + 
			"cover = '" + cover + '\'' + 
			",children = '" + children + '\'' + 
			",parent_id = '" + parentId + '\'' + 
			",name = '" + name + '\'' + 
			",parent_category = '" + parentCategory + '\'' + 
			",logo = '" + logo + '\'' + 
			",id = '" + id + '\'' + 
			",order = '" + order + '\'' + 
			"}";
		}
}