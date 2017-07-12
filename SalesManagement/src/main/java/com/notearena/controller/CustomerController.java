package com.notearena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notearena.model.CustomerObjectForm;



@Controller
public class CustomerController {
	
	@RequestMapping(value = "dashboard")
	public String getDashboard(@ModelAttribute("customerObject") CustomerObjectForm customerObject, Model model) {
		System.out.println("Check dashboard");
		return "customer";
	}
	
	
	@RequestMapping(value = "addCustomer")
	public String addCustomer(@ModelAttribute("customerObject") CustomerObjectForm customerObject, Model model) {
	    System.out.println("Check add customer");
		model.addAttribute("customerObject", customerObject);
		return "addCustomer";
	}
	@RequestMapping(value = "showCustomer")
	public String showCustomer(@ModelAttribute("customerObject") CustomerObjectForm customerObject, Model model) {
		System.out.println("Check show customer");
		System.out.println("Name:"+customerObject.getName());
		model.addAttribute("customerObject", customerObject);
		return "showCustomer";
	}
}
