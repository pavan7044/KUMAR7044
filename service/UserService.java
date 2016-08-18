package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.UserDAO;
import com.niit.model.User;



@Service
public class UserService implements UserServiceDAO {

	
	@Autowired
	UserDAO	userDAO;
	
	 public boolean isvaliduser(String user,String pass)
	 {
		 System.out.println("Welcome to pavan motors");
		 return userDAO.isvaliduser(user, pass);
		 
	 }
	public void saveOrUpdate(User user)
	{
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	public User get(int uid)
	{
		return userDAO.get(uid);
	}
	
	public void delete(int uid)
	{
		userDAO.delete(uid);
	}
	public User getUserByName(String uname) {
		
		return userDAO.getUserByName(uname);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
