package com.tutorialpoint; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp{
	
	public static void main(String[] args){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		myCar car = (myCar) context.getBean("myCarDetails"); 
		
		
		
		
		obj.getMessage();
		car.setCar("Audi RS3");
		car.getCar();
		myCar car2=(myCar) context.getBean("myCarDetails"); 
		car2.getCar(); 	
		car2.setCar("It's actually a S3");
		car.getCar();
		
		myCar car3=(myCar) context.getBean("myCarDetails");
		car3.setCar("Hello Loser! Lambo");
		System.out.println("Car one is now: " + car.toString());
		System.out.println("Car two is now: " + car2.toString());
		
		 context.registerShutdownHook();
		 
	}
}