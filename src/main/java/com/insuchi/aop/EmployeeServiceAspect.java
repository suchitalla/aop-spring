package com.insuchi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	
	
	@Before(value = "execution(* com.insuchi.aop.*Service.*(..)) and args(id)")
	public void beforeAdvice(JoinPoint joinPoint, long id) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee/director with  id - " + id);
	}

	@After(value = "execution(* com.insuchi.aop.*Service.*(..)) and args(id)")
	public void afterAdvice(JoinPoint joinPoint, long id) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee/director with id - " + id);
	}	

}
