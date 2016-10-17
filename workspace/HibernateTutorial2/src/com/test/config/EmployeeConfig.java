package com.test.config;

import org.springframework.context.annotation.*;

import com.test.employee.Employee;

@Configuration
public class EmployeeConfig{
	
	@Bean
	public Employee employee(){
		return new Employee(); 
	}
	
}