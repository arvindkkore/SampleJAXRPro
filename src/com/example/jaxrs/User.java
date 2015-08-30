package com.example.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
 
   // primr key new 1
	//primary Key 
	int id;
	
	//UserName
	String userName;
	
	//Password 
	String password;
	
	public User(int id, String userName, String password) {
		
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		
		//This is the Text mesasge
		System.out.println("This is the  Commited for Git .");
	}
//	@Override
//	public String toString() {
//		
//		return "{\"userid\":"+getId()+",\"userName\":"+getUserName()+",\"password\":"+getPassword()+"}";
//	}
	
}
