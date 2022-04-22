package utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class AppiumServer {
    public static AppiumDriverLocalService service;

    public static void start(){

        // starting the Appium server code

        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
        service.start();

    }


    public static void stop(){

        service.stop();

    }
}
