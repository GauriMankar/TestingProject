package com.actitime.testCases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.actitime.pageObjects.Reports;

public class TC_ACTReports012 extends TC_ACTLoginTest001{
	@Test
	public void createTimetrackReport() throws FindFailed {
		Reports r=new Reports(driver);
		r.clickOnReports();
		r.generateNewReort();
		r.timeTrackReport();
		r.enterReportname("Time Track");
		r.clickOnSaveReport();
	}


}
