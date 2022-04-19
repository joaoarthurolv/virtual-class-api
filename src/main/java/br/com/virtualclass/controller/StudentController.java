package br.com.virtualclass.controller;

import br.com.virtualclass.domain.Student;
import br.com.virtualclass.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 18/04/2022
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getStudents(){
        List<Student> students = service.getStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getStudent(
            @PathVariable("/{student-id}") Integer studentId){

        Student student = service.getStudent(studentId);

        return ResponseEntity.ok(student);
    }
}
