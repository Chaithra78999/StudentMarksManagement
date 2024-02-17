package com.student.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String address;
	

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String address, String phNo, boolean status, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
		this.status = status;
		this.students = students;
	}

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

	@Column(unique = true)
	private String phNo;
	private boolean status=Boolean.TRUE;
	
	//one teacher can teach many students
	@OneToMany(mappedBy = "teacher",cascade = CascadeType.PERSIST) //teacher id will be foreign key
	@JsonIgnoreProperties("teacher")
	List<Student> students;//in students table
	}
//teacher_id