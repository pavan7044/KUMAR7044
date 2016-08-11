package pavanmotor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pavanmotor.Model.Product;
import pavanmotor.Services.Productservice;

public class productcontroller {

	
	@Autowired
	Product product;
	Productservice productService;
	
	
	@RequestMapping("/productupdate")
	public ModelAndView ProductUpdateController(@ModelAttribute ("product") Product product,Model model)
		
			
	{
		System.out.println("in product controller");
		productService.saveOrUpdate(product);
		
	
        	ModelAndView mv=new ModelAndView("product");
		System.out.println("Product controller called");
		return mv;
		
	}

}
