package MavenProject.Maven001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_logoutPage {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement hello_logouthover;
	
	@FindBy (xpath="//*[@id=\"nav-item-signout\"]/span")
	WebElement Logout;
	
	public void hello_hoverover(WebDriver driver) 
	{
	Actions A1=new Actions(driver);	
	A1.moveToElement(hello_logouthover).perform();
	}
	
	public void logout_user()
	{
		Logout.click();
	}
	
	public Amazon_logoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
