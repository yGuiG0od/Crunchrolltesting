import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomeScreenSteps;
import steps.LaunchScreenSteps;
import steps.LoginScreenSteps;

import static java.lang.Thread.sleep;

@RunWith(SerenityRunner.class)
public class LoginFromExploreScreen {

    @Managed(driver = "appium")
    public WebDriver driver;

    @Steps
    public LaunchScreenSteps launchScreenSteps;

    @Steps
    public HomeScreenSteps homeScreenSteps;

    @Steps
    public LoginScreenSteps loginScreenSteps;


    @Test
    @Title("Crunchroll Login Test")
    public void loginFromExploreScreen() {
        launchScreenSteps.tapOnJustExploreButtonIfAppears();
        homeScreenSteps.tapOnMenuButton();
        launchScreenSteps.tapOnLoginAccountButton();
        loginScreenSteps.inputLogin();
        loginScreenSteps.inputPassword();
        loginScreenSteps.tapOnContinueButton();


    }

}

