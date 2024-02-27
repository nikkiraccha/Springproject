package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Product product)
	{
		Product p=productService.saveRecord(product);
		String msg=null;
		if(p!=null)
		{
			msg="data saved successfully";
			
		}
		else {
			msg="data failed";
		}
		return msg;
		
	}
	@GetMapping("/get/{pId}")
	public Product getOne(@PathVariable int pId)
	{
		Product get=productService.getOneRecord(pId);
		return get;
	}
	@GetMapping("/getAll")
	public List<Product> getAll()
	{
		List<Product> getAll=productService.getAllRecord();
		return getAll;
	}
	@DeleteMapping("delete/{pId}")
	public void delete(@PathVariable int pId)
	{
		productService.deleteRecord(pId);
	}
	@PutMapping("update/{pId}")
	public Product update(@RequestBody Product product,@PathVariable int pId)
	{
		Product p=productService.updateRecord(product, pId);
		return p;
	}

}
