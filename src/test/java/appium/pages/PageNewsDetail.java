package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/11/8.
 */
public class PageNewsDetail {
    private Helper helper;

    public PageNewsDetail(Helper helper){
        this.helper = helper;
    }

    public WebElement getBackBtn(){
        return helper.findByClassName("android.widget.ImageButton",1);
    }

    public WebElement getAddToFavoriteBtn(){
        return helper.findById("net.oschina.app:id/iv_fav");
    }

    public WebElement getShareBtn(){
        return helper.findById("net.oschina.app:id/iv_share");
    }

    public WebElement getShareWechatGroup(){
        return helper.findById("net.oschina.app:id/ly_share_weichat_circle");
    }

    public void clickBackImageButton(){
        helper.click(getBackBtn());
    }

    public void clickAddToFavoriteBtn(){
        helper.click(getAddToFavoriteBtn());
    }

    public void clickShareBtn(){
        helper.click(getShareBtn());
    }

    public void clickShareToWechatGroup(){
        helper.click(getShareWechatGroup());
    }
}
