package com.example.Neptun.service;

import com.example.Neptun.repository.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    public Long insertSubject(SubjectVO subject);
    public String updateSubject(SubjectVO subject, Long id);
    public String deleteSubject(Long subjectId);
    public SubjectVO findSubjectById(Long subjectId);

    public List<Subject> findAllSubjects();
}
