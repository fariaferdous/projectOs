package com.website.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.website.pageobjects.ContactusPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactusSD {

	WebDriver driver;

	@Given("^user visitting the home page$")
	public void user_visitting_the_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Faria\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com/login.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("^user click the Contact Us link$")
	public void user_click_the_Contact_Us_link() throws Throwable {
		ContactusPF ob = new ContactusPF(driver);
		ob.contact().click();

	}

	@When("^user enter \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enter(String arg1, String arg2) throws Throwable {
		ContactusPF ob1 = new ContactusPF(driver);
		ob1.fullname().sendKeys(arg1);
		ob1.email().sendKeys(arg2);

	}

	@When("^user enter message from \"([^\"]*)\"$")
	public void user_enter_message_from(String arg1) throws Throwable {
		ContactusPF ob3 = new ContactusPF(driver);
		ob3.textarea().sendKeys(arg1);
	}

	@When("^user click continue button$")
	public void user_click_continue_button() throws Throwable {
		ContactusPF ob4 = new ContactusPF(driver);
		ob4.continuebutton();
	}
	@Then("^visitor can see the information$")
	public void visitor_can_see_the_information() throws Throwable {
	  
	}

}
