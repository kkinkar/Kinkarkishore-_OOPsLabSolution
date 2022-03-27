package com.greatlearning.model;

public class Employee {
	//declaring variables
	private String firstName;
	private String lastName;
	public Employee (String firstName, String lastName) {
		
		super();//what is the use of super keyword?
		
		this.firstName = firstName;/* what is the use of this keyword and why we are assigning
									this firstName to constructor firstName*/
		this.lastName = lastName;
	}
	
	//Why do we need get and setters in this case and what is the main use of getters and setters
	public String getFirstname () {
		return firstName;
	}
	
	public void setFirstname(String firstName) {
		this.firstName = firstName;// why we are declaring it again here when we have done it above
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
}
