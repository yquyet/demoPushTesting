package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by nththuy on 1/3/20.
 */
public class OpenAccountTest extends PageProvider {


    @When("^I choose account as (.+) and currency as (.+)$")
    public void openAccount(String fullname, String currency) throws InterruptedException {
        getOpenAccountPage().getUserInformation(fullname);
        getOpenAccountPage().getCurrency(currency);

    }

    @And("^I click open account$")
    public void i_click_open_account() throws InterruptedException {
        getOpenAccountPage().clickProcess();
    }

    @Then("^I verify that user is already open$")
    public void verifyUserAlreadyOpen() throws InterruptedException {


    }


}
