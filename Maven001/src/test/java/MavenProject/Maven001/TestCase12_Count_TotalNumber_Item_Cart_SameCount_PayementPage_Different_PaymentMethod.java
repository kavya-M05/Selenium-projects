package MavenProject.Maven001;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase12_Count_TotalNumber_Item_Cart_SameCount_PayementPage_Different_PaymentMethod extends LaunchQuit{
	@Test
	public void CountTotalNumber_CartItem_SameCount_paymentpage_choosedifferet_paymentmethod() throws EncryptedDocumentException, IOException, InterruptedException
	
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
		 amahom.search_product3(driver);
		 Amazon_SearchResultPage amasear=new Amazon_SearchResultPage(driver);
		amasear.click_iphoneproduct();
		//amasear.Go_childid(driver);
		Amazon_ProductPage14 amaprod=new Amazon_ProductPage14(driver);
		//amaprod.add_cart();
		Thread.sleep(2000);
		amasear.click_iphoneproduct2();
		//amaprod.add_cart();
		//amasear.Go_childid_new(driver);
		//amaprod.add_cart();
		amaprod.Click_cart();
		amaprod.Total_Count_cart();
		amaprod.proceed_to_buy();
		
		Amazon_ManageAddressPage amamanaddress=new Amazon_ManageAddressPage(driver);
		amamanaddress.Use_this_address();
		amaprod.assertion_totalcount();
		Amazon_PaymentPage amapay=new Amazon_PaymentPage(driver);
		Thread.sleep(4000);
		amapay.select_Radio_button();
		amapay.Click_Card_Details();
				
	}
	
}
