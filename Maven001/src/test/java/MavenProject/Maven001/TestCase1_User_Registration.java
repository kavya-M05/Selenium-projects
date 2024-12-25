package MavenProject.Maven001;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase1_User_Registration extends LaunchQuit
{
	@Test 
	public void User_Registration() throws InterruptedException
	{
		Amazon_logoutPage amalog=new Amazon_logoutPage(driver);
		amalog.hello_hoverover(driver);
		CreateAccount creacc=new CreateAccount(driver);
		creacc.start_here_link(driver);
		creacc.first_last_name();
		creacc.phone_number();
		creacc.password();
		creacc.click_coninue(driver);
		
	}

}
