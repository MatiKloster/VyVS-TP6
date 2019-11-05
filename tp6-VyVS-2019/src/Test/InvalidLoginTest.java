package Test;

import org.junit.Before;
import org.junit.Test;
import Pages.LoginPage;
import junit.framework.Assert;

public class InvalidLoginTest extends BaseTest{

	
	private LoginPage loginPage = new LoginPage();
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void VerifyInvalidLogin() throws Exception
	{
		loginPage.InputUsername().Write("standard_user");
		loginPage.InputPassword().Write("noexiste");
		loginPage.BtnLogin().Click();
		
		
		Assert.assertTrue(loginPage.getErrorLabel().Displayed());
		
		Finalize();
	}
	
	
}
