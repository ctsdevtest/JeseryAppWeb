package com.vandana.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class jaxRSClient {
	 static Client client = Client.create();
	    static String getUrl = "http://localhost:8081/HDFC1/rest/statementsService/statements";
	    
	    public static void main(String args[]){
	    	
	    	           getRequest();
	    	       } 
	    public static void getRequest(){
			WebResource webResource = client.resource(getUrl);
			ClientResponse response = webResource.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
			//a successful response returns 200
	                if(response.getStatus()!=200){
				throw new RuntimeException("HTTP Error: "+ response.getStatus());
			}
			
			String result = response.getEntity(String.class);
			System.out.println("Response from the Server: ");
			System.out.println(result);
		}



}
