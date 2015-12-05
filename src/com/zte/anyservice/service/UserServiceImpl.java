package com.zte.anyservice.service;

import java.util.List;

import com.zte.anyservice.bean.User;
import com.zte.anyservice.dao.UserDAO;


public class UserServiceImpl implements UserService {

	private UserDAO dao;
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
		dao.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		dao.delete(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
		dao.update(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		
		return dao.queryAll();
		
	}

	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		return dao.queryById(id);
	}

}
