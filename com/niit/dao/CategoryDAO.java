package com.niit.dao;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Supplier;

public interface CategoryDAO {
	
	public List<Category> list();

	public Category get(int id);

	public void saveOrUpdate(Category category);

	public void delete(int id);

	
	public Category getByName(String sname);


}
