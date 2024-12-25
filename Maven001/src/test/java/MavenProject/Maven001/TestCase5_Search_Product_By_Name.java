package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5_Search_Product_By_Name extends LaunchQuit{
	@Test
	public void Search_Product_By_Name() throws EncryptedDocumentException, IOException
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
		 Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe", "Not matching with the search");
	}

}
