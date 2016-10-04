package com.tutorialpoint; 

public class TextEditor2{
	
	private SpellChecker2 spellChecker2; 
	
	public void setSpellChecker2(SpellChecker2 spellChecker2){
		System.out.println("Inside SpellChecker 2");
		this.spellChecker2 = spellChecker2; 
	}
	
	public SpellChecker2 getSpellChecker2(){
		return spellChecker2;
	}
	
	public void spellCheck(){
		spellChecker2.checkSpelling(); 
	}
	 
}