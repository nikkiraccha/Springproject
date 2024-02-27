package com.eureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.model.Customer;
import com.eureka.repo.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {

	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer saveRecord(Customer customer) {
	    Customer c=customerRepo.save(customer);
		return c;
	}

	@Override
	public Customer getOneRecord(int id) {
		
		Customer c=customerRepo.findById(id).get();
		return c;
	}

	@Override
	public void deleteRecord(int id) {
		customerRepo.deleteById(id);
		
	}

	@Override
	public Customer updateRecord(Customer customer,int id) {

         Customer old=customerRepo.findById(id).get();
         old.setFirst_name(customer.getFirst_name());
         old.setLast_name(customer.getLast_name());
         old.setAddress(customer.getAddress());
         old.setCity(customer.getCity());
         old.setEmail(customer.getEmail());
         old.setPhone(customer.getPhone());
         old.setState(customer.getState());
         old.setStreet(customer.getStreet());
          Customer c=customerRepo.save(old);
		return c;
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> l=customerRepo.findAll();
		return l;
	}

}
