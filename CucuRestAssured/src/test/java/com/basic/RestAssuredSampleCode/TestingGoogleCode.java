package com.basic.RestAssuredSampleCode;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestingGoogleCode {

	
	public static void main(String[] args) {
		
Response res = RestAssured.given().get("https://google.com");
int stCode = res.getStatusCode();
System.out.println(""+stCode );

	}

}
