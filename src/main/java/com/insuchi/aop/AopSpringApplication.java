package com.insuchi.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableAspectJAutoProxy(proxyTargetClass=true)
@SpringBootApplication
public class AopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSpringApplication.class, args);
	}

}
