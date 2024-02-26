package StepDefinations;

import BrowserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Addtocartstepdefination extends WebConnector {

    Addtocartstepdefination cartPage = new Addtocartstepdefination();



    @When("User click on Sauce Labs Backpack")
    public void userClickOnSauceLabsBackpack() {
        
        cartPage.addcart();
    }

    private void addcart() {
    }

    @Then("Navigate to next page product")
    public void navigateToNextPageProduct(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    
    }

    @Then("the user click on   Add to cart Button")
    public void theUserClickOnAddToCartButton() {
        cartPage.linkaddtocart();
    }

    private void linkaddtocart() {
    }


    @And("the user should see “<expectedtext>”")
    public void theUserShouldSeeExpectedtext(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));

    }
}