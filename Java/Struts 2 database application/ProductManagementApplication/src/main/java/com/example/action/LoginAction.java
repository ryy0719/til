package com.example.action;

import org.apache.struts2.ServltetActionContext;

public class LoginAction extends ActionSupport {

    String userName;
    String password;

    public String execute() {
        String statusCode = "";
        boolean isUserValid = LoginDAO.isUserValid(new LoginInfo(userName, password));
        ServletActionContext.getRequest().getSession().setAttribute("loggedinUser", userName);
      		if (isUserValid) {
  			statusCode = "success";
  		} else {
  			statusCode = "input";
  		}
  		return statusCode;
  	}

  	public String getUserName() {
  		return userName;
  	}
  
  	public void setUserName(String userName) {
  		this.userName = userName;
  	}
  
  	public String getPassword() {
  		return password;
  	}
  
  	public void setPassword(String password) {
  		this.password = password;
  	}
}
