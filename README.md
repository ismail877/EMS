# Employee Management System Project Details

## Overview:
Developed a robust Employee Management System using Spring Boot, providing seamless management of employee information through basic CRUD operations.

## Key Features:
1. **Create Employee:**
   - Endpoint: `POST /employees`
   - Allows users to add new employee details to the system.

2. **Fetch Employee Details:**
   - Endpoint: `GET /employees/{employeeId}`
   - Enables users to retrieve specific employee details based on the employee ID.

3. **Update Employee Details:**
   - Endpoint: `PUT /employees/{employeeId}`
   - Facilitates the modification of existing employee information.

4. **Delete Employee:**
   - Endpoint: `DELETE /employees/{employeeId}`
   - Permits users to delete an employee from the system.

## Tools and Technologies Used:
- **Spring Boot:**
  - Framework used for rapid development of the application, providing a robust and scalable architecture.

- **Postman:**
  - Utilized for testing and interacting with the API endpoints efficiently.

## Project Setup:
1. Clone the project repository:
   ```bash
   `git clone [GitHub Repository Link]`

**Build and run the Spring Boot application:**

Copy code
  `cd EmployeeManagementSystem`
  `mvn clean install`
  `java -jar target/employee-management-system.jar`
Use Postman for testing CRUD operations on employee details.

Repository:
[GitHub Repository Link](https://github.com/ismail877/EMS)

Dependencies:
  Spring Web,
  Spring Data JPA,
  H2 Database (for simplicity, can be replaced with a different database)

Contributors:
Ismail Rahman
