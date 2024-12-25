package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase7_ProductDetails_Price_Review_Description extends LaunchQuit{
	
	@Test
	public void Check_productdetails_price_review_description() throws EncryptedDocumentException, IOException
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
		 amasear.click_product();
		 amasear.Go_childid(driver);
		 Amazon_ProductPage14 amaprod=new Amazon_ProductPage14(driver);
		 amaprod.Find_price();
		 amaprod.Product_Details(driver);
		 amaprod.Review(driver);
		 
	}

}
