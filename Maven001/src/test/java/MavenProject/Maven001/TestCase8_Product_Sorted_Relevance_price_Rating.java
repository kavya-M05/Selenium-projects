package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase8_Product_Sorted_Relevance_price_Rating extends LaunchQuit{
	@Test
	public void Product_sorted_relevance_price_rating() throws EncryptedDocumentException, IOException, InterruptedException
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
		 Amazon_SearchResultPage amasear=new Amazon_SearchResultPage(driver);
		 amasear.Review();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 amasear.price();
		 driver.navigate().refresh();
		 
		 
	}

}
