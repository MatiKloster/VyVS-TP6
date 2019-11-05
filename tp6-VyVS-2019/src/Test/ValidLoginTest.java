package Test;

import org.junit.Before;
import org.junit.Test;
import Pages.LoginPage;
import Pages.ProductPage;
import junit.framework.Assert;

public class ValidLoginTest extends BaseTest {
	
	private LoginPage loginPage = new LoginPage();
	private ProductPage productPage = new ProductPage();
	
	
	@Before
	public void setUp() throws Exception{}
	
	
	@Test
	public void verifyLogin() throws Exception
	{
		
		loginPage.InputUsername().Write("standard_user");
		loginPage.InputPassword().Write("secret_sauce");
		loginPage.BtnLogin().Click();
		
		Assert.assertTrue(productPage.lblProduct().Displayed());
		Assert.assertEquals(productPage.lblProduct().Text(),"Products");
		
		Finalize();
	}

}
