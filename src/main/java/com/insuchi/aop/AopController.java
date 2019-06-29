package com.insuchi.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

	@Autowired
	EmployeeService es;
	
	@Autowired
	DirectorService ds;
	
	@GetMapping(path="/employee/{id}")
	public Employee getEmployee(@PathVariable Long id)
	{
	    return es.getEmployeeById(id);	
	}
	
	
	@GetMapping(path="/director/{id}")
	public Director getdirector(@PathVariable Long id)
	{
	    return ds.getDirectorById(id);	
	}
}
