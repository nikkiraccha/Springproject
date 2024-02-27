package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Electricity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private int current_Reading;
	private int previous_Reading;
	private int units;
	private double totalBill;
	public Electricity(int cId, String name, int current_Reading, int previous_Reading, int units, double totalBill) {
		super();
		this.cId = cId;
		this.name = name;
		this.current_Reading = current_Reading;
		this.previous_Reading = previous_Reading;
		this.units = units;
		this.totalBill = totalBill;
	}
	public Electricity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrent_Reading() {
		return current_Reading;
	}
	public void setCurrent_Reading(int current_Reading) {
		this.current_Reading = current_Reading;
	}
	public int getPrevious_Reading() {
		return previous_Reading;
	}
	public void setPrevious_Reading(int previous_Reading) {
		this.previous_Reading = previous_Reading;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	@Override
	public String toString() {
		return "Electricity [cId=" + cId + ", name=" + name + ", current_Reading=" + current_Reading
				+ ", previous_Reading=" + previous_Reading + ", units=" + units + ", totalBill=" + totalBill + "]";
	}
	
	

}
