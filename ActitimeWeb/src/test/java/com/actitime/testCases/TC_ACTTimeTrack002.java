package com.actitime.testCases;

import org.testng.annotations.Test;

import com.actitime.pageObjects.CreateNewTask;
import com.actitime.pageObjects.EnterTimeTrack;
import com.actitime.pageObjects.TimeTrack;


public class TC_ACTTimeTrack002 extends TC_ACTLoginTest001{
	@Test
	public void createNewTask() {
		TimeTrack t1=new TimeTrack(driver);
		t1.clickEntertimetrack();
		EnterTimeTrack t2=new EnterTimeTrack(driver);
		t2.addNewTask();
		CreateNewTask c1=new CreateNewTask(driver);
		c1.movetodropdown();
		c1.setNewCustomer();
		c1.enterCustomerProjectName("Amayra", "management");
		c1.enterTaskname("Strategic Selection");
		c1.setDeadline();
		c1.clickCreatetask();

	}


}
