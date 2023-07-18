package sadakar.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import sadakar.common.BasePage;
import sadakar.pageobjects.InventoryPOM;
import sadakar.pageobjects.LoginPOM;

import java.time.Duration;


public class SuceDemoLogin extends BasePage {

    LoginPOM loginPOM = new LoginPOM();

    @Given("I navigate to the login page")
    public LoginPOM i_navigate_to_the_login_page() {
        return new LoginPOM();
    }

    @When("I enter my {string} and {string}")
    public void i_enter_my_username_and_password(String username, String password) {
        loginPOM.enterCredentials(username, password);
    }

    @When("I click on the login button And LoggedIn Successfully")
    public void i_click_on_the_login_button() {
        loginPOM.clickLoginButton();
    }

}
