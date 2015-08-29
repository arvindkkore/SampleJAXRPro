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
  //this is the test Code 
   public static ArrayList<User> arrayList=new ArrayList<User>();
	
  @GET
   @Path("add/{userName}/{password}")
	//@Path("/add")
	public void addUse(@PathParam("userName")String userName,@PathParam("password")String password)
	{
		
		arrayList.add(new User(arrayList.size()==0?1:arrayList.get(arrayList.size()-1).getId()+1,userName,password));
		showallUsers();	
	}
  
  @POST
  @Path("adduser")
  @Consumes("application/json")
	//@Path("/add")
	public void addUse(User user)
	{
		
		arrayList.add(user);
		showallUsers();	
	}
  
	@GET
	@Path("delete/{id}")
	public void deleteUser(@PathParam("id")int id)
	{
		int index=-1;
		System.out.println("deleteUser");
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getId()==id) {
				index=i;				
			}
		}
		arrayList.remove(index);
		showallUsers();
	}
	@GET
	@Path("get/{id}")
	public String getUser(@PathParam("id")int id)
	{
		User user=null;
		for (User user1 : arrayList) {
			
			if (user1.getId()==id) {
				user=user1;
				
			}
		}
		
		return user.toString();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User>  showallUsers()
	{
	//System.out.println(arrayList);
	return arrayList;
	
	}
	
	
}
