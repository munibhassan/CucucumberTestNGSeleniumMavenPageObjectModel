package sadakar.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sadakar.common.BasePage;

import java.time.Duration;
import static sadakar.common.BasePage.driver;

public class CartPOM {

    public By checkoutButtonLocator = By.xpath("//button[@id='checkout']");

    public CartPOM() {
        BasePage.VerifyHeader();
        BasePage.verifyTitle("Your Cart");
    }

    public By xpathProductName(String productName) {
        By addToCartBtnLocator = By.xpath("//div[@class='inventory_item'][.//div[@class='inventory_item_name' and text()='" + productName + "']]//button[contains(@class, 'btn_inventory')]");
        return addToCartBtnLocator;
    }

    public CheckOutStepOnePOM ClickOnCheckOutButton() {
        driver.findElement(checkoutButtonLocator).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return new CheckOutStepOnePOM();
    }
}