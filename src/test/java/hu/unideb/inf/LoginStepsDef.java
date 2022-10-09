package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class LoginStepsDef extends AbstractStepDefs {

    @Given("the {string} is filled with {string}")
    public void theUserNameFieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @And("the {string} is filled with this {string}")
    public void theFieldIsFilledWithThisParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @When("the login button is clicked")
    public void theLoginButtonIsClicked() { homePage.clickLoginButton(); }

    @Then("the {string} error message is shown")
    public void theMsgErrorMessageIsShown(String msg) {
        Optional<String> errorMessage = homePage.getLoginError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        } else {
            fail();
        }
    }

}
