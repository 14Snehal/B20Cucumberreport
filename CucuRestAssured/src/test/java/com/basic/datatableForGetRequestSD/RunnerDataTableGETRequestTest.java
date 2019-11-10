package com.basic.datatableForGetRequestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/datatableForGetRequestFF/"},
		glue={"com/basic/datatableForGetRequestSD/"},
		monochrome = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport", //cucumber report
				"json:target/cucumber-report1141.json",//cucumber report
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html" //extendreport is third party report used by cucumber 
		}

		
		)

public class RunnerDataTableGETRequestTest {

}
