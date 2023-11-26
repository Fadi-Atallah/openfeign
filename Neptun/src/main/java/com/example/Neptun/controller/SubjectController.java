package com.example.Neptun.controller;

import com.example.Neptun.repository.Subject;
import com.example.Neptun.service.SubjectService;
import com.example.Neptun.service.SubjectVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class SubjectController {

    private final SubjectService subjectService;

    @PostMapping(path = "/subject")
    public Long insertSubject(@RequestBody SubjectDTO subject){
        return subjectService.insertSubject(subject.toVO());
    }

    @PutMapping(path = "/subject/{id}")
    public String updateSubject(@RequestBody SubjectDTO subject, @PathVariable("id") Long id){
        return subjectService.updateSubject(subject.toVO(), id);
    }

    @GetMapping(path = "/subject/{id}")
    public SubjectVO getSubject(@PathVariable("id") Long id){
        return subjectService.findSubjectById(id);
    }

    @GetMapping(path = "/subject")
    public List<Subject> getAllSubjects(){
        return subjectService.findAllSubjects();
    }

    @DeleteMapping(path = "/subject/{id}")
    public String deleteSubject (@PathVariable("id") Long id){
        return subjectService.deleteSubject(id);
    }
}
