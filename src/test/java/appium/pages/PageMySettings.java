package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/10/31.
 */
public class PageMySettings {
    private Helper helper;

    public PageMySettings(Helper helper){
        this.helper = helper;

    }

    /**
     * 控件的定位
     */
    public WebElement getMySettingsBtn(){
        return helper.findById("net.oschina.app:id/iv_logo_setting");
    }

    public WebElement getLoginIcon(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }

    public WebElement getMyMsgItem(){
        return helper.findById("net.oschina.app:id/rl_message");
    }

    public WebElement getMyBlogItem(){
        return helper.findById("net.oschina.app:id/rl_blog");
    }

    public WebElement getMyActivitiesItem(){
        return helper.findById("net.oschina.app:id/rl_info_avtivities");
    }

    public WebElement getMyTeamItem(){
        return helper.findById("net.oschina.app:id/rl_team");
    }

    public WebElement getNickNameTextView(){
        return helper.findById("net.oschina.app:id/tv_nick");
    }

    public WebElement getfavoritesLayout(){
        return helper.findById("net.oschina.app:id/ly_favorite");
    }
/**
 * 控件的操作
 */
    public void clickSettingsBtn(){
        helper.click(getMySettingsBtn());
    }

    public void clickLoginIcon(){
        helper.click(getLoginIcon());
    }

    public void clickMyMsgItem(){
        helper.click(getMyMsgItem());
    }

    public void clickMyBlogItem(){
        helper.click(getMyBlogItem());
    }

    public void clickMyActivitiesItem(){
        helper.click(getMyActivitiesItem());
    }

    public void clickMyTeamItem(){
        helper.click(getMyTeamItem());
    }

    public void clickFavoritesLayout(){
        helper.click(getfavoritesLayout());
    }

    public String getNickName(){
        return helper.getText(getNickNameTextView());
    }

}
