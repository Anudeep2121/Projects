package Step_Defination_file;

import io.cucumber.java.en.Given;
import utile.Initialize_the_Browser;


public class Login_stepdefination {
	
	
	@Given("Enter the username and password and click on the login button")
	public void enter_the_username_and_password_and_click_on_the_login_button() {

	    Initialize_the_Browser.lanch_browser();
	}

}
