package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {
	public List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee employee);
	public void deleteById(int id);
}
