package screens;

import base.ScreeBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends ScreeBase {
    @AndroidFindBy(xpath = "")
    public WebElement getStartedButton;
    public void getStartedClickButton(){
        clickOn(getStartedButton);
    }

    public void clickGetStartedButton() {
        getStartedButton.click();
    }
}
