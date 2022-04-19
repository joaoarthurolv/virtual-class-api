package br.com.virtualclass.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 18/04/2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Class {

    private Integer id;

    private List<Student> students;

    private Integer year;

    private Integer semester;
}
