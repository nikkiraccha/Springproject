package com.eureka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private int vaccinationCenterId;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(int cid, String name, int vaccinationCenterId) {
		super();
		this.cid = cid;
		this.name = name;
		this.vaccinationCenterId = vaccinationCenterId;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVaccinationCenterId() {
		return vaccinationCenterId;
	}
	public void setVaccinationCenterId(int vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}
	@Override
	public String toString() {
		return "Citizen [cid=" + cid + ", name=" + name + ", vaccinationCenterId=" + vaccinationCenterId + "]";
	}
	
	

}
