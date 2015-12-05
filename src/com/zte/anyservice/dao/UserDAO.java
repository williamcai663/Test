package com.zte.anyservice.dao;

import java.util.List;

import com.zte.anyservice.bean.User;

public interface UserDAO {
  public void save(User user);
  public void delete(int id);
  public void update(User user);
  public List queryAll();
  public User queryById(int id);
}
