package com.internousdev.texas.dto;

public class MCategoryDTO {

	private int Id;
	private int categoryId;
	private String categoryName;
	private String categoryDescription;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
}
