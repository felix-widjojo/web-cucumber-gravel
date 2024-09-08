package web.pages;

import bases.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.utility.Constant;

public class GabungJadiMitra extends BasePage {

    public void clickJoinNow(){
        By languageHomePage = By.linkText(Constant.joinNowID) ;

        if (check(languageHomePage)){
            click(By.linkText(Constant.joinNowID))  ;
        }else if(!check(languageHomePage)){
            click(By.linkText(Constant.joinNowEN))  ;
        }
    }

    public By komunitasSedulurGravelText = By.xpath("//*[text()='Komunitas Sedulur Gravel']");

    public GabungJadiMitra(WebDriver webDriver) {
        super(webDriver);
    }
}
