package testcases;

import base.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import screens.HomeScreen;
import steps.FlipboardSteps;

@RunWith(SerenityRunner.class)
public class SwipTest{
    @Managed(driver="appium")
    public WebDriver driver;


    @Steps
    HomeScreen home;
    @Steps
    FlipboardSteps flipboard;
    @Title("Swipping test")
    @Test
    public void swipeTest() {


        flipboard.clickGetStartedButton();
        flipboard.chooseTopics(3);
        flipboard.clickContinue();
        flipboard.skipLogin();

        flipboard.scrollUp(3);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        flipboard.scrollDown(2);

    }
}
