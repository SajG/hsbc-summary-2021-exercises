package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistException;

public class EmployeeDaoTreeSetImpl implements EmployeeDao{

	private static Set<Employee> employees=new TreeSet<Employee>();
	
	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistException {
		employees.add(employee);

		for(int i=0;i<employees.size();i++) {
			if(employee.getId()==employees.hashCode()) {
				throw new EmployeeAlreadyExistException("Employee Already exist");
			}
		}
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		
		Employee emp=null;
		for(Employee e:employees) {
			if(e.getId()==id) {
				emp=e;
				break;
			}
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		
		Employee[] employeeArray=employees.toArray(new Employee[employees.size()]);
		return employeeArray;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		
		
	}

}
