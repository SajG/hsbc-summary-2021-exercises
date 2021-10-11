package com.hsbc.factory;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class FactoryPattern {

	public static EmployeeDao getDaoInstance() {
		// TODO Auto-generated method stub
		return new EmployeeDaoArrayImpl();
	}

	public static EmployeeService getServiceInstance() {
		// TODO Auto-generated method stub
		return new EmployeeServiceImpl();
	}

}
