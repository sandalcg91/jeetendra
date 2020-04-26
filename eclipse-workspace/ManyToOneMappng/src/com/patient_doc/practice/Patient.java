package com.patient_doc.practice;

public class Patient {

	private Integer pid;
	private String pname;
	private String disease;
	private Doctor docObject;
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
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Doctor getDocObject() {
		return docObject;
	}
	public void setDocObject(Doctor docObject) {
		this.docObject = docObject;
	}
}