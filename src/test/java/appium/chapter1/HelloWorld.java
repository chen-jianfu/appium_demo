package appium.chapter1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

/**
 * Created by Jeff on 2017/10/27.
 */
public class HelloWorld {
    private AppiumDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {

        // set up appium

        File app  = new File(System.getProperty("user.dir"),"AUT/osc.apk");
        //构造
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","015d165c5247f818");//不同APP需要更改

        capabilities.setCapability("app", app.getAbsolutePath());

        capabilities.setCapability("appPackage", "net.oschina.app");//不同APP需要更改

        capabilities.setCapability("appActivity", ".AppStart");//不同APP需要更改

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {
        Thread.sleep(8000);
    }
}
