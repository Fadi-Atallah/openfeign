package com.example.Neptun.service.imp;

import com.example.Neptun.repository.Subject;
import com.example.Neptun.repository.SubjectRepository;
import com.example.Neptun.service.SubjectService;
import com.example.Neptun.service.SubjectVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public Long insertSubject(SubjectVO subject) {
        Subject newSubject = subjectRepository.save(subject.toEntity());
        return newSubject.getId();
    }

    @Override
    public String updateSubject(SubjectVO subject, Long id) {
        Subject subject1 = subjectRepository.findById(id).get();
        subject1.setSubjectCredits(subject.getSubjectCredits());
        subject1.setSubjectCredits(subject.getSubjectCredits());
        subject1.setSubjectName(subject1.getSubjectName());
        subject1.setSubjectCode(subject1.getSubjectCode());
        subject1.setSemesterNumber(subject.getSemesterNumber());
        subjectRepository.save(subject1);
        return "Subject " + subject.getSubjectName() + " is updated.";
    }

    public String deleteSubject(Long subjectId) {
        subjectRepository.deleteById(subjectId);
        return "Deleted Successfully: " + subjectId;
    }

    public SubjectVO findSubjectById(Long subjectId) {
        return subjectRepository.findById(subjectId)
                .map(subject -> new SubjectVO(subject.getId(), subject.getSubjectCode(), subject.getSubjectName(), subject.getSemesterNumber(), subject.getSubjectCredits()))
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "no such kind of subject exist"));
    }

    public List<Subject> findAllSubjects() {
        return (List<Subject>) subjectRepository.findAll();
    }
}
