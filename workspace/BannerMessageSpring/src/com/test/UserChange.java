package com.test;

import java.util.Scanner;

public class UserChange {
	
	private BannerMessage bannerMessageBean; 
	private BannerUtil bannerUtil; 
	
	public UserChange(BannerMessage bannerMessageBean, BannerUtil bannerUtil){
		this.bannerMessageBean = bannerMessageBean; 
		this.bannerUtil = bannerUtil; 
	}
	
	
	Boolean wait = true; 
	
	public BannerMessage newEntry(){
		while(wait){
		System.out.println("Please select one of the following options: \n"
				+ "1 - to change the scrolling message text \n"
				+ "2 - to change the home message text \n"
				+ "3 - to change the visibility of the messages \n"
				+ "4 - to save changes  \n");
		
		Scanner reader = new Scanner(System.in); 
		System.out.println("What would you like to change: ");
		String entry = reader.nextLine();
		
		switch (entry){
		case "1": 
			System.out.println("Enter new text for scrolling message: ");
			String newScrollingText = reader.nextLine();
			bannerMessageBean.setScrollingMessage(newScrollingText); 
			break; 
		case "2":
			System.out.println("Enter new text for home message: ");
			String newHomeMessage = reader.nextLine();
			bannerMessageBean.setHomepageMessage(newHomeMessage); 
			break;
		 case "3":
			System.out.println("Turn on visibility(TRUE or FALSE):  ");
			Boolean vis = Boolean.parseBoolean(reader.nextLine());
			bannerMessageBean.setVisibility(vis);
			break;
		 case "4": 
			 System.out.println("Saving changes... ");
			 wait = false; 
			 return bannerMessageBean;
		
		}
	 
		}
		return bannerMessageBean;
		
	}
	
}