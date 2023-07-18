package sadakar.pageobjects;

import org.openqa.selenium.By;
import sadakar.common.BasePage;

import java.time.Duration;

import static sadakar.common.BasePage.driver;

public class CheckOutStepTwoPOM {

    public By finishButtonLocator = By.xpath("//button[@id='finish']");

    public CheckOutStepTwoPOM() {
        BasePage.VerifyHeader();
        BasePage.verifyTitle("Checkout: Overview");
    }

    public CheckOutCompletePOM ClickOnFinishButton() {
        driver.findElement(finishButtonLocator).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return new CheckOutCompletePOM();
    }
}