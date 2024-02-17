package com.example.learningacademy.service;

import com.example.learningacademy.model.Student;
import com.example.learningacademy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private JavaMailSender mailSender;
    public String registerStudent(Student student){
        String toEmail = student.getEmail();
        String message1 = "hi"+student.getFirstName()+"Thank you for registration,Please confirm your email.";
        String link ="work on it later";
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rokibulhasan295@gmail.com");
        message.setTo(toEmail);
        message.setSubject("mail for confirmation regarding your registration for learning academy");
        message.setText(message1);
        this.mailSender.send(message);
        this.studentRepository.save(student);
        return "registration mail sent";


    }

}
