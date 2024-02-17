package com.student.service;

import com.student.entities.Teacher;
import com.student.model.TeacherDTO;

public interface TeacherService 
{
	TeacherDTO	registerTeacher(Teacher teacher);
	String assignStudentToTeacher(int tid,int sid);
}
