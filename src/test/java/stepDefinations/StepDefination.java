package stepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepDefination {
	
	@Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		
		System.out.println("In Given Block");
		System.out.println("Code change from India");
		System.out.println("Code change from India2");
		System.out.println("Code change from India3");
		System.out.println("Code change from India4");
		System.out.println("Code change from USA");
		System.out.println("Code change from Asian Architech");
		
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("In When Block");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("In Then Block");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("In And Block");
    }
	
    

//    @Given("User is on Netbanking landing page")
//    public void user_is_on_netbanking_landing_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User login into application with username and password")
//    public void user_login_into_application_with_username_and_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Home page is populated")
//    public void home_page_is_populated() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Cards are displayed")
//    public void cards_are_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }



	

}
