package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement elecompanyname;
	public CreateLeadPage enterCompanyname(String data)
	{
		type(elecompanyname, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement elefirstname;
	public CreateLeadPage enterFirstName(String data) {
		type(elefirstname, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement eleLastname;
	public CreateLeadPage enterLastName(String data) {
		type(eleLastname, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement eleCreateLeadbutton;
	public ViewLead clickCreateLeadButton() {
		click(eleCreateLeadbutton);
		return new ViewLead();
	}
}
