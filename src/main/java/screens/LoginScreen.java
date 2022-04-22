package screens;

import base.ScreeBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginScreen extends ScreeBase {
    @AndroidFindBy(id="flipboard.app:id/first_launch_cover_continue")
    public WebElement getStartedButton;

    public void clickGetStartedButton() {
        getStartedButton.click();
    }
}
