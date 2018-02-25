package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	WebElement elefirstname;
	public ViewLead verifyFirstName(String data) {
		verifyExactText(elefirstname, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	WebElement eleCompanyName;
	public ViewLead verifyCompanyName(String data) {
		verifyExactText(elefirstname, data);
		return this;
	}
	
	public ViewLead verifyPageTitle(String data) {
		verifyTitle(data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads ")
	WebElement eleFindLeadsLink;
	public FindLeadsPage clickFindLeads() {
		clickWithNoSnap(eleFindLeadsLink);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	WebElement eleDuplicateLeadButton;
	public DuplicateLeadPage clickDuplicateLeadButton() {
		click(eleDuplicateLeadButton);
		return new DuplicateLeadPage();
	}
	
	public String copyFirstName() {
		String firstName = getText(elefirstname);
		return firstName;
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButtonDangerous']")
	WebElement eleDeleteButton;
	public MyLeadsPage clickDeleteButton() {
		click(eleDeleteButton);
		return new MyLeadsPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[@class = 'subMenuButton' ][3]")
	WebElement eleEditButton;
	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage();
	}
}
