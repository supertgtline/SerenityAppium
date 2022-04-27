package utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;

public class AppiumServer {
    public static AppiumDriverLocalService service;
    public static  DesiredCapabilities cap;
    public static AppiumServiceBuilder builder;

    public static void start(){
        //Set Capabilities
        cap = new DesiredCapabilities();
        cap.setCapability("noReset", "false");

        //Build the Appium service
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("0.0.0.0");
        builder.usingPort(4723);
        builder.withCapabilities(cap);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

        // starting the Appium server code
        service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                 //       .withIPAddress("0.0.0.0")
               //         .withArgument(()->"--base-path","wd/hub")
               // .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File( "Server.log")));
       // service = AppiumDriverLocalService.buildService(builder);
        service.start();


  /*      HashMap<String, String> environment = new HashMap<String, String>();
        environment.put("PATH", "/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/bin:/Users/giangthao/Library/Android/sdk/tools:/Users/giangthao/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin" + System.getenv("PATH"));
        environment.put("ANDROID_HOME", "/Users/giangthao/Library/Android/sdk");
        environment.put("JAVA_HOME", "/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home");
        service= AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("/usr/local/bin/node"))
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withEnvironment(environment).withLogFile(new File("Server.log")));*/


    }


    public static void stop(){

        service.stop();

    }
}
