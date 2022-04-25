package br.com.virtualclass.service;

import br.com.virtualclass.domain.Teacher;
import br.com.virtualclass.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import br.com.virtualclass.repository.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 18/04/2022
 */
@Service
public class TeacherService {

    private TeacherRepository repository;

    private TeacherMapper teacherMapper;

    public List<Teacher> getTeachers() {
        return repository.findAll().stream().map(teacherEntity -> teacherMapper.toModel(teacherEntity)).collect(Collectors.toList());
    }

    public Teacher getTeacher(Integer teacherId) {
        return teacherMapper.toModel(repository.searchById(teacherId));
    }

    public void saveTeacher(Teacher teacher) {
        repository.save(teacherMapper.fromModel(teacher));
    }
}
