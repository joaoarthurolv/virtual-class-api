package br.com.virtualclass.repository.mapper;

import br.com.virtualclass.domain.Teacher;
import br.com.virtualclass.repository.entity.TeacherEntity;
import br.com.virtualclass.service.TeacherService;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 25/4/2022
 */
@Mapper(builder = @Builder(disableBuilder = true), uses = {TeacherService.class})
public interface TeacherMapper extends GenericEntityMapper<Teacher, TeacherEntity> {
}
