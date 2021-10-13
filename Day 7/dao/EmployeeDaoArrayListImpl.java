package com.hsbc.dao;


import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistException;

public class EmployeeDaoArrayListImpl implements EmployeeDao{

	private static List<Employee> employees1=new ArrayList<Employee>();
	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistException {
		employees1.add(employee);

		for(int i=0;i<employees1.size();i++) {
			if(employee.getId()==employees1.get(i).getId()) {
				throw new EmployeeAlreadyExistException("Employee Already exist");
			}
		}
	}


	@Override
	public Employee[] findAllEmployees() {
		
		Employee[] employeeArray = employees1.toArray(new Employee[employees1.size()]);
		return employeeArray;
	}
	
	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp = null;
		for(Employee e : employees1) {
			if(e.getId() == id) {
				emp = e;
				break;
			}
		}
		return emp;
		
	}


	@Override
	public void updateEmployee(int id, Employee employee) {
		
	}


	
}
