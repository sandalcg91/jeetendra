package com.teach_sub.update;

import java.util.Set;

public class Teacher {

	private Integer tid;
	private String firstname;
	private String lastname;
	private Double salary;
	private Set subject;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Set getSubject() {
		return subject;
	}
	public void setSubject(Set subject) {
		this.subject = subject;
	}
	
	
}
