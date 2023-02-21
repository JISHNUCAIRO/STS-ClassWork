package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("/get")
	public StudentResponse getStudent() 
	{
		StudentResponse studentResponse = new StudentResponse(1,"john","Smith");
		return studentResponse;
	}
  
}
