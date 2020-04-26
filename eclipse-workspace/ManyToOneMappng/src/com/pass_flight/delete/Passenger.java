package com.pass_flight.delete;

public class Passenger {

	private Integer pid;
	private String pname;
	private Long mobile;
	/*private String pfrom;
	private String to;
	*/private Flight fltObject;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	/*public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}*/
	public Flight getFltObject() {
		return fltObject;
	}
	public void setFltObject(Flight fltObject) {
		this.fltObject = fltObject;
	}
	
}
