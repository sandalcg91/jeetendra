package com.team_player.practice;

public class Players {

	private Integer pid;
	private String pname;
	private Integer ranking;
	private Integer teamid;
	private Team teamObject;
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
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	public Integer getTeamid() {
		return teamid;
	}
	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}
	public Team getTeamObject() {
		return teamObject;
	}
	public void setTeamObject(Team teamObject) {
		this.teamObject = teamObject;
	}
	
}
