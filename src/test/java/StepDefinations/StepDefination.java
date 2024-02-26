package StepDefinations;

import BrowserControl.WebConnector;
import PageObjects.LoginPage;
import Utilities.ConstantUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefination extends WebConnector {


    LoginPage page = new LoginPage();


    @Given("the user navigate to {string}")
    public void the_navigates_to(String Webpage) {

        driver.get(ConstantUtils.BASE_URL);
    }

    //*step defination for username and password*\\
    @When("the user enter {string} in username")
    public void theUserEnterInUsername(String username) {
        page.setUsernameXpath(username);

    }

    @And("the user enter {string} in password")
    public void theUserEnterInPassword(String password) {
        page.setPasswordXpath(password);
    }

    @And("the user click on login button")
    public void theUserClickOnLoginButton() {
        page.LoginXpath();
    }

    @Then("the user should see {string} text on page")
    public void theUserShouldSeeTextOnPage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }

    @When("the user login with {string} username and {string} password")
    public void theUserLoginWithUsernameAndPassword(String username, String password) {
        page.setUsernameXpath(username);
        page.setPasswordXpath(password);
        page.LoginXpath();
    }

    @Then("the user should see {string} on the page")
    public void theUserShouldSeeOnThePage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }


    @Then("the user input {string} in the password")
    public void theUserInputInThePassword(String password) {
        page.setPasswordXpath(password);
    }

    @When("the user input {string} in the the username")
    public void theUserInputInTheTheUsername(String username) {
        page.setUsernameXpath(username);
    }

    @Then("it should should show {string}")
    public void itShouldShouldShow(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }

    @Then("the user should should see four option in the {string}")
    public void theUserShouldShouldSeeFourOptionInThe(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }

    @Then("it should should show {string} on the next page")
    public void itShouldShouldShowOnTheNextPage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }

    @When("the user select {string} from the list")
    public void theUserSelectFromTheList(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }


}





