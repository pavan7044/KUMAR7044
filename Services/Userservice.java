package pavanmotor.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pavanmotor.DAO.UserDAO;
import pavanmotor.Model.User;

@Service
public class Userservice {
	
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
	public User get(int id)
	{
		return userDAO.get(id);
	}
	public User getusername(String name)
	{
		return userDAO.getusername(name);
	}
	public void delete(int id)
	{
		userDAO.delete(id);
	}

	

}
