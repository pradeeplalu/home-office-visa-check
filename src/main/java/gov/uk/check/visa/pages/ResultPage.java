package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectTourism;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement verifyResultText;

    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyMsg;

    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement verifyMsgFinal;


    public void selectTourism() {
        Reporter.log("Select on tourism"  + selectTourism.toString()+"<br>");
        clickOnElement(selectTourism);
    }

    public void clickContinueButton() {
        Reporter.log("Click on Continue button"  + continueButton.toString()+"<br>");
        clickOnElement(continueButton);
    }
    public String getResultText(){
        Reporter.log("Get result text : "  + verifyResultText.toString()+"<br>");
        return getTextFromElement(verifyResultText);
    }
    public String getTextVerifyMsg(){
        Reporter.log("Get result text : "  + verifyResultText.toString()+"<br>");
        return getTextFromElement(verifyMsg);
    }
    public String getVerifyPartnerMsg(){
        Reporter.log("Get result text : "  + verifyResultText.toString()+"<br>");
        return getTextFromElement(verifyMsgFinal);
    }



}


