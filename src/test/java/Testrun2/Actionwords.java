package Testrun2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionwords {
    private WebDriver driver;

    public Actionwords() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void iOpenHttpGoogleCom(String httpGoogleCom) {

    }

    public void iSearchForHiptest(String hiptest) {

    }

    public void aLinkToHiptestAgileTestManagementToolBehaviorDrivenDevelopment(String hiptestAgileTestManagementToolBehaviorDrivenDevelopment) {

    }

    public void iOpenPage(String freeText) {

    }

    public void clickLoginButton() {

    }

    public void iInputValidEmail(String freeText) {

    }

    public void inputValidPassword(String freeText) {

    }

    public void theUrlContains(String freeText) {

    }

    public void clickOnLoginButton() {

    }

    public void goToPage() {
        driver.findElement(By.xpath("//a"));
    }

    public void goToEngland() {

    }

    public void assertEnglandUrl() {

    }

    public void goToPage2() {

    }

    public void goToEngland2() {

    }
}