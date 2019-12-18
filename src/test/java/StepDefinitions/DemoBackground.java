package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DemoBackground {
	WebDriver driver;
	
	@Given("Application is launched by user XY")
	public void application_is_launched_by_user_XY() {
		System.setProperty("webdriver.gecko.driver","Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com");
	    //throw new cucumber.api.PendingException();
	}

	@Given("User clicks on Signup link XY")
	public void user_clicks_on_Signup_link_XY() {
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	    //throw new cucumber.api.PendingException();
	}

	@Then("valid data has be provide XY")
	public void valid_data_has_be_provide_XY() {
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Siddhii");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Rajemahadik");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("siddhirajemahadik@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("sid123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("sid123");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	    //throw new cucumber.api.PendingException();
	}

	@Then("Verifies the registration process and perform logout XY")
	public void verifies_the_registration_process_and_perform_logout_XY() {
	
	    //throw new cucumber.api.PendingException();
	}



}
