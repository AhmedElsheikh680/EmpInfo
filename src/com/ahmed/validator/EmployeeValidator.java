package com.ahmed.validator;

import model.Employee;

public class EmployeeValidator {
	
	public void validate(Employee emp) throws IllegalArgumentException {
		EmailValidator mail = new EmailValidator();
		if(emp == null)  {
			throw new IllegalArgumentException("Employee Can\'t Be Null");
		}
		if(emp.getName() == null || emp.getName().equals("")) {
			throw new IllegalArgumentException("Employee Name Can\'t Be Null");
		}
		if(emp.getPassword() == null || emp.getPassword().length() <6) {
			throw new IllegalArgumentException("Invalid Password");
		}
		if(emp.getEmail() == null || !mail.validateEmail(emp.getEmail())){
			throw new IllegalArgumentException("Invalid Email");
		}
		if(emp.getGender() ==null) {
			throw new IllegalArgumentException("Gender Can\'t Be Null");
		}
		if(emp.getCountry() == null) {
			throw new IllegalArgumentException("Country Can\t Be Null");
		}
		
	}
}
