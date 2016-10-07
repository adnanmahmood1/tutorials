package com.test.config; 

import org.springframework.context.annotation.*;

import com.test.BannerMessage;

@Configuration
public class BannerMessageConfig{
	
	@Bean(initMethod="init", destroyMethod="destroy")
	public BannerMessage bannerMessage(){
		return BannerMessage.getInstance();
	}
	
	
	
}