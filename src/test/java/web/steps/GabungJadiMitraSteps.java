package web.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.PagePool;
import web.utility.Constant;

public class GabungJadiMitraSteps {
    @When("User scroll to Join Komunitas Sedulur Gravel section")
    public void userScrollToJoinKomunitasSedulurGravelSection() {
        PagePool.gabungJadiMitra.scrollToElement(PagePool.gabungJadiMitra.komunitasSedulurGravelText);
    }

    @When("User click Join Now button")
    public void userClickJoinNowButton() {
        PagePool.gabungJadiMitra.clickJoinNow();
    }

    @Then("User redirected to Play Store Dulur page")
    public void userRedirectedToPlayStorePage() {
        PagePool.gabungJadiMitra.compareRedirectedUrl(Constant.protocol+Constant.playStoreGravelDulurUrl);
    }
}
