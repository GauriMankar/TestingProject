package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewTimeTrack {
   // WebDriver driver;
	@FindBy(xpath = "//td[text()='                Export to PDF            ']")
	private WebElement exporttopdf;

	@FindBy(id = "viewTTPdfPreviewLightbox_downloadPdfBtn")
	private WebElement downloadpdf;
	
	@FindBy(xpath="//span[text()=\"Download PDF\"]")
	private WebElement downloadpdfbutton;

	public ViewTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);// intialize data members
		driver.manage().window().maximize();
		
	}

	public void clickExporttopdf() {
		exporttopdf.click();
	}

	public void clickOndownload(){
		
		downloadpdfbutton.click();
	}
}

