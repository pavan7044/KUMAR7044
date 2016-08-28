package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Supplier;
import com.niit.service.SupplierService;

@Controller
public class SupplierController {
	

	@Autowired
	SupplierService ss;
	
	@RequestMapping("/supplierpage")
	public ModelAndView displaysppage()
	{
		ModelAndView r1=new ModelAndView("supplierpage");
		System.out.println("supplier page is from catcontroller");
		return r1;
	}
	
	@RequestMapping("/supr")
	public ModelAndView supr(
			@ModelAttribute Supplier supplier,
			@RequestParam(value = "spname") String name,
			@RequestParam(value = "spaddress") String addr
			 ) {
		
		supplier.setSpname(name);
		supplier.setSpaddress(addr);



		System.out.println("in supplier controller");
		ss.saveOrUpdate(supplier);
		ModelAndView mv = new ModelAndView("viewproducts");
		return mv;
	}

}
