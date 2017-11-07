package appium.testcases.versioncheck;

import appium.common.BasicTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jeff on 2017/11/7.
 */
public class VersionCheck extends BasicTestCase{
    @Test
    public void testAppVersion() throws Exception {
        pageManager.getPageCommon().goToMySettingsTab();
        pageManager.getPageMySettings().clickSettingsBtn();
        pageManager.getPageSettings().clickAboutUs();
        Assert.assertEquals(pageManager.getPageAbout().getAppVersionValue(),"v2.8.9(1609281026)");


    }
}
