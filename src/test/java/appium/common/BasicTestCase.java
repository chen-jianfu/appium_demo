package appium.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.URL;

/**
 * Created by Jeff on 2017/10/30.
 */
public class BasicTestCase {
    private AppiumDriver driver;
    private Helper helper;
    public PageManager pageManager;
    @BeforeMethod
    public void setUp() throws Exception {
        // set up appium
        File app  = new File(System.getProperty("user.dir"),"AUT/osc.apk");
        ///构造被测试应用的路径
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //实例化DesiredCapabilities
        capabilities.setCapability("deviceName","015d165c5247f818");//不同APP需要更改
        //deviceName的值可以任意指定
        capabilities.setCapability("app", app.getAbsolutePath());
        //设置被测应用的绝对路径
        capabilities.setCapability("appPackage", "net.oschina.app");//不同APP需要更改
        //设置启动类的信息，这个信息可以通过aapt dump bading apkname来获得
        capabilities.setCapability("appActivity", ".AppStart");//不同APP需要更改
        capabilities.setCapability("unicodeKeyboard",true);
        capabilities.setCapability("noReset",true);
        //初始化AppiumDriver
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        helper = new Helper(driver);
        pageManager = new PageManager(helper);
        pageManager.getPageCommon().goToMySettings();
        if ("aotu12345aotu".equals(pageManager.getPageMySettings().getNickName())){
            pageManager.getPageMySettings().clickSettingsBtn();
            pageManager.getPageSettings().clickLogoutBtn();
        }
        pageManager.getPageCommon().goToHomeTab();
    }

    @AfterMethod
    public void tearDown() throws Exception {
      driver.quit();
    }
}
