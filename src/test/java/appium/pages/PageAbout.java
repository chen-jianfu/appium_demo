package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/11/7.
 */
public class PageAbout {

    private Helper helper;

    public PageAbout(Helper helper){
        this.helper = helper;
    }

    public WebElement getAppVersionTextView(){
      return  helper.findById("net.oschina.app:id/tv_version_name");
    }

    public String getAppVersionValue(){
        return helper.getText(getAppVersionTextView());
    }


}
