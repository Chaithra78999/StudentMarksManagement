package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.student.entities.Mark;
import com.student.service.MarkService;

@RestController
@RequestMapping("/api/marks")
public class MarkController {

    @Autowired
    private MarkService markService;

    @GetMapping
    public ResponseEntity<List<Mark>> getAllMarks() {
        List<Mark> marks = markService.getAllMarks();
        return new ResponseEntity<>(marks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mark> getMarkById(@PathVariable Long id) {
        Mark mark = markService.getMarkById(id);
        return new ResponseEntity<>(mark, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Mark> createMark(@RequestBody Mark mark) {
        Mark createdMark = markService.createMark(mark);
        return new ResponseEntity<>(createdMark, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mark> updateMark(@PathVariable Long id, @RequestBody Mark updatedMark) {
        Mark mark = markService.updateMark(id, updatedMark);
        return new ResponseEntity<>(mark, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMark(@PathVariable Long id) {
        markService.deleteMark(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
