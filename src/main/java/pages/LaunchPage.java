package pages;

import org.openqa.selenium.By;

public class LaunchPage extends AbstractPage {


    By SettingsButton = By.id("settings_text");
    By justExploreButton = By.id("just_explore");
    By tapOnLoginAccountButton = By.id("login_account_text");

    public void tapOnJustExploreButtonIfAppears() {
        if (find(justExploreButton).isVisible()) {
            appiumDriver().findElement(justExploreButton).click();
        }
    }

    public void tapOnSettingsButton() {

        appiumDriver().findElement(SettingsButton).click();
    }

    public void tapOnLoginAccountButton(){

        appiumDriver().findElement(tapOnLoginAccountButton).click();
    }
}


