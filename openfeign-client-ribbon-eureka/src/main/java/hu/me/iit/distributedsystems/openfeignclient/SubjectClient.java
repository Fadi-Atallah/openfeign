package hu.me.iit.distributedsystems.openfeignclient;

import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("neptun")
public interface SubjectClient {

    @GetMapping(path = "subject", produces= MediaType.APPLICATION_JSON_VALUE)
    List<SubjectDto> allSubjects();
    @PostMapping(path="subject")
    void newSubject(@RequestBody @Valid SubjectDto subjectDto);
    @PutMapping(path="subject/")
    void replaceSubject(@RequestBody @Valid SubjectDto subjectDto);
    @DeleteMapping(path="subject/{id}")
    void deleteSubject(@PathVariable("id") Long id);
}
