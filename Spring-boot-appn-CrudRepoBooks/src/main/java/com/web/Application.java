package com.web;



import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.model.Books;
import com.web.repo.BookRepo;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private BookRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
    @Override
	public void run(String... args) throws Exception {
	
		 //insertion
//		Books b1=new Books(06,"chinnu","suga","56789","bighit","2003",600);
//		Books b2=new Books(07,"manas","nasa","56789","cartio","1995",1000);
//		Books b3=new Books(8,"bunny","mochhi","567845","gucci","1995",800);
//		Books b4=new Books(9,"chanti","rm","5675678","bighit","2000",900);
//		Books b5=new Books(10,"ruchi","jk","567654","bighit","2001",600);
//
//
//	    repo.save(b1);
//		repo.save(b2);
//		repo.save(b3);
//		repo.save(b4);
//		repo.save(b5);
//		
//		System.out.println("records are inserted");
////		
//		System.out.println("=== GET ONE RECORD books table");
//		Books getOne=repo.findById(10).get();
//		System.out.println(getOne);
//		
		
//	System.out.println("=== GET ALL RECORDS FROM books");
//	List<Books> list=(List<Books>) repo.findAll();
//	System.out.println(list);
	
//	System.out.println("===UPDATE books RECORDS==");
//	Books old=repo.findById(10).get();
//	Books newdata=new Books();
//	newdata.setPrice(500.0);
//	newdata.setPublisher_name("savage");
//	newdata.setBname("ruchitha");
//	old.setPrice(newdata.getPrice());
//	old.setPublisher_name(newdata.getPublisher_name());
//	old.setBname(newdata.getBname());
//	repo.save(old);
//	System.out.println("updated...");
	
	System.out.println("== delete book record==");
	repo.deleteById(6);
	System.out.println("deleted");

//		
//		
	}

}

