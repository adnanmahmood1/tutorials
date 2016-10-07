package com.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class BannerUtil{
	private final String filePath = "../BannerMessageAnnotation/src/com/test/data/payroll.xml"; 
	private BannerMessage bannerMessageBean; 
	private File xmlFile; 
	private DocumentBuilderFactory docBuildFact; 
	private DocumentBuilder docBuild;
	private Document doc; 
	
	public BannerUtil(BannerMessage bannerMessageBean){
		this.bannerMessageBean = bannerMessageBean; 
	}
	
	
	public void getFile(){
		try{
			xmlFile = new File(filePath);
			docBuildFact =  DocumentBuilderFactory.newInstance(); 
			docBuild = docBuildFact.newDocumentBuilder(); 
			doc = docBuild.parse(xmlFile);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	public  BannerMessage readXMLFile(){ 
		
		try{
			this.getFile();
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
	
	public void updateXML(){
		try{
			this.getFile();
			doc.getElementsByTagName("BANNERMESSAGE").item(0).setTextContent(bannerMessageBean.getScrollingMessage());
			doc.getElementsByTagName("HOMEMESSAGE").item(0).setTextContent(bannerMessageBean.getHomepageMessage());
			doc.getElementsByTagName("VISIBILITY").item(0).setTextContent(bannerMessageBean.getVisibility().toString());
	
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance(); 
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc); 
			StreamResult result = new StreamResult(new File(filePath)); 
			transformer.transform(source, result);
			System.out.println("Changes saved successfully");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
}