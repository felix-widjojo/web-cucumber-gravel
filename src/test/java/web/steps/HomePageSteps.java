package web.steps;


import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.pages.HomePage;
import web.pages.PagePool;
import web.utility.Constant;

public class HomePageSteps {

    @After
    public void cleanUp(){
        PagePool.homepage.quitSession();
    }

    @Given("User open browser with Chrome")
    public void userOpenBrowserWithChrome() {
        WebDriver webDriver = PagePool.homepage.chromeDriverSetup();
        PagePool.homepage = new HomePage(webDriver);
    }
    @Given("User open Gravel Homepage")
    public void userOpenGravelHomepage() {
        PagePool.homepage.getUrl(Constant.protocol+Constant.mainUrlID);
    }

    @When("User click Gabung Jadi Mitra at Navigation Bar")
    public void userClickGabungJadiMitraAtNavigationBar() {
        PagePool.homepage.clickBeOurPartnerNavBar();
        PagePool.homepage.goToGabungJadiMitraPage();
    }

    @Then("User redirected to Gabung Jadi Mitra Page")
    public void userRedirectedToGabungJadiMitraPage() {
        PagePool.homepage.compareUrl(Constant.protocol+Constant.mainUrlID+Constant.pathBeOurPartner);
    }

    @When("User click Inspirasi at Navigation Bar")
    public void userClickInspirasiAtNavigationBar() {
        PagePool.homepage.clickInspirationNavBar();
        PagePool.homepage.goToInspirasiPage();
    }

    @Then("User redirected to Inspirasi Page")
    public void userRedirectedToInspirasiPage() {
        PagePool.homepage.compareUrl(Constant.protocol+Constant.mainUrlID+Constant.pathInspiration);
    }

    @When("User click Karir at Navigation Bar")
    public void userClickKarirAtNavigationBar() {
        PagePool.homepage.clickCareerNavBar();
    }

    @Then("User redirected to Karir Page")
    public void userRedirectedToCareerPage() {
        PagePool.homepage.compareRedirectedUrl(Constant.protocol+Constant.careerPageUrl);
    }

    @When("User scroll to Project section")
    public void userScrollToProjectSection() throws InterruptedException {
        PagePool.homepage.scrollToElement(PagePool.homepage.titleProject);
    }

    @Then("User can see carousel about {string}")
    public void userCanSeeCarouselAbout(String text) {
        PagePool.homepage.check(By.xpath("//*[text()='"+text+"']"));
    }
}
