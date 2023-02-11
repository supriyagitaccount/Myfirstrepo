package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ibm.icu.impl.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AmazonLogin {

	WebDriver driver;
	
	@Given("I am on amazon login page")
	public void i_am_on_amazon_login_page() {
	  
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads//chromedriver.exe");
		 driver=new ChromeDriver();
			 
		driver.get("https://www.amazon.in/");
		
	}

	@When("I enter mobile product in search and click")
	public void i_enter_mobile_product_in_search_and_click() {
	   
	WebElement ele=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	ele.sendKeys("iphone13");
	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	}

	@Then("I see all mobiles name list")
	public void i_see_all_mobiles_name_list() {

		String expstring="//span[text()=\"Smartphones & Basic Mobiles\"]";
		String actstring=driver.getCurrentUrl();
		
		if(!expstring.equals(actstring)) {
		
		System.out.println("Invalid string");
		}
		
	
	driver.quit();
		
	}

}
