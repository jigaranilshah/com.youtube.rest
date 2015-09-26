package com.youtube.rest.status;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



@Path("/v1/status")
public class V1_status {
	private static final String api_version="0.1.00";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<P>JAVA REST WEB SERVICES</P>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<P>JAVA REST WEB SERVICES --> VERSION</P>"+api_version;
	}

}
