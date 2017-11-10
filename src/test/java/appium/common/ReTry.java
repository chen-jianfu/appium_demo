package appium.common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Jeff on 2017/11/10.
 */
public class ReTry implements IRetryAnalyzer{
    int index = 0;
    int reTryCount = 2;
    public boolean retry(ITestResult iTestResult) {
        if(index < 2){
            index ++;
            return true;
        }
        return false;
    }
}
