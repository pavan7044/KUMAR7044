package com.niit.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Model.User;

@Repository("UserDAO")
public interface UserDAO {	
public void saveOrUpdate(User user);
	
	public User get(int userid);
	
	public User getUserByname(String name);
	
	public void delete(int userid);
	
	public List<User> list();
	
	public boolean isvaliduser(String user, String pass,boolean isAdmin);


}
