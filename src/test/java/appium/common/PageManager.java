package appium.common;

import appium.pages.PageCommon;
import appium.pages.PageLogin;
import appium.pages.PageMySettings;

/**
 * Created by Jeff on 2017/10/31.
 */
public class PageManager {
    private Helper helper;
    private PageCommon pageCommon;
    private PageLogin pageLogin;
    private PageMySettings pageMySettings;

    public PageManager(Helper helper){
        this.helper = helper;
    }

    public PageCommon getPageCommon(){
        if (pageCommon == null){
            pageCommon = new PageCommon(helper);
        }
        return pageCommon;
    }

    public PageLogin getPageLogin(){
        if(pageLogin == null){
            pageLogin = new PageLogin(helper);
        }
        return pageLogin;
    }

    public PageMySettings getPageMySettings() {
        if(pageMySettings == null){
            pageMySettings = new PageMySettings(helper);
        }
        return pageMySettings;
    }
}
