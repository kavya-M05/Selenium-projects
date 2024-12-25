package maven.SpiceJet;

import org.testng.annotations.Test;

public class Testcase1_Singup extends LunchQuit
{
	//WebDriver driver;
	@Test 
	public void singup() throws InterruptedException
	{
		 
	 HomePage su1= new HomePage(driver);
	// su1.popup(driver);
	 su1.sign_up();
	 su1.swtich_to_childwindow(driver);
	 SingUpPage sigup=new SingUpPage(driver);
	 sigup.select_title();
	 sigup.enter_firstname();
	 sigup.enter_lastname();
	 sigup.select_country();
	 sigup.date_of_Birth();
	 sigup.select_month();
	 sigup.select_year();
	 sigup.select_day();
	 Thread.sleep(4000);
	 //sigup.select_countrycode();
	 sigup.mobile_number();
	 Thread.sleep(4000);
	 sigup.enter_emailid(driver);
	 sigup.enter_password(driver);
	 sigup.confirm_password();
	 Thread.sleep(4000);
	 sigup.checkbox(driver);
	 Thread.sleep(4000);
	 sigup.click_sibmit(driver);
	 sigup.OTP_assertion();
	 
	}
    
}
