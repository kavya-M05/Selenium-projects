package MavenProject.Maven001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_HomePage {
	//WebDriver driver;
	//Step1
	@FindBy (id="twotabsearchtextbox")
	WebElement search_tf;
	//Step2
	public void search_product(WebDriver driver)
	{
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe", "Search is not proper");
	}
	
	public void search_product2(WebDriver driver)
	{
		search_tf.sendKeys("product with coupons");
		search_tf.sendKeys(Keys.ENTER);
		//Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe", "Search is not proper");
	}
	
	public void search_product3(WebDriver driver)
	{
		search_tf.sendKeys("iphone 15 pro");
		search_tf.sendKeys(Keys.ENTER);
		//Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe", "Search is not proper");
	}
	
	
	
	
	
	public Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
