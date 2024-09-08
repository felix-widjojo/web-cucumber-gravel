package web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.PagePool;

public class InspirasiSteps {
    @When("User type test data {string} in the search bar")
    public void userTypeTestDataInTheSearchBar(String testData) {
        PagePool.inspirasi.sendKeys(PagePool.inspirasi.inspirasiArticleInputText, testData);
        PagePool.inspirasi.sendEnter(PagePool.inspirasi.inspirasiArticleInputText);
    }

    @Then("User see search result that contains {string}")
    public void userSeeSearchResultThatContains(String testData) throws InterruptedException {
        PagePool.inspirasi.checkArticleTitle(testData);
    }

    @When("User scroll to Inspirasi section")
    public void userScrollToInspirasiSection() {
        PagePool.inspirasi.waitElement(PagePool.inspirasi.inspirasiArticleTitleText,5);
        PagePool.inspirasi.scrollToElement(PagePool.inspirasi.inspirasiArticleTitleText);

    }

    @Then("User see Inspirasi")
    public void userSeeInspirasi() {
        PagePool.inspirasi.check(PagePool.inspirasi.inspirasiArticleTitleText);
    }

    @Then("User will see more Inspirasi")
    public void userWillSeeMoreInspirasi() {
        PagePool.inspirasi.check(PagePool.inspirasi.inspirasiArticleTitleText);
    }

    @And("User click one of the Inspirasi")
    public void userClickOneOfTheInspirasi() {
        PagePool.inspirasi.click(PagePool.inspirasi.inspirasiArticleTitleText);
    }

    @Then("User see details of the Inspirasi")
    public void userSeeDetailsOfTheInspirasi() {
        PagePool.inspirasi.check(PagePool.inspirasi.inspirasiArticleTitleText);
    }

    @And("User click Muat Lebih Banyak text")
    public void userClickMuatLebihBanyakText() {
        PagePool.inspirasi.waitElement(PagePool.inspirasi.inspirasiLoadMoreText,5);
        PagePool.inspirasi.scrollToElement(PagePool.inspirasi.inspirasiLoadMoreText);
        PagePool.inspirasi.click(PagePool.inspirasi.inspirasiLoadMoreText);
    }
}
