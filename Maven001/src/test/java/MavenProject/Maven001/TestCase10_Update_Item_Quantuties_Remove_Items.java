package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase10_Update_Item_Quantuties_Remove_Items extends LaunchQuit{
@Test
public void Update_Items_Quantities_Remove_Items_cart() throws EncryptedDocumentException, IOException, InterruptedException	
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
	 Thread.sleep(2000);
	 amahom.search_product(driver);
	 Amazon_SearchResultPage amasear=new Amazon_SearchResultPage(driver);
	amasear.click_product();
	amasear.Go_childid(driver);
	Amazon_ProductPage14 amaprod=new Amazon_ProductPage14(driver);
	amaprod.add_cart();
	amasear.Return_parentid(driver);
	amasear.click_product2();
	amasear.Go_childid_new(driver);
	amaprod.add_cart();
	amaprod.Click_cart();
	amaprod.Select_qty();
	Thread.sleep(2000);
	amaprod.delete_item();
	amaprod.delete_assertion(driver);
	
	
}
}
