package com.example.demo.service;

import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<Object> login(String username, String password)throws Exception;
}
