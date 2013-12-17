package org.mohans.dev.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "Message : " + msg;
		return Response.status(200).entity(output).build();
 
	}
 
	@GET
	@Path("/")
	public Response getMsg() {
		String output = "Hello From YogaRESTApp!";
		return Response.status(200).entity(output).build();
 
	}

}
