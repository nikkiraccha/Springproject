package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rest.model.Customer;
import com.rest.service.CustomerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Customer customer) {
	
		Customer cust=customerService.saveRecord(customer);
		String msg=null;
		if(cust!=null)
		{
			msg="data saved successfully";
		}
		else
		{
			msg="data failed";
		}
		return msg;
	}
	@GetMapping("/get/{cid}")
	public Customer getOne(@PathVariable int cid)
	{
		Customer get=customerService.getOneRecord(cid);
		return get;
	}
	@GetMapping("/getAll")
	public List<Customer> getAll()
	{
		List<Customer> getall=customerService.getAllRecord();
		
		return getall;
	}
	

}
