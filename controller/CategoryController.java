package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Category;
import com.niit.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService cs;
	
	@RequestMapping("/EditCategory")
	public ModelAndView displaycatpage()
	{
		ModelAndView r1=new ModelAndView("EditCategory");
		System.out.println("catgy page is from catcontroller");
		return r1;
	}
	
	
	@RequestMapping("/catgry")
	public ModelAndView catgry(
			@ModelAttribute Category category,
			@RequestParam(value = "sname") String name,
			@RequestParam(value = "sdescription") String desc
			 ) {
		
		category.setSname(name);
		category.setSdecription(desc);



		System.out.println("in category controller");
		cs.saveOrUpdate(category);
		ModelAndView mv = new ModelAndView("viewproducts");
		return mv;
	}
	

}
