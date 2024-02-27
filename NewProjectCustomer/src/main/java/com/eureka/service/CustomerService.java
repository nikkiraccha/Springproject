package com.eureka.service;

import java.util.List;

import com.eureka.model.Customer;

public interface CustomerService {
	
	public Customer saveRecord(Customer customer);
	public Customer getOneRecord(int  id);
	public void deleteRecord(int id);
	public Customer updateRecord(Customer customer,int id);
	public List<Customer> getAll();

}
