package com.stock.practice;

import java.util.Set;

public class Stock {

	private Integer sid;
	private String sname;
	private Set stock_record;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set getStock_record() {
		return stock_record;
	}
	public void setStock_record(Set stock_record) {
		this.stock_record = stock_record;
	}
}