package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configure.JwtTokenProvider;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtTokenProvider jwtTokenProvider;
	
	@GetMapping(value="/tests")
	public String get() {
		return "hello jwt";
	}
	
	@PostMapping(value="/login")
	public ResponseEntity<Object> login(@RequestParam String username,@RequestParam String password,@RequestParam String role) throws Exception{
		System.out.println("work");
		return userService.login(username, password);
	}
	
	@GetMapping("/getusername/")
	public String getUsername(@RequestHeader("Authorization") String Authorization) {
		return jwtTokenProvider.getUsername(Authorization);
	}
}
