package com.eureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eureka.entity.Citizen;
import com.eureka.entity.RequiredResponse;
import com.eureka.model.VaccinationCenter;
import com.eureka.repo.VaccinationRepo;

@RestController
@RequestMapping("/vaccinationCenter")
public class VaccinationController{
	
	@Autowired
	private VaccinationRepo vaccinationRepo;
	@Autowired
	private RestTemplate restTemplate;
	@PostMapping("/add")
	public ResponseEntity<VaccinationCenter> addCenter(@RequestBody VaccinationCenter newCenter){
		
		VaccinationCenter center=vaccinationRepo.save(newCenter);
		return new ResponseEntity<>(center,HttpStatus.OK);
	}
	 @GetMapping("/get/{id}")
	public VaccinationCenter getVaccinationRecord(@PathVariable int id) 
	 { 
	  VaccinationCenter getOneRecord=vaccinationRepo.findById(id).get(); 
	  return getOneRecord; 
	 } 
	  
	 @GetMapping("/getData/{id}") 
	 public ResponseEntity<RequiredResponse> getdata(@PathVariable int id) 
	 { 
	  RequiredResponse requiredResponse=new RequiredResponse(); 
	   
	  // This is for Vaccination Center Details 
	  VaccinationCenter center=vaccinationRepo.findById(id).get(); 
	  requiredResponse.setCenter(center); 
	   
	 // Then Get citizen registered to Vaccination Details 
	 List<Citizen> listOfCitizens=restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/"+id,List.class); 
	 requiredResponse.setCitizens(listOfCitizens);  
	 return new ResponseEntity<RequiredResponse>(requiredResponse,HttpStatus.OK); 
	   
	   
	 } 
	}
		





