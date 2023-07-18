package sadakar.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sadakar.common.BasePage;
import sadakar.pageobjects.CartPOM;
import sadakar.pageobjects.InventoryPOM;


public class SuceCart extends BasePage {

    CartPOM cartPOM = new CartPOM();

    @Then("Click On CheckOut Button")
    public void click_on_check_out_button() {
        cartPOM.ClickOnCheckOutButton();
    }
}
