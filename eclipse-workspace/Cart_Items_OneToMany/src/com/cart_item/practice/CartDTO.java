package com.cart_item.practice;

import java.util.Set;

public class CartDTO {

	private Integer cid;
	private String name;
	private Set sandal;

	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Set getSandal() {
		return sandal;
	}
	public void setSandal(Set sandal) {
		this.sandal = sandal;
	}
}
