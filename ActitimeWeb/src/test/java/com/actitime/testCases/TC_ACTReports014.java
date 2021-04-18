package com.actitime.testCases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.actitime.pageObjects.Reports;

public class TC_ACTReports014 extends TC_ACTLoginTest001 {
	@Test
	public void createProfitlossReport() throws FindFailed {
		Reports r=new Reports(driver);
		r.clickOnReports();
		r.generateNewReort();
		r.profitLossReport();
		r.enterReportname("Profit and Loss");
		r.clickOnSaveReport();
	}


}
