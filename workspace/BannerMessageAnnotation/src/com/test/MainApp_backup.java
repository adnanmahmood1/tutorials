package com.test;
import java.util.Properties;
import java.util.Scanner;
import com.test.Display; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp_backup{
	
	public static void main(String[] args){

		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml"); 
		
		BannerUtil bannerUtil = (BannerUtil) context.getBean("bannerUtil");
		BannerMessage banner= (BannerMessage) context.getBean("bannerMessage");
		UserChange change = (UserChange) context.getBean("userChange"); 
		Display dis = (Display) context.getBean("displayBean"); 
		
		bannerUtil.readXMLFile();
		dis.checkDisplay();
		change.newEntry(); 
		bannerUtil.updateXML();
		dis.checkDisplay();
			
		context.registerShutdownHook();
	}
}