package com.state_country.practice;

public class State {

	private Integer sid;
	private String sname;
	private String cm;
	private Country cntryObject;
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
	public String getCm() {
		return cm;
	}
	public void setCm(String cm) {
		this.cm = cm;
	}
	public Country getCntryObject() {
		return cntryObject;
	}
	public void setCntryObject(Country cntryObject) {
		this.cntryObject = cntryObject;
	}
	
}
