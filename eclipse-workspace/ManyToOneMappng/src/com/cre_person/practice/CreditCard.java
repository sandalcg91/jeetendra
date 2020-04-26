package com.cre_person.practice;

public class CreditCard {

	private Long ccno;
	private String bankname;
	private Integer cclimit;
	private Person perObject;
	public Long getCcno() {
		return ccno;
	}
	public void setCcno(Long ccno) {
		this.ccno = ccno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	public Integer getCclimit() {
		return cclimit;
	}
	public void setCclimit(Integer cclimit) {
		this.cclimit = cclimit;
	}
	public Person getPerObject() {
		return perObject;
	}
	public void setPerObject(Person perObject) {
		this.perObject = perObject;
	}
	
}
