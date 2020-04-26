package com.act_movi.delete;

import java.util.Set;

public class Actor {

	private Integer actid;
	private String actname;
	private Set movie;
	public Integer getActid() {
		return actid;
	}
	public void setActid(Integer actid) {
		this.actid = actid;
	}
	public String getActname() {
		return actname;
	}
	public void setActname(String actname) {
		this.actname = actname;
	}
	public Set getMovie() {
		return movie;
	}
	public void setMovie(Set movie) {
		this.movie = movie;
	}
}
