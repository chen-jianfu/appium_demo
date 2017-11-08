package appium.testcases.login;

import appium.common.BasicTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jeff on 2017/10/31.
 */
public class LoginWithRingtCredentials extends BasicTestCase{
    @Test
    public void testSucessfullyLogin() throws Exception {
        pageManager.getPageCommon().goToMySettingsTab();
        pageManager.getPageMySettings().clickLoginIcon();
        pageManager.getPageLogin().login("735723619@qq.com","12345678");
        Assert.assertEquals(pageManager.getPageMySettings().getNickName(),"aotu12345aotu");
    }
}
