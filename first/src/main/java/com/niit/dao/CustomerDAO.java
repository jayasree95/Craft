package com.niit.dao;

import com.niit.model.Customer;
import com.niit.model.User;

public interface CustomerDAO {
	
	void registerCustomer(Customer customer);
	boolean isEmailUnique(String email);
	User getUser(String email);

}
