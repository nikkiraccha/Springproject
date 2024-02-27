package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String ename;
	private String designation;
	private String email;
	private long mobile;
	private String gender;
	private String city;
	private String state;
	private String country;
	private String address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String ename, String designation, String email, long mobile, String gender, String city,
			String state, String country, String address) {
		super();
		this.id = id;
		this.ename = ename;
		this.designation = designation;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.city = city;
		this.state = state;
		this.country = country;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", designation=" + designation + ", email=" + email
				+ ", mobile=" + mobile + ", gender=" + gender + ", city=" + city + ", state=" + state + ", country="
				+ country + ", address=" + address + "]";
	}
	
	

}
