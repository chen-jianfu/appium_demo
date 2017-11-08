package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/10/30.
 */
public class PageCommon {
    private Helper helper;

    public PageCommon(Helper helper){
        this.helper = helper;
    }

    public WebElement getHomeTab(){
        return helper.findById("net.oschina.app:id/nav_item_news");
    }

    public WebElement getMonmentTab(){
        return helper.findById("net.oschina.app:id/nav_item_tweet");
    }

    public WebElement getPublishBtn(){
        return helper.findById("net.oschina.app:id/nav_item_tweet_pub");
    }

    public WebElement getExploreTab(){
        return helper.findById("net.oschina.app:id/nav_item_explore");
    }

    public WebElement getMySettingsTab(){
        return helper.findById("net.oschina.app:id/nav_item_me");
    }

    public void goToHomeTab(){
        helper.click(getHomeTab());
    }

    public void goToMomentTab(){
        helper.click(getMonmentTab());
    }

    public void goToExploreTab(){
        helper.click(getExploreTab());
    }

    public void clickPulishBtn(){
        helper.click(getPublishBtn());
    }

    public void goToMySettingsTab(){
        helper.click(getMySettingsTab());
    }
}
