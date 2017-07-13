package com.notearena.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notearena.model.CustomerObjectForm;



@Controller
public class CustomerController {
	private static final Logger logger = Logger.getLogger(CustomerController.class);

	@RequestMapping(value = "dashboard")
	public String getDashboard(@ModelAttribute("customerObject") CustomerObjectForm customerObject, Model model) {
		//System.out.println("Check dashboard");
		logger.debug("Checking dashboard");
		return "customer";
	}
	
	
	@RequestMapping(value = "addCustomer")
	public String addCustomer(@ModelAttribute("customerObject") CustomerObjectForm customerObject, Model model) {
		//System.out.println("Check add customer");
		logger.debug("Checking addCustomer");
		model.addAttribute("customerObject", customerObject);
		return "addCustomer";
	}
	@RequestMapping(value = "showCustomer")
	public String showCustomer(@ModelAttribute("customerObject") CustomerObjectForm customerObject, Model model) {
		//System.out.println("Check show customer");
		logger.debug("Checking show customer");
		//System.out.println("Name:"+customerObject.getName());
		logger.info("Name:"+customerObject.getName());
		model.addAttribute("customerObject", customerObject);
		return "showCustomer";
	}
}
