package MavenProject.Maven001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert; 


public class Amazon_LoginPage extends DataFetching
{
  WebDriver driver;
	// Step1
	@FindBy(name="email")
	WebElement un_tf;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(name="password")
	WebElement pwd_tf;
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	//Step2
	public void un()
	{
		un_tf.sendKeys(username);
	}
	public void continue_button()
	{
		continue_button.click();
	}
	public void pwd()
	{
		pwd_tf.sendKeys(password);
	}
	public void singin_button(WebDriver driver)
	{
		signin_button.click();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Incorrect username displayed");
	}
	
	public Amazon_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
