package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;


/**
 * Created by Jeff on 2017/11/8.
 */
public class PageHome {
    private Helper helper;

    public PageHome(Helper helper){
        this.helper = helper;
    }

    public WebElement getNewsTitleTextView(int index){
        return helper.findById("net.oschina.app:id/tv_title",index);
    }

    public String getNewsTitle(int index){
        return helper.getText(getNewsTitleTextView(index));
    }

    public void clickNewsTitle(int index){
        helper.click(getNewsTitleTextView(index));
    }
}
