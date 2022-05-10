package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startButton;
    @FindBy(xpath = "//*[@id=\"global-cookie-message\"]/div[1]/div/div[2]/button[1]")
    WebElement acceptCookies;

    public void setAcceptCookies(){
        clickOnElement(acceptCookies);
    }


    public void clickOnStartButton() {
        Reporter.log("Click on Start button"  + startButton.toString()+"<br>");
        clickOnElement(startButton);
    }


}


