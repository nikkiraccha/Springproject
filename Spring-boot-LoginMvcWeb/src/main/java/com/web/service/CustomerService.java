package com.web.service;

import com.web.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	Customer login(String cname, String password);

}
