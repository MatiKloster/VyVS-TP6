package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Pages.LoginPage;
import Pages.ProductPage;

public class BuyProductsTest extends BaseTest{

	private LoginPage loginPage = new LoginPage();
	private ProductPage productPage = new ProductPage();
	
	
	@Before
	public void setUp() throws Exception
	{}
	
	@Test
	public void VerifyBuyThreeProducts(){
		loginPage.InputUsername().Write("standard_user");
		loginPage.InputPassword().Write("secret_sauce");
		loginPage.BtnLogin().Click();
		
		
		productPage.btnFirstProduct().Click();
		productPage.btnSecondProduct().Click();
		productPage.btnThirdProduct().Click();
		
		
		Assert.assertEquals(productPage.howMany().Text(),"3");
		
		Finalize();
	}
	
	
}
