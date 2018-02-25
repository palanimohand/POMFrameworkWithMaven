package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {

	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	public DuplicateLeadPage verifyDuplicateLeadTitle(String data) {
		verifyContainsTitle(data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name = 'submitButton']")
	WebElement eleCreateLeadinDuplicateLead;
	public ViewLead clickCreateLeadinDuplicateLeadPage() {
		click(eleCreateLeadinDuplicateLead);
		return new ViewLead();
	}
}
