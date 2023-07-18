package sadakar.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static sadakar.common.BasePage.driver;

public class LoginPOM {

    // locators for view Directory Page/Tab, Search button
    public By headerLoginPage = By.xpath("//div[@class='login_logo'][text()='Swag Labs']");
    public By loginButtonLocator = By.xpath("//input[@value='Login']");

    public By userNameLocator = By.xpath("//input[@id='user-name']");
    public By passwordLocator = By.xpath("//input[@id='password']");

    public LoginPOM(){
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set an explicit wait with a timeout of 10 seconds

        // Wait until the userNameLocator element appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerLoginPage));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButtonLocator));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void enterCredentials(String username, String password){
        driver.findElement(userNameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public InventoryPOM clickLoginButton() {
        driver.findElement(loginButtonLocator).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return  new InventoryPOM();
    }


}