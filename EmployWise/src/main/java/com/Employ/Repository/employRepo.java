package com.Employ.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Employ.Entity.Employee;

public interface employRepo extends CrudRepository<Employee, String>
{

	
	
}
