package br.com.virtualclass.service;

import br.com.virtualclass.domain.Student;
import br.com.virtualclass.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 18/04/2022
 */
@Service
public class StudentService {

    private StudentRepository repository;

    public List<Student> getStudents(){
        return repository.getStudents();
    }

    public Student getStudent(Integer studentId) {
        return repository.getStudent(studentId);
    }
}
