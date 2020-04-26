package com.state_dist.selectall;

import java.util.Set;

public class State {

	private Integer stid;
	private String stname;
	private Integer population;
	private Set district;
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Set getDistrict() {
		return district;
	}
	public void setDistrict(Set district) {
		this.district = district;
	}	
}