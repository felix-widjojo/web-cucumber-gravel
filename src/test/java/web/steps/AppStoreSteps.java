package web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import web.pages.PagePool;
import web.utility.Constant;

public class AppStoreSteps {
    @When("User click App Store button from navigation bar")
    public void userClickAppStoreButtonFromNavigationBar() {
        PagePool.homepage.click(By.linkText("App Store"));
    }

    @Then("User redirected to App Store page")
    public void userRedirectedToAppStorePage() {
        PagePool.homepage.compareRedirectedUrl(Constant.protocol+Constant.appStoreGravelUrl);
    }

    @When("User scroll to Download section")
    public void userScrollToDownloadSection() {
        PagePool.homepage.scrollToElement(By.xpath("//div[@class='download-button']"));
    }

    @And("User click App Store button from content")
    public void userClickAppStoreButtonFromContent() {
        PagePool.homepage.click(By.xpath("(//img)[31]"));
    }
}
