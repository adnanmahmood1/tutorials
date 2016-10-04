package com.tutorialpoint; 


public class TextEditor{
	
	private SpellChecker spellChecker; 
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditior constructor. Getting creted");
		this.spellChecker = spellChecker; 
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling(); 
	}
}
