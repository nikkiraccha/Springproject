package com.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	private int bookId;
	private String bname;
	private String author;
	private String isbn_no;
	private String publisher_name;
	private String publisher_year;
	private double price;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(int bookId, String bname, String author, String isbn_no, String publisher_name, String publisher_year,
			double price) {
		super();
		this.bookId = bookId;
		this.bname = bname;
		this.author = author;
		this.isbn_no = isbn_no;
		this.publisher_name = publisher_name;
		this.publisher_year = publisher_year;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn_no() {
		return isbn_no;
	}
	public void setIsbn_no(String isbn_no) {
		this.isbn_no = isbn_no;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}
	public String getPublisher_year() {
		return publisher_year;
	}
	public void setPublisher_year(String publisher_year) {
		this.publisher_year = publisher_year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bname=" + bname + ", author=" + author + ", isbn_no=" + isbn_no
				+ ", publisher_name=" + publisher_name + ", publisher_year=" + publisher_year + ", price=" + price
				+ "]";
	}
	
	
}
	
	
	
	