package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="username")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name="pwd")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(id="keepLoggedInCheckBox")
	WebElement checkbox;

	@FindBy(id="loginButton")
	WebElement loginbutton;

	@FindBy(xpath="//span[contains(text(),'Username')]")
	WebElement errormsg;

	@FindBy(linkText="actiTIME Inc.")
	WebElement copyrights;

	@FindBy(linkText="Forgot your password?")
	WebElement forgotpsw;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}

	public void selectCheckBox()
	{
		checkbox.click();
	}

	public boolean verifyErrorMsg()
	{
		return errormsg.isDisplayed();
	}

	public String printErrorMsg()
	{
		return errormsg.getText();
	}

	public void forgotPassword()
	{
		forgotpsw.click();
	}

	public void viewCopyRights()
	{
		copyrights.click();
	}

}



