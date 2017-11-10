package appium.testcases.crossapp;

import appium.common.BasicTestCase;
import org.testng.annotations.Test;

/**
 * Created by Jeff on 2017/11/10.
 */
public class ShareToQQ extends BasicTestCase {
    @Test
    public void testShareToWechat() throws Exception {
        pageManager.getPageCommon().goToMySettingsTab();
        pageManager.getPageMySettings().clickLoginIcon();
        pageManager.getPageLogin().login("735723619@qq.com", "12345678");
        pageManager.getPageCommon().goToHomeTab();
        pageManager.getPageHome().clickNewsTitle(2);
        pageManager.getPageNewsDetail().clickShareBtn();
        pageManager.getPageNewsDetail().clickShareToQQ();
        pageManager.getPageQQ().shareToClass2();
        pageManager.getPageQQ().clickSendBtn();
    }
}
