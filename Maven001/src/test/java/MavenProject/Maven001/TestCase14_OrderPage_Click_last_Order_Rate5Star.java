package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase14_OrderPage_Click_last_Order_Rate5Star extends LaunchQuit{
	@Test
	public void Orderpage_Give_5Star_Rating() throws EncryptedDocumentException, IOException
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
		 amasin.hoverover_signin(driver);
		 amasin.click_yourorder();
		 Amazon_Order_page amaorder=new Amazon_Order_page(driver);
		 amaorder.click_product_review();
		 amaorder.select_star();
		 amaorder.assertion_order();
		 
		 
	}

}
