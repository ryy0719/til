package com.example.action;

import com.example.dao.ProductManagementDAO;
import com.example.pojo.Product;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAtion extends ActionSupport {

    private String id;
    private String name;
    private String category;
    private Integer price;

    public String execute() {
        String statusCode = "";
        Product product = new Product(id, name, category, price, null);
        int recordUpdated = ProductManagementDAO.updateProduct(product);
    		if (recordUpdated == 1) {
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
