package com.clothshop.practice;

public class Cloths {

	private Integer cid;
	private String cname;
	private String types;
	private Double price;
	private Shop shopObject;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Shop getShopObject() {
		return shopObject;
	}
	public void setShopObject(Shop shopObject) {
		this.shopObject = shopObject;
	}
	
	
}
