package com.tutorialpoint; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp{
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
	/*	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
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
		System.out.println("Car two is now: " + car2.toString()); */
		
		// helloIndia 
		
		/* HelloWorld3 objA = (HelloWorld3) context.getBean("helloWorld3");
		objA.getMessage1();
		objA.getMessage2(); 
		
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia"); 
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3(); */
		
		// DI TextEditor
		//TextEditor te = (TextEditor) context.getBean("textEditor");
		//te.spellCheck();
		//context.registerShutdownHook();
		
		TextEditor2 te2 = (TextEditor2) context.getBean("textEditor2");
		te2.spellCheck(); 
		 
	}
}