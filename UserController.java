package com.niit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.User;
import com.niit.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	private UserService userservice;

	
	

	@RequestMapping("/register")
	public ModelAndView showSignup() {
		
		ModelAndView mv = new ModelAndView("register","user",new User());
		System.out.println("inside login controller");
		return mv;
	}
	
	
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView register(@Valid @ModelAttribute("user") User user,BindingResult bindingResult)
    {	
		System.out.println("inside sign up "+bindingResult);
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("register");
		}
		System.out.println("in register controller");
		userservice.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("login1");
		return mv;
	}
	
	
	
	
	
	
	
	

}
	
	
	
	
	
	
	
	
	
	

