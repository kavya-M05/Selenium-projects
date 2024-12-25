package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase13_User_Apply_Cupon_Code extends LaunchQuit{
	@Test
	public void User_Apply_Cupon_Code() throws EncryptedDocumentException, IOException
	{
		 Amazon_SingIn amasin= new Amazon_SingIn(driver);
		 amasin.hoverover_signin(driver);	
		 amasin.click_signin(driver);
		 DataFetching.TestData();//calling the data fetching by using the calssname.methodname
		 Amazon_LoginPage amalog=new Amazon_LoginPage(driver);
		 amalog.un();
		 amalog.continue_button();
		 amalog.pwd();
		 amalog.singin_button(driver); 
		 Amazon_HomePage amahom=new Amazon_HomePage(driver);
		 amahom.search_product2(driver);
		 Amazon_SearchResultPage amasear=new Amazon_SearchResultPage(driver);
		 amasear.click_product();
		 amasear.Go_childid(driver);
		 Amazon_ProductPage14 amapro=new Amazon_ProductPage14(driver);
		 amapro.Click_cupon_checkbox();
		 amapro.assertion_cupon_code();
		 
	}

}
