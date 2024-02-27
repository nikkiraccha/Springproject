package com.eureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.model.Customer;
import com.eureka.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public String save(@RequestBody Customer customer)
	{
		Customer c=customerService.saveRecord(customer);
		if(c!=null)
		{
			return "data saved successfully";
		}
		else {
		return null;
		}
	}
	
	@GetMapping("/get/{id}")
	public Customer getOne(@PathVariable int id)
	{
		Customer c=customerService.getOneRecord(id);
		if(c!=null)
		{
			return c;
		}
		else {
		return null;
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		customerService.deleteRecord(id);
		return "successfully deleted";
		
	}
	@PutMapping("/update/{id}")
	public String update(@RequestBody Customer customer,@PathVariable int id)
	{
		Customer c=customerService.updateRecord(customer, id);
		if(c!=null)
		{
			return "data updated successfully";
		}
		else {
		return null;
		}
	}
	@GetMapping("/getAll")
	public List<Customer> getAllRecords()
	{
		List<Customer> l=customerService.getAll();
		return l;
	}

}
