package com.tutorialpoint;
import java.util.*;

public class JavaCollections{
	
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp; 
	
	// a setter to set list 
	public void setAddressList(List addressList){
		this.addressList = addressList; 
	}
	
	// prints and returns all elements of the list 
	public List getAddressList(){
		System.out.println("List Elements : " + addressList);
		return addressList; 
	}
	
	// a setter to set Set 
	public void setAddressSet(Set addressSet){
		this.addressSet = addressSet;
	}
	// prints and returns all element of the set 
	public Set getAddressSet(){
		System.out.println("Set Elements :" + addressSet);
		return addressSet; 
	}
	
	
	// a setter to set Map 
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	
	// prints and returns all element of Map
	public Map getAddressMap(){
		System.out.println("Map elements :" + addressMap);
		return addressMap; 
	}
	
	// a setter to set Props 
	public void setAddressProp(Properties addressProp){
		this.addressProp = addressProp; 
	}
	
	// prints and returns all element of Map
	public Properties getAddressProp(){
		System.out.println("Address elements :" + addressProp);
		return addressProp; 
	}
	
}