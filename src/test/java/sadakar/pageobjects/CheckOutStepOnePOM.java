package sadakar.pageobjects;

import org.openqa.selenium.By;
import sadakar.common.BasePage;

import java.time.Duration;

import static sadakar.common.BasePage.driver;

public class CheckOutStepOnePOM {

    public By continueButtonLocator = By.xpath("//input[@id='continue']");
    public By firstNameFieldLocator = By.xpath("//input[@id='first-name']");
    public By lastNameFieldLocator = By.xpath("//input[@id='last-name']");
    public By zipCodeFieldLocator = By.xpath("//input[@id='postal-code']");

    public CheckOutStepOnePOM() {
        BasePage.VerifyHeader();
        BasePage.verifyTitle("Checkout: Your Information");
    }
    public void EnterName(String firstName, String LastName){
        driver.findElement(firstNameFieldLocator).sendKeys(firstName);
        driver.findElement(lastNameFieldLocator).sendKeys(LastName);
    }

    public void EnterZipCode(String zipCode){
        driver.findElement(zipCodeFieldLocator).sendKeys(zipCode);
    }
    public CheckOutStepTwoPOM ClickOnContinueButton() {
        driver.findElement(continueButtonLocator).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return new CheckOutStepTwoPOM();
    }
}