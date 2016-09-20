package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
import com.niit.model.Supplier;


@Service

public class CategoryService {
	

	@Autowired
	CategoryDAO categoryDAO;
	
	public void saveOrUpdate(Category category)
	{
		categoryDAO.saveOrUpdate(category);	
	}
	public List<Category> list()
	{
		List<Category> list=categoryDAO.list();
		System.out.println("in category service");
		return list;
	}
	public Category get(int id)
	{
		return categoryDAO.get(id);
	}
	public void delete(int id)
	{
		categoryDAO.delete(id);
	}
	
	
public Category getByName(String sname) {
		
		return categoryDAO.getByName(sname);
	}
	
	
	
	
	
	

}
