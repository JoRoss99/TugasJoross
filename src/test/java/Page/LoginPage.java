package Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class   LoginPage {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String arg0) {
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String arg0) {
    }

    @When("user click login button")
    public void userClickLoginButton() {
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String arg0) {
    }
}
