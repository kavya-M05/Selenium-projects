package MavenProject.Maven001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_Order_page {
	
	@FindBy(xpath="(//a[@id='Write-a-product-review_2'])[1]")
	WebElement productreview;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-top-micro']/button[5]/img")
	WebElement selectstar;
	
	@FindBy(xpath="//div[@class='a-alert-content']/span/span")
	WebElement assertionorder;
	
	public void click_product_review()
	{
		productreview.click();
	}
	
	public void select_star()
	{
		selectstar.click();
	}
	
	public void assertion_order()
	{
		String str=assertionorder.getText();
		Assert.assertEquals(str, "Submitted");
	}
	
	public Amazon_Order_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
