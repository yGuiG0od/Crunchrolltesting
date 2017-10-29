package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;


public class LoginScreenSteps {

    LoginPage loginPage;


    @Step("Input Login")
    public LoginScreenSteps inputLogin() {
        loginPage.inputLogin("String");
        return this;
    }
    @Step("Input Password")
    public LoginScreenSteps inputPassword() {
        loginPage.inputPassword("String");
        return this;
    }
    @Step("Tap On Continue Button")
    public LoginScreenSteps tapOnContinueButton() {
        loginPage.tapOnContinueButton();
        return this;
    }
}
