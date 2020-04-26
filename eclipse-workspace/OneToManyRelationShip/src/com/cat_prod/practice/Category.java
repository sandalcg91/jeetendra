package com.cat_prod.practice;

import java.util.Set;

public class Category {

	private Integer catid;
	private String catname;
	private Set products;
	public Integer getCatid() {
		return catid;
	}
	public void setCatid(Integer catid) {
		this.catid = catid;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public Set getProducts() {
		return products;
	}
	public void setProducts(Set products) {
		this.products = products;
	}
	
	
}
