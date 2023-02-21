package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student
{
	@JsonIgnore
	private int rollno;
	private String name;
	private int rank;
  public Student(int rollno, String name, int rank){
		this.rollno = rollno;
		this.name = name;
		this.rank = rank;
	}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}

}
