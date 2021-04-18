package com.actitime.testCases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.actitime.pageObjects.Reports;

public class TC_ACTReports011 extends TC_ACTLoginTest001{
	@Test
	public void createLeavetimeReport() throws FindFailed {
		Reports r=new Reports(driver);
		r.clickOnReports();
		r.generateNewReort();
		r.generateLeaveTimeReport();
		r.enterReportname("Leave Report");
		r.clickOnSaveReport();
	}


}
