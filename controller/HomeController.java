package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public ModelAndView pavan(){
		System.out.println("\nController - / ");
		ModelAndView pr= new ModelAndView("index");
		return pr;
	}
	

	@RequestMapping("/Tvscaursol")
	public ModelAndView pavan1(){
		System.out.println("\nController - / ");
		ModelAndView pr= new ModelAndView("Tvscaursol");
		return pr;
	}
	
	

}