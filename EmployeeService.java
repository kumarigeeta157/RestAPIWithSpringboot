package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee employee);
	public void deleteById(int id);

}
