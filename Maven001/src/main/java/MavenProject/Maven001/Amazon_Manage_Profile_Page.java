package MavenProject.Maven001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Manage_Profile_Page {
	
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement ManageProfileLink;
	
	@FindBy(linkText="View")
	WebElement clickviewlink;
	
	@FindBy(xpath="(//*[name()='svg'][@class='chevron'])[1]")
	WebElement Click_preffereddepartment;
	
	@FindBy (xpath="(//button[@class='attribute-action'])[1]")
	WebElement clickadd;
	
	@FindBy(xpath="//button[.='Men']")
	WebElement selectdepartmentmen;
	@FindBy(xpath="//button[.='Women']")
	WebElement selectdepartmentwomen;
	
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement clicksave;
	
	@FindBy(xpath="//div[@class='attribute-value ']")
	WebElement blankdepartment;
	
	@FindBy(xpath="(//button[@class='attribute-action'])[1]")
	WebElement clickEdit;
	
	
	
	public void Click_Manage_Profile_Link()
	{
		ManageProfileLink.click();
	}
	public void Click_view_Link()
	{
		clickviewlink.click();
	}
	public void expand_Department()
	{
		Click_preffereddepartment.click();
	}
	public void click_department_add() throws InterruptedException
	{
		Thread.sleep(4000);
		clickadd.click();
	}
	public void select_department_men()
	{
		selectdepartmentmen.click();
	}
	public void click_save()
	{
		clicksave.click();
	}
	
	public void click_edit()
	{
		clickEdit.click();
	}
	
	public void preffered_department() throws InterruptedException
	{
		String str=blankdepartment.getText();
		System.out.println(str);
		if (str.equals("--"))
		{
			
			click_department_add();
			select_department_men();
			click_save();
		}
		else
		{
			click_edit();
			boolean a1=selectdepartmentmen.isEnabled();
			
			//System.out.println(a1);
			Thread.sleep(4000);
			if(a1==true )
			{
				
				selectdepartmentwomen.click();
				click_save();
			}
			else
			{
				
				selectdepartmentmen.click();
				click_save();
				
				
			}
				
		}
		
		
	}
	
	
	public Amazon_Manage_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
