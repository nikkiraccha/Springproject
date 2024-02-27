package com.rest.service;

import com.rest.model.Account;

public interface BankService {
	
	public Account saveRecord(Account account);
	public Account getRecord(int accno,String name,String password);
	public Account depositLogic(int accNo,String name,String password,double amount);
	public Account withdrawLogic(int accNo,String name,String password,double amount);

}
