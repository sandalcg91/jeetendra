package com.vend_cust.all;

import java.util.Set;

public class Vendor {

	private Integer vid;
	private String vname;
	private Set customer;
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Set getCustomer() {
		return customer;
	}
	public void setCustomer(Set customer) {
		this.customer = customer;
	}
}
