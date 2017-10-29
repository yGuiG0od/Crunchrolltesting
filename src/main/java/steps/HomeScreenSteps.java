package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomeScreenSteps extends ScenarioSteps {

    HomePage homePage;

    @Step("Tap on menu button")
    public HomeScreenSteps tapOnMenuButton() {
        homePage.tapOnMenuButton();
        return this;
    }

    @Step("Should see menu sidebar")
    public void shouldSeeMenuSideBar() {
        assertThat("Sidebar is not opened", homePage.isSidebarIsDisplayed(), is(true));
    }

}

//loginAccountButton();