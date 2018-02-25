package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Create lead and verify the first name";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC002";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadandVerifyFirstName(String uName, String pwd, String cname, String fname, String lname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsMainPage()
		.clickCreateLead()
		.enterCompanyname(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton()
		.verifyFirstName(fname);
		
	}
}
