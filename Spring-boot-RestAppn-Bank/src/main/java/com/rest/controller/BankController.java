package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Account;
import com.rest.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	
	@PostMapping("/save")
	public String saveData(@RequestBody Account account) {
	
		Account acc=bankService.saveRecord(account);
		String msg=null;
		if(acc!=null)
		{
			msg="data saved successfully";
		}
		else
		{
			msg="data failed";
		}
		return msg;
	}
	
	@GetMapping("/balance/{accNo}/{name}/{password}")
	public Account balanceCheck(@PathVariable int accNo,@PathVariable String name,@PathVariable String password)
	{
		Account a=bankService.getRecord(accNo, name, password);
		if(a!=null)
		{
		return a;
		}
		else {
			return null;
		}
	}
	
	@GetMapping("/deposit/{accNo}/{name}/{password}/{amount}")
	public Account deposit(@PathVariable int accNo,@PathVariable String name,@PathVariable String password,@PathVariable double amount)
	{
		Account a=bankService.depositLogic(accNo, name, password, amount);
		if(a!=null)
		{
		return a;
		}
		else {
			return null;
		}
	}
	@GetMapping("/withdraw/{accNo}/{name}/{password}/{amount}")
	public Account withdraw(@PathVariable int accNo,@PathVariable String name,@PathVariable String password,@PathVariable double amount)
	{
		Account a=bankService.withdrawLogic(accNo, name, password, amount);
		if(a!=null)
		{
		return a;
		}
		else {
			return null;
		}
	}
	

}
