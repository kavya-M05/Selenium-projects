package maven.SpiceJet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_On_page {
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-1awozwy r-1hv0noj r-z2wwpe r-1loqt21 r-18u37iz r-1ugchlj r-1wtj0ep r-1joea0r r-nsbfu8 r-1qfoi16 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-b8lwoo']//*[name()='svg']")
	WebElement clickaddon;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-bnwqim r-73glhw']//*[name()='svg']//*[name()='g' and @id='OneWay']//*[name()='g' and @id='Flight-Results-One-Way---Fare-Details']//*[name()='g' and @id='Group-2']//*[name()='g' and @id='Group-7']//*[name()='g' and @id='Group-6']//*[name()='path' and @id='right-chveron']")
	WebElement seatselection;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1enofrn r-1wyvozj r-u8s1d r-1v2oles r-1i38069 r-184en5c'])[7]")
	WebElement seatselection1;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1enofrn r-1wyvozj r-u8s1d r-1v2oles r-1i38069 r-184en5c'])[8]")
	WebElement seatselection2;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1enofrn r-1wyvozj r-u8s1d r-1v2oles r-1i38069 r-184en5c'])[9]")
	WebElement seatselection3;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickmeal;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-cens5h r-1awozwy r-cqee49 r-poiln3 r-1b43r93 r-1777fci r-14gqq1x'])[1]")
	WebElement selectmeals1;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-cens5h r-1awozwy r-poiln3 r-1b43r93 r-1777fci r-14gqq1x'])[1]")
	WebElement selectmeals2;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-cens5h r-1awozwy r-cqee49 r-poiln3 r-1b43r93 r-1777fci r-14gqq1x'])[3]")
	WebElement selectmeals3;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickdone;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-13awgt0 r-1biggbk']/div[4]")
	WebElement clickcontinue;
	
	@FindBy(tagName="iframe")
	WebElement iframe;
	public void click_add_on()
	{
		clickaddon.click();
	}
	
	public void seat_selection()
	{
		seatselection.click();
	}
	
	public void seat_selection1()
	{
		seatselection1.click();
	}
	public void seat_selection2()
	{
		seatselection2.click();
	}
	public void seat_selection3()
	{
		seatselection3.click();
	}
	public void click_meal_button(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Actions a1=new Actions(driver);
		a1.click(clickmeal).build().perform();
	
	}
	
	public void select_meals1()
	{
	selectmeals1.click();
	}
	
	public void select_meals2()
	{
	selectmeals2.click();
	}
	
	public void select_meals3()
	{
	selectmeals3.click();
	}
	
	public void click_done()
	{
		clickdone.click();
	}
	public void click_continue(WebDriver driver)
	{
		
		clickcontinue.click();
	}
	
	
	
	public Add_On_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
