package com.app_3yourmind.pages;

import com.app_3yourmind.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath="//span[.='Close']")
    public WebElement closeButton;

    @FindBy(css=".d-none")
    public WebElement uploadButton;

    @FindBy(css=".basket-line__content")
    public WebElement basket;


    /**
     * finds the web element dynamically based on @param and checks the web element is displayed
     *
     * @param fileName - name of the uploading file
     */
    public boolean uploadCheck(String fileName){
        return Driver.get().findElement(By.xpath("//div[contains(text(), '" + fileName + "')]")).isDisplayed();
    }
}