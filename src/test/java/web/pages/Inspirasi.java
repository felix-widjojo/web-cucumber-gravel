package web.pages;

import bases.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import web.utility.Constant;

public class Inspirasi extends BasePage {

    public By inspirasiArticleInputText = By.xpath("//input[@id=\"outlined-adornment-weight\"]");
    public By inspirasiArticleTitleText = By.xpath("//h1[@class='title']");

    public void checkArticleTitle(String testData) throws InterruptedException {
        waitElement(inspirasiArticleInputText,5);
        scrollToElement(inspirasiArticleInputText);
        Thread.sleep(1000);

        if (!check(inspirasiArticleTitleText)){
            By inspirasiArticleNotFoundText = By.xpath("//p[@class='not-found-article']");
            check(inspirasiArticleNotFoundText);
        }
    }

    public By inspirasiLoadMoreText = By.xpath("//p[@class='show-more']");


    public Inspirasi(WebDriver webDriver) {
        super(webDriver);
    }
}
