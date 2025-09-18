package com.example;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class StepDefinitions {
    private Login login;
    private boolean result;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        login = new Login();
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        result = login.authenticate("user", "pass");
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        assertTrue(result);
    }
}