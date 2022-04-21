package screens;

import base.ScreeBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChooseTopicsScreen extends ScreeBase {
    @AndroidFindBy(id="flipboard.app:id/topic_picker_topic_row_topic_tag")
    public List<WebElement> topic;

    @AndroidFindBy(id="flipboard.app:id/topic_picker_continue_button")
    public WebElement contButton;


    @AndroidFindBy(id="flipboard.app:id/icon_button_text")
    public WebElement skipLogin;


    public void chooseTopics(int topicsCount) {


        for(int i=0; i<topicsCount; i++) {

            waitFor(topic.get(i)).click();
        }


    }


    public void clickContinue() {

        contButton.click();

    }


    public void skipLogin() {

        skipLogin.click();
    }


}
