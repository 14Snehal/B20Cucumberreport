package com.basic.myfirstcucuscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstTestStepDef {
	WebDriver driver;
	
	@Given("I am starting cucumber automation")
	public void I_am_starting_cucumber_automation(){
		System.out.println("Starting cucumber automation");
		//System.out.println("");
		System.setProperty("webdriver.chrome.driver","C:\\Radicalsoftware\\final\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.seleniumhq.org/");
		
	}
	
	@When("I print hello cucumber")
	public void I_print_hello_cucumber(){
		System.out.println("Hello Cucumber");
	}
	
	@Then("I print cucumber test passed")
	public void I_print_cucumber_test_passed(){
		System.out.println("test passed");
	}

}
