package com.actitime.testCases;

import org.testng.annotations.Test;

import com.actitime.pageObjects.TimeTrack;
import com.actitime.pageObjects.ViewTimeTrack;

public class TC_ACTTimeTrack005 extends TC_ACTLoginTest001 {
	@Test
 public void downloadPdF() {
		TimeTrack t1=new TimeTrack(driver);
		t1.clickViewtimetrack();
		ViewTimeTrack v1=new ViewTimeTrack(driver);
    	v1.clickExporttopdf();
    	v1.clickOndownload();
 }
}
