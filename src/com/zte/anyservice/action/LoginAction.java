package com.zte.anyservice.action;

import com.opensymphony.xwork2.Action;
import com.zte.anyservice.service.LoginCheck;

public class LoginAction implements Action{

	private String username;
	private String password;
	private LoginCheck lc;
	public void setLc(LoginCheck lc) {
		this.lc = lc;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String check(){
		if(lc.check(username, password)){
			return SUCCESS;
		}
		return INPUT;		
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
