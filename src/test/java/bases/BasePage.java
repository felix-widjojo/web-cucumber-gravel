package bases;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver webDriver;
    private WebElement webElement;
    private Actions actions;

    public BasePage getUrl(String url) {
        this.webDriver.manage().window().maximize();
        this.webDriver.get(url);
        return this;
    }

    public BasePage compareRedirectedUrl(String expectedUrl){
        ArrayList<String> multiWindow = new ArrayList<String> (this.webDriver.getWindowHandles());
        this.webDriver.switchTo().window(multiWindow.get(1));

        WebDriverWait wait = new WebDriverWait(this.webDriver,5);
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        String currentUrl= this.webDriver.getCurrentUrl();
        System.out.println("Current URL = "+currentUrl);
        return this;
    }

    public BasePage compareUrl(String expectedUrl){
        WebDriverWait wait = new WebDriverWait(this.webDriver,5);
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        String currentUrl= this.webDriver.getCurrentUrl();
        System.out.println("Current URL = "+currentUrl);
        return this;
    }

    public boolean check(By by) {
        this.webElement = this.webDriver.findElement(by);
        return this.webElement.isDisplayed();
    }

    public BasePage click(By by) {
        this.webElement = this.webDriver.findElement(by);
        this.actions.click(this.webElement).perform();
        return this;
    }

    public BasePage getText(By by) {
        this.webElement = this.webDriver.findElement(by);
        this.webElement.getAttribute("value");
        return this;
    }

    public BasePage sendKeys(By by, String text) {
        this.webElement = this.webDriver.findElement(by);
        this.actions.sendKeys(this.webElement, text).perform();
        return this;
    }

    public BasePage sendEnter(By by) {
        this.webElement = this.webDriver.findElement(by);
        this.actions.sendKeys(this.webElement, Keys.ENTER).perform();
        return this;
    }

    public BasePage scrollTo(By by) {
        this.webElement = this.webDriver.findElement(by);
        this.actions.moveToElement(this.webElement);
        this.actions.perform();
        return this;
    }

    public void scrollToElement(By by) {
        this.webElement = this.webDriver.findElement(by);
        ((JavascriptExecutor) this.webDriver).executeScript("arguments[0].scrollIntoView(true)", this.webElement);
    }

    public BasePage waitElement(By by, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOutInSeconds);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return this;
    }

    public static WebDriver chromeDriverSetup(){
        return new ChromeDriver();
    }

    public BasePage quitSession(){
        this.webDriver.quit();
        return this;
    }

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.actions = new Actions(this.webDriver);
    }
}
