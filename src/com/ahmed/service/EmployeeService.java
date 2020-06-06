package com.ahmed.service;

import java.util.List;

import model.Employee;

public interface EmployeeService {

	public  int save(Employee e) throws Exception;
	public  int update(Employee e) throws Exception;
	public  int delete(Employee e) throws Exception;
	public  List<Employee> getAllRecords() throws Exception;
	public  Employee getRecordsById(int id) throws Exception;
}
