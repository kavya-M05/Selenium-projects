package maven.SpiceJet;

import org.testng.annotations.Test;

public class Testcase3_Login_InValid_Credential extends LunchQuit{
	//WebDriver driver;
	@Test
	
	public void Login_Invalid_credential()
	{
		Login_Page logpage=new Login_Page(driver);
		logpage.login_link_click();
		logpage.mobilenumber_select();
		logpage.enter_wrong_mobile_number();
		logpage.enter_password();
		logpage.click_login_button();
//		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(30));
//		Alert alert = w1.until(ExpectedConditions.alertIsPresent());
//		String text = alert.getText();
//		System.out.println(text);
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
		
	}

}
