// Confirm package 
package com.tutorialpoint; 

//define class as public class - must be in same name of file name
public class HelloWorld3{
	
	// define program variables 
	// in form of private {type} {variablename}
	private String message1;
	private String message2; 
	private String message3;
	//define getters and setters for variables
	// in form of public {returnType i.e void, int etc..} nameofmethod(args if any)
	public void setMessage1(String message){ 
		this.message1 = message;
	}
	
	public void setMessage2(String message){
		this.message2 = message;
	}
	public void setMessage3(String message){
		this.message2 = message;
	}
	
	public void getMessage1(){
		System.out.println("World Message1 : " + message1);
	}
	
	public void getMessage2(){
		System.out.println("World Message 2 : " + message2);
	}
	public void getMessage3(){
		System.out.println("World Message 2 : " + message3);
	}
}