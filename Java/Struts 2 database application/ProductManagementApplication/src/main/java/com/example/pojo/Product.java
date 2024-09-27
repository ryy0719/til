package com.example.pojo;

public class Product {

	private String id;
	private String name;
	private String category;
	private Integer price;
	private String createdDate;

	public Product() {
		// @TODO Auto-generated constructor stub
	}

	public Product(String id, String name, String category, Integer price, String createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.createdDate = createdDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category"
	            + category + ", price=" + price + ", createdDate" + createdDate + "]";
	}
}
