package com.student.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(length=50)
private String name;
	@Column(length=50)
private String email;
	@Column(unique=true)
private String phno;

private Boolean status=Boolean.TRUE;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String email, String phno) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phno = phno;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
}
public void setPhno(String phno) {
	this.phno = phno;
}

//many students -one teacher
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "tId")
@JsonIgnoreProperties("students")
private Teacher teacher;
public Student(int id, String name, String email, String phno, Boolean status, Teacher teacher) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phno = phno;
	this.status = status;
	this.teacher = teacher;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
}
