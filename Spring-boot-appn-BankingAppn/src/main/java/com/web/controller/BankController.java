package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Account;
import com.web.service.BankServiceImpl;

@Controller
public class BankController {
	
	@Autowired
	private BankServiceImpl service;
	
	@RequestMapping("/home")
	public String homePage() {
		
		return "home";
	}
	@RequestMapping("/account")
	public String accountPage() {
		
		return "account";
	}
	@RequestMapping("/register")
	public String saveMarks(Account account)
	{
		Account s=service.saveAccount(account);
		return "success";
	}
	@RequestMapping("/clear")
	public String clearAccount()
	{
		return "account";
	}
	@RequestMapping("/balance")
	public String balanceForm()
	{
		return "balance";
	}
	@RequestMapping("/balcheck")
	public String balanceCheck(@RequestParam int accNo,ModelMap model)
	{
		model.put("balance",service.getAccount(accNo));
		
		return "balDetl";		
	}
	@RequestMapping("/deposit")
	public String depositForm()
	{
		return "deposit";
	}
	@RequestMapping("/add")
	public String deposite(@RequestParam int accNo,@RequestParam String name,@RequestParam String password,@RequestParam double amount,ModelMap model)
	{
		Account a=service.getAccount(accNo);
	   Account account=service.addAmount(accNo,amount, name, password);
	   if(account!=null) {
		model.put("cAmount",a.getAmount());
		model.put("dAmount", amount);
		model.put("adding",account);
		return "add";
	   }
	   else
	   {
		   return "redirect:/deposit";
	   }
	}
	
	@RequestMapping("/withdraw")
	public String withdrawForm() {
		
		return "withdraw";
		
	}
	@RequestMapping("/remove")
	public String withdraw(@RequestParam int accNo,@RequestParam double amount,ModelMap model)
	{
		
		model.put("withdraw", amount);
		model.put("removing", service.withdrawAmount(accNo, amount));
		return "remove";
	}
	@RequestMapping("/trasfer")
	public String transferForm() {
		
		return "transfer";
		
	}
	@RequestMapping("/trans")
	public String transfer(@RequestParam int accNo,@RequestParam int accNo2,double amount,ModelMap model)
	{
		model.put("accNo", accNo);
		model.put("accNo2", accNo2);
		model.put("transfer", service.transferAmount(accNo, accNo2, amount));
		return "trans";
	}
	


}
