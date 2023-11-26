package hu.me.iit.distributedsystems.openfeignclient;

import lombok.Data;

@Data
public class SubjectDto {

    private final Long id;
    private final String subjectCode;
    private final String subjectName;
    private final int semesterNumber;
    private final int subjectCredits;
}
