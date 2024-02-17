package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Mark;


public interface Marksrepository extends JpaRepository<Mark, Long> {
    
}
