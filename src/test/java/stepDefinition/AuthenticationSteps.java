package stepDefinition;

import base.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;
import page.LoginPage;
import page.MyAccountPage;

/**
 * Created by Amish on 3/28/2017.
 */
public class AuthenticationSteps extends BaseClass {
    @When("^I open demo website$")
    public void i_open_demo_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        initializeDriver();
        driver.get("http://automationpractice.com");
    }

    @When("^I sign in$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //PageFactory.initElements(driver, AutomationHomePage.class);
        //PageFactory.initElements(driver, LoginPage.class);
        //SignInAction.Execute(driver,datamap);
        new HomePage(driver).getLoginPage();
        new LoginPage(driver).login("amish4c@gmail.com","Test1234");
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //SignoutAction.Execute(driver,datamap);
        new MyAccountPage(driver).logout();
    }
}
