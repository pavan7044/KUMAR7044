package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;
@Service
public class ProductService implements ProductServiceDAO{

	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	SessionFactory sessionFactory;
	public ProductService(){}
	
	public ProductService(SessionFactory sessionfactory){
		sessionFactory=sessionfactory;
	}

	public void saveOrUpdate(Product product) {
		System.out.println("In productsevice");
		productDAO.saveOrUpdate(product);	
	}
		
	

	public List<Product> list() {
		List<Product> list=productDAO.list();
		return list;
		
	}

	public Product get(int ptid) {
		return productDAO.get(ptid);
	}

	public void delete(int ptid) {
		productDAO.delete(ptid);
		
	}
	
	
	
}
