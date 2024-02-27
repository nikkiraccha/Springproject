package com.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/payment")
public class MypaymentController {
	
	@GetMapping("/test")
	public String home()
	{
		return "welcome";
	}
	@GetMapping("/pay/{price}")
	public String paymentMethod(@PathVariable double price)
	{
		return "your Account"+price+"successful paid";
	}
	
	
}
