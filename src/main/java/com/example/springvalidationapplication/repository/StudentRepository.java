package com.example.springvalidationapplication.repository;

import com.example.springvalidationapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  StudentRepository extends JpaRepository<Student,Long> {


}
