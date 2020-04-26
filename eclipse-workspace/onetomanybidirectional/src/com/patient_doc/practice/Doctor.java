package com.patient_doc.practice;

import java.util.Set;

public class Doctor {

	private Integer docid;
	private String dname;
	private String specialist;
	private Set patient;
	public Integer getDocid() {
		return docid;
	}
	public void setDocid(Integer docid) {
		this.docid = docid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public Set getPatient() {
		return patient;
	}
	public void setPatient(Set patient) {
		this.patient = patient;
	}
	
}
