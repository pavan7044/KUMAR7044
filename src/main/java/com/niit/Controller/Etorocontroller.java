package com.niit.Controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.DAO.UserDAO;
import com.niit.Model.Blog;
import com.niit.Model.User;

@Controller
public class Etorocontroller {
	


	@RequestMapping("/")
	public ModelAndView pavan(){
		System.out.println("\nWelcome page Controller has called - / ");
		ModelAndView prb= new ModelAndView("Welcome");
		return prb;
	}
		
	
	@ModelAttribute
	public Object returnObject()
	{
		return new User();
		
	}
	
	
		@RequestMapping("/login")
		public ModelAndView pavan5(){
			System.out.println("\nlogin page has Controller called - / ");
			ModelAndView pr= new ModelAndView("login");
			return pr;
		}
		
	@RequestMapping("/SignUp")
		public ModelAndView pavan552(){
			System.out.println("\nSignUp page Controller has called - / ");
			ModelAndView prh= new ModelAndView("SignUp");
			return prh;
		
		}

	@RequestMapping("/home")
	public ModelAndView pavan85(){
		System.out.println("\nhome page has Controller called - / ");
		ModelAndView prp= new ModelAndView("home");
		return prp;
	}
	
	
	

	
	
	
}
