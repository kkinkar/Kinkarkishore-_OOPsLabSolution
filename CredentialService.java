package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	
	public String generateEmailAddress (String firstName, String lastName, String department) {
		String email = firstName + lastName + "@" + department + "."+ "kkinfotech.com";
		return email;
	}
	
	public char[] generatePassword() {
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		String specialChar = "!@#$%^&*()<>,.?";
		String values = uppercase + lowercase + num + specialChar;
		Random random = new Random();
		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}
	public void showCredential(Employee employee, String email, char[] generatedPassword ) {
		System.out.println("Hello "+employee.getFirstname()+ " your generated credentials are as follows ");
		System.out.println("Email --> "+ email);
		System.out.print("Password -->"+ "");
		System.out.print(generatedPassword);
	}
}

