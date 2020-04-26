package com.singer_songs.practice;

import java.util.Set;

public class Singer {

	private Integer sid;
	private String sname;
	private String award;
	private Set song;
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
	public String getAward() {
		return award;
	}
	public void setAward(String award) {
		this.award = award;
	}
	public Set getSong() {
		return song;
	}
	public void setSong(Set song) {
		this.song = song;
	}	
}