package com.example.learningacademy.repository;

import com.example.learningacademy.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
