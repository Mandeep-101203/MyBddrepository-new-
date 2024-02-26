package StepDefinations;

import BrowserControl.WebConnector;
import PageObjects.DropDownpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dropdownstepdefination extends WebConnector {


        DropDownpage page = new DropDownpage();


    @Then("the user select {string} option from the dropdown list")
    public void theUserSelectOptionFromTheDropdownList(String option) {
        page.clickondropdown();
        page.setDropdownoptionselectedXpath(option);
    }
    @When("the user can see {string} text on the page")
    public void theUserCanSeeTextOnThePage(String option) {
        Assert.assertTrue(driver.getPageSource().contains(option));

    }

    @Then("the use should see {int} option in the dropdown")
    public void theUseShouldSeeOptionInTheDropdown(int arg0) {
    }


}

