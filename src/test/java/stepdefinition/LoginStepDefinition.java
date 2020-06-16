package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Srinidhi\\Desktop\\Jars\\chromedriver.exe");
	}
	
	@Given("^the browser is launched$")
	public void the_browser_is_launched() throws Throwable {
		driver = new ChromeDriver();
		
	  
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
	    driver.get("https://demo.actitime.com/");
	}

	@When("^the user enters the valid username$")
	public void the_user_enters_the_valid_username() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("admin");
	   
	}

	@When("^the user enters the valid password$")
	public void the_user_enters_the_valid_password() throws Throwable {
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Thread.sleep(4000);
	}

	@When("^the user clicks on the login Button$")
	public void the_user_clicks_on_the_login_Button() throws Throwable {
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(4000);
	   
	}

	@Then("^dashboard should be displayed$")
	public void dashboard_should_be_displayed() throws Throwable {
		Thread.sleep(4000);
		Assert.assertEquals("", "");
		driver.close();
	  
	}
	
	@When("^user clicks on Forgot your password link$")
	public void user_clicks_on_Forgot_your_password_link() throws Throwable {
	    driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
	}

	@Then("^forgot your passsword component should be displayed$")
	public void forgot_your_passsword_component_should_be_displayed() throws Throwable {
	    Assert.assertEquals("", "");
	    Thread.sleep(3000);
	    driver.close();
	}
	
	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("trainee");
		 driver.findElement(By.name("pwd")).sendKeys("trainee");
		  Thread.sleep(4000);
	  
	}
	
	@When("^the user enters the creadentials as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_creadentials_as_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);
		 driver.findElement(By.name("pwd")).sendKeys(arg2);
		  Thread.sleep(4000);
	}
	
	@When("^the user enters valid username and password$")
	public void the_user_enters_valid_username_and_password(DataTable data) throws Throwable {
	 
		List<Map<String, String>> dataMap = data.asMaps(String.class, String.class);
		driver.findElement(By.id("username")).sendKeys(dataMap.get(0).get("username"));
		 driver.findElement(By.name("pwd")).sendKeys(dataMap.get(0).get("password"));
		  Thread.sleep(4000);
	}

}
