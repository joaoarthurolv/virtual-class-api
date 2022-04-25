package br.com.virtualclass.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 25/4/2022
 */
@Entity(name = "teacher")
@Setter
@Getter
public class TeacherEntity {

    @Id
    private Integer id;

    private String name;
}
