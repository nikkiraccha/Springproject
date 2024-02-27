package com.rest.services;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {
	
	public Product saveRecord(Product product);
	public Product updateRecord(Product product,int pId);
	public void deleteRecord(int pId);
	public Product getOneRecord(int pId);
	public  List<Product> getAllRecord();

}
