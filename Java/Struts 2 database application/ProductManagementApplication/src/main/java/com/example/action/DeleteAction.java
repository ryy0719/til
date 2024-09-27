package com.example.action;

import com.example.dao.ProductManagementDAO;

public class DeleteAction extends ActionSupport {

    String id;

    public String execute() {
        String statusCode = "";
        int recordDeleted = ProductManagementDAO.deleteProduct(id);
        if (recordDeleted == 1) {
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
}
