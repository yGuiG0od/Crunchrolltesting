package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LaunchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LaunchScreenSteps extends ScenarioSteps {

    LaunchPage launchPage;


    @Step("Tap On Just Explore Button If Appears")
    public LaunchScreenSteps tapOnJustExploreButtonIfAppears() {
        launchPage.tapOnJustExploreButtonIfAppears();
        return this;
    }

    @Step("Tap On setting button")
    public LaunchScreenSteps tapOnSettingButton() {
        launchPage.tapOnSettingsButton();
        return this;
    }
    @Step("Tap On Login Account Button")
    public LaunchScreenSteps tapOnLoginAccountButton() {
        launchPage.tapOnLoginAccountButton();
        return this;
    }

}


