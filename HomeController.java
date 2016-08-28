package com.niit.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public ModelAndView pavan(){
		System.out.println("\nlanding page Controller has called - / ");
		ModelAndView pr= new ModelAndView("Tvscaursol");
		return pr;
	}
	
	@RequestMapping("/Tvscaursol1")
	public ModelAndView pavan5(){
		System.out.println("\nBase page has Controller called - / ");
		ModelAndView pr= new ModelAndView("Tvscaursol1");
		return pr;
	}
	
	@RequestMapping("/login1")
	public ModelAndView pavan552(){
		System.out.println("\nlogin page Controller has called - / ");
		ModelAndView pr= new ModelAndView("login1");
		return pr;
	}
	
	@RequestMapping("/contact")
	public ModelAndView pavan1(){
		System.out.println("\ncontact page Controller has called- / ");
		ModelAndView pr= new ModelAndView("contact");
		return pr;
	}

	@RequestMapping("/viewproducts")
	public ModelAndView pavan21(){
		System.out.println("\nview products page user has called from Controller - / ");
		ModelAndView pr= new ModelAndView("viewproducts");
		return pr;
	}

	

	@RequestMapping("/UserCheck")
	public ModelAndView usercheck(Principal principal){
		System.out.println("it is of user check");
		return new ModelAndView("userpage");
		
	}
	
	@RequestMapping("/AdminCheck")
	public ModelAndView admincheck(Principal principal){
		System.out.println("it is of admincheck");
		return new ModelAndView("viewproducts");
	}
	/*@RequestMapping("/logout")
	public ModelAndView logout(Principal principal,HttpSession session){
		session.invalidate();
		return new ModelAndView("logout");
	}*/
	

	@RequestMapping("/logout")
	public ModelAndView pavan13(){
		System.out.println("\nsuucessfully logout from Controller - / ");
		ModelAndView pr= new ModelAndView("logout");
		return pr;
	}


	@RequestMapping("/userjs")
	public ModelAndView pavan135(){
		System.out.println("\nuserjs page Controller - / ");
		ModelAndView pr= new ModelAndView("userjs");
		return pr;
	}

	
	@RequestMapping("/aboutus")
	public ModelAndView pavan1355(){
		System.out.println("\n aboutus page Controller - / ");
		ModelAndView pr= new ModelAndView("aboutus");
		return pr;
	}
	
	
	@RequestMapping("/userpage1")
	public ModelAndView pavan135335(){
		System.out.println("\n aboutus page Controller - / ");
		ModelAndView pr= new ModelAndView("userpage1");
		return pr;
	}
	
	
	
	
	
	

}
