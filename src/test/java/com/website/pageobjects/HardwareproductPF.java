package com.website.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HardwareproductPF {

	WebDriver driver;

	public HardwareproductPF(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='columnLeft']/div[1]/div[2]/a[1]")
	WebElement click_Hardware;

	public WebElement hardwaree() {
		return click_Hardware;
	}

	@FindBy(xpath = "//*[@id='bodyContent']/div/div/table/tbody/tr[1]/td[3]/a")
	WebElement click_keyboard;

	public WebElement Keyboard() {
		return click_keyboard;
	}

	@FindBy(xpath = "//*[@id='tdb4']/span[2]")
	WebElement click_Buynowbotton;

	public WebElement Button() {
		return click_Buynowbotton;
	}

	@FindBy(partialLinkText="Check")
	WebElement click_Checkout;

	public WebElement checkout() {
		return click_Checkout;
	}

}
