package com.test.config;

import org.springframework.context.annotation.*;

import com.test.UserChange;

@Configuration
@Import({BannerMessageConfig.class, BannerUtilConfig.class})

public class UserChangeConfig{
	
	private BannerMessageConfig ban = new BannerMessageConfig();
	private BannerUtilConfig bannerUtil = new BannerUtilConfig(); 
	
	@Bean
	@Scope("singleton")
	public UserChange userChange(){
		return new UserChange(ban.bannerMessage().getInstance(), bannerUtil.bannerUtil());
	}
	
}