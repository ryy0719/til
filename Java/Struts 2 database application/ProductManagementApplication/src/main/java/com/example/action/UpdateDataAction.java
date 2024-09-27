package com.example.action;

import com.example.dao.ProductManagementDAO;
import com.example.pojo.Product;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateDataAction extends ActionSupport {

    private String id;
    private String name;
    private String category;
    private Integer price;
    private String createdDate;

    public String execute() {
        Product product = ProductManagementDAO.getProdctById(id);
    		id = product.getId();
    		name = product.getName();
    		category = product.getCategory();
    		price = product.getPrice();
    		createdDate = product.getCreatedDate();
    		return "success";
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
}
