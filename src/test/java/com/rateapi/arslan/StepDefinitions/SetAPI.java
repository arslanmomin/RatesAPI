package com.rateapi.arslan.StepDefinitions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SetAPI {
	
	static String addURI;
	static ResponseEntity<String> response;

	public static void setNormalApi() {
		// TODO Auto-generated method stub
		addURI = "https://api.ratesapi.io/api/latest";
	}

	
	
	public static void setDatedApi() {
		addURI = "https://api.ratesapi.io/api/2010-01-12";
	}
	
	public static void setIncompeteApi() {
		addURI = "https://api.ratesapi.io/s";
	}
	
	public static void setIncorrectApi() {
		addURI = "https://api.ratesapi.io/api/lat";
	}
	

	public static void setRequestHeader() {
		 
		RestTemplate restTemplate = new RestTemplate ();
		response = restTemplate.getForEntity(addURI + "/1", String.class);
	}
	
	
}
