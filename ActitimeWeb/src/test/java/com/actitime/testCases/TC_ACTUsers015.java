package com.actitime.testCases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.actitime.pageObjects.Users;

public class TC_ACTUsers015 extends TC_ACTLoginTest001{
	@Test
	public void addNewUser() throws FindFailed {
		Users u=new Users(driver);
		u.clickonUsersmodule();
		u.addNewuser();
		u.clickOnEnterFirstLastName("Rita", "Roy");
		u.enterEmailId("ritaroy@gmail.com");
		u.selectDeptDropdown();
		u.clickOnQualityControlDept();
		u.approveTimetracktoggle();
		u.clickOnPermissions();
		u.clickOnApprovetimetrackPermissions();
		u.clickOnManagescopePermissions();
		u.saveSentInvite();
	}

}
