package com.actitime.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterTimeTrack {
	@FindBy(xpath="//span[text()='Me']")
	private WebElement entertimetrackfor;
	
	@FindBy(xpath="//span[text()='New']")
	private WebElement addnew;
	
	@FindBy(xpath="//span[text()='Add Tasks from the List']")
	private WebElement addtaskfromlist;
	
	@FindBy(xpath="//td[@class='dropdownButton'][1]")
	private WebElement tasklistdropdown;
	
	@FindBy(xpath="//td[text()=\"Big Bang Company\"]")
	private WebElement selcompany;
	
	@FindBy(xpath="//span[text()=\"Mars mission support\"]")
	private WebElement chkboxcomp;
	
	@FindBy(xpath="//button[text()=\"Add Selected\"]")
	private WebElement addselected;
	
	@FindBy(xpath="//span[text()='Add Recent Task']")
	private WebElement addrecenttask;
	
	@FindBy(id="SubmitTTButton")
	private WebElement savechanges;
	
	@FindBy(xpath="(//div[text()=\"Calls\"])[1]")
	private WebElement selecttask;
	
	@FindBy(xpath="(//div[contains(@class,'cellButton')]//div[@class='name'][normalize-space()='Done']")
	private WebElement done;
	
	@FindBy(xpath="//div[@Class=\"sendCommentLine\" ]")
	private WebElement cmtbox;
	
	@FindBy(xpath="//div[@Class=\"sendCommentButton\" ]")
	private WebElement cmtbtn;
	
	@FindBy(xpath="//span[text()='Your changes were successfully saved.']")
	private WebElement successmsg;
	
	@FindBy(xpath="img[title=\"Click to edit comments\"]")
	private WebElement comment;
	
	@FindBy(className="listtblcell_submit_tt listtblcell_submit_tt_background  taskNameColumn firstInRow")
	private WebElement recenttask;
	
	@FindBy(xpath="//div[text()=\"Strategic Selection\"]")
	private WebElement lastrowtask;
	
	@FindBy(xpath="//div[text()=\"Strategic roadmap\"]")
	private WebElement strategicrod;
	
	@FindBy(xpath="//div[text()=\"Strategic Selection\"]")
	private WebElement strategicselection;
	
	@FindBy(xpath="//div[text()=\"ACTIONS\"]")
	private WebElement actions;
	
	@FindBy(xpath="//div[text()=\"Delete\"]")
	private WebElement delete;
	
	@FindBy(xpath="//span[text()=\"Delete with users' time entries\"]")
	private WebElement deletethistask;
	
	@FindBy(xpath="//span[text()=\"Delete permanently\"]")
	private WebElement deleteconfirmbtn;
	
	@FindBy(xpath="//div[@class='workflowStatus statusType_open statusColor_darkGreen statusTypeIcon_darkGreen withPrefix showArrow']")
	private WebElement status;
	
	WebDriver ldriver;
	public EnterTimeTrack(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void addTimetrackfor() {
		entertimetrackfor.click();
	}
	
	public void addNewTask() {
		addnew.click();
	}
	
	public void addTaskFromList() {
		addtaskfromlist.click();
		Actions a=new Actions(ldriver);
		a.moveToElement(tasklistdropdown).perform();
		tasklistdropdown.click();
		selcompany.click();
		chkboxcomp.click();
		addselected.click();
		
	}
	
	public void addRecentTask() {
		addrecenttask.click();
		lastrowtask.click();
		strategicrod.click();
	}
	public void clickOncommentBox() {
		comment.click();
		
		/*Alert a = driver.switchTo().alert();
		a.sendKeys("new task");
		a.accept();*/	
	}
	
	public void clickSavebutton() {
		//ldriver.navigate().refresh();
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		savechanges.click();
	}
	
	public void selectTask() {
		selecttask.click();
	}
	public void movetochangeStatus() {
		
		status.click();
		
        // Actions a=new Actions(ldriver);
      
		done.click();
	}
	
	public void cmtBox() {
		 cmtbox.click();
		 cmtbox.sendKeys("Task Completed");
		 WebDriverWait wt=new WebDriverWait(ldriver, 10);
			WebElement ele=wt.until(ExpectedConditions.elementToBeClickable(cmtbtn));
		 ele.click();
	}
	
	
	public void getSuccessmsg() {
		String str = successmsg.getText();
		System.out.println(str);
	}
	
	public void deleteTask() {
		strategicselection.click();
		actions.click();
		delete.click();
		//deletethistask.click();
		deleteconfirmbtn.click();
	}
}
