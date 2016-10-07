package com.test.config; 

import org.springframework.context.annotation.*;

import com.test.Display;

@Configuration
@Import(BannerMessageConfig.class)
public class DisplayBeanConfig{
	
	private BannerMessageConfig ban = new BannerMessageConfig();
	
	@Bean 
	public Display displayBean(BannerMessageConfig ban){
		return new Display(ban.bannerMessage()); 
	}
	
	
	
}