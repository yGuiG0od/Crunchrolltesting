package pages;

import org.openqa.selenium.By;

public class HomePage extends AbstractPage {

    By toolbar = By.id("toolbar");
    By menuButton = By.className("android.widget.ImageButton");
    By settingsButton = By.id("settings_text");


    public void tapOnMenuButton() {
        appiumDriver().findElement(toolbar).findElement(menuButton).click();
    }

    public boolean isSidebarIsDisplayed() {
        return appiumDriver().findElement(settingsButton).isDisplayed();
    }
}
