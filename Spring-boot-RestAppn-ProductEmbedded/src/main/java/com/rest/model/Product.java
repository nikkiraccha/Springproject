package com.rest.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int pId;
	private String pName;
	private String pType;
	private String category;
	private int price;
	private double finalPrice;

	@Embedded
	private Charges charges;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pId, String pName, String pType, String category, int price, Charges charges, Double finalPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pType = pType;
		this.category = category;
		this.price = price;
		this.charges = charges;
		this.finalPrice = finalPrice;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Charges getCharges() {
		return charges;
	}
	public void setCharges(Charges charges) {
		this.charges = charges;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalprice) {
		this.finalPrice = finalprice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pType=" + pType + ", category=" + category + ", price="
				+ price + ", charges=" + charges + ", finalPrice=" + finalPrice + "]";
	}
	
	
	
	

}
