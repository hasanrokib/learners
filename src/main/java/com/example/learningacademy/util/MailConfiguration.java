package com.example.learningacademy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;
@Configuration
public class MailConfiguration {
    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("rokibulhasan295@gmail.com");
        mailSender.setPassword("qnpf fnra fjhe hvgs");
        Properties properties = mailSender.getJavaMailProperties();
        properties.put("mail.transport.protocol","smtp");
        properties.put("mail.smtp.auth" ,"true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.ssl.protocols","TLSv1.2");
        properties.put("mail.smtp.ssl.trust","smtp.gmail.com");


        return mailSender;
    }
}
