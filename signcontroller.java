package pavanmotor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pavanmotor.Model.User;
import pavanmotor.Services.Userservice;

@Controller
public class signcontroller {
	
	@Autowired
	
	Userservice userservice;
	User user;
	
	@RequestMapping("/registration")
	public ModelAndView Signupcontroller()
	{
		ModelAndView mv= new ModelAndView("registration");
		System.out.println("Registration control called");
		
		
		return mv;
	}
	
		
	
	@RequestMapping("/register")
	public ModelAndView Registercontroller(@ModelAttribute User user,
			@RequestParam(value ="t1") String firstname,
			@RequestParam(value = "t2") String lastname,
			@RequestParam(value ="t3") String username,
			@RequestParam(value ="d1") String dob,
			
			
			@RequestParam(value ="t5") String email,
			@RequestParam(value ="t4") String password,
			@RequestParam(value ="t6") String phonenumber
			)
	
	{
		
		
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		//user.setAdimn(false);
		user.setPhonenumber(phonenumber);
		System.out.println("Register controll kjdfnguicalled");

	userservice.saveOrUpdate(user);
		ModelAndView mv=new ModelAndView("login1");
		System.out.println("Register controll called");
		
		return mv;
		
		
		
	}
	
	
		
	}
			


