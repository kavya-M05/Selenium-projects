package MavenProject.Maven001;

import org.testng.annotations.Test;

public class TestCase15_Reach_Cart_Without_Login extends LaunchQuit{
	@Test
	public void Reach_Cart_Without_Login()
	{
		Amazon_HomePage amahom=new Amazon_HomePage(driver);
		amahom.search_product(driver);
		Amazon_SearchResultPage amaser=new Amazon_SearchResultPage(driver);
		amaser.click_product();
		amaser.Go_childid(driver);
		Amazon_ProductPage14 amaprod=new Amazon_ProductPage14(driver);
		amaprod.add_cart();
		amaprod.Click_cart();
		amaprod.assertion_cart_without_login();
		
	}

}
