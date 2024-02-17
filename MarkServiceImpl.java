package com.student.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Mark;
import com.student.exception.ResourceNotFoundException;
import com.student.repository.Marksrepository;
import com.student.service.MarkService;

@Service
public class MarkServiceImpl implements MarkService {

    @Autowired
    private Marksrepository markRepository;

    @Override
    public Mark createMark(Mark mark) {
        return markRepository.save(mark);
    }

    @Override
    public List<Mark> getAllMarks() {
        return markRepository.findAll();
    }

    @Override
    public Mark getMarkById(Long id) {
        return markRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mark", "id", id));
    }

    @Override
    public Mark updateMark(Long id, Mark updatedMark) {
        Mark mark = markRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mark", "id", id));

        mark.setStudentId(updatedMark.getStudentId());
        mark.setSubject(updatedMark.getSubject());
        mark.setScore(updatedMark.getScore());

        return markRepository.save(mark);
    }

    @Override
    public void deleteMark(Long id) {
        Mark mark = markRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mark", "id", id));
        markRepository.delete(mark);
    }
}
