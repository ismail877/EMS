package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/home")
	public String homePage() {
		return "Welcome";
	}

	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee createdEmployee = employeeService.createEmployee(employee);

		return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employeeById = employeeService.getEmployeeById(id);

		return new ResponseEntity<>(employeeById, HttpStatus.FOUND);
	}

	@GetMapping("/all")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		Employee updatedEmployee = employeeService.updateEmployee(id, employee);

		if (updatedEmployee != null) {
			return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(updatedEmployee, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
