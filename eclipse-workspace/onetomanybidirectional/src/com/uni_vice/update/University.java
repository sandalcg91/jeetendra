package com.uni_vice.update;

import java.util.Set;

public class University {

	private Integer uniid;
	private String uniname;
	private String ranking;
	private Set viceChan;
	public Integer getUniid() {
		return uniid;
	}
	public void setUniid(Integer uniid) {
		this.uniid = uniid;
	}
	public String getUniname() {
		return uniname;
	}
	public void setUniname(String uniname) {
		this.uniname = uniname;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public Set getViceChan() {
		return viceChan;
	}
	public void setViceChan(Set viceChan) {
		this.viceChan = viceChan;
	}
	
}
