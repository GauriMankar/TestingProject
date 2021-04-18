package com.actitime.testCases;

import org.testng.annotations.Test;

import com.actitime.pageObjects.Reports;

public class TC_ACTReports007 extends TC_ACTLoginTest001{
	@Test
	public void downloadChart() {
		Reports r=new Reports(driver);
		r.clickOnReports();
		r.clickOnCreateChart();
		r.clickOnallStaff();
		r.clickOnSelectedStaff();
		r.clickOnExportToPdf();
		r.clickOnExportToPdf();
	}
}
