import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomeScreenSteps;
import steps.LaunchScreenSteps;

import static java.lang.Thread.sleep;

@RunWith(SerenityRunner.class)
public class OpenSettingsPanelTest
{
    @Managed(driver = "appium")
    public WebDriver driver;
    @Steps
    public LaunchScreenSteps launchScreenSteps;
    @Steps
    public HomeScreenSteps homeScreenSteps;


    @Test
    @Title("Crunchroll Settings Panel Test")
    public void openSettingsPanel(){
        launchScreenSteps.tapOnJustExploreButtonIfAppears();
        homeScreenSteps.tapOnMenuButton();
        launchScreenSteps.tapOnSettingButton();


    }

}
