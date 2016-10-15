package com.niit.Controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.DAO.BlogDAO;
import com.niit.DAO.UserDAO;
import com.niit.Model.Blog;

@Controller
public class Blogcontroller {
	
	@Autowired
	UserDAO ud;
	
	@Autowired
	BlogDAO bd;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("/blog") // from user / admin success login page
	public ModelAndView displayBlogPage(){
		System.out.print("\nBlogController - displayBlogPage()");
		ModelAndView mv = new ModelAndView("blog");
	//	session.setAttribute("uname",);
		return mv;
	}
	
	
	
	@ModelAttribute("blog")
	public Blog returnObject()
	{
		return new Blog();
	}
	
	@RequestMapping("/bpost")
	public String createBlog(@ModelAttribute("blog") Blog blog,Model model,Principal p)throws IOException
	{
		
		//User us= new User();
		blog.setUsername(p.getName());
		//blog.setUsername("pavan kumar");
		//blog.setBlogStatus("valid");
		blog.setBlogcreationdate(new java.util.Date());
		bd.saveOrUpdate(blog);
		return "blog";
	}
	
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues() {			
		String devs="";
		System.out.println("gson all blogs...");
		List <Blog> listdev = bd.list();
		Gson gson = new Gson();
		devs=gson.toJson(listdev);	
		return devs;
	}	
	
	@RequestMapping("/getBlogDataInd")
	public @ResponseBody String getfullValues() {			
		String devs="";
		System.out.println("gson all blogs...");
		List <Blog> listdev = bd.list();
		Gson gson = new Gson();
		devs=gson.toJson(listdev);	
		return devs;
	}	
	
	
	
	
	
	
	

}
