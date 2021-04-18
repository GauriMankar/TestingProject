package com.actitime.testCases;

import org.testng.annotations.Test;

import com.actitime.pageObjects.EnterTimeTrack;
import com.actitime.pageObjects.TimeTrack;

public class TC_ACTTimeTrack003 extends TC_ACTLoginTest001{
	@Test
	public void createTaskFromList() {
	
	TimeTrack t1=new TimeTrack(driver);
	t1.clickEntertimetrack();
	EnterTimeTrack t2=new EnterTimeTrack(driver);
	t2.addTaskFromList();

}
}
