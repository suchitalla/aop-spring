package com.insuchi.aop;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Director {
	
	@Id
	@GeneratedValue
	long id;
	
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Director(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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
