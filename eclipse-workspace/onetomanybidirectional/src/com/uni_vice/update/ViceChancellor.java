package com.uni_vice.update;

public class ViceChancellor {

	private Integer vcid;
	private String vcname;
	private String degree;
	private Integer univerid;
	private University uniObject;
	public Integer getVcid() {
		return vcid;
	}
	public void setVcid(Integer vcid) {
		this.vcid = vcid;
	}
	public String getVcname() {
		return vcname;
	}
	public void setVcname(String vcname) {
		this.vcname = vcname;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Integer getUniverid() {
		return univerid;
	}
	public void setUniverid(Integer univerid) {
		this.univerid = univerid;
	}
	public University getUniObject() {
		return uniObject;
	}
	public void setUniObject(University uniObject) {
		this.uniObject = uniObject;
	}
}