package com.dept_empl.select;

import java.util.Set;

public class Department {

	private Integer deptid;
	private String deptname;
	private String location;
	private Set emp;
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set getEmp() {
		return emp;
	}
	public void setEmp(Set emp) {
		this.emp = emp;
	}
}