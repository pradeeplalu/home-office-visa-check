package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath= "//div[@class='gem-c-radio govuk-radios__item'][1]")
    WebElement clickYes;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthAndCareProfessional;


    public void selectOnYes(){
        Reporter.log("Select on yes "  + clickYes.toString()+"<br>");
        clickOnElement(clickYes);
    }
    public void clickContinueButton() {

        Reporter.log("Click on Continue button"  + continueButton.toString()+"<br>");
        clickOnElement(continueButton);
    }
    public void clickOnHealthAndCareProfessional(){
        Reporter.log("Click on health and care professional "  + healthAndCareProfessional.toString()+"<br>");
        clickOnElement(healthAndCareProfessional);
    }
}


