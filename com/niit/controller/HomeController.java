package com.niit.controller;

import java.security.Principal;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/Tvscaursol")
	public ModelAndView pavan5(){
		System.out.println("\nBase page has Controller called - / ");
		ModelAndView pr= new ModelAndView("Tvscaursol");
		return pr;
	}
	
@RequestMapping("/login1")
	public ModelAndView pavan552(){
		System.out.println("\nlogin page Controller has called - / ");
		ModelAndView prh= new ModelAndView("login1");
		return prh;
	
	}


@RequestMapping("/signup")
public ModelAndView pavan5532(){
	System.out.println("\nsignup page Controller has called - / ");
	ModelAndView prh= new ModelAndView("signup");
	return prh;

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
	
	
	
	

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/login_session_attributes")
	public String login_session_attributes(HttpSession session,Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
	//	User user = userService.get(username);
	//	session.setAttribute("userId", user.getId());
		session.setAttribute("username", username);
		session.setAttribute("LoggedIn", "true");

		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
		.getAuthentication().getAuthorities();
		String role="ROLE_USER";
		for (GrantedAuthority authority : authorities) 
		{
		  
		     if (authority.getAuthority().equals(role)) 
		     {
		    	 session.setAttribute("UserLoggedIn", "true");
		//    	 session.setAttribute("cartsize",cartDAO.cartsize((int)session.getAttribute("userId")));
	
		    	 return "userpage";
		    	 }
		     else 
		     {
		    	 session.setAttribute("Administrator", "true");
	/*	    	 model.addAttribute("product",  new Product());
		    	 model.addAttribute("ProductPageClicked", "true");
		    	 model.addAttribute("supplierList",supplierDAO.list());
		    	 model.addAttribute("categoryList",categoryDAO.list());
	*/		 }
		}
		return "viewproducts";
	}	

	
	

	/*@RequestMapping("/UserCheck")
	public ModelAndView usercheck(Principal principal){
		System.out.println("it is of user check");
		ModelAndView mv = new ModelAndView("userpage");
		String name= principal.getName();
		mv.addObject("name"," Hai.. " + name +"  ");
		
		
		
		return  mv;
		
	}
	
	@RequestMapping("/AdminCheck")
	public ModelAndView admincheck(Principal principal){
		System.out.println("it is of admincheck");
		return new ModelAndView("viewproducts");
	}*/
@RequestMapping("/doout")
	public ModelAndView logout(){
		
		return new ModelAndView("Tvscaursol");
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
