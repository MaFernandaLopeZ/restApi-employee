package com.service.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.employee.model.Employee;
import com.service.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/rest")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	//Get all employee
	@GetMapping("/employees")
	public List<Employee> getAll(){
		return repository.findAll();
	}
	
	//Get one employee
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id) throws Exception{
		Optional<Employee> theEmployee = repository.findById(id);
		
		if(theEmployee.isEmpty())
			throw new Exception("Employee id not found - "+id);
		
		return theEmployee;
	}
	

}
