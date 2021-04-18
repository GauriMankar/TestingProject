package com.actitime.testCases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.actitime.pageObjects.Reports;

public class TC_ACTReports009 extends TC_ACTLoginTest001 {
	@Test
	public void copyUsersWithodDeptReport() throws FindFailed, InterruptedException {
		Reports r=new Reports(driver);
		r.clickOnReports();
		r.copyUsersWithoutDept();
	}

}
