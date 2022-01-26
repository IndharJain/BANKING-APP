package com.project.bankingapplication.service.Interfaces;

import com.project.bankingapplication.entity.Employee;

public interface IEmployeeService {
	Employee login(String email, String password);
	Employee getEmployee(int id);
}
