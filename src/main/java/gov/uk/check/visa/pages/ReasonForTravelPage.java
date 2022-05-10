package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-4']")
    WebElement selectReason;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement clickOnYes;


    public void clickOnSelectReason() {
        Reporter.log("Select reason "  + selectReason.toString()+"<br>");
        clickOnElement(selectReason);
    }
    public void clickContinueButton() {
        Reporter.log("Click on Continue button"  + continueButton.toString()+"<br>");
        clickOnElement(continueButton);
    }
    public void clickYesUkImmigrationStatus(){
        Reporter.log("Click on yes "  + clickOnYes.toString()+"<br>");
        clickOnElement(clickOnYes);
    }


}


