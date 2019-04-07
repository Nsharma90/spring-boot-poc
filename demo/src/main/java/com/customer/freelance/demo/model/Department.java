package com.customer.freelance.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Department {
	@Id
	@Column(name="dept_id")
	private Long departmentId;
	@Column(name="dept_name")
	private String departmentName;
	@Column(name="location")
	private String location;

}
