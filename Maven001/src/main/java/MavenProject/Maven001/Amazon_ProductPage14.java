	package MavenProject.Maven001;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_ProductPage14 {
	//WebDriver driver;
	
	@FindBy (xpath="//input[@id='add-to-wishlist-button-submit']")
	WebElement add_wishlist;
	
	@FindBy (xpath="//button[@class=' a-button-close a-declarative']")
	WebElement close_pupup;
	
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	WebElement add_to_card;
	
	@FindBy (xpath="//span[@id='submit.add-to-cart-announce']")
	WebElement add_to_card_product2;
	
		
	@FindBy (xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement Proceedtobuy;
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	WebElement price;
	
	@FindBy(xpath="//h3[.=' About this item ']")
	WebElement productdetails;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[19]")
	WebElement reviews;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[9]")
	WebElement Gotocart;
	
	@FindBy(xpath="//div[@id='nav-cart-count-container']/span[@id='nav-cart-count']")
	WebElement clickcart;
	
	@FindBy(xpath="//select[@id='quantity']")
	WebElement Qtyselect;
	
	@FindBy(xpath="(//span[@class='a-declarative'])[16]/input[@class='a-color-link']")
	WebElement delete;
	
	//@FindBy(xpath="((//div[@class='a-padding-medium']/span[@class='a-size-base'])[1])")
	@FindBy(xpath="(//span[@class='a-size-base'])[5]")
	//(//div[@class='a-padding-medium']/span/a)[6]//manish xpath
	WebElement assertion;
	
	@FindBy(xpath="//div[@class='a-row sc-cart-header sc-compact-bottom']/div/h1")
	WebElement assertion_cart_withoutlogin;
	
	@FindBy(xpath="(//span[@class='a-size-medium sc-number-of-items'])[1]")
	WebElement Totalcartitems;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
	WebElement cuponcheckbox;
	
	@FindBy(xpath="//span[@class='a-size-base a-color-success']")
	WebElement cuponassertion;
	
	@FindBy(xpath="((//table[@class='a-normal small-line-height'])[2]/tbody/tr/td)[2]")
	WebElement countassertion;
	
	
//	public void parent_child(WebDriver driver)
//	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		String pid= driver.getWindowHandle();
//		Set<String> pandcid= driver.getWindowHandles();
//		System.out.println(pid);
//		System.out.println(pandcid);
//		Iterator<String> pc= pandcid.iterator();
//		String parentid= pc.next();
//		String childid= pc.next();
//		System.out.println(parentid);
//		System.out.println(childid);
//		driver.switchTo().window(childid);
//	}
	
	public void addtowishlist()
	{
		
	add_wishlist.click();
			
	}
	@Test(dependsOnMethods="addtowishlist")
	public void close_popup()
	{
		close_pupup.click();
	}
	public void add_cart()
	{
		add_to_card.click();
	}
	public void add_cart_product2()
	{
		add_to_card_product2.click();
	}
	
	public void proceed_to_buy()
	{
		Proceedtobuy.click();
	}
	public void Find_price()
	{
		String amount=price.getText();
		System.out.println("The price is "+amount);
		
	}
	
	public void Product_Details(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(productdetails).perform();
				
	}
	public void Review(WebDriver driver)
	{
//		Point p1=reviews.getLocation();
//		int x=p1.getX();
//		int y=p1.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i=0;i<=120;i++)
		{
		js.executeScript("window.scrollBy(0,50)");
		}
					
	}
	
	public void Go_to_card()
	{
		Gotocart.click();
	}
	
	public void Click_cart()
	{
		clickcart.click();
	}
	 public void Select_qty()
	 {
		 Select s1=new Select(Qtyselect);
		 s1.selectByValue("3");
	 }
	 
	 public void delete_item()
	 {
		 delete.click();
	 }
	 
	 public void delete_assertion(WebDriver driver )
	 {
////		 WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(40)); 
////		w1.until(ExpectedConditions.visibilityOfElementLocated((By)assertion));
//		//String mess=assertion.getAttribute("innerHTML");
		 String mess=assertion.getText();
//				// String text=mess.substring(274);
//		System.out.println(mess);
////		System.out.println(text);
		 Assert.assertEquals(mess, "was removed from Shopping Cart. ");
		 
//		 WebElement removedText=driver.findElement(By.xpath("(//span[@class='a-size-base'])[5]"));
//    	 //System.out.println(removedText.isDisplayed());
//    	 System.out.println(removedText.getText());
//    	 String word=removedText.getText();
//    	 System.out.println(word.contains("removed"));
//    	Assert.assertTrue(word.contains("removed"));
    	 
    	// Assert.assertEquals(null, null);
       	
	 }
	 
	 public void assertion_cart_without_login()
	 {
		 String str=assertion_cart_withoutlogin.getText();
		 Assert.assertEquals(str, "Shopping Cart");
	 }
	 public void assertion_cupon_code()
	 {
		 String str=cuponassertion.getText();
		 Assert.assertTrue(str.contains("voucher applied"));
	 }
	 public void assertion_totalcount()
	 {
		 String str=countassertion.getText();
		 System.out.println("str");
		 Assert.assertEquals(str, "₹1,37,990.00");
	 }
	 
	 public void Total_Count_cart() {
		 String subtotal=Totalcartitems.getText();
		 String itemcount=subtotal.substring(10, 11);
		 System.out.println(itemcount);
	 }
	 
	 public void Click_cupon_checkbox()
	 {
		 cuponcheckbox.click();
	 }
	
	public Amazon_ProductPage14(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
