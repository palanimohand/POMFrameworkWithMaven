package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	WebElement eleclickMergeLead;
	public MergeLeadsPage clickMergeLead(){
		clickWithNoSnap(eleclickMergeLead);	
		return new MergeLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement eleclickCreateLead;
	public CreateLeadPage clickCreateLead() {
		click(eleclickCreateLead);	
		return new CreateLeadPage();
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	WebElement eleclickFindLead;
	public FindLeadsPage clickFindLead() {
		click(eleclickFindLead);	
		return new FindLeadsPage();
	}
}
