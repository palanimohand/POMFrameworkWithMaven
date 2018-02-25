package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	WebElement eleCompanyName;
	public EditLeadPage clearCompanyName() {
		clearContent(eleCompanyName);
		return this;
	}
	
	public EditLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	WebElement eleUpdateButton;
	public ViewLead clickUpdate() {
		click(eleUpdateButton);
		return new ViewLead();
	}
}
