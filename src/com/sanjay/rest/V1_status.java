package com.sanjay.rest;
 import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
 @Path("/v1/status")
public class V1_status {
	 private static String api_version="0.001.009";
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public  String returnTitle()
	 {
		 return "<p>java web</p>";
	 }
	 
	 @Path("/version")
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public  String returnVersion()
	 {
		 return "<p>java web</p>"+api_version;
	 }

}
