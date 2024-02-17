package com.student.serviceImpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.exception.ResourceNotFoundException;
import com.student.model.StudentDTO;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import com.student.util.Converter;

@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	StudentRepository studentrepository;
	
	@Autowired
	Converter converter;

	@Override
	public StudentDTO createStudent(Student student) {
		// TODO Auto-generated method stub
		Student stud=studentrepository.save(student);
		return converter.convertToStudentDTO(stud);
	}

	@Override
	public List<StudentDTO> getAllStudents()
	{
List<Student> students=studentrepository.findAll();
		
		//list of type DTO
		List<StudentDTO> dtoList=new ArrayList<>();
		for(Student s:students)
		{
			dtoList.add(converter.convertToStudentDTO(s));
		}
		
		return dtoList;
	}
	@Override
	public StudentDTO getStudentById(int id) {
		//Student s=studentrepository.findById(id).get();
		Student s=studentrepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", id));
		return converter.convertToStudentDTO(s);
	}

	@Override
	public StudentDTO updateStudent(int id, Student student) {
		Student s=studentrepository.findById(id).get();
		s.setName(student.getName());
		s.setEmail(student.getEmail());
		s.setPhno(student.getPhno());
		
		Student stud=studentrepository.save(s);
		return converter.convertToStudentDTO(stud);
	}

	@Override
	public String deleteStudent(int id) {
		studentrepository.deleteById(id);
		return "Students got deleted successfully!!";
				
	}
}
