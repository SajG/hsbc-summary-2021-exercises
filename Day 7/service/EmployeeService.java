package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistException;
import com.hsbc.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public void store(Employee employee) throws EmployeeAlreadyExistException;
	public Employee findEmployee(int id) throws EmployeeNotFoundException;
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException;
	public void updateName(int id, String name) throws EmployeeNotFoundException;
	
}