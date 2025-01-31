package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;
	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = new EmployeeDaoArrayImpl();
	}

	@Override
	public void store(Employee employee) {
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) {
		
		return dao.fetchEmployeeById(id);
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) {
		Employee e=dao.fetchEmployeeById(id);
		e.setSalary(salary);
		dao.updateEmployee(id, e);
	}

	@Override
	public void updateName(int id, String name) {
		Employee e=dao.fetchEmployeeById(id);
		e.setName(name);
		dao.updateEmployee(id, e);
	}

}
