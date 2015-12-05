package com.zte.anyservice.service;

import java.util.List;

import com.zte.anyservice.bean.User;

public interface UserService {
	public void save(User user);
	  public void delete(int id);
	  public void update(User user);
	  public List<User> queryAll();
	  public User queryById(int id);
}
