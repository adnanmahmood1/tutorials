package com.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class BannerUtil{
	public static BannerMessage readXMLFile(){
		BannerMessage bannerMessageBean = new BannerMessage();
		
		try{
			File xmlFile = new File("../BannerMessage/src/com/test/payroll.xml");
			DocumentBuilderFactory docBuildFact =  DocumentBuilderFactory.newInstance(); 
			DocumentBuilder docBuild = docBuildFact.newDocumentBuilder(); 
			Document doc = docBuild.parse(xmlFile);
			String homeText = doc.getElementsByTagName("BANNERMESSAGE").item(0).getTextContent(); 
			String scrollingText = doc.getElementsByTagName("HOMEMESSAGE").item(0).getTextContent();  
			Boolean vis = Boolean.parseBoolean(doc.getElementsByTagName("VISIBILITY").item(0).getTextContent());
			bannerMessageBean.setHomepageMessage(homeText);
			bannerMessageBean.setScrollingMessage(scrollingText);
			bannerMessageBean.setVisibility(vis);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return bannerMessageBean; 
	}
	
	
	
}