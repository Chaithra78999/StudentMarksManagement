package com.student.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.entities.Teacher;
import com.student.exception.ResourceNotFoundException;
import com.student.model.TeacherDTO;
import com.student.repository.StudentRepository;
import com.student.repository.TeacherRepository;
import com.student.service.TeacherService;
import com.student.util.Converter;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Converter converter;
	
	

	@Override
	public String assignStudentToTeacher(int tid, int sid) {
		Student s=studentRepository.findById(sid).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", sid));
		
		Teacher  t=teacherRepository.findById(tid).orElseThrow(()->
		new ResourceNotFoundException("Teacher", "Id", tid));
		
		List<Student> students=new ArrayList<>();
		students.add(s);
		
		//assign students to teacher
		t.setStudents(students);
		
		//assign teacher to student
		s.setTeacher(t);
		
		teacherRepository.save(t);
		return "Students assigned to teacher successfully";
	}

	@Override
	public TeacherDTO registerTeacher(Teacher teacher) {
		return converter.convertToTeacherDTO(teacherRepository.save(teacher));
	}
}