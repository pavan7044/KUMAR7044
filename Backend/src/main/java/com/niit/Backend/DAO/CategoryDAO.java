package com.niit.Backend.DAO;

import java.util.List;

import com.niit.Backend.model.Category;



public interface CategoryDAO 
{

public List<Category> list();

public Category get(String id);

public void saveOrUpdate(Category category);

public void delete(String id);


}

