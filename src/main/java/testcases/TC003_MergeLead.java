package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_MergeLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC003_MergeLead";
		testDescription="Merge two leads to a single lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName, String pwd, String fromid, String toid, String result) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsMainPage()
		.clickMergeLead()
		.clickFromLeadButton()
		.enterLeadIdforMergeLead(fromid)
		.clickFindLeadButtonForMerge()
		.selectFirstItem()
		.clickToLeadButton()
		.enterLeadIdforMergeLead(toid)
		.clickFindLeadButtonForMerge()
		.selectFirstItem()
		.clickMergeButton()
		.acceptAreYouSureAlert()
		.clickFindLeads()
		.enterLeadID(fromid)
		.clickFindLead()
		.verifyResult(result);
		
	}

}
