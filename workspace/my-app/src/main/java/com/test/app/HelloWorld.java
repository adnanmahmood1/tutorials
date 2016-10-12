package com.test.app;

public class HelloWorld{
	
	private String name; 
	
	public void setName(String name){
		this.name = name;
	}
	
	public void getName(){
		System.out.println("Hello " + name);
	}
}