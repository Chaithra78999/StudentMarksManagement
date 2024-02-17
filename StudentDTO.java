package com.student.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.student.entities.Teacher;
public class StudentDTO 
{
	@NotNull
private int id;
	@NotNull
	@Size(min=3,max=5,message="Name should have min 3 to max 50 characters allowed")
private String name;
	@NotNull
	@Size(min=3,max=5,message="min 3 to max 50 characters allowed")
private String email;
	@NotNull
private String phno;
	
	private Teacher teacher;
public Teacher getTeacher() {
		return teacher;
	}
	public StudentDTO(@NotNull int id,
		@NotNull @Size(min = 3, max = 5, message = "Name should have min 3 to max 50 characters allowed") String name,
		@NotNull @Size(min = 3, max = 5, message = "min 3 to max 50 characters allowed") String email,
		@NotNull String phno, Teacher teacher) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phno = phno;
	this.teacher = teacher;
}
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}

}
