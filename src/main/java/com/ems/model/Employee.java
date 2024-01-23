package com.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull(message = "First name is required")
	@NotEmpty(message = "First name cannot be empty")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "Last name is required")
	@NotEmpty(message = "Last name cannot be empty")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "Salary is required")
	@Column(name = "salary")
	private double salary;

	@NotNull(message = "Department is required")
	@NotEmpty(message = "Department cannot be empty")
	@Column(name = "department")
	private String department;

	@NotNull(message = "Position is required")
	@NotEmpty(message = "Position cannot be empty")
	@Column(name = "position")
	private String position;

	@NotNull(message = "Email address is required")
	@NotEmpty(message = "Email address cannot be empty")
	@Email(message = "Invalid email address")
	@Column(name = "email_address")
	private String emailAddress;

	@NotNull(message = "Contact number is required")
	@NotEmpty(message = "Contact number cannot be empty")
	@Column(name = "contact_number")
	private String contactNumber;

	public Employee() {
		
	}

	public Employee(Long id,
			@NotNull(message = "First name is required") @NotEmpty(message = "First name cannot be empty") String firstName,
			@NotNull(message = "Last name is required") @NotEmpty(message = "Last name cannot be empty") String lastName,
			@NotNull(message = "Salary is required") double salary,
			@NotNull(message = "Department is required") @NotEmpty(message = "Department cannot be empty") String department,
			@NotNull(message = "Position is required") @NotEmpty(message = "Position cannot be empty") String position,
			@NotNull(message = "Email address is required") @NotEmpty(message = "Email address cannot be empty") @Email(message = "Invalid email address") String emailAddress,
			@NotNull(message = "Contact number is required") @NotEmpty(message = "Contact number cannot be empty") String contactNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
		this.position = position;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
	

}