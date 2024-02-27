package com.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.model.Mobiles_data;
import com.web.repo.MobileRepo;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private MobileRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
    @Override
	public void run(String... args) throws Exception {
	
		// insertion
//		Mobiles_data s1=new Mobiles_data(309,"nv","vivo","8gb","64gb","android","i1","400pixl","399pixl",300000.0,"9876543456ok");
//		Mobiles_data s2=new Mobiles_data(310,"nv","oneplus","8gb","64gb","android","i1","350pixl","400pixl",1000000.0,"98765438766ok");
//	    repo.save(s1);
//		repo.save(s2);
//		System.out.println("records are inserted");
//		
//		System.out.println("=== GET ONE RECORD FROM MOBILE_DATA");
//		Mobiles_data getOne=repo.findById(301).get();
//		System.out.println(getOne);
//		
		
//	System.out.println("=== GET ALL RECORDS FROM STUDENT_DATA");
//	List<Mobiles_data> list=(List<Mobiles_data>) repo.findAll();
//	System.out.println(list);
	
//	System.out.println("===UPDATE mobile RECORDS==");
//	Mobiles_data old=repo.findById(301).get();
//	Mobiles_data newdata=new Mobiles_data();
//	newdata.setCompany("oppo12");
//	newdata.setMname("abc");
//	newdata.setPrice(7600000.0);
//	old.setCompany(newdata.getCompany());
//	old.setMname(newdata.getMname());
//	old.setPrice(newdata.getPrice());
//	repo.save(old);
//	System.out.println("updated...");
	
	System.out.println("== delete mobile record==");
	repo.deleteById(310);
	System.out.println("deleted");

		
		
	}

}
