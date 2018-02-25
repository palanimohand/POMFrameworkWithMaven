package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FromLeadPage extends ProjectMethods{

	public FromLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement eleMergeLeadID;
	public FromLeadPage enterLeadIdforMergeLead(String data) {
		type(eleMergeLeadID, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="x-btn-text")
	WebElement eleFindLeadForMerge;
	public FromLeadPage clickFindLeadButtonForMerge() throws InterruptedException {
		clickWithNoSnap(eleFindLeadForMerge);
		Thread.sleep(1000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	WebElement eleFirstElement;
	public MergeLeadsPage selectFirstItem() {
		clickWithNoSnap(eleFirstElement);
		switchToWindow(0);
		return new MergeLeadsPage();
	}
}
