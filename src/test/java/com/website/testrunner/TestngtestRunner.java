package com.website.testrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

	@CucumberOptions
	(features="Features",
	glue="com.website.stepdefs",
	tags="@contactus"
	)
	public class TestngtestRunner extends AbstractTestNGCucumberTests{
		
	} 
