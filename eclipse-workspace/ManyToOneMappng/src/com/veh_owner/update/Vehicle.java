package com.veh_owner.update;

public class Vehicle {

	private Integer vid;
	private String vname;
	private String type;
	private Owner ownerObject;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Owner getOwnerObject() {
		return ownerObject;
	}
	public void setOwnerObject(Owner ownerObject) {
		this.ownerObject = ownerObject;
	}
	
}
