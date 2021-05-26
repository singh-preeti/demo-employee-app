package com.employee.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.employee.demo.domain.Employee;

@Service
public interface EmployeeService extends JpaRepository<Employee, Long>{
	
}
