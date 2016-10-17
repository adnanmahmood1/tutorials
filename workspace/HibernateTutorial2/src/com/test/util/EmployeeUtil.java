package com.test.util;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.employee.Employee;

public class EmployeeUtil{
	
	private static SessionFactory factory; 
	private Employee emp = null; 
	
	public EmployeeUtil(Employee employee){
		this.emp = employee;
		try{
			factory = new Configuration().configure().buildSessionFactory(); 
		} catch (Throwable ex){ 
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public Integer addEmployee(String fname, String lname, int salary){
		Session session = factory.openSession();
		Transaction tx = null; 
		Integer employeeID = null; 
		try{
			tx = session.beginTransaction();
			emp = new Employee (fname, lname, salary); 
			employeeID = (Integer) session.save(emp); 
			tx.commit();
		}
		catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	    }
		finally {
	         session.close(); 
	     }
		 return employeeID;
	}
	public void listEmployees() {
		Session session = factory.openSession();
	    Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Employee").list(); 
	         for (Iterator iterator = 
                     employees.iterator(); iterator.hasNext();){
			      emp = (Employee) iterator.next(); 
			      System.out.print("First Name: " + emp.getFirstName()); 
			      System.out.print("  Last Name: " + emp.getLastName()); 
			      System.out.println("  Salary: " + emp.getSalary()); 
	         }
	         tx.commit();
	      }
	      catch (HibernateException e) {
	          if (tx!=null) tx.rollback();
	          e.printStackTrace(); 
	      }
	      finally {
	          session.close(); 
	       }
	}
	     
	
	public void updateEmployee(Integer EmployeeID, int salary ){
		 Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         emp = 
	                    (Employee)session.get(Employee.class, EmployeeID); 
	         emp.setSalary( salary );
			 session.update(emp); 
	         tx.commit();
	      }
	      catch (HibernateException e) {
	          if (tx!=null) tx.rollback();
	          e.printStackTrace(); 
	       }
	      finally {
	          session.close(); 
	       }
	}
	
	public void deleteEmployee(Integer EmployeeID){
		Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	          emp = 
	                   (Employee)session.get(Employee.class, EmployeeID); 
	         session.delete(emp); 
	         tx.commit();
	      }
	      catch (HibernateException e) {
	          if (tx!=null) tx.rollback();
	          e.printStackTrace(); 
	       }
	      finally {
	          session.close(); 
	       }
	}
	
	public void deleteAll(){
		Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Employee").list(); 
	         for (Iterator iterator = 
                     employees.iterator(); iterator.hasNext();){
			      emp = (Employee) iterator.next(); 
			      session.delete(emp);
	         }
	         tx.commit();
	  
	      }
	      catch (HibernateException e) {
	          if (tx!=null) tx.rollback();
	          e.printStackTrace(); 
	       }
	      finally {
	          session.close(); 
	       }
	}
	
	public void retrieveEmployee(Integer EmployeeID){
		  Session session = factory.openSession();
	      Transaction tx = null;
	      try{
		         tx = session.beginTransaction();
		         emp = 
		                    (Employee)session.get(Employee.class, EmployeeID);
		         
		         tx.commit();
		         printEmployee(emp);
		      }
		      catch (HibernateException e) {
		          if (tx!=null) tx.rollback();
		          e.printStackTrace(); 
		       }
		      finally {
		          session.close(); 
		       }
	}
	
	public void printEmployee(Employee emp){
		System.out.println("First Name: " + emp.getFirstName()); 
	      System.out.println("Last Name: " + emp.getLastName()); 
	      System.out.println("Salary: " + emp.getSalary()); 
	}
}