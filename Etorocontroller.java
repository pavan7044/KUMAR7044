package com.niit.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.UserDAO;
import com.niit.Model.Message;
import com.niit.Model.OutputMessage;
import com.niit.Model.User;

@Controller
public class Etorocontroller {
	
	@Autowired
	UserDAO ud;
	

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
	@RequestMapping("/index")
	public ModelAndView pavan5552(){
		System.out.println("\nSignUp page Controller has called - / ");
		ModelAndView prh= new ModelAndView("index");
		return prh;
	
	}

	@RequestMapping("/home")
	public ModelAndView pavan85(){
		System.out.println("\nhome page has Controller called - / ");
		ModelAndView prp= new ModelAndView("home");
		return prp;
	}
	
	@RequestMapping("/register")
	public String createUser(@ModelAttribute("user") User user,@RequestParam("img") MultipartFile file,Model model,HttpServletRequest request)throws IOException
	{
	 	String filename;
	 	byte[]bytes;
	 	
	 			 user.setRole("ROLE_USER");
	 			 
	 			
	 			 user.setAuthority("ROLE_USER");
	 			 user.setEnabled(true);
	 			 user.setAdmin(false);
	 			ud.saveOrUpdate(user);
	 			
	 			
	 			System.out.println("image");
	 			MultipartFile image=user.getImg();
	 			Path path;
	 			path=Paths.get("D:\\worksspace2\\etoro\\src\\main\\webapp\\resources\\images\\"+user.getUserid()+".jpg");
	 			
	            System.out.println("Path = " + path);
	            System.out.println("File name = " + user.getImg().getOriginalFilename());
	         
	            if(image!=null && !image.isEmpty())
	            {
	            	try
	            	{
	            	   image.transferTo(new File(path.toString()));
	            	   System.out.println("Image Saved in:"+path.toString());
	            	}catch(Exception e)
	            	{
	            		e.printStackTrace();
	            		System.out.println("Image not saved");
	            	}
	            }
		return "login";
	}

	
	@RequestMapping("About")
	public ModelAndView pavan568(){
		System.out.println("\n About page Controller has called - / ");
		ModelAndView prb= new ModelAndView("About");
		return prb;
	}
	
	
	@RequestMapping("/contactus")
	public ModelAndView pavan355(){
		System.out.println("\n contactus page has Controller called - / ");
		ModelAndView pr= new ModelAndView("Contactus");
		return pr;
	}
	
	//////Blog controller///////
	
	
	
	

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
		    	 // session.setAttribute("UserLoggedIn", "true");
		//    	 session.setAttribute("cartsize",cartDAO.cartsize((int)session.getAttribute("userId")));
	
		    	 return "index";
		    	 }
		     else 
		     {
		    	 
		    	 return "login";
		    	 
		    	// session.setAttribute("Administrator", "true");
	/*	    	 model.addAttribute("product",  new Product());
		    	 model.addAttribute("ProductPageClicked", "true");
		    	 model.addAttribute("supplierList",supplierDAO.list());
		    	 model.addAttribute("categoryList",categoryDAO.list());
	*/		 }
		}
	return "login";
	}	

	
	@RequestMapping("/Welcome")
	public ModelAndView pavan554(){
		System.out.println("\n Wel come page has Controller called - / ");
		ModelAndView pr= new ModelAndView("Welcome");
		return pr;
	}
	
////// chat controller///////
	
	@RequestMapping("/getchat")
	public ModelAndView displaychat(){
		ModelAndView r1=new ModelAndView("chatpage");
		System.out.println("log page is from logicontroller");
		return r1;
	}
	
	  @MessageMapping("/chat")
	  @SendTo("/topic/message")
	  public OutputMessage sendMessage(Message message) {
	    return new OutputMessage(message, new Date());
	  }
	
	
	
		
		
	}

	
	
	

	
	
	

