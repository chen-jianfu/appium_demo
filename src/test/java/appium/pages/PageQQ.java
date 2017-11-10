package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

import java.util.WeakHashMap;

/**
 * Created by Jeff on 2017/11/10.
 */
public class PageQQ {
    private Helper helper;

    public PageQQ(Helper helper){
        this.helper = helper;
    }

    public WebElement getClass2ChatItem(){
        return helper.findByText("晨阳");
    }

    public WebElement getSendBtn(){
        return helper.findById("com.tencent.mobileqq:id/dialogRightBtn");
    }

    public void shareToClass2(){
        helper.click(getClass2ChatItem());
    }

    public void clickSendBtn(){
        helper.click(getSendBtn());
    }





}
