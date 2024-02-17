package com.example.learningacademy.controller;

import com.example.learningacademy.entity.LoginEntity;
import com.example.learningacademy.model.Student;
import com.example.learningacademy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/register")
public String registerNewStudent(@RequestBody Student student){
    return this.studentService.registerStudent(student);

}
    @PostMapping("/login")
    public String LoginToWebsite(@RequestBody LoginEntity loginEntity){
        return "login successful";
    }
}
