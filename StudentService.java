package com.student.service;

import java.util.List;

import com.student.entities.Student;
import com.student.model.StudentDTO;

public interface StudentService
{
 StudentDTO createStudent(Student student);
List<StudentDTO> getAllStudents();
StudentDTO getStudentById(int id);
StudentDTO updateStudent(int id,Student student);
String deleteStudent(int id);
}
