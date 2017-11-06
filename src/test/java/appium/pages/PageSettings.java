package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/11/6.
 */
public class PageSettings {
    private Helper helper;

    public PageSettings(Helper helper){
        this.helper = helper;
    }

    public WebElement getLogoutBtn(){
        return helper.findById("net.oschina.app:id/rl_cancle");
    }

    public void clickLogoutBtn(){
        helper.click(getLogoutBtn());
    }
}
