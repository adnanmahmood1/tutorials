package com.test.config;

import org.springframework.context.annotation.*;

import com.test.BannerUtil;


@Configuration
@Import (BannerMessageConfig.class)

public class BannerUtilConfig{
	private BannerMessageConfig ban = new BannerMessageConfig(); 
	
	
	@Bean 
	public BannerUtil bannerUtil(){
		return  new BannerUtil(ban.bannerMessage().getInstance()); 
	} 
}