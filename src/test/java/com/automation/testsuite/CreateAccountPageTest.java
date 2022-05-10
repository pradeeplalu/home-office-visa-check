package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class CreateAccountPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        softAssert = new SoftAssert();
        createAccountPage = new CreateAccountPage();
        PageFactory.initElements(driver, this);
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnSignInLink();
        signInPage.clickOnCreateAnAccount("neweverytime@gmail.com");
        createAccountPage.fillPersonalInformationForm("George","Smith","Hello1234");
        createAccountPage.fillYourAddressDetails("1 Nice Building", "Maryland","Ohio","12345","United States","0123456789","main home");
        String expectedTest = "My account";
        String actualTest = createAccountPage.verifyMyAccountText();
        softAssert.assertEquals(expectedTest,actualTest);
        softAssert.assertAll();


    }
}
