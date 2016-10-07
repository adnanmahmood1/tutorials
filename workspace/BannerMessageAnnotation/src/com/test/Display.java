package com.test;

public class Display{
	private BannerMessage bannerMessageBean; 
	
	
	public Display(BannerMessage bannerMessageBean){
		this.bannerMessageBean = bannerMessageBean; 
	}
	
	public void checkDisplay(){
		if (bannerMessageBean.getVisibility()){
			System.out.println("Message status : " + bannerMessageBean.getVisibility());
			System.out.println(bannerMessageBean.getHomepageMessage());
			System.out.println(bannerMessageBean.getScrollingMessage());
		}
		else {
			System.out.println("Message status : " + bannerMessageBean.getVisibility());
		}		
			
	}	
}