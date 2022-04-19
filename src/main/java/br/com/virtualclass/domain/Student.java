package br.com.virtualclass.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com)
 * @since 06/07/2021
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer id;

    private String name;

    private String cpf;

    private Date dateOfBirth;
}
