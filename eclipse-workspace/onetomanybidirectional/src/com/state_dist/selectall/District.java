package com.state_dist.selectall;

public class District {

	private Integer distid;
	private String distname;
	private Integer stateid;
	private State stObject;
	public Integer getDistid() {
		return distid;
	}
	public void setDistid(Integer distid) {
		this.distid = distid;
	}
	public String getDistname() {
		return distname;
	}
	public void setDistname(String distname) {
		this.distname = distname;
	}
	public Integer getStateid() {
		return stateid;
	}
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}
	public State getStObject() {
		return stObject;
	}
	public void setStObject(State stObject) {
		this.stObject = stObject;
	}	
}