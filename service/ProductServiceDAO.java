package com.niit.service;

import java.util.List;

import com.niit.model.Product;

public interface ProductServiceDAO {
	
	public void saveOrUpdate(Product product);
	public List<Product> list();
	public Product get(int ptid);
	public void delete(int ptid);
	
	

}
