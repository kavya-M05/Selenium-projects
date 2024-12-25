package MavenProject.Maven001;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase11_CheckoutProcess__AddressSelection_PaymentSelection extends LaunchQuit
{

	@Test//(retryAnalyzer=MavenProject.Maven001.Retry_Programm.class)
	public void Login_search_cart_payment() throws EncryptedDocumentException, IOException, InterruptedException
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
		 amahom.search_product(driver);
		 Amazon_SearchResultPage amasear=new Amazon_SearchResultPage(driver);
		 amasear.click_product();
		 amasear.Go_childid(driver);
		 Amazon_ProductPage14 amapro=new Amazon_ProductPage14(driver);
//		 amapro.parent_child(driver);
		 amapro.add_cart();
		 amapro.proceed_to_buy();
		 Amazon_ManageAddressPage amamanaddress=new Amazon_ManageAddressPage(driver);
		 amamanaddress.Use_this_address();
		 Amazon_PaymentPage amapay=new Amazon_PaymentPage(driver);
		
		 Thread.sleep(4000);
		 amapay.select_Radio_button();
		 amapay.Click_Card_Details();
		 amapay.iframe_payment(driver);
		 amapay.enter_cardnumber();
		 amapay.enter_nickname();
		 amapay.expiry_date();
		 amapay.expiry_year();
		 amapay.click_enter_card_details_button();
		 amapay.enter_cvv();
		 //driver.switchTo().alert().
		// amapay.payment_method_button();
		 amapay.continue_without();
		 amapay.Assert_place_your_order(driver);
		
		 
		 
		 
	}

}
