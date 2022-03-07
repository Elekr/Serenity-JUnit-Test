package serenitygoogle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class GetQuoteStepDefinitions {

    @Steps
    DirectLineFormActions directLineFormActions;

    @Given("The customer has accessed the website")
    public void the_customer_has_accessed_the_website() {
        directLineFormActions.toHomePage();

    }
    @Given("accepted the cookies")
    public void accepted_the_cookies() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I enter my {string} plate number")
    public void i_enter_my_plate_number(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("click submit")
    public void click_submit() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the website will show my car model and description")
    public void the_website_will_show_my_car_model_and_description() {
        // Write code here that turns the phrase above into concrete actions

    }
}
