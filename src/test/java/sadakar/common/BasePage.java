package sadakar.common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    public static By headerInventoryPage = By.xpath("//div[@class='app_logo'][text()='Swag Labs']");
    public static By menuButtonLocator = By.xpath("//button[@id='react-burger-menu-btn']");
    public static By cartButtonLocator = By.xpath("//div[@id='shopping_cart_container']");
    public static String getTitle() {
        return driver.findElement(By.xpath("//span[@class='title']")).getText();
    }

    public static void VerifyHeader(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set an explicit wait with a timeout of 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerInventoryPage));
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuButtonLocator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButtonLocator));
    }

    public static boolean verifyTitle(String expectedTitle) {
        String actualTitle = getTitle();
        return actualTitle.equals(expectedTitle);
    }

}