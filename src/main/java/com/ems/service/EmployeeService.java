package com.ems.service;

import java.util.List;

import com.ems.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee epmloyee);
	
	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Long id, Employee employee);
	
	void deleteEmployee(Long id);

}
