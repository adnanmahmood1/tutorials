package com.tutorialpoint; 

public class myCar{
	
	private String car; 
	
	public void setCar(String car){
		this.car = car;
	}
	
	public void getCar(){
		System.out.println("Your car is : " + car);
	}
	
	public void init(){
		System.out.println("Bean is going through init");
	}
	
	public void destroy() {
		System.out.print("Bean will destroy now");
	}
}