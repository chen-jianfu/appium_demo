package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/10/31.
 */
public class PageLogin {
    private Helper helper;

    public PageLogin(Helper helper){
        this.helper = helper;
    }

    /**
     * 控件定位
     */

    public WebElement getNameEditText(){
       return helper.findById("net.oschina.app:id/et_username");
    }

    public WebElement getPwdEditText(){
        return helper.findById("net.oschina.app:id/et_password");
    }

    public WebElement getLoginBtn(){
        return helper.findById("net.oschina.app:id/btn_login");
    }

    public void enterName(String name){
        helper.enterText(getNameEditText(),name);
    }

    public void enterPwd(String password){
        helper.enterText(getPwdEditText(),password);
    }

    public void clickLoginBtn(){
        helper.click(getLoginBtn());
    }

    public void clearName(){
        helper.clearText(getNameEditText());
    }

    public void clearPwd(){
        helper.clearText(getPwdEditText());
    }

    public void login(String name,String pwd){
        helper.enterTextWithPreClear(getNameEditText(),name);
        helper.enterTextWithPreClear(getPwdEditText(),pwd);
        helper.click(getLoginBtn());
    }
}
