package MavenProject.Maven001;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("nameofbroswer")
//	public void switchbrowser(String whichbroswer)
//	{
//		if (whichbroswer.equals("chrome"))
//		{
//			driver= new ChromeDriver();
//		}
//		if (whichbroswer.equals("firefox"))
//		{
//			driver= new FirefoxDriver();
//		}
//		if (whichbroswer.equals("edge"))
//		{
//			driver= new EdgeDriver();
//		}
//		
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		 driver.get("https://www.amazon.in/");
//	}
   public void launch_browser()
   {
     driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void quit() throws IOException
	{
			TakesScreenshot t1=	(TakesScreenshot) driver;
			File source=t1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\USER\\eclipse-workspace\\Maven001\\Screenshot\\"+Math.random() +" .png");
			FileHandler.copy(source, destination);
	}
	
}
