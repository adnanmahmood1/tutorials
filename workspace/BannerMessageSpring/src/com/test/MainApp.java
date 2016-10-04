package com.test;

public class MainApp{
	
	public static void main(String[] args){
		
		BannerMessage banner = BannerUtil.readXMLFile(); 
		
		if (banner.getVisibility()){
			System.out.println("Message status : " + banner.getVisibility());
			System.out.println(banner.getHomepageMessage());
			System.out.println(banner.getScrollingMessage());
		}
		else {
			System.out.print("Message status : " + banner.getVisibility());
		}
	}
	
	
}