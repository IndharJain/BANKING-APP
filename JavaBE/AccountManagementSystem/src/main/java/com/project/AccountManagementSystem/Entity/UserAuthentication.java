package com.project.AccountManagementSystem.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User_Authentication")
public class UserAuthentication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_salary")
	private int salary;

	@Column(name = "emp_age")
	private int age;

	@Column(name = "emp_aadhar_no")
	private int aadharNumber;

	@Column(name = "department")
	private String department;

}