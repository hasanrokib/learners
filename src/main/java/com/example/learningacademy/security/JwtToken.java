//package com.example.learningacademy.security;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//public class JwtToken {
//    public String generateToken(UserDetails userDetails){
//        Map<String,Object> claims = new HashMap<String,Object>();
//        return doGenerateToken(claims,userDetails.getUsername());
//
//    }
//
//    private String doGenerateToken(Map<String, Object> claims, String username) {
//        return Jwts.builder().setClaims(claims).setSubject(username).setIssuedAt(
//                new Date(System.currentTimeMillis())
//        ).setExpiration(new Date(System.currentTimeMillis()+3600000))
//                .signWith(SignatureAlgorithm.HS512,"Bearer").compact();
//    }
//}
