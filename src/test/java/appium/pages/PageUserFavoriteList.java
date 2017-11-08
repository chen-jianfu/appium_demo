package appium.pages;

import appium.common.Helper;
import org.openqa.selenium.WebElement;

/**
 * Created by Jeff on 2017/11/8.
 */
public class PageUserFavoriteList {
    private Helper helper;

    public PageUserFavoriteList(Helper helper){
        this.helper = helper;
    }

    public WebElement getFavoritesTitleTextView(int index){
        return helper.findById("net.oschina.app:id/tv_favorite_title",index);
    }

    public String getFavoritisTitle(int index){
       return helper.getText(getFavoritesTitleTextView(index));
    }


}
