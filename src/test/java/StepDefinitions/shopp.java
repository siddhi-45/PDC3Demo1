package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shopp {
	
	WebDriver driver;
	
	@Given("DemoWebShop website is launched")
	public void demowebshop_website_is_launched() {
		System.setProperty("webdriver.gecko.driver","Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com");
        //throw new cucumber.api.PendingException();
	}

	@Given("user clicks on register link")
	public void user_clicks_on_register_link() {
	   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters the deatils")
	public void user_enters_the_deatils() {
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Siddhii");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Rajemahadik");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("siddhiiirajemahadik@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("sid123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("sid123");
	    //throw new cucumber.api.PendingException();
	}

	@Then("Clicks on register button for account creation")
	public void clicks_on_register_button_for_account_creation() {
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	    //throw new cucumber.api.PendingException();
	}

	@Given("Registered user clicks on Login link")
	public void registered_user_clicks_on_Login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user enters the required credentials")
	public void user_enters_the_required_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Clicks on Login button to access the website")
	public void clicks_on_Login_button_to_access_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Registered user is successfully logged in DemoWebShop")
	public void registered_user_is_successfully_logged_in_DemoWebShop() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters name of particular item in the search bar")
	public void user_enters_name_of_particular_item_in_the_search_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Details of searched item is displayed")
	public void details_of_searched_item_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user verifies the details mentioned of product")
	public void user_verifies_the_details_mentioned_of_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user clicks on Add to Cart button")
	public void user_clicks_on_Add_to_Cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



}
