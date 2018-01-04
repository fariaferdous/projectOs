package com.website.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPF {
	WebDriver driver;

	public ContactusPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='columnLeft']/div[5]/div[2]/a[4]")
	WebElement click_contactus;

	public WebElement contact() {
		return click_contactus;
	}

	@FindBy(xpath = "//input[@name='name']")
	WebElement enter_fullname;

	public WebElement fullname() {
		return enter_fullname;
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement enter_emailaddress;

	public WebElement email() {
		return enter_emailaddress;
	}

	@FindBy(xpath = "//textarea[@name='enquiry']")
	WebElement textarea_enquiry;

	public WebElement textarea() {
		return textarea_enquiry;
	}

	@FindBy(xpath = "//button[@id='tdb4']")
	WebElement click_continue;

	public WebElement continuebutton() {
		return click_continue;
	}

}
