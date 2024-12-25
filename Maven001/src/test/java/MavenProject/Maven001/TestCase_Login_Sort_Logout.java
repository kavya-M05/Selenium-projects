package MavenProject.Maven001;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase_Login_Sort_Logout  extends LaunchQuit
{
	@Test(/*retryAnalyzer=MavenProject.Maven001.Retry_Programm.class*/)
	public void Login_search_sort_logout() throws EncryptedDocumentException, IOException
	{
		
		 Amazon_SingIn amasin= new Amazon_SingIn(driver);
		 amasin.hoverover_signin(driver);	
		 amasin.click_signin(driver);
		 DataFetching.TestData();
		 Amazon_LoginPage amalog=new Amazon_LoginPage(driver);
		 amalog.un();
		 amalog.continue_button();
		 amalog.pwd();
		 amalog.singin_button(driver); 
		 Amazon_HomePage amahom=new Amazon_HomePage(driver);
		 amahom.search_product(driver);
		 Amazon_SearchResultPage amasea=new Amazon_SearchResultPage(driver);
		 amasea.sorting_4star();
		 amasea.sorting_2days();
		 Amazon_logoutPage amalogout=new Amazon_logoutPage(driver);
		 amalogout.hello_hoverover(driver);
		 amalogout.logout_user();
		 
	}
	
	
	} 

