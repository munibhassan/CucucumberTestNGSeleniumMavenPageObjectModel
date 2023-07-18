package sadakar.stepdefinitions;

import io.cucumber.java.en.Then;
import sadakar.common.BasePage;
import sadakar.pageobjects.CartPOM;
import sadakar.pageobjects.CheckOutStepTwoPOM;


public class SuceCheckOutStepTwo extends BasePage {

    CheckOutStepTwoPOM stepTwo = new CheckOutStepTwoPOM();

    @Then("Click On Finish Button And CheckOutComplete Page Should be Displayed")
    public void click_on_finish_button_and_check_out_complete_page_should_be_displayed() {
        stepTwo.ClickOnFinishButton();
    }
}
