package com.anonim.myapplication.Data;

public class Category{
	private int parentId;
	private String name;
	private ParentCategory parentCategory;
	private int id;
	private int order;

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
			"Category{" + 
			"parent_id = '" + parentId + '\'' + 
			",name = '" + name + '\'' + 
			",parent_category = '" + parentCategory + '\'' + 
			",id = '" + id + '\'' + 
			",order = '" + order + '\'' + 
			"}";
		}
}
