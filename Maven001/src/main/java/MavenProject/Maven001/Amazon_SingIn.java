package MavenProject.Maven001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SingIn {
	//WebDriver driver;
	//step1:  locating the element by Findby annotation
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement signin_link;
	
	@FindBy(linkText="Sign in")
	WebElement click_signin;
	
	@FindBy(xpath="(//span[@class='nav-text'])[8]")
	WebElement yourorder;
	
	//Step2 : crate method to perfrom action
	public void hoverover_signin(WebDriver driver)
	{
		Actions A1=new Actions(driver);	
		A1.moveToElement(signin_link).perform();
		//signin_link.click();
	}
	public void click_signin(WebDriver driver)
	{
		
		click_signin.click();
	}
			
	//Step3: initializing the page using

	public void click_yourorder()
	{
		yourorder.click();
	}
	
 public Amazon_SingIn(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
}
