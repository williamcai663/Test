package com.zte.anyservice.service;

public class LoginCheck {
  public boolean check(String name,String pd){
	  if("cai".equals(name) && "123".equals(pd)){
		  return true;
	  }
	  return false;
  }
}
