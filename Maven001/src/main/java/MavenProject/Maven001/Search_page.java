package MavenProject.Maven001;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchbox;
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")
	WebElement clickproduct;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement click_add_to_card;
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	WebElement click_buy_now;
	//click_card()
	
	public void enter_book()
	{
		Searchbox.sendKeys("books"+Keys.ENTER);
	}
	public void click_product()
	{
		clickproduct.click();
	}
	public void switchwindow(WebDriver driver)
	{
		Set<String> allid= driver.getWindowHandles();
		Iterator<String>	I1=allid.iterator();
		String parentid=I1.next();
		String childid=I1.next();
		driver.switchTo().window(childid);
	}
	public void click_card()
	{
		click_add_to_card.click();
	}
	
	public void click_buy_now()
	{
		click_buy_now.click();
	}
	
	public Search_page(WebDriver driver)
	{
       PageFactory.initElements(driver, this);
    }
}
