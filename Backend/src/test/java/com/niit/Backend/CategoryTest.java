package com.niit.Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.CategoryDAO;
import com.niit.Backend.model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
		
		CategoryDAO categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		Category category=(Category) context.getBean("category");
		
		category.setId("cg129");
		category.setName("cgname129");
		category.setDescription("cgDec124");
		
		categoryDAO.saveOrUpdate(category);
		
		if(categoryDAO.get("sdfsf")==null)
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
