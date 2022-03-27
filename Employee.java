package com.greatlearning.model;

public class Employee {
	//declaring variables
	private String firstName;
	private String lastName;
	public Employee (String firstName, String lastName) {
		
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public String getFirstname () {
		return firstName;
	}
	
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
}
