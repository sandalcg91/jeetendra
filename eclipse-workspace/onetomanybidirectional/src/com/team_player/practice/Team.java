package com.team_player.practice;

import java.util.Set;

public class Team {

	private Integer tid;
	private String tname;
	private String boardname;
	private Set player;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getBoardname() {
		return boardname;
	}
	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}
	public Set getPlayer() {
		return player;
	}
	public void setPlayer(Set player) {
		this.player = player;
	}
}