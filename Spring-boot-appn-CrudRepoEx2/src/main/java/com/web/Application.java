package com.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.model.Student_data;
import com.web.repo.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		// insertion
//		Student_data s1=new Student_data(105,"ruchi","mbbs","80000.0");
//		Student_data s2=new Student_data(106,"ramya","spring","30000");
//		repo.save(s1);
//		repo.save(s2);
//		System.out.println("records are inserted");
//		
//		System.out.println("=== GET ONE RECORD FROM STUDENT_DATA");
//		Student_data getOne=repo.findById(101).get();
//		System.out.println(getOne);
//		
		
//	System.out.println("=== GET ALL RECORDS FROM STUDENT_DATA");
//	List<Student_data> list=(List<Student_data>) repo.findAll();
//	System.out.println(list);
//	
//	System.out.println("===UPDATE STUDENT RECORDS==");
//	Student_data old=repo.findById(105).get();
//	Student_data newdata=new Student_data();
//	newdata.setStdname("chinnu");
//	newdata.setCourse("AI");
//	newdata.setFee("1000000");
//	old.setStdname(newdata.getStdname());
//	old.setCourse(newdata.getCourse());
//	old.setFee(newdata.getFee());
//	repo.save(old);
//	System.out.println("updated...");
//
		
		System.out.println("== delete student record==");
		repo.deleteById(101);
		System.out.println("deleted");

					
	}

}
