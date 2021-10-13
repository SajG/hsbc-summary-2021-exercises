package com.hsbc.dao;


import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyExistException;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;

	
	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistException {
		employeeDb[arrayIndexCounter] = employee;
		
		for(int i=0;i<arrayIndexCounter;i++) {
			if(employee.getId()==employeeDb[i].getId()) {
				throw new EmployeeAlreadyExistException("Employee Already Exist");
			}
		}
		arrayIndexCounter++;	
		
		
	}
	
	@Override
	public Employee fetchEmployeeById(int id) {
		for(Employee e:employeeDb) {
			if(e!=null) {
				if(e.getId()==id) {
					return e;
				}
			}
		}
		return null;
	}
	@Override
	public Employee[] findAllEmployees() {
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for(int index = 0; index < arrayIndexCounter; index++) {
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}
	@Override
	public void updateEmployee(int id, Employee employee) {
		for(Employee em:employeeDb) {
			if(em!=null) {
				if(em.getId()==id) {
					em.setName(employee.getName());
					em.setSalary(employee.getSalary());
				}					
			}
		}
	}
	
	
}