package com.example.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/service")
public class Services 
{
	@GET
	//@Produces("text/html")	
public String  sayHello()
{
	//http://localhost:8080/SampleJAXRProj/rest/services
return "Hello  Friend how are you";	
}
}
