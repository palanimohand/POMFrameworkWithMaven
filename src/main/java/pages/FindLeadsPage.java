package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement eleLeadID;
	public FindLeadsPage enterLeadID(String data) {
		type(eleLeadID, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement eleFindLeadButton;
	public FindLeadsPage clickFindLead() throws InterruptedException {
		click(eleFindLeadButton);
		Thread.sleep(1000);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	WebElement elePageInfo;
	public FindLeadsPage verifyResult(String data) {
		verifyExactText(elePageInfo, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	WebElement eleEmailTab;
	public FindLeadsPage clickEmailTab() {
		click(eleEmailTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	WebElement eleEmailTextbox;
	public FindLeadsPage enterEmailId(String data) {
		type(eleEmailTextbox, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a")
	WebElement eleFirstItem;
	public ViewLead selectFirstResultingItemOfFirstName() {
		click(eleFirstItem);
		return new ViewLead();
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstItemofID;
	public ViewLead selectFirstResultingItemOfID() {
		click(eleFirstItemofID);
		return new ViewLead();
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	WebElement elePhoneTab;
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	WebElement elePhoneTextBox;
	public FindLeadsPage enterPhoneNo(String data) {
		type(elePhoneTextBox, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleID;
	public String copyId() {
		String id = getText(eleID);
		return id;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	WebElement eleFirstNametextbox;
	public FindLeadsPage enterFirstName(String data) {
		type(eleFirstNametextbox, data);
		return this;
	}
	
}
