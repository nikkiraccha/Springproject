package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private long mobile;
	private String prodName;
	private double price;
	private int quantity;
	private double total;
	private double discount;
	private double gst_amt;
	private double invoice_bill;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String name, long mobile, String prodName, double price, int quantity, double total,
			double discount, double gst_amt, double invoice_bill) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobile = mobile;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.gst_amt = gst_amt;
		this.invoice_bill = invoice_bill;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst_amt() {
		return gst_amt;
	}
	public void setGst_amt(double gst_amt) {
		this.gst_amt = gst_amt;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobile=" + mobile + ", prodName=" + prodName + ", price="
				+ price + ", quantity=" + quantity + ", total=" + total + ", discount=" + discount + ", gst_amt="
				+ gst_amt + ", invoice_bill=" + invoice_bill + "]";
	}
	
	
	
	

}
