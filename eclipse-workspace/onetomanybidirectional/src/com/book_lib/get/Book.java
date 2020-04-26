package com.book_lib.get;

import java.util.Set;

public class Book {

	private Integer bookid;
	private String title;
	private Integer price;
	private Set library;
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Set getLibrary() {
		return library;
	}
	public void setLibrary(Set library) {
		this.library = library;
	}	
}