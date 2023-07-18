package sadakar.stepdefinitions;

import io.cucumber.java.en.Then;
import sadakar.common.BasePage;
import sadakar.pageobjects.CartPOM;
import sadakar.pageobjects.CheckOutStepOnePOM;


public class SuceCheckOutStepOne extends BasePage {

    CheckOutStepOnePOM stepOne = new CheckOutStepOnePOM();

    @Then("I enter {string} And {string}")
    public void i_enter_and(String firstName, String lastName) {
        stepOne.EnterName(firstName,lastName);
    }
    @Then("I enter {string}")
    public void i_enter(String zipCode) {
        stepOne.EnterZipCode(zipCode);
    }
    @Then("Click On Continue Button And SuceCheckOutStepTwo Page Should be Displayed")
    public void click_on_continue_button_and_suce_check_out_step_two_page_should_be_displayed() {
        stepOne.ClickOnContinueButton();
    }
}
