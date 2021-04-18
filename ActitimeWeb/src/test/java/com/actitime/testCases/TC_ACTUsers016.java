package com.actitime.testCases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.actitime.pageObjects.Users;

public class TC_ACTUsers016 extends TC_ACTLoginTest001 {
	@Test
	public void addNewDept() throws FindFailed {
		Users u=new Users(driver);
		u.clickonUsersmodule();
		u.clickOnDepartments();
		u.enterDeptName("Developement");
		u.clickonAddButton();
	}

}
