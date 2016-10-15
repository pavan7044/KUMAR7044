package com.niit.Controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.DAO.ForumDAO;
import com.niit.Model.Forum;

@Controller
public class Forumcontroller {
	
	@Autowired
	private ForumDAO forumdao;
	
	@RequestMapping("/fom") // from user / admin success login page
	public ModelAndView displayBlogPage(){
		
		System.out.print("\nforumController - displayBlogPage()");
		ModelAndView mv = new ModelAndView("forum");
	//	session.setAttribute("uname",);
		return mv;
	}
	
	
	
	@RequestMapping("/frm")
	public String createforum(@ModelAttribute("forum") Forum forum,Model model,Principal p )throws IOException
	{
		System.out.println("forum");
		forum.setUsername(p.getName());
		forum.setFstatus("valid");
		forum.setFcreationdate(new java.util.Date());
		forumdao.saveOrUpdate(forum);
		return "forum";
	}

	String setName;
	List<Forum> flist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon1")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			flist = forumdao.list();
			Gson gson = new Gson();			  
			result = gson.toJson(flist);			
			return result;
	}

	@ModelAttribute("forum")
	public Forum returnObject()
	{
		return new Forum();
	}
	
	
	

}
