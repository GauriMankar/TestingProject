package com.actitime.testCases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.actitime.pageObjects.Reports;

public class TC_ACTReports013 extends TC_ACTLoginTest001{
	@Test
	public void createEstivsActualReport() throws FindFailed {
		Reports r=new Reports(driver);
		r.clickOnReports();
		r.generateNewReort();
		r.generatEstimatevsActualReport();
		r.enterReportname(" Est vs Act Time");
		r.clickOnSaveReport();
	}


}
