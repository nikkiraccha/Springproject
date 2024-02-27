package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Employee;
import com.web.repo.EmpRepo;

@Controller
public class EmpController {
	
	@Autowired
	private EmpRepo repo;
	
	@RequestMapping("/")
	public String homePage() {
		
		return "home";	
	}
	@RequestMapping("/addemp")
	public String addemps()
	{
		return "addemp";
	}
	@RequestMapping("/register")
	public String viewUsers(Employee emps, ModelMap model)
	{  
		repo.save(emps);
		return "success";
	}
	
	@RequestMapping("/viewemp")
	public String viewAllUserDetails(ModelMap model)
	{
		model.put("emps",repo.findAll());
		return "viewform";
	}
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{   repo.deleteById(id);
		return "redirect:/viewemp";
		
	}
	
	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable int id,ModelMap model)
	{
		model.put("command", repo.findById(id).get());
		return "edituser";
		
	}
	@RequestMapping("/editandsave")
	public String editAndSave(Employee users,ModelMap model)
	{   repo.save(users);
		return "redirect:/viewemp";
		
	}
	@RequestMapping("/reset")
	public String resetEmp()
	{
		return "addemp";
	}

}
