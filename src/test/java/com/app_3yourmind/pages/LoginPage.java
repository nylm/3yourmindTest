package com.app_3yourmind.pages;

import com.app_3yourmind.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="input[type='email']")
    public WebElement userName;

    @FindBy(css="input[type='password']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();
    }
}
