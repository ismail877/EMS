package com.ems.seviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.service.EmployeeService;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceIMPL(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Long id, Employee updatedEmployee) {
		Optional<Employee> optionalExistingEmployee = employeeRepository.findById(id);

		if (optionalExistingEmployee.isPresent()) {
			Employee existingEmployee = optionalExistingEmployee.get();

			existingEmployee.setFirstName(updatedEmployee.getFirstName());
			existingEmployee.setLastName(updatedEmployee.getLastName());
			existingEmployee.setSalary(updatedEmployee.getSalary());
			existingEmployee.setDepartment(updatedEmployee.getDepartment());
			existingEmployee.setPosition(updatedEmployee.getPosition());
			existingEmployee.setEmailAddress(updatedEmployee.getEmailAddress());
			existingEmployee.setContactNumber(updatedEmployee.getContactNumber());

			return employeeRepository.save(existingEmployee);
		} else {
			return null;
		}

	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

}
