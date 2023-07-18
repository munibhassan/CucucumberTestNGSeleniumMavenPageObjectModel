package sadakar.pageobjects;

import org.openqa.selenium.By;
import sadakar.common.BasePage;

import java.time.Duration;

import static sadakar.common.BasePage.driver;

public class CheckOutCompletePOM {

    public CheckOutCompletePOM() {
        BasePage.VerifyHeader();
        BasePage.verifyTitle("Checkout: Complete!");
    }

}