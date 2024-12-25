package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Testcase4_Edit_Profile_Page extends LaunchQuit
{
	@Test
	public void EditProfile() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Amazon_SingIn amasin=new Amazon_SingIn(driver);
		amasin.hoverover_signin(driver);	
		amasin.click_signin(driver);
		DataFetching.TestData();
		Amazon_LoginPage amalog = new Amazon_LoginPage(driver);
		amalog.un();
		amalog.continue_button();
		amalog.pwd();
		amalog.singin_button(driver);
		amasin.hoverover_signin(driver);
		Amazon_Manage_Profile_Page manpro=new Amazon_Manage_Profile_Page(driver);
		Thread.sleep(4000);
		manpro.Click_Manage_Profile_Link();
		manpro.Click_view_Link();
		manpro.expand_Department();
		manpro.preffered_department();
		
		
		
	}

}
