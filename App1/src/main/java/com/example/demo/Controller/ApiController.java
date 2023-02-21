package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping("/l")
	public String handler() 
	{
	  return "Hello World";	
	}
	@RequestMapping("/li")
	public String handler1() 
	{
	  return "Hello planet";	
	}
}
