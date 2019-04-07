package com.customer.freelance.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(value = "employee", method = RequestMethod.GET)
	public List<Employee> get() {
		System.out.println("calling get method...");
		// System.out.println("-->"+employeeRepository.findAll());

		return employeeRepository.findAll();
	}

	@RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable Long id) {
		System.out.println("calling getEmployee method...");
		return employeeRepository.getOne(id);
	}

	@RequestMapping(value = "employee/{id}", method = RequestMethod.PUT)
	public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
		Employee existingEmployee = employeeRepository.getOne(id);
		BeanUtils.copyProperties(employee, existingEmployee);
		return employeeRepository.saveAndFlush(existingEmployee);
	}

	@RequestMapping(value = "employee", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Employee delete(@PathVariable Long id) {
		Employee existingEmployee = employeeRepository.getOne(id);
		employeeRepository.delete(existingEmployee);
		return existingEmployee;
	}

	public List<Employee> retrieveStub() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setEmpId(1001l);
		emp1.setFirstName("Tristan");
		emp1.setLastName("Journal");
		list.add(emp1);
		return list;
	}
}
