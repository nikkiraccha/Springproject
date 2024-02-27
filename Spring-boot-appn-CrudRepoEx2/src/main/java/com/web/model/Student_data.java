package com.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student_data {
	
	@Id
	@Column(name="sid")
	private int stdid;
	@Column(name="sname")
	private String stdname;
	private String course;
	private String fee;
	public Student_data(int stdid, String stdname, String course, String fee) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.course = course;
		this.fee = fee;
	}
	public Student_data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student_data [stdid=" + stdid + ", stdname=" + stdname + ", course=" + course + ", fee=" + fee + "]";
	}
	
	
	
}
	
	