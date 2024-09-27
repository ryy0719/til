package com.example.action;

import java.text.SimpleDateFormat;

public class AddAction extends ActionSupport {

    String id;
    Sting name;
    String category;
    Integer price;

    public String execute() {
        String statusCode = "";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String createdDateStr = formatter.format(new Date());
        Product product = new Product(id, name, category, price, createdDateStr);
        int recordAdded = ProductManagementDAO.addProduct(product);
        if (recordAdded == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
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
}
