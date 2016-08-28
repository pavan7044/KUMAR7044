package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;
@Service
public class SupplierService {
	

	@Autowired
	SupplierDAO supplierDAO;
	
	public void saveOrUpdate(Supplier supplier)
	{
		supplierDAO.saveOrUpdate(supplier);	
	}
	public List<Supplier> list()
	{
		List<Supplier> list=supplierDAO.list();
		return list;
	}
	public Supplier get(int id)
	{
		return supplierDAO.get(id);
	}
	public void delete(int id)
	{
		supplierDAO.delete(id);
	}
	
public Supplier getByName(String spname) {
		
		return supplierDAO.getByName(spname);
	}
	

}
