package com.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Student;
import com.student.model.StudentDTO;
import com.student.service.StudentService;
import com.student.util.Converter;

@RestController

public class StudentController 
{

	@Autowired
	StudentService studentservice;
	
	@Autowired
	Converter converter;
	@PostMapping("/api/createStudent")
	StudentDTO createStudent(@RequestBody Student student)
	{
		return studentservice.createStudent(student);
	}
	/*@PostMapping("/api/createStudent")
	ResponseEntity<StudentDTO> createStudent(@Valid @RequestBody StudentDTO studentDTO)
	{
		final Student student=converter.convertToStudentEntity(studentDTO);
		return new ResponseEntity<StudentDTO>(studentservice.createStudent(student),HttpStatus.CREATED);
	}
	*/
	@GetMapping("/api/getAllStudents")
	List<StudentDTO> getAllStudents()
	{
		return studentservice.getAllStudents();
	}
	@GetMapping("/getStudentById/{sid}")
	   StudentDTO getStudentById(@PathVariable("sid") int id)
	   {
		   return studentservice.getStudentById(id);
	   }
		
		@PutMapping("/updateStudent/{id}")
	StudentDTO	updateStudent(@Valid @PathVariable int id,@RequestBody StudentDTO studentDTO)
	{
			final Student student=converter.convertToStudentEntity(studentDTO);
		return studentservice.updateStudent(id, student);
	}
		@DeleteMapping("/deleteStudent/{id}")
		String deleteStudent(@PathVariable int id)
		{
			return studentservice.deleteStudent(id);
		}
}
