package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryDefinitions {
	WebDriver driver;
	
	@Given("Mercury website is launched")
	public void mercury_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for launching of mercury website");
		System.setProperty("webdriver.gecko.driver","Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com");

	}

	@Given("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for click on sign up button");
	}

	@When("user enters proper data")
	public void user_enters_proper_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for entering proper data");
	}

	@Then("clicks on submit button for account creation")
	public void clicks_on_submit_button_for_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for click on submit for account creation");
	}

	@Given("registered user clicks on signIn link")
	public void registered_user_clicks_on_signIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for click on signIn link");
	}

	@Then("he provides valid data for login input fields")
	public void he_provides_valid_data_for_login_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for providing valid data for login");
	}

	@Then("clicks on submit button for the login validation")
	public void clicks_on_submit_button_for_the_login_validation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for click on submit for login validation");
	}

	@Given("user verifies the flights available")
	public void user_verifies_the_flights_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for verification of the flights available");
	}

	@Then("selects the desired flight")
	public void selects_the_desired_flight() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for selection of desired flight");
	}

	@When("user makes the payments")
	public void user_makes_the_payments() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for making payments");
	}

	@Then("Tickets are generated")
	public void tickets_are_generated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for Tickets generated");
	}


	

}
