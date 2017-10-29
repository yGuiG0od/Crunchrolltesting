package pages;

import org.openqa.selenium.By;

public class LoginPage extends AbstractPage {


    By emailField = By.id("login_field");
    By passwordField = By.id("password_field");
    By tapOnContinueButton = By.id("continue_button");

    public void inputLogin(String login) {
        appiumDriver().findElement(emailField).sendKeys("sansastark.bold@gmail.com");
    }
    public void inputPassword(String password) {

        appiumDriver().findElement(passwordField ).sendKeys("generator");
    }
    public void tapOnContinueButton() {

        appiumDriver().findElement(tapOnContinueButton).click();
    }



}