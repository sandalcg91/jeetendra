package com.act_movi.delete;

public class Movie {

	private Integer mveid;
	private String mvename;
	private String duration;
	private Integer actid;
	private Actor actObject;
	public Integer getMveid() {
		return mveid;
	}
	public void setMveid(Integer mveid) {
		this.mveid = mveid;
	}
	public String getMvename() {
		return mvename;
	}
	public void setMvename(String mvename) {
		this.mvename = mvename;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getActid() {
		return actid;
	}
	public void setActid(Integer actid) {
		this.actid = actid;
	}
	public Actor getActObject() {
		return actObject;
	}
	public void setActObject(Actor actObject) {
		this.actObject = actObject;
	}
}
