package com.example.springvalidationapplication.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Must be not null")
    @Size(min = 3)
    private  String nameSurname;

    @NotBlank(message = "Must be not blank")
    private  String schoolName;

    @Email(message = "Should be ve valid")
    private String email;

    @Pattern(regexp = "[0-9\\s]{12}")
    private String phone;

    @Min(value = 18,message = "Can not be younger than 18 years old")
    private  int age;

}
