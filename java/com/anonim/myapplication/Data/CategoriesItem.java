package com.anonim.myapplication.Data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoriesItem{

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("children")
	private List<ChildrenItem> children;

	@SerializedName("parent_id")
	private Object parentId;

	@SerializedName("name")
	private String name;

	@SerializedName("parent_category")
	private Object parentCategory;

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

	public void setChildren(List<ChildrenItem> children){
		this.children = children;
	}

	public List<ChildrenItem> getChildren(){
		return children;
	}

	public void setParentId(Object parentId){
		this.parentId = parentId;
	}

	public Object getParentId(){
		return parentId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setParentCategory(Object parentCategory){
		this.parentCategory = parentCategory;
	}

	public Object getParentCategory(){
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
			"CategoriesItem{" + 
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