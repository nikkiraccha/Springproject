package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Account;
import com.web.repo.BankRepo;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepo repo;
	
	
	@Override
	public Account saveAccount(Account account) {
		Account a=repo.save(account);
		return a;
	}
	
	@Override
	public Account getAccount(int accNo) {
		
		Account get=repo.findById(accNo).get();
		return get;
		
	}
	@Override
	public Account addAmount(int accNo,double amount,String name,String password) {
		
		Account get=repo.findById(accNo).get();
		if(get.getName().equals(name)&& get.getPassword().equals(password)) {
		 double add=get.getAmount()+amount;
	     get.setAmount(add);
		 repo.save(get);
		}
		
		return get;
	}

	@Override
	public Account withdrawAmount(int accNo, double amount) {
	
		Account get=repo.findById(accNo).get();
		 double a=get.getAmount();
		 if(amount<=a)
		 {
			 a=a-amount;
		 }
		 get.setAmount(a);
		 repo.save(get);
		return get;
	}


	@Override
	public Account transferAmount(int accNo, int accNo2, double amount) {
		Account get=repo.findById(accNo).get();
		double a=get.getAmount();
		Account trans=repo.findById(accNo2).get();
		double b=trans.getAmount();
		if(amount<=a)
		 {
			 a=a-amount;
		 }
		b=b+amount;
		trans.setAmount(b);
		get.setAmount(a);
		repo.save(trans);
		repo.save(get);
		return trans;
	}
	
	

	

	
	
	






	

	

	
}
