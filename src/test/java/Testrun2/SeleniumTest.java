package Testrun2;

import org.testng.annotations.*;

public class SeleniumTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void findingASiteOnGoogleUid1b161df0cb4f4cf1b7e3e5f3226691e7() {
        // Given I open "http://google.com"
        actionwords.iOpenHttpGoogleCom("http://google.com");
        // When I search for "Hiptest"
        actionwords.iSearchForHiptest("Hiptest");
        // Then a link to "Hiptest: Agile test management tool & behavior driven development"
        actionwords.aLinkToHiptestAgileTestManagementToolBehaviorDrivenDevelopment("Hiptest: Agile test management tool & behavior driven development");
    }

    @Test
    public void loginToAccountWithValidValuesUidedfdbf7f0f8b4135884a88c49d2245ea() {
        // Given I open page
        actionwords.iOpenPage("https://test.loadedreports.com/");
        // And click login button
        actionwords.clickLoginButton();
        // When I input valid email
        actionwords.iInputValidEmail("evgeniia.vecheria@redwerk.com");
        // And input valid password
        actionwords.inputValidPassword("ZK13+bbf70");
        // And click on Login button
        actionwords.clickOnLoginButton();
        // Then the url contains
        actionwords.theUrlContains("/dashboard");
    }

    @Test
    public void newScenarioUid2a95d6dc1c8f414ab581549fc269d7e6() {
        // When go to page
        actionwords.goToPage();
        // When go to England
        actionwords.goToEngland();
        // Then assert England url
        actionwords.assertEnglandUrl();
    }

    @Test
    public void new2Uid1db4ea8b8af641cf90ee05177d1643c0() {
        actionwords.goToPage2();
        actionwords.goToEngland2();
    }
}