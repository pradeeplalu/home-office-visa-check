package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectNationality;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectNationality(String nationality){
        Reporter.log(" Select nation : "  + selectNationality.toString()+"<br>");
        sendTextToElement(selectNationality,nationality);
    }
    public void clickContinueButton(){
        Reporter.log("Click on Continue button"  + continueButton.toString()+"<br>");
        clickOnElement(continueButton);
    }

}


