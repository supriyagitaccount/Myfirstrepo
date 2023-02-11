package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_page_steps {


@Given(": I am on login page")
public void i_am_on_login_page() {
   System.out.println("I navigate to Home page");
}

@When(": I entered valid credential and click on submit button")
public void i_entered_valid_credential_and_click_on_submit_button() {
  System.out.println(" I am on login page");
  
}

@Then(": I navigate to Home page")
public void i_navigate_to_home_page() {
   System.out.println("I navigate to Home page");
}


	
}
