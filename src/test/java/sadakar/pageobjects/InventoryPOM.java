package sadakar.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static sadakar.common.BasePage.driver;

public class InventoryPOM {

    // locators for view Directory Page/Tab, Search button
    public By headerInventoryPage = By.xpath("//div[@class='app_logo'][text()='Swag Labs']");
    public By menuButtonLocator = By.xpath("//button[@id='react-burger-menu-btn']");
    public By cartButtonLocator = By.xpath("//div[@id='shopping_cart_container']");


    public InventoryPOM() {
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set an explicit wait with a timeout of 10 seconds

        // Wait until the userNameLocator element appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerInventoryPage));
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuButtonLocator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButtonLocator));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public By xpathProductName(String productName) {
        By addToCartBtnLocator = By.xpath("//div[@class='inventory_item'][.//div[@class='inventory_item_name' and text()='" + productName + "']]//button[contains(@class, 'btn_inventory')]");
        return addToCartBtnLocator;
    }

    public void ClickOnProduct(String productName) {
        By addToCartBtnLocator = xpathProductName(productName);
        driver.findElement(addToCartBtnLocator).click();
    }

    public InventoryPOM clickOnCartButton() {
        driver.findElement(cartButtonLocator).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return  new InventoryPOM();
    }

    public By xpathNoOfItemsInCart(String noOfItems) {
        By cartItemsLocator = By.xpath("//span[@class='shopping_cart_badge'][text()='"+noOfItems+"']");
        return cartItemsLocator;
    }
    public void VerifyNoOfItemsInCart(String noOfItems){
        By addToCartBtnLocator = xpathNoOfItemsInCart(noOfItems);
        String expectedItems= driver.findElement(addToCartBtnLocator).getText();
        expectedItems.equals(noOfItems);
    }

    public CartPOM clickCartButton() {
        driver.findElement(cartButtonLocator).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return  new CartPOM();
    }

}