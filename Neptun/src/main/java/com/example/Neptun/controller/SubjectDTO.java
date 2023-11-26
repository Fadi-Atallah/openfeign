package com.example.Neptun.controller;

import com.example.Neptun.service.SubjectVO;
import lombok.Data;

@Data
public class SubjectDTO {

    private final Long id;
    private final String subjectCode;
    private final String subjectName;
    private final int semesterNumber;
    private final int subjectCredits;

    public SubjectVO toVO(){
        return new SubjectVO(id,subjectCode, subjectName, semesterNumber, subjectCredits);
    }
}
