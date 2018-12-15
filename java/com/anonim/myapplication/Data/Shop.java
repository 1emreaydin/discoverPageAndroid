package com.anonim.myapplication.Data;

import com.google.gson.annotations.SerializedName;

public class Shop{

	@SerializedName("comment_count")
	private int commentCount;

	@SerializedName("is_editor_choice")
	private boolean isEditorChoice;

	@SerializedName("name_updateable")
	private boolean nameUpdateable;

	@SerializedName("product_count")
	private int productCount;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("vacation_mode")
	private int vacationMode;

	@SerializedName("follower_count")
	private int followerCount;

	@SerializedName("shop_payment_id")
	private int shopPaymentId;

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("shop_rate")
	private int shopRate;

	@SerializedName("share_url")
	private String shareUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("logo")
	private Logo logo;

	@SerializedName("definition")
	private String definition;

	@SerializedName("id")
	private int id;

	@SerializedName("is_following")
	private boolean isFollowing;

	@SerializedName("slug")
	private String slug;

	public void setCommentCount(int commentCount){
		this.commentCount = commentCount;
	}

	public int getCommentCount(){
		return commentCount;
	}

	public void setIsEditorChoice(boolean isEditorChoice){
		this.isEditorChoice = isEditorChoice;
	}

	public boolean isIsEditorChoice(){
		return isEditorChoice;
	}

	public void setNameUpdateable(boolean nameUpdateable){
		this.nameUpdateable = nameUpdateable;
	}

	public boolean isNameUpdateable(){
		return nameUpdateable;
	}

	public void setProductCount(int productCount){
		this.productCount = productCount;
	}

	public int getProductCount(){
		return productCount;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setVacationMode(int vacationMode){
		this.vacationMode = vacationMode;
	}

	public int getVacationMode(){
		return vacationMode;
	}

	public void setFollowerCount(int followerCount){
		this.followerCount = followerCount;
	}

	public int getFollowerCount(){
		return followerCount;
	}

	public void setShopPaymentId(int shopPaymentId){
		this.shopPaymentId = shopPaymentId;
	}

	public int getShopPaymentId(){
		return shopPaymentId;
	}

	public void setCover(Cover cover){
		this.cover = cover;
	}

	public Cover getCover(){
		return cover;
	}

	public void setShopRate(int shopRate){
		this.shopRate = shopRate;
	}

	public int getShopRate(){
		return shopRate;
	}

	public void setShareUrl(String shareUrl){
		this.shareUrl = shareUrl;
	}

	public String getShareUrl(){
		return shareUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setIsFollowing(boolean isFollowing){
		this.isFollowing = isFollowing;
	}

	public boolean isIsFollowing(){
		return isFollowing;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	@Override
 	public String toString(){
		return 
			"Shop{" + 
			"comment_count = '" + commentCount + '\'' + 
			",is_editor_choice = '" + isEditorChoice + '\'' + 
			",name_updateable = '" + nameUpdateable + '\'' + 
			",product_count = '" + productCount + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",vacation_mode = '" + vacationMode + '\'' + 
			",follower_count = '" + followerCount + '\'' + 
			",shop_payment_id = '" + shopPaymentId + '\'' + 
			",cover = '" + cover + '\'' + 
			",shop_rate = '" + shopRate + '\'' + 
			",share_url = '" + shareUrl + '\'' + 
			",name = '" + name + '\'' + 
			",logo = '" + logo + '\'' + 
			",definition = '" + definition + '\'' + 
			",id = '" + id + '\'' + 
			",is_following = '" + isFollowing + '\'' + 
			",slug = '" + slug + '\'' + 
			"}";
		}
}