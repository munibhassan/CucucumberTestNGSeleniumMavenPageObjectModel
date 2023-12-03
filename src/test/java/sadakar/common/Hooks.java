package sadakar.common;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks extends BasePage {

    @Before //Cucumber Before Hook
    public static void setupDriver() throws InterruptedException {


        String path = "C:\\Users\\hp\\Downloads\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);

        // Create a new instance of the Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After // Cucumber After hook
    public static void quitDriver() throws Exception {
        driver.quit();//Test12
    }

}