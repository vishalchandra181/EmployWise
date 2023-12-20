package com.Employ.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employ.Entity.Employee;
import com.Employ.Service.EmployService;

@RestController
@RequestMapping("/employee")
public class MainController {
	
	@Autowired
	EmployService empService;
	
	@PostMapping
	public ResponseEntity<Employee> setAllEmployee(@RequestBody Employee emp){
		return ResponseEntity.status(HttpStatus.CREATED).body(empService.addEmp(emp));
	}
    
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee(){
		return ResponseEntity.status(HttpStatus.CREATED).body(empService.getAllEmp());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable(name ="id") String id){
		empService.delEmp(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("One Employee Deleted Successfully");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(name ="id") String id,@RequestBody Employee emp){
		emp.setId(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(empService.updEmp(emp));
	}
}
