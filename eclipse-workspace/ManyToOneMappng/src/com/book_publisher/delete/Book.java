package com.book_publisher.delete;

public class Book {

	private Integer bookid;
	private String title;
	private Double price;
	private Integer edition;
	private Publisher pubObject;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getEdition() {
		return edition;
	}
	public void setEdition(Integer edition) {
		this.edition = edition;
	}
	public Publisher getPubObject() {
		return pubObject;
	}
	public void setPubObject(Publisher pubObject) {
		this.pubObject = pubObject;
	}
	
	
}
