package MavenProject.Maven001;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct_addPromocode {
	@Test
	public void searchproduct_addpromocode()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books"+Keys.ENTER);
		//driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		Search_page sear=new Search_page(driver);
		sear.enter_book();
		sear.click_product();
		sear.switchwindow(driver);
		//sear.click_card();
		sear.click_buy_now();
	
	}

}
