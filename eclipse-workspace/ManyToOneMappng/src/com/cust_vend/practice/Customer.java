package com.cust_vend.practice;

public class Customer {

	private Integer custid;
	private String custname;
	private Long mobile;
	private Vendor parentObject;
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Vendor getParentObject() {
		return parentObject;
	}
	public void setParentObject(Vendor parentObject) {
		this.parentObject = parentObject;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
}
