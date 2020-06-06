package com.ahmed.factory;

import com.ahmed.dao.impl.EmployeeDaoImpl;
import com.ahmed.service.EmployeeService;
import com.ahmed.service.impl.EmployeeServiceImpl;

public class EmployeeServiceFactory {

	public static EmployeeService create() {
		return  new EmployeeServiceImpl(new EmployeeDaoImpl());
	}
}
