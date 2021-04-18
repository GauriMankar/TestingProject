package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTask{
	@FindBy(xpath="/html/body/div[28]/div/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]")
	private WebElement popup;
	
	@FindBy(xpath="//div[@Class=\"customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]")
	private WebElement dropdown;
	
	@FindBy(xpath="//div[text()=\"- New Customer -\"]")
	private WebElement newcustomer;

	@FindBy(xpath="//input[@placeholder=\"Enter Customer Name\"]")
	private WebElement enternewcustomer;

	@FindBy(xpath="//input[@placeholder=\"Enter Project Name\"]")
	private WebElement enternewproject;

	@FindBy(xpath="//input[@placeholder=\"Enter task name\"]")
	private WebElement enternewtask;

	@FindBy(xpath="//button[text()='set deadline'][1]")
	private WebElement deadline;
	
	@FindBy(xpath="//button[text()='today']")
	@CacheLookup
	private WebElement todaysdate;
	
	@FindBy(xpath="//div[text()='engineering']")
	private WebElement typeofwork;

	@FindBy(xpath="//*[contains(text(),'Create Tasks')]")
	private WebElement createtask;
	
	@FindBy(id="createTasksPopup_cancelBtn")
	private WebElement createtaskcancle;
	
	WebDriver ldriver;

	public CreateNewTask(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);//intialize data members
	}


	public void movetodropdown() {
		/*WebDriverWait w=new WebDriverWait(ldriver, 10);
		WebElement el=w.until(ExpectedConditions.elementToBeClickable(dropdown));
		Actions a=new Actions(ldriver);
		
		a.moveToElement(dropdown).click().perform();*/
		dropdown.click();
		
	}
	public void setNewCustomer() {
		newcustomer.click();	
	}
	public void enterCustomerProjectName(String customername,String projectname) {
		enternewcustomer.sendKeys(customername);
		enternewproject.sendKeys(projectname);
	}
	public void enterTaskname(String taskname) {

		enternewtask.sendKeys(taskname);
	}
	
	public void setDeadline() {
		deadline.click();
		todaysdate.click();
		//selecteddate.click();
	}
	public void setTypeofwork() {
		typeofwork.click();
	}
	public void clickCreatetask() {
		createtask.click();
	}
	public void clickCreatecancelButton() {
		createtaskcancle.click();
	}
}
