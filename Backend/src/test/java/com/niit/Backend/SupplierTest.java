package com.niit.Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.CategoryDAO;
import com.niit.Backend.DAO.SupplierDAO;
import com.niit.Backend.model.Category;
import com.niit.Backend.model.Supplier;


public class SupplierTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
	
		SupplierDAO supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier=(Supplier) context.getBean("supplier");
		
		supplier.setSid("p999");
		supplier.setSaddress("sec-bad 515671");
		supplier.setSname("Shanthi motors");
		supplier.setSemail("manjo@gmail.com");
		supplier.setSphno(7793698);
		
		
	supplierDAO.saveOrUpdate(supplier);
		
		if(supplierDAO.get("sdfsf")==null)
		{
			System.out.println("Category does not exst");
		}
		else
		{
			System.out.println("category exist ..... the details are.....");
			System.out.println();
		}
		
	

	}

}
