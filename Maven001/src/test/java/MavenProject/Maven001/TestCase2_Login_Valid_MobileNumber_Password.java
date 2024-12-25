package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_Login_Valid_MobileNumber_Password extends LaunchQuit{
	@Test
	
	public void Login_Valid_Credential() throws EncryptedDocumentException, IOException {
	Amazon_SingIn amasin= new Amazon_SingIn(driver);
	 amasin.hoverover_signin(driver);	
	 amasin.click_signin(driver);
	 DataFetching.TestData();
	 Amazon_LoginPage amalog=new Amazon_LoginPage(driver);
	 amalog.un();
	 amalog.continue_button();
	 amalog.pwd();
	 amalog.singin_button(driver);
	 Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Login not successful");
	}
}
