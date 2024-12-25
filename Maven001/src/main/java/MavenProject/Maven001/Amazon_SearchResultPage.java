package MavenProject.Maven001;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_SearchResultPage {
	
//WebDriver driver;
//Step1
@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[6]")
WebElement click_product;
@FindBy(xpath="(//button[@class='a-button-text'])[1]")
WebElement click_iphoneproduct;
@FindBy(xpath="(//button[@class='a-button-text'])[2]")
WebElement click_iphoneproduct2;




@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]")
WebElement click_product2;


@FindBy (xpath="//*[@id=\"p_72/1318476031\"]/span/a/section/i")
WebElement sorting_fourstar;

@FindBy (xpath="//*[@id=\"p_90/20912642031\"]/span/a/span")
WebElement sorting_days;

@FindBy(xpath="//span[.=\"Men's Sports & Outdoor Shoes\"]")
WebElement category;

@FindBy(xpath="(//input[@class='s-range-input'])[2]")
WebElement Rightslider;

@FindBy(xpath="//input[@class='a-button-input']")
WebElement clickgo;

@FindBy(id="s-result-sort-select")
WebElement sortby;

@FindBy(xpath="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']/ul/li[3]")
WebElement pricehightolow;

@FindBy(xpath="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']/ul/li[4]")
WebElement customerreview;

//Step2

public void click_product2()
{
	click_product2.click();
}
public void click_product()
{
	click_product.click();

}
public void click_iphoneproduct()
{
	click_iphoneproduct.click();
}
public void click_iphoneproduct2()
{
	click_iphoneproduct.click();
}

public void Go_childid(WebDriver driver)
{
	String parentid1=driver.getWindowHandle();
	Set<String> pandcid= driver.getWindowHandles();
	Iterator<String> pc= pandcid.iterator();
	String parentid= pc.next();
	String childid= pc.next();
	driver.switchTo().window(childid);
		
}

public void Go_childid_new(WebDriver driver)
{
	String parentid1=driver.getWindowHandle();
	Set<String> pandcid= driver.getWindowHandles();
	System.out.println(pandcid);
	Iterator<String> pc= pandcid.iterator();
	String parentid= pc.next();
	String childid= pc.next();
	String childid2= pc.next();
	System.out.println(parentid);
	System.out.println(childid);
	driver.switchTo().window(childid2);
		
}



public void Return_parentid(WebDriver driver)
{
	
	Set<String> pandcid= driver.getWindowHandles();
	Iterator<String> pc= pandcid.iterator();
	String parentid= pc.next();
	String childid= pc.next();
	driver.switchTo().window(parentid);
}

public void sorting_4star()
{
	sorting_fourstar.click();
}
public void sorting_2days()
{
	sorting_days.click();
}

public void Click_category()
{
	category.click();
}

public void Drag_Slider()
{
	for (int i=0;i<99;i++)
	{
		Rightslider.sendKeys(Keys.ARROW_LEFT);
	}
}

public void Review()
{
	//sortby.click();
	Select s1=new Select(sortby);
	s1.selectByValue("review-rank");
	
}
public void price()
{
	//sortby.click();
	Select s1=new Select(sortby);
	s1.selectByValue("price-desc-rank");
	
}

public void Click_Go_button()
{
	clickgo.click();
}

public void Price_Higer_Low()
{
	pricehightolow.click();
}

public void Customer_review()
{
	customerreview.click();
}

//Step3
public Amazon_SearchResultPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
