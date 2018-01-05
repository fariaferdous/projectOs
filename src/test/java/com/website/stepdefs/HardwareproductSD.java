package com.website.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.website.pageobjects.HardwareproductPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HardwareproductSD {

	WebDriver driver;

	@Given("^user go to the homepage$")
	public void user_go_to_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Faria\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demo.oscommerce.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("^user click the Hardware link$")
	public void user_click_the_Hardware_link() throws Throwable {

		HardwareproductPF ob = new HardwareproductPF(driver);
		ob.hardwaree().click();
	}

	@When("^user select keyboards$")
	public void user_select_keyboards() throws Throwable {
		HardwareproductPF ob1 = new HardwareproductPF(driver);
		ob1.Keyboard().click();

	}

	@When("^user select Buy Now button$")
	public void user_select_Buy_Now_button() throws Throwable {
		HardwareproductPF ob3 = new HardwareproductPF(driver);
		ob3.Button().click();
	}

	@When("^user click the Checkout button\\.$")
	public void user_click_the_Checkout_button() throws Throwable {
		HardwareproductPF ob4 = new HardwareproductPF(driver);
		ob4.checkout().click();

	}

	@Then("^user find the information\\.$")
	public void user_find_the_information() throws Throwable {
	}

}
