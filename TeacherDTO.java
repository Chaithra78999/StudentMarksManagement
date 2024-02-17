package com.student.model;

import java.util.List;

import com.student.entities.*;
public class TeacherDTO {
private int id;
	
	private String name;
	
	private String address;
	
	private String phNo;
	private boolean status=Boolean.TRUE;
	
	
	List<Student> students;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhNo() {
		return phNo;
	}


	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
