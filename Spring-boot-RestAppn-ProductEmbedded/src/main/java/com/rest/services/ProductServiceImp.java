package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Charges;
import com.rest.model.Product;
import com.rest.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product saveRecord(Product product) {
	
		double dis=0.0,prodGst=0.0;
		
		double finalprice;
		 double p = product.getPrice();
		 
	        String compare=product.getCharges().getCategories();

	        if (product.getCategory().equals(compare)) {
	            dis = p * product.getCharges().getDiscount();
	            prodGst = p * product.getCharges().getGst();
	        }

	        finalprice = product.getPrice() + prodGst - dis;       
	        product.setFinalPrice(finalprice);
	       
	        Product prod = productRepo.save(product);
	        return prod;

	
	}

	@Override
	public Product updateRecord(Product product, int pId) {
		
		Product old=productRepo.findById(pId).get();
		old.setpId(product.getpId());
		old.setpName(product.getpName());
		old.setPrice(product.getPrice());
		old.setpType(product.getpType());
		old.setCategory(product.getCategory());
		old.setCharges(product.getCharges());
		
      double dis=0.0,prodGst=0.0;
		
		double finalprice;
		 double p = product.getPrice();
		 
	        String compare=product.getCharges().getCategories();

	        if (product.getCategory().equals(compare)) {
	            dis = p * product.getCharges().getDiscount();
	            prodGst = p * product.getCharges().getGst();
	        }

	        finalprice = product.getPrice() + prodGst - dis;       
	        old.setFinalPrice(finalprice);
	       
	        Product prod = productRepo.save(old);
	        return prod;
		
	}

	@Override
	public void deleteRecord(int pId) {
		productRepo.deleteById(pId);
		
	}

	@Override
	public Product getOneRecord(int pId) {
		Product p=productRepo.findById(pId).get();
		return p;
	}

	@Override
	public List<Product> getAllRecord() {
		List<Product> l=productRepo.findAll();
		return l;
	}
	
	

}
