package com.student.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long studentId;
    
    private String subject;
    
    private double score;
    
    // Constructors
    public Mark() {
        super();
    }

    public Mark(Long id, Long studentId, String subject, double score) {
        super();
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // toString() method
    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
