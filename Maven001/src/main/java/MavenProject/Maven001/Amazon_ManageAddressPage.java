package MavenProject.Maven001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ManageAddressPage {
	
	@FindBy (xpath="//*[@id=\"address-list\"]/div/div[1]/div/fieldset[1]/div[1]/span/div/label/input")
	WebElement Address;
	
	@FindBy (xpath="//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")
	WebElement Usethisaddress;
	
	public void Select_this_address()
	{
		Address.click();	
	}
	
	public void Use_this_address()
	{
		Usethisaddress.click();
	}
	public Amazon_ManageAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
