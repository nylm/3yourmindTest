package com.app_3yourmind.stepdefinitions;

import com.app_3yourmind.pages.HomePage;
import com.app_3yourmind.pages.LoginPage;
import com.app_3yourmind.utilities.ConfigurationReader;
import com.app_3yourmind.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadSD {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 7);

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page()  {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        wait.until(ExpectedConditions.visibilityOf(homePage.closeButton));
        homePage.closeButton.click();
    }

    @When("the user clicks upload button and selects a file")
    public void the_user_clicks_upload_button_and_selects_a_file()  {
        String fullPath = System.getProperty("user.dir") + "/src/test/resources/Apple.stl";
        homePage.uploadButton.sendKeys(fullPath);
        wait.until(ExpectedConditions.visibilityOf(homePage.basket));
    }


    @Then("the user should be able to upload file succesfully")
    public void the_user_should_be_able_to_upload_file_succesfully() {
        String fileName = "Apple";
        Assert.assertTrue(homePage.uploadCheck(fileName));
    }
}

