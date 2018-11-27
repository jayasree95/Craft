package com.niit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CustomerDAO;
import com.niit.model.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDao;
	@RequestMapping(value="/all/getregistrationform")
	public ModelAndView getRegistrationForm(Model model){
	Customer customer	=new Customer();
	model.addAttribute("customer",customer);
	ModelAndView m = new ModelAndView();
	m.setViewName("registrationform");
	return m;	
	}
	@RequestMapping(value="/all/registercustomer")
	
	public String registerCustomer(@ModelAttribute Customer customer,Model model){
		String email=customer.getUser().getEmail();
		if(!customerDao.isEmailUnique(email))
		{
			model.addAttribute("errorMessage","Email already exists.. please choose different email id");
			return "Register";
		}
		customerDao.registerCustomer(customer);
		
		 return "redirect:/login";
	}

}
