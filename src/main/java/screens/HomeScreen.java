package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeScreen {
    @AndroidFindBy(id="flipboard.app:id/bottom_nav_view_icon")
    public List<WebElement> bottomNavigation;


    public void selectBottomPanel(int screenNo) {

        bottomNavigation.get(screenNo - 1).click();
    }
}
