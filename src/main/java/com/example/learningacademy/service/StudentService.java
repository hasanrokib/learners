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


        student.setRegistrationConfirmation(false);
        this.studentRepository.save(student);




        String link ="http://localhost:8082/"+"confirm/"+student.getStudentId();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rokibulhasan295@gmail.com");
        message.setTo(toEmail);
        message.setSubject("mail for confirmation regarding your registration for learning academy");
        message.setText(message1+link);
        this.mailSender.send(message);

        return "registration mail sent";


    }

    public String confirmRegistration(Integer myid) {
        Student studentData = this.studentRepository.findById(myid).get();

        studentData.setRegistrationConfirmation(true);
        this.studentRepository.save(studentData);
        return "thank you for your confirmation";
    }
}
