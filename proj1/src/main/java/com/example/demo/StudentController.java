package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
	@Value("${value.name}")
	private String newNameString;
	@GetMapping("/")
	 public String homePage()
	{
		return newNameString+" to student list";
	}
	@GetMapping("/lis")
	public List<Student> getList()
	{
		List<Student> detailList = new ArrayList<>();
		detailList.add(new Student(1,"A",40));
		detailList.add(new Student(2,"B",50));
		detailList.add(new Student(3,"C",60));
		detailList.add(new Student(4,"D",70));
		detailList.add(new Student(5,"E",80));
		
		return detailList;
	}
}
