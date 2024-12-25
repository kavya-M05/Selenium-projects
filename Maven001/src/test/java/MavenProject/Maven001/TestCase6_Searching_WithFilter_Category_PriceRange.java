package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase6_Searching_WithFilter_Category_PriceRange extends LaunchQuit{
	@Test
	public void Search_withfilter_category_PriceRange() throws EncryptedDocumentException, IOException
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
		 Amazon_SearchResultPage amasearch=new Amazon_SearchResultPage(driver);
		 amasearch.Click_category();
		 amasearch.Drag_Slider();
		 amasearch.Click_Go_button();
	}
	

}
