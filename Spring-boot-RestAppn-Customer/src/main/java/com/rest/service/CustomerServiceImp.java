package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Customer;
import com.rest.repo.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	 private CustomerRepo customerRepo;

	@Override
	public Customer saveRecord(Customer customer) {
		
double gst=0.0,totalbill=0.0, invoice=0.0,disc=0.0;
		
		totalbill=customer.getPrice()*customer.getQuantity();
		
		if(totalbill>2500)
		{
			disc=0.1;
			
		}
		else if(totalbill<2500 && totalbill<5000)
		{
			disc=1.5;
		}
		else {
			disc=2.5;
		}
	disc=totalbill*disc;
	gst=0.2*totalbill;
	
	invoice=totalbill-disc+gst;
	customer.setTotal(totalbill);
	customer.setDiscount(disc);
	customer.setGst_amt(gst);
	customer.setInvoice_bill(invoice);
	
	Customer c=customerRepo.save(customer);
		return c;
	}

	@Override
	public Customer updateRecord(Customer customer, int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRecord(int cid) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getOneRecord(int cid) {
		Customer c=customerRepo.findById(cid).get();
		return c;
	}

	@Override
	public List<Customer> getAllRecord() {
		List<Customer> list=customerRepo.findAll();
		return list;
	}

}
