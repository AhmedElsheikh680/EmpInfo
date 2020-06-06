package com.ahmed.service.impl;

import java.util.List;

import model.Employee;

import com.ahmed.daoo.EmployeeDao;
import com.ahmed.service.EmployeeService;
import com.ahmed.validator.EmployeeValidator;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeValidator validator = new EmployeeValidator();
	private EmployeeDao empDao;
	
	public EmployeeServiceImpl(EmployeeDao empDao) {
		super();
		this.empDao=empDao;
	}
	@Override
	public int save(Employee e) throws Exception {
		validator.validate(e);
		return empDao.save(e);
	}
	@Override
	public int update(Employee e) throws Exception {
		validator.validate(e);
		return empDao.update(e);
	}
	@Override
	public int delete(Employee e) throws Exception {
		// TODO Auto-generated method stub
		return empDao.delete(e);
	}
	@Override
	public List<Employee> getAllRecords() throws Exception {
		// TODO Auto-generated method stub
		return empDao.getAllRecords();
	}
	@Override
	public Employee getRecordsById(int id) throws Exception {
		// TODO Auto-generated method stub
		return empDao.getRecordsById(id);
	}
}
