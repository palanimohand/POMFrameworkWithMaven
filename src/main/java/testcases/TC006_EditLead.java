package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_EditLead";
		testDescription="Edit an existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC006";
	}


	@Test(dataProvider="fetchData")
public void editlead(String uName, String pwd, String fname, String cname) throws InterruptedException{
	
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogIn()
	.clickCrmsfa()
	.clickLeadsMainPage()
	.clickFindLead()
	.enterFirstName(fname)
	.clickFindLead()
	.selectFirstResultingItemOfID()
	.clickEditButton()
	.clearCompanyName()
	.enterCompanyName(cname)
	.clickUpdate()
	.verifyCompanyName(cname);
	
}
	
}
