package MavenProject.Maven001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amazon_PaymentPage {
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	WebElement Radiobutton;
	
	@FindBy(xpath="//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")
	WebElement Entercarddetails;
	
	@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	WebElement iframepayment;
	
	@FindBy(xpath="//input[@class='a-input-text a-form-normal pmts-account-Number']")
	WebElement cardnumber;
	
	@FindBy(xpath="//input[@class='a-input-text a-form-normal apx-add-credit-card-account-holder-name-input mcx-input-fields']")
	WebElement Nickname;	
	
	@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
	WebElement expirdate;
	@FindBy(xpath="//select[@name='ppw-expirationDate_year']")
	WebElement expiryear;
	
	@FindBy(xpath="(//input[@name='ppw-widgetEvent:AddCreditCardEvent'])")
	WebElement entercarddetails;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement entercvv;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[22]")
	WebElement paymentmethodbutton;
	
	@FindBy(xpath="//span[@class='a-button a-spacing-top-medium a-button-base']")
	WebElement continuewithout;
	
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[1]")
	WebElement placeyourorder;
	
	public void select_Radio_button()
	{
		Radiobutton.click();
	}
	public void Click_Card_Details()
	{
		Entercarddetails.click();
	}
	
	public void iframe_payment(WebDriver driver)
	{
		driver.switchTo().frame(iframepayment);
	}
	public void enter_cardnumber()
	{
		cardnumber.sendKeys("2345678912345678");
	}
	
	public void enter_nickname()
	{
		Nickname.clear();
		Nickname.sendKeys("vipin Kund");
	}
	
	public void expiry_date()
	{
		Select s1=new Select(expirdate);
		s1.selectByValue("5");	
	}
	
	public void expiry_year()
	{
		Select s1=new Select(expiryear);
		s1.selectByValue("4545");	
	}
	
	public void click_enter_card_details_button()
	{
		entercarddetails.click();
	}
	
	public void enter_cvv()
	{
		entercvv.sendKeys("503"+ Keys.ENTER);
	}
	
	public void payment_method_button()
	{
		paymentmethodbutton.click();
	}
	
	public void continue_without()
	{
		continuewithout.click();
	}
	public void Assert_place_your_order(WebDriver driver)
	{
//		Actions a1=new Actions(driver);
//		a1.moveToElement(placeyourorder);
		Assert.assertTrue(placeyourorder.isDisplayed());
	}
	public Amazon_PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
