package com.student.service;

import java.util.List;

import com.student.entities.Marks;

public interface MarkService {
    Marks createMark(Marks mark);
    List<Marks> getAllMarks();
    Marks getMarkById(Long id);
    Marks updateMark(Long id, Marks updatedMark);
    void deleteMark(Long id);
}
