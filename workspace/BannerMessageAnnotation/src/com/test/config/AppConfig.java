package com.test.config;


import org.springframework.context.annotation.*;

@Configuration

@Import({BannerMessageConfig.class, BannerUtilConfig.class,  DisplayBeanConfig.class,
		UserChangeConfig.class})
public class AppConfig{
	
	
	 
}