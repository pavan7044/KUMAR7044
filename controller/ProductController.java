package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Product;
import com.niit.service.ProductService;


@Controller
public class ProductController {
	

	
	
	@Autowired
	private ProductService productService; 

	
	@RequestMapping(value="/Product", method=RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("Product")Product pd,HttpServletRequest request)
	{		
	 	System.out.println("in product controller11");

		//String filename;
	 	byte[]bytes;
	 	System.out.println(pd.getPtname());
	 	
	 	try{
	 		bytes=pd.getImg().getBytes();
	 		String path = request.getSession().getServletContext().getRealPath("/resources/images/" + pd.getPtname()+".jpg");
	 		System.out.println("\nPath : " + path);
	 		System.out.println("\nFilename : " + pd.getImg().getOriginalFilename());
	 		File f= new File(path);
	 		BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
	 		bs.write(bytes);
	 		bs.close();
	 		System.out.println("image uploaded");
	 		
	 	}
	 	catch(Exception ex){
	 		System.out.println("\nExcep - " + ex);
	 	}
	 	productService.saveOrUpdate(pd);
	 	return "viewproducts";
	}
	
	@RequestMapping("/Product")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Product> list = productService.list();
		System.out.println("product list="+list);
		ObjectMapper om = new ObjectMapper();
		String listjson = om.writeValueAsString(list);
		System.out.println(listjson);
		return new ModelAndView("Product","listofitem",listjson);
		
	
	}
	
/*
	@RequestMapping("deleteItem")
	public String removeProduct(@RequestParam int ptid) throws Exception {
	System.out.println("In delete");
	System.out.println(ptid);

	    try {
	        productService.delete(ptid);
	      //  model.addAttribute("message", "Successfully Added");
	    } catch (Exception e) {
	     //   model.addAttribute("message", e.getMessage());
	        e.printStackTrace();
	    }
	    // redirectAttrs.addFlashAttribute(arg0, arg1)
	    return "Products";
	}
	
	
	String setName;
	List<Product> plist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			plist = productService.list();
			Gson gson = new Gson();			  
			result = gson.toJson(plist);			
			return result;
	}
	
	*/
	

}
