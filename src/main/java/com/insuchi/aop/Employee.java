package com.insuchi.aop;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Employee {
	
	@Id
	@GeneratedValue
	Long id;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

}
