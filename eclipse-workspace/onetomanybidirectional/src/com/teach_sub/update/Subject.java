package com.teach_sub.update;


public class Subject {

	private Integer subid;
	private String subname;
	private Integer tid;
	private Teacher teachObject;
	public Integer getSubid() {
		return subid;
	}
	public void setSubid(Integer subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Teacher getTeachObject() {
		return teachObject;
	}
	public void setTeachObject(Teacher teachObject) {
		this.teachObject = teachObject;
	}
	
}