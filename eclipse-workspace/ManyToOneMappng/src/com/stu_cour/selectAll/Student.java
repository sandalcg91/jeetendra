package com.stu_cour.selectAll;

public class Student {

	private Integer rollno;
	private String sname;
	private Course courseObject;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getCourseObject() {
		return courseObject;
	}
	public void setCourseObject(Course courseObject) {
		this.courseObject = courseObject;
	}
}
