package com.rest.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Charges {
	private double discount;
	private double gst;
	private int deliveryCharge;
	private String categories;
	
	public Charges() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Charges(double discount, double gst, int deliveryCharge, String categories) {
		super();
		this.discount = discount;
		this.gst = gst;
		this.deliveryCharge = deliveryCharge;
		this.categories = categories;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public int getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(int deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Charges [discount=" + discount + ", gst=" + gst + ", deliveryCharge=" + deliveryCharge + ", categories="
				+ categories + "]";
	}
	
	

}
