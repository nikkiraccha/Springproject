package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Users;
import com.web.repo.UsersRepo;

@Controller
public class UserController {
	
	@Autowired
	private UsersRepo repo;
	
	@RequestMapping("/")
	public String homePage() {
		
		return "home";	
	}
	@RequestMapping("/adduser")
	public String addUser()
	{
		return "addUser";
	}
	@RequestMapping("/register")
	public String viewUsers(Users users, ModelMap model)
	{  
		repo.save(users);
		return "success";
	}
	
	@RequestMapping("/viewusers")
	public String viewAllUserDetails(ModelMap model)
	{
		model.put("users",repo.findAll());
		return "viewform";
	}
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{   repo.deleteById(id);
		return "redirect:/viewusers";
		
	}
	
	@RequestMapping("/edit/{id}")
	public String editForm(@PathVariable int id,ModelMap model)
	{
		model.put("command", repo.findById(id).get());
		return "edituser";
		
	}
	@RequestMapping("/editandsave")
	public String editAndSave(Users users,ModelMap model)
	{   repo.save(users);
		return "redirect:/viewusers";
		
	}

}
