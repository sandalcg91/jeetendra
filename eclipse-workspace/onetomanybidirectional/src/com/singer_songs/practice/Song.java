package com.singer_songs.practice;

public class Song {

	private Integer songid;
	private String songname;
	private String duration;
	private Integer singerid;
	private Singer singObject;
	public Integer getSongid() {
		return songid;
	}
	public void setSongid(Integer songid) {
		this.songid = songid;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getSingerid() {
		return singerid;
	}
	public void setSingerid(Integer singerid) {
		this.singerid = singerid;
	}
	public Singer getSingObject() {
		return singObject;
	}
	public void setSingObject(Singer singObject) {
		this.singObject = singObject;
	}
	
}
