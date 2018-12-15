package com.anonim.myapplication.Data;

import java.util.List;

public class PopularProductsItem{
	private int commentCount;
	private Object maxInstallment;
	private boolean isEditorChoice;
	private Object code;
	private String title;
	private int categoryId;
	private int price;
	private String definition;
	private int id;
	private int stock;
	private String slug;
	private boolean isLiked;
	private List<ImagesItem> images;
	private boolean isActive;
	private int likeCount;
	private boolean isNew;
	private boolean isOwner;
	private int oldPrice;
	private int cargoTime;
	private Object rejectReason;
	private String shareUrl;
	private String difference;
	private boolean isApproved;
	private int commissionRate;
	private Category category;
	private boolean isCargoFree;
	private int viewCount;

	public void setCommentCount(int commentCount){
		this.commentCount = commentCount;
	}

	public int getCommentCount(){
		return commentCount;
	}

	public void setMaxInstallment(Object maxInstallment){
		this.maxInstallment = maxInstallment;
	}

	public Object getMaxInstallment(){
		return maxInstallment;
	}

	public void setIsEditorChoice(boolean isEditorChoice){
		this.isEditorChoice = isEditorChoice;
	}

	public boolean isIsEditorChoice(){
		return isEditorChoice;
	}

	public void setCode(Object code){
		this.code = code;
	}

	public Object getCode(){
		return code;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setDefinition(String definition){
		this.definition = definition;
	}

	public String getDefinition(){
		return definition;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setStock(int stock){
		this.stock = stock;
	}

	public int getStock(){
		return stock;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setIsLiked(boolean isLiked){
		this.isLiked = isLiked;
	}

	public boolean isIsLiked(){
		return isLiked;
	}

	public void setImages(List<ImagesItem> images){
		this.images = images;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setLikeCount(int likeCount){
		this.likeCount = likeCount;
	}

	public int getLikeCount(){
		return likeCount;
	}

	public void setIsNew(boolean isNew){
		this.isNew = isNew;
	}

	public boolean isIsNew(){
		return isNew;
	}

	public void setIsOwner(boolean isOwner){
		this.isOwner = isOwner;
	}

	public boolean isIsOwner(){
		return isOwner;
	}

	public void setOldPrice(int oldPrice){
		this.oldPrice = oldPrice;
	}

	public int getOldPrice(){
		return oldPrice;
	}

	public void setCargoTime(int cargoTime){
		this.cargoTime = cargoTime;
	}

	public int getCargoTime(){
		return cargoTime;
	}

	public void setRejectReason(Object rejectReason){
		this.rejectReason = rejectReason;
	}

	public Object getRejectReason(){
		return rejectReason;
	}

	public void setShareUrl(String shareUrl){
		this.shareUrl = shareUrl;
	}

	public String getShareUrl(){
		return shareUrl;
	}

	public void setDifference(String difference){
		this.difference = difference;
	}

	public String getDifference(){
		return difference;
	}

	public void setIsApproved(boolean isApproved){
		this.isApproved = isApproved;
	}

	public boolean isIsApproved(){
		return isApproved;
	}

	public void setCommissionRate(int commissionRate){
		this.commissionRate = commissionRate;
	}

	public int getCommissionRate(){
		return commissionRate;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setIsCargoFree(boolean isCargoFree){
		this.isCargoFree = isCargoFree;
	}

	public boolean isIsCargoFree(){
		return isCargoFree;
	}

	public void setViewCount(int viewCount){
		this.viewCount = viewCount;
	}

	public int getViewCount(){
		return viewCount;
	}

	@Override
 	public String toString(){
		return 
			"PopularProductsItem{" + 
			"comment_count = '" + commentCount + '\'' + 
			",max_installment = '" + maxInstallment + '\'' + 
			",is_editor_choice = '" + isEditorChoice + '\'' + 
			",code = '" + code + '\'' + 
			",title = '" + title + '\'' + 
			",category_id = '" + categoryId + '\'' + 
			",price = '" + price + '\'' + 
			",definition = '" + definition + '\'' + 
			",id = '" + id + '\'' + 
			",stock = '" + stock + '\'' + 
			",slug = '" + slug + '\'' + 
			",is_liked = '" + isLiked + '\'' + 
			",images = '" + images + '\'' + 
			",is_active = '" + isActive + '\'' + 
			",like_count = '" + likeCount + '\'' + 
			",is_new = '" + isNew + '\'' + 
			",is_owner = '" + isOwner + '\'' + 
			",old_price = '" + oldPrice + '\'' + 
			",cargo_time = '" + cargoTime + '\'' + 
			",reject_reason = '" + rejectReason + '\'' + 
			",share_url = '" + shareUrl + '\'' + 
			",difference = '" + difference + '\'' + 
			",is_approved = '" + isApproved + '\'' + 
			",commission_rate = '" + commissionRate + '\'' + 
			",category = '" + category + '\'' + 
			",is_cargo_free = '" + isCargoFree + '\'' + 
			",view_count = '" + viewCount + '\'' + 
			"}";
		}
}