package com.Employ.Service.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employ.Entity.Employee;
import com.Employ.Repository.employRepo;
import com.Employ.Service.EmployService;

@Service
public class EmployServiceImpl implements EmployService {
	
	@Autowired
	employRepo employ;

	@Override
	public Employee addEmp(Employee emp) {
		// TODO Auto-generated method stub
		String RandomUUID=UUID.randomUUID().toString();
        emp.setId(RandomUUID);
		return employ.save(emp);
	}
 
    @Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return (List<Employee>) employ.findAll();
	}

	@Override
	public void delEmp(String id) {
		// TODO Auto-generated method stub
		employ.deleteById(id); 
	}

	@Override
	public Employee updEmp(Employee emp) {
		// TODO Auto-generated method stub
		return employ.save(emp);
	}

}
