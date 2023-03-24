package stepDefinations;

import io.cucumber.java.en.*;

public class stepDefination {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("navigated to login url");
	}

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }
	
	/*
	 * @When("User login into application with username and password") public void
	 * user_login_into_application_with_username_and_password() { // Write code here
	 * that turns the phrase above into concrete actions
	 * System.out.println("Logged in successfully"); }
	 */

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Validated home page");
	    System.out.println("Validated home page2 - By Git Y");
	    System.out.println("Validated home page2 - By Git Y-2");
	}

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
        System.out.println("Validated home page2 - By Git Z-1");
        System.out.println("Validated home page2 - By Git Z-2");
        System.out.println("Validated home page2 - By Git Z-3");
        
        System.out.println("Validated home page2 - By Git Y-3");
        System.out.println("Validated home page2 - By Git Y-4");
        System.out.println("Validated home page2 - By Git Y-5");
    }

}
