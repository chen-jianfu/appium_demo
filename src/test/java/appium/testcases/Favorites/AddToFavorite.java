package appium.testcases.Favorites;

import appium.common.BasicTestCase;
import appium.common.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Jeff on 2017/11/8.
 */
public class AddToFavorite extends BasicTestCase {
    @Test
    public void testAddToFavorite() throws Exception {
        pageManager.getPageCommon().goToMySettingsTab();
        pageManager.getPageMySettings().clickLoginIcon();
        pageManager.getPageLogin().login("735723619@qq.com","12345678");
        pageManager.getPageCommon().goToHomeTab();
        String expectedNewsTitle = pageManager.getPageHome().getNewsTitle(2);
        System.out.println(expectedNewsTitle);
        pageManager.getPageHome().clickNewsTitle(2);
        pageManager.getPageNewsDetail().clickAddToFavoriteBtn();
        Thread.sleep(1000);
        pageManager.getPageNewsDetail().clickBackImageButton();
        pageManager.getPageCommon().goToMySettingsTab();
        pageManager.getPageMySettings().clickFavoritesLayout();
        Thread.sleep(1000);
        System.out.println(pageManager.getPageUserFavoriteList().getFavoritisTitle(1)+"111111111111111");
        //Assert.assertEquals(pageManager.getPageUserFavoriteList().getFavoritisTitle(1),expectedNewsTitle);
        assertTrue(expectedNewsTitle.contains(pageManager.getPageUserFavoriteList().getFavoritisTitle(1)));
    }
}
