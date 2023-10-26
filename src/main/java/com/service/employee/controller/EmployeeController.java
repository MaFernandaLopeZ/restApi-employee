package com.service.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
