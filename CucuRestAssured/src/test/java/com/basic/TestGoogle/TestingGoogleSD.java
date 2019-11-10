package com.basic.TestGoogle;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogleSD {
	//restassured and cucumber combination
	Response res; 
	
	@Given("^i start rest assured testing$")
	public void i_start_rest_assured_testing() throws Throwable {
		System.out.println("starting");
	    
	}

	@When("^I hit google website$")
	public void i_hit_google_website() throws Throwable {
		res = RestAssured.given().get("//http:/google.com");
	   
	}

	@Then("^I check the status code from response$")
	public void i_check_the_status_code_from_response() throws Throwable {
		int stCode = res.getStatusCode();
		Assert.assertTrue(stCode ==200);
	   
	}

}
