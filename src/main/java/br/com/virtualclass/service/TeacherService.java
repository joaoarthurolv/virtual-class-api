package br.com.virtualclass.service;

import br.com.virtualclass.domain.Teacher;
import br.com.virtualclass.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 18/04/2022
 */
@Service
public class TeacherService {

    private TeacherRepository repository;

    public List<Teacher> getTeachers() {
        return null;
    }

    public Teacher getTeacher(Integer teacherId) {
        return null;
    }
}
