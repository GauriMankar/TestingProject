package com.actitime.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrack {
	@FindBy(xpath="//a[text()='Enter Time-Track']")
	private WebElement entertimetrack;
	
	@FindBy(xpath="//a[text()='View Time-Track']")
	private WebElement viewtimetrack;
	
	@FindBy(xpath="//a[text()='Lock Time-Track']")
	private WebElement locktimetrack;
	
	@FindBy(xpath="//a[text()='Approve Time-Track']")
	private WebElement approvetimetrack;
	
	public TimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);//intialize data members
	}
	
	public void clickEntertimetrack() {
		entertimetrack.click();
	}
	public void clickViewtimetrack() {
		viewtimetrack.click();
	}
	
	public void clickLocktimetrack() {
		locktimetrack.click();
	}
	
	public void clickApprovetimetrack() {
		approvetimetrack.click();
	}
}

