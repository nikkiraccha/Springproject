package com.web.service;

import java.util.List;

import com.web.model.Account;

public interface BankService {
	public Account saveAccount(Account acount);
	public Account getAccount(int accNo);
	 public Account addAmount(int accNo, double amount,String name ,String password);
	public Account withdrawAmount(int accNo,double amount);
	public Account transferAmount(int accNo,int accNo2,double amount);
   
}
