package com.student.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.student.entities.Mark;
import com.student.entities.Student;
import com.student.entities.Teacher;
import com.student.model.MarksDTO;
import com.student.model.StudentDTO;
import com.student.model.TeacherDTO;

@Component
public class Converter 
{
// convert from DTO to entity(Student)
	
	public Student convertToStudentEntity(StudentDTO studentDTO)
	{
		Student student=new Student();
		if(studentDTO!=null)
		{
			BeanUtils.copyProperties(studentDTO, student);
		}
		return student;
	}
	
	//convert from entity to DTO
	
	public StudentDTO convertToStudentDTO(Student student)
	{
		StudentDTO studentDTO=new StudentDTO();
		if(student!=null)
		{
			BeanUtils.copyProperties(student, studentDTO);
		}
		return studentDTO;
	}
	
	//convert from DTO to Entity

	public  Teacher convertToTeacherEntity(TeacherDTO teacherDTO)
	{
		Teacher teacher=new Teacher();
		if(teacherDTO!=null)
		{
			BeanUtils.copyProperties(teacherDTO, teacher);
		}
	     return teacher;
	}

	//convert from Entity to DTO
	public TeacherDTO convertToTeacherDTO(Teacher teacher)
	{
		TeacherDTO teacherDTO=new TeacherDTO();
		if(teacher!=null)
		{
			BeanUtils.copyProperties(teacher, teacherDTO);
		}
		return teacherDTO;
	}

    public Mark convertToMarks(MarksDTO marksDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToMarks'");
    }

    public MarksDTO convertToMark(MarksDTO marksDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToMark'");
    }

    public MarksDTO convertToMark(Mark savedMark) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToMark'");
    }
}
