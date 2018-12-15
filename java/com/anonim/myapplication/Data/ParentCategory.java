package com.anonim.myapplication.Data;

public class ParentCategory{
	private Object parentId;
	private String name;
	private Object parentCategory;
	private int id;
	private int order;

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
			"ParentCategory{" + 
			"parent_id = '" + parentId + '\'' + 
			",name = '" + name + '\'' + 
			",parent_category = '" + parentCategory + '\'' + 
			",id = '" + id + '\'' + 
			",order = '" + order + '\'' + 
			"}";
		}
}
