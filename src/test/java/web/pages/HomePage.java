package web.pages;

import bases.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.utility.Constant;

public class HomePage extends BasePage {

    public void clickCareerNavBar(){
        By languageHomePage = By.linkText(Constant.langID) ;

        if (check(languageHomePage)){
            click(By.linkText(Constant.careerID))  ;
        }else if(!check(languageHomePage)){
            click(By.linkText(Constant.careerEN))  ;
        }
    }

    public void clickInspirationNavBar(){
        By languageHomePage = By.linkText(Constant.langID) ;

        if (check(languageHomePage)){
            click(By.linkText(Constant.inspirationID))  ;
        }else if(!check(languageHomePage)){
            click(By.linkText(Constant.inspirationEN))  ;
        }
    }

    public void clickBeOurPartnerNavBar(){
        By languageHomePage = By.linkText(Constant.langID) ;

        if (check(languageHomePage)){
            click(By.linkText(Constant.beOurPartnerID))  ;
        }else if(!check(languageHomePage)){
            click(By.linkText(Constant.beOurPartnerEN))  ;
        }
    }

    public By titleProject = By.xpath("//p[@class=\"title-proyek\"]");

    public void goToGabungJadiMitraPage() {
        PagePool.gabungJadiMitra = new GabungJadiMitra(this.webDriver);
    }

    public void goToInspirasiPage() {
        PagePool.inspirasi = new Inspirasi(this.webDriver);
    }

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
}
