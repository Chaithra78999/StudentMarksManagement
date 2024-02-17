package com.student.model;

public class MarksDTO {
    private Long id;
    private Long studentId;
    private String subject;
    private double score;

    // Constructors
    public MarksDTO() {
    }

    public MarksDTO(Long id, Long studentId, String subject, double score) {
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
        return "MarksDTO{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
