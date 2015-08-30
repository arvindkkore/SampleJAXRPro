package com.example.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;

//import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.PathParam;

@Path("user")
public class UserDAO 
{
  //this is the test Code 1
   public static ArrayList<User> arrayList=new ArrayList<User>();
	
 /* @GET
   @Path("add/{userName}/{password}")
	//@Path("/add")
	public void addUse(@PathParam("userName")String userName,@PathParam("password")String password)
	{
		
		arrayList.add(new User(arrayList.size()==0?1:arrayList.get(arrayList.size()-1).getId()+1,userName,password));
		showallUsers();	
	}
  */
 
  @POST
  @Path("adduser")
  @Consumes("application/json")
  @Produces("application/json")
	//@Path("/add")
	public List<User> addUse(User user)
	{
		
		arrayList.add(user);
		return showallUsers();	
	}
  
	@GET
	@Path("delete/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public List<User> deleteUser(@PathParam("id")int id)
	{
		int index=-1;
		System.out.println("deleteUser");
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getId()==id) {
				index=i;				
			}
		}
		if (index!=-1) {
			arrayList.remove(index);	
		}
		return showallUsers();
	}
	@GET
	@Path("get/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public User getUser(@PathParam("id")int id)
	{
		User user=null;
		for (User user1 : arrayList) {
			
			if (user1.getId()==id) {
				user=user1;
				
			}
		}
		
		return user;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> showallUsers()
	{
	//System.out.println(arrayList);
	return arrayList;
	
	}
	
	
}
