package com.niit.service;

import java.util.List;

import com.niit.model.User;

public interface UserServiceDAO {
	public List<User> list();

	public User get(int uid);

	public void saveOrUpdate(User user);

	public void delete(int uid);
	
	public User getUserByName(String uname);
	
    public boolean isvaliduser(String user, String pass);
	
}
