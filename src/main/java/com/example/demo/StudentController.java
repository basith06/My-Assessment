package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class StudentController { 
	
	@GetMapping("/student")
	
	public Student getStudent() {
		return new Student("Basith","abdulbasiths2002@gmail.com");
	}

}
