package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition 
{
		WebDriver driver;
		
	@Given("^user is already on Login Page$")  // user is already on Login Page
	public void user_is_already_on_Login_Page()  {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\Cucumber Framework\\BDD_Framework_FreeCRMAps\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");	
		
		
	    
	}

	@When("^title of login page is Free CRM$") // title of login page is Free CRM
	public void title_of_login_page_is_Free_CRM(){
	    	    
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
		// Here taking title expected value from Page source
	}

	@Then("^user clicks on first login button$") // user clicks on first login button
	public void user_clicks_on_first_login_button()  {
	    
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginBtn);
	    
	}
	
	
	/* @Then("^user enters  \"([^\"]*)\" and \"([^\"]*)\"$") // user enters username and password
	public void user_enters_and(String arg1 , String arg2)  {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arg2);
	    
	}*/

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
	    // Write code here that turns the phrase above into concrete actions
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get("password"));
		}
	}
	
	
	@Then("^user clicks on login button$") // user clicks on login button
	public void user_clicks_on_login_button()  {
	   
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginBtn);
			    
	}

	@Then("^user is on home page$") // user is on home page
	public void user_is_on_home_page()  {
	  	   
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Assert.assertEquals("Cogmento CRM", title);
	}

	/*Given user is already on home page
	When user clicks on contacts link
	Then user clicks on New Contact link
	Then user enters firstname and lastname
	Then user clicks on save button
	Then verify new contact created */

	@Given("^user is already on home page$") // user is on home page
	public void user_is_already_on_home_page()  
	{
	  	String title1 = driver.getTitle();
		System.out.println("Home Page title ::"+ title1);
		Assert.assertEquals("Cogmento CRM", title1);
	}
	
	@When("^user clicks on contacts link$") // user clicks on login button
	public void user_clicks_on_contacts_link()  {
	   
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click();", ContactsLink);
			    
	}
	
	@Then("^user clicks on New Contact link$") // user clicks on login button
	public void user_clicks_on_New_Contact_link()  {
	   
		driver.findElement(By.xpath("//i[@class='edit icon']")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click();", NewContact);
			    
	}
	
	@Then("^user enters firstname and lastname$") // user enters username and password
	public void user_enters_firstname_and_lastname()  {
	
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Abhay");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Namdeo");
	    
	}
	
	@Then("^user clicks on save button$") // user clicks on login button
	public void user_clicks_on_save_button()  {
	   
		WebElement ContactsLink = driver.findElement(By.xpath("//button[@class='ui linkedin button']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", ContactsLink);
			    
	}
	@Then("^verify new contact created$") // user is on home page
	public void verify_new_contact_created()  
	{
	  	String Name= driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).getText();
		System.out.println("Home Page title ::"+ Name);
		Assert.assertEquals("Abhay Namdeo", Name);
	}
	
	@Then("^Close the browser$") 
	public void Close_the_browser()  {
		   
		driver.quit();
	}
	
	
}
