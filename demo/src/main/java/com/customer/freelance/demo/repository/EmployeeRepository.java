package com.customer.freelance.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.freelance.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
