package com.insuchi.aop;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return new Employee(id,"Sita "+id);
	}

}
