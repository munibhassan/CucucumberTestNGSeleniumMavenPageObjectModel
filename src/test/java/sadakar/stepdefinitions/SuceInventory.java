package sadakar.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sadakar.common.BasePage;
import sadakar.pageobjects.InventoryPOM;
import sadakar.pageobjects.LoginPOM;

import java.time.Duration;


public class SuceInventory extends BasePage {

    InventoryPOM inventoryPOM = new InventoryPOM();

    @Given("Given I am logged in")
    public InventoryPOM given_i_am_logged_in() {
        return new InventoryPOM();
    }

    @Given("I click first {string}")
    public void i_click_a_first(String productName) {
        inventoryPOM.ClickOnProduct(productName);
    }
    @Given("I click second {string}")
    public void i_click_a_second(String productName) {
        inventoryPOM.ClickOnProduct(productName);
    }
    @And("{string} the product should be added to my cart")
    public void the_product_should_be_added_to_my_cart(String noOfItems) {
        inventoryPOM.VerifyNoOfItemsInCart(noOfItems);
    }
    @Then("Cart Page Should be Displayed")
    public void cart_page_should_be_displayed() {
        inventoryPOM.clickCartButton();
    }
}
