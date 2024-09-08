package web.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import web.pages.PagePool;
import web.utility.Constant;

import java.util.Objects;

public class ChangeLanguageSteps {
    @When("User click language select dropdown")
    public void userClickLanguageSelectDropdown() {
        PagePool.homepage.click(By.linkText("ID"));
    }

    @Then("User click {string} language at Homepage")
    public void userClickLanguageAtHomepage(String language) throws InterruptedException {
        if (Objects.equals(language, "Indonesia")){
            Thread.sleep(1000);
            PagePool.homepage.click(By.linkText(Constant.langID));
            PagePool.homepage.compareUrl(Constant.protocol+Constant.mainUrlID+"/");

        }else if (Objects.equals(language, "English")){
            Thread.sleep(1000);
            PagePool.homepage.click(By.linkText(Constant.langEN));
            PagePool.homepage.compareUrl(Constant.protocol+Constant.mainUrlEN);

        }
    }

    @Then("User click {string} language at Gabung Jadi Mitra Page")
    public void userClickLanguageAtGabungJadiMitraPage(String language) throws InterruptedException {
        if (Objects.equals(language, "Indonesia")){
            Thread.sleep(1000);
            PagePool.gabungJadiMitra.click(By.linkText(Constant.langID));
            PagePool.gabungJadiMitra.compareUrl(Constant.protocol+Constant.mainUrlID+Constant.pathBeOurPartner);

        }else if (Objects.equals(language, "English")){
            Thread.sleep(1000);
            PagePool.gabungJadiMitra.click(By.linkText(Constant.langEN));
            PagePool.gabungJadiMitra.compareUrl(Constant.protocol+Constant.mainUrlEN+Constant.pathBeOurPartner);

        }
    }

    @Then("User click {string} language at Inspirasi Page")
    public void userClickLanguageAtInspirasiPage(String language) throws InterruptedException {
        if (Objects.equals(language, "Indonesia")){
            Thread.sleep(1000);
            PagePool.homepage.click(By.linkText(Constant.langID));
            PagePool.homepage.compareUrl(Constant.protocol+Constant.mainUrlID+Constant.pathInspiration);

        }else if (Objects.equals(language, "English")){
            Thread.sleep(1000);
            PagePool.homepage.click(By.linkText(Constant.langEN));
            PagePool.homepage.compareUrl(Constant.protocol+Constant.mainUrlEN+Constant.pathInspiration);

        }
    }
}
