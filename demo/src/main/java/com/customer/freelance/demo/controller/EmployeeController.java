package com.customer.freelance.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.freelance.demo.model.Employee;
import com.customer.freelance.demo.repository.EmployeeRepository;


@RestController
@RequestMapping("api/emp/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value="employee", method=RequestMethod.GET)
	public List<Employee> get() {
		System.out.println("calling get method...");
		//System.out.println("-->"+employeeRepository.findAll());
		
		return employeeRepository.findAll();
	}
	
	
	public List<Employee> retrieveStub(){
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setEmpId(1001);
		emp1.setFirstName("Tristan");
		emp1.setLastName("Journal");
		list.add(emp1);
		return list;
	}
}
