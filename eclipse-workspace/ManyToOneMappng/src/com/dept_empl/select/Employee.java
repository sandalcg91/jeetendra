package com.dept_empl.select;

public class Employee {

	private Integer eid;
	private String firstname;
	private String lastname;
	private Double salary;
	private Department deptObject;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
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
	public Department getDeptObject() {
		return deptObject;
	}
	public void setDeptObject(Department deptObject) {
		this.deptObject = deptObject;
	}
	
}
