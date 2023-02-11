package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home_Page {

	@Given(": I am on home page")
	public void i_am_on_home_page() {
	   System.out.println(" I am on home page");
	}

	@When(": I enter product name in search and enter")
	public void i_enter_product_name_in_search_and_enter() {
	 System.out.println("I enter product name in search and enter");
	}

	@Then(": I navigate to particular product")
	public void i_navigate_to_particular_product() {
		System.out.println("I navigate to particular product");
	 	}
	
	@When(": I click on about")
	public void i_click_on_about() {
	    System.out.println("I click on about");
	}

	@Then(": I navigate to about page")
	public void i_navigate_to_about_page() {
	   System.out.println("I navigate to about page");
	}
	
	@When(": I click on feedback")
	public void i_click_on_feedback() {
	   System.out.println("I click on feedback");
	}

	@Then(": I navigate to feedback page")
	public void i_navigate_to_feedback_page() {
	  System.out.println("I navigate to feedback page");
	}

	@When(": I click on all")
	public void i_click_on_all() {
	   System.out.println("I click on all");
	}

	@Then(": I navigate to all product list")
	public void i_navigate_to_all_product_list() {
	   System.out.println("I navigate to all product list");
	}


}
