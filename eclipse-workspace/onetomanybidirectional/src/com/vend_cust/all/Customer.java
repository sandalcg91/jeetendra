package com.vend_cust.all;

public class Customer {

	private Integer cid;
	private String name;
	private long mobile;
	private Integer vendorId;
	private Vendor vendObject;
	
	public Vendor getVendObject() {
		return vendObject;
	}
	public void setVendObject(Vendor vendObject) {
		this.vendObject = vendObject;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
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
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
}