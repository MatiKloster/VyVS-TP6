package Test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductPage;

public class MyCartTest extends BaseTest {
		
	LoginPage loginPage = new LoginPage();
	ProductPage productPage = new ProductPage();
	CartPage cartPage = new CartPage();
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void VerifyMyCart(){
		
	
		
		loginPage.InputUsername().Write("standard_user");
		loginPage.InputPassword().Write("secret_sauce");
		loginPage.BtnLogin().Click();
		
		
			
		productPage.btnFirstProduct().Click();
		productPage.btnSecondProduct().Click();
		productPage.btnThirdProduct().Click();
		
		
		
		cartPage.cartPageBtn().Click();
				
		Assert.assertTrue(cartPage.myFirstProduct().Displayed());
		Assert.assertTrue(cartPage.mySecondProduct().Displayed());
		Assert.assertTrue(cartPage.myThirdProduct().Displayed());
		
		Finalize();
	}
}
