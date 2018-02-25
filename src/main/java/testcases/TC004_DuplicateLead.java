package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC004_DuplicateLead";
		testDescription="Duplicate an already existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName,String pwd,String email, String title) throws InterruptedException {
		
		String firstname = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsMainPage()
		.clickFindLead()
		.clickEmailTab()
		.enterEmailId(email)
		.clickFindLead()
		.selectFirstResultingItemOfFirstName()
		.copyFirstName();
		
		new ViewLead()
		.clickDuplicateLeadButton()
		.verifyDuplicateLeadTitle(title)
		.clickCreateLeadinDuplicateLeadPage()
		.verifyFirstName(firstname);
		
	}
	
}
