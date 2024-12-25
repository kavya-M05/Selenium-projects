package maven.SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Passenger_details_Page {
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[3]")
	WebElement selecttitle;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement enterfirstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement enterlastname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement enterphonenumer;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement enteremailid;
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")
	WebElement entertowncity;
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement enterpassfirstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement enterpasslastname;
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[8]")
	WebElement enterpassphonenumber;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79']")
	WebElement clicknext;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement enterpass2firstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement enterpass2lastname;
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[8]")
	WebElement enterpass2phonenumber;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement enterpass3firstname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement enterpass3lastname;
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[8]")
	WebElement enterpass3phonenumber;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement passcontinuebutton;
	
	public void select_title() 
	{
		selecttitle.click();
	}
	
	public void enter_firstname()
	{
		enterfirstname.sendKeys("saroj");
	}
	public void enter_lastname()
	{
		enterlastname.sendKeys("kund");
	}
	public void enter_phonenumber()
	{
		enterphonenumer.sendKeys("8080666110");
	}
	public void enter_emailid()
	{
		enteremailid.sendKeys("skund@gmail.com");
	}
	public void enter_towncity(WebDriver driver)
	{
		entertowncity.sendKeys("mumbai");
//		Actions a1=new Actions(driver);
//		a1.sendKeys(entertowncity , "mumbai").build().perform();
    }
	public void enter_pass_firstname()
	{
		enterpassfirstname.sendKeys("saroj");
	}
	public void enter_pass_lastname()
	{
		enterpasslastname.sendKeys("kund");
	}
	public void enter_pass_phonenumber()
	{
		enterpassphonenumber.sendKeys("8080666110");
	}
	
	public void click_next_button()
	{
		clicknext.click();
	}
	
	public void enter_pass2_firstname()
	{
		enterpass2firstname.sendKeys("priya");
	}
	public void enter_pass2_lastname()
	{
		enterpass2lastname.sendKeys("kund");
	}
	public void enter_pass2_phonenumber()
	{
		enterpass2phonenumber.sendKeys("8080666111");
	}
	public void enter_pass3_firstname()
	{
		enterpass3firstname.sendKeys("Ratnakar");
	}
	public void enter_pass3_lastname()
	{
		enterpass3lastname.sendKeys("kund");
	}
	public void enter_pass3_phonenumber()
	{
		enterpass3phonenumber.sendKeys("8080666112");
	}
	
	public void click_pass_continue_button()
	{
		passcontinuebutton.click();
	}
	
	public Passenger_details_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
