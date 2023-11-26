package com.example.Neptun.service;

import com.example.Neptun.repository.Subject;
import lombok.Data;

@Data
public class SubjectVO {

    private final Long id;
    private final String subjectCode;
    private final String subjectName;
    private final int semesterNumber;
    private final int subjectCredits;

    public Subject toEntity(){
        return new Subject(id,subjectCode, subjectName, semesterNumber, subjectCredits);
    }
}
