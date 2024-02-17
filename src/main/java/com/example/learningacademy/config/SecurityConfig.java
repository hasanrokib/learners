//package com.example.learningacademy.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//@EnableWebSecurity
//@CrossOrigin("*")
//
//public class SecurityConfig {
//
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.csrf(csrf->csrf.disable())
//                .cors(cors->cors.disable())
//                .authorizeHttpRequests(auth->auth.requestMatchers("/login/**").authenticated()
//                                .requestMatchers("/register","/auth/**").permitAll().anyRequest()
//                                .authenticated());
//
//        return httpSecurity.build();
//    }
//}
