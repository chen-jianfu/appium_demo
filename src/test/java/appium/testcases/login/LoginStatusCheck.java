package appium.testcases.login;

import appium.common.BasicTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jeff on 2017/11/7.
 */
public class LoginStatusCheck extends BasicTestCase {
    @Test
    public void testShouldLogin() throws Exception {
        pageManager.getPageCommon().goToMySettingsTab();
        pageManager.getPageMySettings().clickMyMsgItem();
        Assert.assertTrue (pageManager.getPageLogin().isLoginPape());
        pageManager.getPageLogin().clickBackImageButton();

        pageManager.getPageMySettings().clickMyBlogItem();
        Assert.assertTrue (pageManager.getPageLogin().isLoginPape());
        pageManager.getPageLogin().clickBackImageButton();

        pageManager.getPageMySettings().clickMyActivitiesItem();
        Assert.assertTrue (pageManager.getPageLogin().isLoginPape());
        pageManager.getPageLogin().clickBackImageButton();

        pageManager.getPageMySettings().clickMyTeamItem();
        Assert.assertTrue (pageManager.getPageLogin().isLoginPape());
        pageManager.getPageLogin().clickBackImageButton();
    }
}
