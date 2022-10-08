package hu.unideb.inf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static final String PageURL = "https://www.saucedemo.com/";
    private WebDriver driver;

    @FindBy(id = "login-button")
    private WebElement loginLink;

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PageURL);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginLink () { loginLink.click();}
}
