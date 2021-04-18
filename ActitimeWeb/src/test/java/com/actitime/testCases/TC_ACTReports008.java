package com.actitime.testCases;

import org.testng.annotations.Test;

import com.actitime.pageObjects.Reports;

public class TC_ACTReports008 extends TC_ACTLoginTest001{
	@Test
	public void deleteChart() {
		Reports r=new Reports(driver);
		r.clickOnReports();
		r.deleteReport();
		r.confirmDelrtion();
	}

}
