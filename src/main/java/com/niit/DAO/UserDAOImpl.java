package com.niit.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.Model.User;



public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	

	public UserDAOImpl() {
		System.out.println("UserDAOImpl --One");
	}
	public UserDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
		System.out.println("Inside UserDAOImpl");
	}
	
	
	
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		
	}

	public User get(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int userid) {
		// TODO Auto-generated method stub
		
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
}
