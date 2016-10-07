package com.test;
import java.util.Properties;
import java.util.Scanner;
import com.test.Display;
import com.test.config.AppConfig;
import com.test.config.BannerMessageConfig;
import com.test.config.BannerUtilConfig;
import com.test.config.DisplayBeanConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp{
	
	public static void main(String[] args){

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		
		BannerMessage banner= (BannerMessage) context.getBean("bannerMessage");
		BannerUtil bannerUtil = (BannerUtil) context.getBean("bannerUtil"); 
		UserChange change = (UserChange) context.getBean("userChange"); 
		Display dis = (Display) context.getBean("displayBean"); 
		
		bannerUtil.readXMLFile();
		change.newEntry(); 
		dis.checkDisplay();	
		
	}
}