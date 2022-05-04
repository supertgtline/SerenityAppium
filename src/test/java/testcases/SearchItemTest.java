package testcases;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import screens.HomeScreen;
import steps.FlipboardSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(".\\src\\test\\resources\\testdata\\searchitem.csv")
public class SearchItemTest {


    private String searchitem;
    private String result;


    public void setSearchitem(String searchitem) {
        this.searchitem = searchitem;
    }
    public void setResult(String result){
        this.result=result;

    }

    @Managed(driver="appium")
    public WebDriver driver;


    @Steps
    HomeScreen home;
    @Steps
    FlipboardSteps flipboard;

    @Title("Search Item Test")
    @Test
    public void searchItemTest() {

        flipboard.clickGetStartedButton();
        flipboard.chooseTopics(3);
        flipboard.clickContinue();
        flipboard.skipLogin();
        flipboard.selectBottomPanel(3);
        flipboard.searchFlipBoard(searchitem);
        flipboard.verifySearchText(result);


    }




}

