package web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import web.pages.PagePool;
import web.utility.Constant;

public class PlayStoreSteps {
    @When("User click Play Store button from navigation bar")
    public void userClickPlayStoreButtonFromNavigationBar() {
        PagePool.homepage.click(By.linkText("Play Store"));
    }

    @Then("User redirected to Play Store page")
    public void userRedirectedToPlayStoreDulurPage() {
        PagePool.homepage.compareRedirectedUrl(Constant.protocol+Constant.playStoreGravelUrl);
    }

    @And("User click Play Store button from content at Homepage")
    public void userClickPlayStoreButtonFromContentAtHomepage() {
        PagePool.homepage.click(By.xpath("(//img)[32]"));
    }

    @And("User click Play Store button from content at Gabung Jadi Mitra Page")
    public void userClickPlayStoreButtonFromContentAtGabungJadiMitraPage() {
        PagePool.homepage.click(By.xpath("(//img)[25]"));
    }
}
