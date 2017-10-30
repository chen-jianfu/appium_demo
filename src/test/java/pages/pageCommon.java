package pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/10/30.
 */
public class pageCommon {
    private Helper helper;

    public pageCommon(Helper helper){
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

    public WebElement MySettingsTab(){
        return helper.findById("net.oschina.app:id/nav_item_me");
    }
}
