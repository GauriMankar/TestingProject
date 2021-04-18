package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportTaskFromOtherProject {
	

	@FindBy(xpath="//span[text()='Import Selected Tasks']")
	private WebElement importselectedtasks;
	
	@FindBy(id="importArchivedCheckbox")
	private WebElement importfromarchivedproject;
	
	@FindBy(xpath="(//div[@class=\"customerProjectSelector activeProjects\"]//td[@class=\"dropdownButton\"])[1]")
	private WebElement customerorproject;
	

	@FindBy(xpath="//div[@class=\"customerProjectSelector activeProjects\"]//div[@class=\"cpDropdown\"]//table[1]")
	private WebElement customer ;

	@FindBy(xpath="(//div[@class=\"taskList\"])[1]/div[4]//input[@type=\"checkbox\"]")
	private WebElement task;
	
public ImportTaskFromOtherProject(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickImportselectedtasks() {
	importselectedtasks.click();
}

public void clickImportfromarchivedproject() {
	importfromarchivedproject.click();
}
public void clickCustomerorproject() {
	customerorproject.click();
}
public void clickCustomer() {
	customer.click();
}
public void clickTask() {
	task.click();
}



}
