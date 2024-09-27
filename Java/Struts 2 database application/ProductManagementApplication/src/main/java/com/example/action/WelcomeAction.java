package com.eexample.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.example.dao.ProductManagementDAO;
import com.example.pojo.Product;
import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

    private List<Product> products;
    private String name;
    private String category;
    private Date createdDate;

    public void initializeProducts() {
        String createdDateStr = "";
        if (createdDate != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");
            createdDateStr = formatter.format(createdDate);
        }

        products = ProductManagementDAO.getAllProducts(name, category, createdDateStr);
    }

  	public String execute() {
  		initializeProducts();
  		return "success";
  	}
  
  	public List<Product> getProducts() {
  		return products;
  	}
  
  	public void setProducts(List<Product> products) {
  		this.products = products;
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
  
  	public Date getCreatedDate() {
  		return createdDate;
  	}
  
  	public void setCreatedDate(Date createdDate) {
  		this.createdDate = createdDate;
  	}
}
