package com.test.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.test.config.AppConfig;
import com.test.employee.Employee;
import com.test.util.EmployeeUtil;


public class ManageEmployee{
	private static SessionFactory factory; 
	
	public static void main (String[] args){
	
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		
		Employee employee = (Employee) context.getBean("employee"); 
		EmployeeUtil empUtil  = (EmployeeUtil) context.getBean("employeeUtil"); 
		
		
		//Integer empID1 = empUtil.addEmployee("Zara", "Ali", 1000); 
		//Integer empID2 = empUtil.addEmployee("Dasiy", "Das", 5000); 
		//Integer empID3 = empUtil.addEmployee("John", "Paul", 10000); 
		Integer employeeID = (Integer) 23; 
		empUtil.retrieveEmployee(employeeID);
		//empUtil.listEmployees(); 
		//empUtil.deleteAll();
		//empUtil.updateEmployee(empID1, 5000);
		
		
		//empUtil.deleteEmployee(empID2);
		
		//empUtil.listEmployees();
	}
	
}