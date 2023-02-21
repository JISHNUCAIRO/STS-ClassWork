package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentResponse {
private long id;
@JsonIgnore
private String firstName;
private String lastName;
public StudentResponse(long id, String firstName, String lastName) 
{
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstname(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastname(String lastName) {
	this.lastName = lastName;
}
}
