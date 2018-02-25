package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete an existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC005";
	}

	@Test(dataProvider="fetchData")
	public void deleteexistingLead(String uName, String pwd, String phno, String result) throws InterruptedException {
		
		String id = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsMainPage()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNo(phno)
		.clickFindLead()
		.copyId();
		
		new FindLeadsPage()
		.selectFirstResultingItemOfID()
		.clickDeleteButton()
		.clickFindLead()
		.enterLeadID(id)
		.clickFindLead()
		.verifyResult(result);
		
	}

}
