package com.test;

public class BannerMessage{
	private String homepageMessage;
	private String scrollingMessage;
	private Boolean visibility;
	
	public void setHomepageMessage(String message){
		this.homepageMessage = message;
	}
	public String getHomepageMessage(){
		return homepageMessage; 
	}
	
	public void setScrollingMessage(String message){
		this.scrollingMessage=message;
	}
	public String getScrollingMessage(){
		return scrollingMessage; 
	}
	
	public void setVisibility(Boolean vis){
		this.visibility=vis;
	}
	public Boolean getVisibility(){
		return visibility; 
	}
	
}
