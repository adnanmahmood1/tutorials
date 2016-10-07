package com.test;

public class BannerMessage{
	private String homepageMessage;
	private String scrollingMessage;
	private Boolean visibility;
	private static BannerMessage _instance = new BannerMessage();
	
	private BannerMessage(){
		 
	}
	
	public static BannerMessage getInstance(){
		return _instance; 
	}
	
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
	
	public void init() {
		System.out.println("Creating BannerMessage Bean"); 
	}
	
	public void destroy(){
		System.out.println("Deleting BannerMessage Bean");
	}
}
