package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
    }

    @Test(groups ={ "sanity","regression"})
    public void anAustralianComingToUKForTourism() {
        startPage.setAcceptCookies();
        startPage.clickOnStartButton();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickContinueButton();
        resultPage.selectTourism();
        resultPage.clickContinueButton();
        //familyImmigrationStatusPage.selectOnYes();
        //    familyImmigrationStatusPage.clickContinueButton();
        String expectedResults = "You will not ned a visa to come to the UK";
        String actualResults = resultPage.getResultText();
        Assert.assertEquals(actualResults,expectedResults,"Result not found");
    }

    @Test(groups = {"regression","smoke"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.setAcceptCookies();
        startPage.clickOnStartButton();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickContinueButton();
        workTypePage.selectWorkAcademicVisitOrBusiness();
        workTypePage.clickContinueButton();
        durationOfStayPage.selectLongerThenSixMonths();
        durationOfStayPage.clickContinueButton();
        familyImmigrationStatusPage.clickOnHealthAndCareProfessional();
        familyImmigrationStatusPage.clickContinueButton();
        String expectedResult="You need a visa to work in health and care";
        String actualResult=resultPage.getTextVerifyMsg();
        Assert.assertEquals(actualResult,expectedResult, "Result not found");
    }
    @Test(groups = {"sanity","regression","smoke"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.setAcceptCookies();
        startPage.clickOnStartButton();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickContinueButton();
        reasonForTravelPage.clickOnSelectReason();
        reasonForTravelPage.clickContinueButton();
        reasonForTravelPage.clickYesUkImmigrationStatus();
        reasonForTravelPage.clickContinueButton();
        String expectedResult="You’ll need a visa to join your family or partner in the UK";
        String actualResult=resultPage.getVerifyPartnerMsg();
        Assert.assertEquals (actualResult,expectedResult, "Result not Found");

    }


}


