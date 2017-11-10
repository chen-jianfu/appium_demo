package appium.listeners;

import appium.common.BasicTestCase;
import io.appium.java_client.AppiumDriver;
import javafx.scene.input.DataFormat;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * Created by Jeff on 2017/11/10.
 */
public class TestListener implements ITestListener{
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        if(iTestResult.getMethod().getRealClass().getSimpleName().contains("LoginWithRingtCredentials")){
            System.out.println("------------已成功登入");
        }
    }

    public void onTestFailure(ITestResult iTestResult) {
        takeScreenshot(iTestResult, BasicTestCase.driver);
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    public void takeScreenshot(ITestResult iTestResult, AppiumDriver driver){
       String name = iTestResult.getMethod().getRealClass().getSimpleName()
                + "."+ iTestResult.getMethod().getMethodName();
       DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
       String screenshotName = name + "-" + format.format(new Date())+".png";
       File file = driver.getScreenshotAs(OutputType.FILE);
       String destination = "screenshots";
        try {
            FileUtil.copyFile(file,new File(destination + "/" + screenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
