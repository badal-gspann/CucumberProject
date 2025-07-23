package stepdefination;

import factory.DriverFactory;
import factory.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on shopping site")
	public void user_is_on_shopping_site() {
		DriverFactory.getDriver().get("https://sauce-demo.myshopify.com/account/login");
	}
	
	@When("User enter username")
	public void user_enter_username() {
		PageFactory.getLoginPage().enterUsername("badal@gmail.com");
	}
	
	@When("User enter password")
	public void user_enter_password() {
		PageFactory.getLoginPage().enterPassword("12345678");
	}
	
	@When("User click on Sign in")
	public void user_click_on_sign_in() {
		PageFactory.getLoginPage().clickOnSignInBtn();
	}
	
	@Then("User should be on accounts page")
	public void user_should_be_on_accounts_page() {
		System.out.println("Accounts Page");
	}
	
	

}
