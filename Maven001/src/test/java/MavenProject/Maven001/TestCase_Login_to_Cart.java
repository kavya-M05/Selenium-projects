package MavenProject.Maven001;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_Login_to_Cart extends LaunchQuit
{
	
	@Test(retryAnalyzer=MavenProject.Maven001.Retry_Programm.class)
	public void login_to_amazon_till_cart() throws InterruptedException, EncryptedDocumentException, IOException
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
		 Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Login not successful");
		 Amazon_HomePage amahom=new Amazon_HomePage(driver);
		 amahom.search_product(driver);
	     Amazon_SearchResultPage amaser=new Amazon_SearchResultPage(driver);
		 amaser.click_product();
		 amaser.Go_childid(driver);
		 Thread.sleep(6000);
	     Amazon_ProductPage14 amawish=new Amazon_ProductPage14(driver);
	     Thread.sleep(6000);
//		 amawish.parent_child(driver);
		 amawish.addtowishlist();
		 Thread.sleep(6000);
		 amawish.close_popup();
		 amawish.add_cart();
		 
//		
}
}
