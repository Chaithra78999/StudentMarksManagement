package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Teacher;
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
