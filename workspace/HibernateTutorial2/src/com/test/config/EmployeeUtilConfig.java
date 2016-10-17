package com.test.config;

import org.springframework.context.annotation.*;

import com.test.util.EmployeeUtil;
@Import(EmployeeConfig.class)

@Configuration
public class EmployeeUtilConfig{
	private EmployeeConfig emp = new EmployeeConfig(); 
	
	
	@Bean
	public EmployeeUtil employeeUtil(){
		return new EmployeeUtil(emp.employee()); 
	}
	
}