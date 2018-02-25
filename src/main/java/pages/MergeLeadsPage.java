package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//a[contains(@href,'ComboBox_partyIdFrom')]")
	WebElement eleFromLeadButton;
	public FromLeadPage clickFromLeadButton() {
		clickWithNoSnap(eleFromLeadButton);
		switchToWindow(1);
		return new FromLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(@href,'ComboBox_partyIdTo')]")
	WebElement eleToLeadButton;
	public FromLeadPage clickToLeadButton() {
		clickWithNoSnap(eleToLeadButton);
		switchToWindow(1);
		return new FromLeadPage();
	}
	
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	WebElement eleMergeButton;
	public MergeLeadsPage clickMergeButton() {
		click(eleMergeButton);
		return this;
	}
	
	public ViewLead acceptAreYouSureAlert() {
		acceptAlert();
		return new ViewLead();
	}
	
}
