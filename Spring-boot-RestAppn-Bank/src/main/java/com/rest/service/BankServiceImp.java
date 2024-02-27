package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Account;
import com.rest.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {
	@Autowired
	private BankRepo repo;

	@Override
	public Account saveRecord(Account account) {
		
		Account a=repo.save(account);
		return a;
	}

	@Override
	public Account getRecord(int accNo, String name, String password) {
		
		Account a=repo.findById(accNo).get();
		if(a.getAccNo()==accNo && a.getName().equals(name)&& a.getPassword().equals(password))
		{
			return a;
		}
		else
		{
		
		return null;
		}
	}

	@Override
	public Account depositLogic(int accNo, String name, String password,double amount) {
		
		Account a=repo.findById(accNo).get();
		
		if(a.getAccNo()==accNo && a.getName().equals(name)&& a.getPassword().equals(password))
		{
			double add=a.getAmount()+amount;
			a.setAmount(add);
			Account account=repo.save(a);
			return account;
		}
		else
		{
		
		return null;
		}
	}

	@Override
	public Account withdrawLogic(int accNo, String name, String password, double amount) {
		
            Account a=repo.findById(accNo).get();
            Account account=null;
		
		if(a.getAccNo()==accNo && a.getName().equals(name)&& a.getPassword().equals(password))
		{
			if(amount<=a.getAmount())
			{
			double withdraw=a.getAmount()-amount;
			a.setAmount(withdraw);
			 account=repo.save(a);
			
		    }
			return account;
		}
		else
		{
		
		return null;
		}
		
		
	}

}
