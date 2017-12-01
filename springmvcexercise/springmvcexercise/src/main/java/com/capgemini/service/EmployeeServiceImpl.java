package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.Employee;
import com.capgemini.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		employeeRepo.addEmployee(employee);
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeRepo.getAllEmployees();
	}

	@Override
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		employeeRepo.deleteEmployee(employeeId);
	}

	public Employee getEmployee(int empid) {
		return employeeRepo.getEmployee(empid);
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepo.updateEmployee(employee);
	}

	public void setEmployeeDAO(EmployeeRepository employeeDAO) {
		this.employeeRepo = employeeDAO;
	}

}
