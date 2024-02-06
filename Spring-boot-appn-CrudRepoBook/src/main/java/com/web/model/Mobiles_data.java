package com.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobiles_data {
	
	@Id
	private int mobileNo;
	private String mname;
	private String company;
	private String ram;
	private String rom;
	private String os;
	private String processer;
	private String f_cam;
	private String b_cam;
	private double price;
	private String imei;
	public Mobiles_data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobiles_data(int mobileNo, String mname, String company, String ram, String rom, String os, String processer,
			String f_cam, String b_cam, double price, String imei) {
		super();
		this.mobileNo = mobileNo;
		this.mname = mname;
		this.company = company;
		this.ram = ram;
		this.rom = rom;
		this.os = os;
		this.processer = processer;
		this.f_cam = f_cam;
		this.b_cam = b_cam;
		this.price = price;
		this.imei = imei;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProcesser() {
		return processer;
	}
	public void setProcesser(String processer) {
		this.processer = processer;
	}
	public String getF_cam() {
		return f_cam;
	}
	public void setF_cam(String f_cam) {
		this.f_cam = f_cam;
	}
	public String getB_cam() {
		return b_cam;
	}
	public void setB_cam(String b_cam) {
		this.b_cam = b_cam;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	@Override
	public String toString() {
		return "Mobiles [mobileNo=" + mobileNo + ", mname=" + mname + ", company=" + company + ", ram=" + ram + ", rom="
				+ rom + ", os=" + os + ", processer=" + processer + ", f_cam=" + f_cam + ", b_cam=" + b_cam + ", price="
				+ price + ", imei=" + imei + "]";
	}
	
	
	
}
	
	
	
	