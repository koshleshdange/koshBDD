package step_definitions.registration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

    @Given("I am on the landing page")
    public void i_amon_the_landing_page()
    {
        throw new io.cucumber.java.PendingException();
        //Assert.assertTrue(registrationPage.verifyonLandingPage());
    }

    @When("I click on the registration button")
    public void iClickOnTheRegistrationButton() {

    }

    @And("User fills the registration form with valid data {string} {string} {string} {string} {string} {string} {string}")
    public void userFillsTheRegistrationFormWithValidData(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
    }

    @And("I click on the Register button and continue button")
    public void iClickOnTheRegisterButtonAndContinueButton() {
        
    }

    @Then("I should be on the home page")
    public void iShouldBeOnTheHomePage() {
    }
}

