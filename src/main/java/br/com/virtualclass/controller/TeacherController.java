package br.com.virtualclass.controller;

import br.com.virtualclass.domain.Teacher;
import br.com.virtualclass.service.TeacherService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 18/04/2022
 */
@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getTeachers(){
        List<Teacher> teachers = service.getTeachers();
        return ResponseEntity.ok(teachers);
    }

    @GetMapping(value = "/{teacherId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getTeacher(
            @PathVariable("{teacherId}") Integer teacherId){

        Teacher teacher = service.getTeacher(teacherId);
        return ResponseEntity.ok(teacher);
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveTeacher(@RequestBody Teacher teacher){
        service.saveTeacher(teacher);
        return ResponseEntity.ok(teacher);
    };
}
