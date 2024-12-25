package MavenProject.Maven001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAccount {
	//WebDriver driver;
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-newCust\"]/a")
	WebElement starthere_link;
	
	@FindBy(id="ap_customer_name")
	WebElement firstlastname;
	
	@FindBy(id="ap_phone_number")
	WebElement phonenumber;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(xpath="//button[@class='sc-nkuzb1-0 sc-d5trka-0 eZxMRy button']")
	WebElement clickpuzzle;
	
	@FindBy(xpath="//iframe[@class='cvf-aamation-iframe']")
	WebElement iframesingup;
	
	public void start_here_link(WebDriver driver)
	{
		starthere_link.click();
	}
	
	public void first_last_name()
	{
		firstlastname.sendKeys("saroj kund");
	}
	
	public void phone_number()
	{
		phonenumber.sendKeys("8080656110");
	}
	public void password()
	{
		password.sendKeys("Udayapur1@");
	}
	
	public void iframe_signup(WebDriver driver)
	{
		driver.switchTo().frame(iframesingup);
	}
	public void click_coninue(WebDriver driver) throws InterruptedException
	{
		continue_button.click();
		Thread.sleep(4000);
		iframe_signup(driver);
	WebElement 	 w1=driver.findElement(By.xpath("//div[@class='a-section a-text-left']/a"));
		Assert.assertEquals(w1.getText(), "Need help?", "not matching");
	
	}
	
	public void click_puzzle_button()
	{
		clickpuzzle.click();	
	}
	
	public CreateAccount(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

}
