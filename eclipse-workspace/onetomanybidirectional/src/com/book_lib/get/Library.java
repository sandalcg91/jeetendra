package com.book_lib.get;

public class Library {

	private Integer libid;
	private String libname;
	private String location;
	private Integer bookid;
	private Book bookObject;
	public Integer getLibid() {
		return libid;
	}
	public void setLibid(Integer libid) {
		this.libid = libid;
	}
	public String getLibname() {
		return libname;
	}
	public void setLibname(String libname) {
		this.libname = libname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Book getBookObject() {
		return bookObject;
	}
	public void setBookObject(Book bookObject) {
		this.bookObject = bookObject;
	}
	
}
