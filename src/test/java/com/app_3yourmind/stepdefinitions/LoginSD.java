package com.app_3yourmind.stepdefinitions;

import com.app_3yourmind.pages.LoginPage;
import com.app_3yourmind.utilities.ConfigurationReader;
import com.app_3yourmind.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginSD {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters cridentials")
    public void the_user_enters_cridentials() {
        LoginPage lp = new LoginPage();
        lp.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("the user should be able to login succesfully")
    public void the_user_should_be_able_to_login_succesfully()  {
        String expectedUrl = "https://app.3yourmind.com/user-panel/?showLoginToaster=true";
        Assert.assertEquals(expectedUrl, Driver.get().getCurrentUrl());
    }
}
