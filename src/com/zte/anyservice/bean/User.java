package com.zte.anyservice.bean;

public class User {
  private int userid;
  private String username;
  private String password;
  private int age;
  private String email;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
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

public User(int id,String name,String pwd){
	 this.userid=id;
	 this.username=name;
	 this.password=pwd;
}
public User(){
	
}
}
