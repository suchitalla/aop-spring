package com.insuchi.aop;

import org.springframework.stereotype.Service;

@Service
public class DirectorService {

	public Director getDirectorById(Long id) {
		// TODO Auto-generated method stub
		return new Director(id,"Geeta "+id);
	}

}
