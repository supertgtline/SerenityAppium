package testcases;

import base.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.FlipboardSteps;

@RunWith(SerenityRunner.class)
public class FlipBoardLoginTest{
    @Managed(driver = "appium")
    public WebDriver driver;
    @Steps
    FlipboardSteps flipboard;
    @Title("Login to the Flib")
    @Test
    public void loginTest(){
        flipboard.clickGetStartedButton();
        flipboard.chooseTopics(4);
        flipboard.clickContinue();
    }
}
