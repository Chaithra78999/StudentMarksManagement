package com.student.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Teacher;
import com.student.model.TeacherDTO;
import com.student.service.TeacherService;
import com.student.util.Converter;

@RestController
@RequestMapping("/api")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private Converter converter;
	@PostMapping("/createTeacher")	
	 ResponseEntity<TeacherDTO> registerTeacher(@Valid @RequestBody TeacherDTO teacherDTO)	
	 {
		final Teacher teacher=converter.convertToTeacherEntity(teacherDTO);
		return new ResponseEntity<TeacherDTO>(teacherService.registerTeacher(teacher),HttpStatus.CREATED); 
	 }
	
	@PostMapping("/assignment/{tid}/{sid}")
	public String assignStudentToTeacher(@PathVariable("tid") int tid,
			@PathVariable("sid") int sid)
	{
		return teacherService.assignStudentToTeacher(tid, sid);
	}
}