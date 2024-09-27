package com.example.interceptors;

import org.apache.struts2.ServletActionContext;

import com.example.action.LoginAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() called");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init() called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		Object user = ServletActionContext.getRequest().getSession().getAttribute("loggedinUser");
		if (user == null) {
			// 実行しようとしているアクションがLoginActionかどうか判定
			if (ai.getAction().getClass().equals(LoginAction.class)) {
				// アクションを実行するメソッド
				return ai.invoke();
			}
			// ログインが必要なページにリダイレクト
			return "input";
		}
		return ai.invoke();
	}
}
