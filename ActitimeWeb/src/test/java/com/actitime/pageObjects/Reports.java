package com.actitime.pageObjects;



import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Reports {
	@FindBy(id="container_reports")
	private WebElement reports;
	
	@FindBy(xpath="//span[text()=\"Create Chart\"]")
	private WebElement createchartbtn;
	
	@FindBy(xpath="//span[text()=\"New Report\"]")
	private WebElement newreportbtn;
    
	@FindBy(xpath="//div[text()=\"Monthly Team Performance\"]")
	private WebElement teamperformance;
	
	@FindBy(xpath="//div[text()=\"Team Hours & Overtime\"]")
	private WebElement teamovertime;
	
	@FindBy(xpath="//div[text()=\"Add to Dashboard\"]")
	private WebElement addtodash;
	
	@FindBy(xpath="//input[@class=\"reportNameEdit inputFieldWithPlaceholder\"]")
	private WebElement enterchartname;
	
	@FindBy(xpath="//td[@class=\"saveNewConfigButton greyButton\"]")
	private WebElement savebtn;
	
	@FindBy(id="closeCreateChartLightboxButton")
	private WebElement closebtn;
	
	@FindBy(id="createChartLightbox_taskUserSelectorButtonWrapperId")
	private WebElement allstaf;
	
	@FindBy(xpath="//label[normalize-space()='Selected Staff']")
	private WebElement selectedstaff;
	
	@FindBy(xpath="//span[text()=\"Apply\"]")
	private WebElement apply;
	
	@FindBy(xpath="/html[1]/body[1]/div[19]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/span[1]")
	private WebElement userswithoutdept;
	
	@FindBy(xpath="//div[@id='createChartLightbox_commitBtn']//div[@class='buttonIcon']")
	private WebElement exporttopdf;
	
	@FindBy(xpath="//span[normalize-space()='Download PDF']")
	private WebElement downloadpdf;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[11]/table[2]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private WebElement deletereport;
	
	@FindBy(xpath="(//div[@class=\"shareButtonContainer\"])[1]")
	private WebElement copytodropdown;
	
	@FindBy(xpath="//span[@title=\"Users Without Department\"]")
	private WebElement cuserswitoutdept;
	
	@FindBy(xpath="/html[1]/body[1]/div[13]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[2]")
	private WebElement copytobtn;
	
	@FindBy(xpath="//div[text()=\"Configure Report Parameters\"]")
	private WebElement conreportparabtn;
	
	@FindBy(id="applyReportConfiguration")
	private WebElement generatehtmlreportbtn;
	
	@FindBy(xpath="//div[text()=\"Add to Dashboard\"]")
	private WebElement gaddtodash;
	
	@FindBy(xpath="//input[@class=\"reportNameEdit inputFieldWithPlaceholder\"]")
	private WebElement enterreportname;
	
	
	WebDriver ldriver;
	public Reports(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnReports() {
		reports.click();
	}
	public void clickOnCreateChart() {
		createchartbtn.click();
	}
	
	public void clickOnaadToDashboard() {
		addtodash.click();
	}
	
	public void enterChartName(String chartname) {
	enterchartname.sendKeys(chartname);
}
	public void clickOnSaveBtn() {
		savebtn.click();
	}
	
	public void clickOnCloseBtn() {
		closebtn.click();
	}
	public void clickOnallStaff() {
		allstaf.click();
	}
	public void clickOnSelectedStaff() {
		selectedstaff.click();
		userswithoutdept.click();
		
		apply.click();
	}
	public void clickOnExportToPdf() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		exporttopdf.click();
	}
	public void clickOnDownloadPdf() {
		downloadpdf.click();
	}
	public void deleteReport() {
		deletereport.click();
	}
	
	public void confirmDelrtion() {
		
		Alert a = ldriver.switchTo().alert();
		a.accept();
	}
	public void copyUsersWithoutDept() throws FindFailed, InterruptedException {
		copytodropdown.click();
		cuserswitoutdept.click();
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\CopyTo.PNG");
		s.click(p1);
	}
	public void generateNewReort(){
		newreportbtn.click();
		
	}
	public void generateStaffReport() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\confireportparabtn.PNG");
		s.click(p1);
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		generatehtmlreportbtn.click();	
	}
	public void generateLeaveTimeReport() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\leavetime.PNG");
		s.click(p1);
		Pattern p2 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\confireportparabtn.PNG");
		s.click(p2);
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		generatehtmlreportbtn.click();	
	}
	public void generatEstimatevsActualReport() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\esvsact.PNG");
		s.click(p1);
		Pattern p2 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\confireportparabtn.PNG");
		s.click(p2);
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		generatehtmlreportbtn.click();	
	}
	public void timeTrackReport() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\timetrack.PNG");
		s.click(p1);
		Pattern p2 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\confireportparabtn.PNG");
		s.click(p2);
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		generatehtmlreportbtn.click();	
	}
	public void profitLossReport() throws FindFailed {
		Screen s = new Screen();
		Pattern p1 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\profitloss.PNG");
		s.click(p1);
		Pattern p2 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\confireportparabtn.PNG");
		s.click(p2);
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		generatehtmlreportbtn.click();	
	}
	public void enterReportname(String reportname) {
		gaddtodash.click();
		enterreportname.sendKeys(reportname);
	}
	
	public void clickOnSaveReport() throws FindFailed {
		Screen s = new Screen();
		Pattern p2 = new Pattern("E:\\SeleniumWorkspace\\ActitimeWeb\\sikuliimgs\\savebtn.PNG");
		s.click(p2);
	}

}
