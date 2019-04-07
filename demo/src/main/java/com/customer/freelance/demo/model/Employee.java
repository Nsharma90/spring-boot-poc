package com.customer.freelance.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@Column(name = "emp_id")
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	@Column(name = "fname")
	private String firstName;
	@Column(name = "lname")
	private String lastName;
	@Column(name = "city")
	private String city;
	@Column(name = "dept_id")
	private Integer deptartmentId;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getDeptartmentId() {
		return deptartmentId;
	}
	public void setDeptartmentId(Integer deptartmentId) {
		this.deptartmentId = deptartmentId;
	}

	
	
}
