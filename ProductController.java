package com.niit.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.service.CategoryService;
import com.niit.service.ProductService;
import com.niit.service.SupplierService;



@Controller
public class ProductController {
	


	
	@Autowired
	private ProductService productService; 
	
	
	@Autowired
	private CategoryService categoryService; 
	@Autowired
	private SupplierService supplierService; 
	
	
	
	
	
	@RequestMapping("/Product")
	public ModelAndView displayHomePage(@ModelAttribute("product")Product product,Model model){
		System.out.print("\nMyController - displayHomePage as landpage()");
		System.out.println(product.getPtname());
		
		
		model.addAttribute("product", new Product());
	
		model.addAttribute("productList", this.productService.list());

		
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("categoryList", this.categoryService.list());
		model.addAttribute("supplierList", this.supplierService.list());
		
		
		
		System.out.println("Product page has called");
		
		
		
		
		ModelAndView mv = new ModelAndView("Product");		
		return mv;
	}	
	
	@RequestMapping(value="/productadd", method=RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product")Product product,HttpServletRequest request)
	{		
	 	
		
		System.out.println("in product controller11");

		@SuppressWarnings("unused")
		String filename;
	 	@SuppressWarnings("unused")
		byte[]bytes;
	 	System.out.println(product.getPtmodel());
	 	
	
	 	
	 		System.out.println("image uploaded");
	 		

	
	
	System.out.println("product controller called");
	MultipartFile image=product.getImg();
	Path path;
	path=Paths.get("E:/tvs/raja/bikeshop/src/main/webapp/resources/images/"+product.getPtname() +".jpg");
	
	System.out.println("Path = " + path);
    System.out.println("File name = " + product.getImg().getOriginalFilename());
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
    
   /* 
    Category category = categoryService.getByName(product.getCategory().getTgname());
	categoryService.saveOrUpdate(category);
    
    Supplier supplier=supplierService.getByName(product.getSupplier().getSpname());
	supplierService.saveOrUpdate(supplier);
 	
	product.setCategory(category);
	product.setSupplier(supplier);
 	
	product.setCatg_tgid(category.getSid());
	product.setSupplier_id(supplier.getSpid());

   
    */
    
    
    
    
//    category and supplier services
    
    Category category = categoryService.getByName(product.getCategory().getSname());
	categoryService.saveOrUpdate(category);  

	Supplier supplier = supplierService.getByName(product.getSupplier().getSpname());
	supplierService.saveOrUpdate(supplier); 		
	
	product.setCategory(category);
	product.setSupplier(supplier);
	
	/*product.setCategory_id(category.getSid());
	product.setSupplier_id(supplier.getSpid());
    
*/    //category and supplier services
    
    
   
    productService.saveOrUpdate(product);
   


    return "angularjs";

	
	}
	
	
	@RequestMapping("/Products")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Product> list = productService.list();
		System.out.println("product list="+list);
		ObjectMapper om = new ObjectMapper();
		String listjson = om.writeValueAsString(list);
		System.out.println(listjson);
		return new ModelAndView("angularjs","listofitem",listjson);
		
	
	}
	

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
	    return "angularjs";
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
	

	@RequestMapping("/editItem")
	public ModelAndView editItem(@RequestParam("ptid") int ptid)
	{
	System.out.println("id:"+ptid);
	Product product=productService.get(ptid);
	System.out.println("Product Name:"+product.getPtid());
	System.out.println("qty"+product.getPtquantity());
	return new ModelAndView("Product","product",product);
	}
	
	@RequestMapping("viewdetails")
	public String viewProduct(@ModelAttribute("prod")Product prod) throws Exception {
	System.out.println("In view");
	System.out.println(prod.getPtid());

	    try {
	        productService.get(prod.getPtid());
	      //  model.addAttribute("message", "Successfully Added");
	    } catch (Exception e) {
	     //   model.addAttribute("message", e.getMessage());
	        e.printStackTrace();
	    }
	    // redirectAttrs.addFlashAttribute(arg0, arg1)
	    return "viewdetails";
	}
	
	}
	

