package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Users {
	@FindBy(id="container_users")
	private WebElement users;

	@FindBy(xpath="//div[text()=\"New User\"]")
	private WebElement newuser;
	
	@FindBy(xpath="//div[text()=\"Bulk Invitations\"]")
	private WebElement bulkinvitations;
	
	@FindBy(xpath="//input[@id=\"createUserPanel_firstNameField\"]")
	private WebElement enterfirstname;
	
	@FindBy(id="createUserPanel_lastNameField")
	private WebElement enterlastname;
	
	@FindBy(id="createUserPanel_emailField")
	private WebElement enteremailid;
	
	@FindBy(xpath="//input[@id=\"groupManagementLightBox_newGroupInput\"]")
	private WebElement enterdeptname;
	
	@FindBy(xpath="//button[@id=\"groupManagementLightBox_addGroupButton\"]")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[@class=\"simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty\"]")
	private WebElement selectdept;
	
	@FindBy(xpath="//div[@class=\"components_switcher small off animated\"]")
	private WebElement timetrackapproval;
	
	@FindBy(xpath="//div[@class=\"components_button submitBtn\"]")
	private WebElement savebtn;
	
	@FindBy(xpath="//div[@class=\"components_button cancelBtn\"]")
	private WebElement canclebtn;
	
	WebDriver ldriver;
	public Users(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonUsersmodule() {
		users.click();
	}
	
	public void clickonAddButton() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\addbtn.PNG");
		s.click(p1);
	}
	public void clickOnEnterFirstLastName(String fname,String Lname) {
		 WebDriverWait wt=new WebDriverWait(ldriver, 10);
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(enterfirstname));
		ele.click();
		enterfirstname.sendKeys(fname);
		enterlastname.click();
		enterlastname.sendKeys(Lname);
	}
	public void enterEmailId(String email) {
		enteremailid.click();
		enteremailid.sendKeys(email);
	}
	
	public void enterDeptName(String dept) {
		 WebDriverWait wt=new WebDriverWait(ldriver, 10);
			WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(enterdeptname));
			ele.click();
		enterdeptname.sendKeys(dept);
	}
	public void addNewuser() {
		newuser.click();
	}
	public void selectDeptDropdown() {
		selectdept.click();
	}
	public void approveTimetracktoggle() {
		timetrackapproval.click();
	}
	public void saveSentInvite() {
		savebtn.click();
	}
	
	
	
	public void clickOnDepartments() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\departments.PNG");
		s.click(p1);
	}
	public void clickOnQualityControlDept() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\qualitycontrol.PNG");
		s.click(p1);
	}
	public void clickOnPermissions() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\permissions.PNG");
		s.click(p1);
	}
	public void clickOnApprovetimetrackPermissions() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\approvetime.PNG");
		s.click(p1);
	}
	public void clickOnManagescopePermissions() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\managescope.PNG");
		s.click(p1);
	}



}
