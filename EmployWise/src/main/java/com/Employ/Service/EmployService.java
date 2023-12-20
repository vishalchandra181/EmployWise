package com.Employ.Service;

import java.util.List;

import com.Employ.Entity.Employee;

public interface EmployService {
	
	//Add Employee
	Employee addEmp(Employee emp);
	
	//Get All Employee
    List<Employee> getAllEmp();
	
	//Delete Employee by Id
    void delEmp(String id);
	
	//Update Employee by Id
    Employee updEmp(Employee emp);

}
