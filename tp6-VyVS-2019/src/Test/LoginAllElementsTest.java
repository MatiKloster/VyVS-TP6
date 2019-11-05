package Test;

import org.junit.Before;
import org.junit.Test;


import Pages.LoginPage;
import junit.framework.Assert;

public class LoginAllElementsTest extends BaseTest {
	private LoginPage loginPage;
	
	@Before
	public void setUp() throws Exception{}
	@Test
	public void verifyVisibilityOfAllElements() throws Exception
	{
		loginPage=new LoginPage();
		
		Assert.assertTrue(loginPage.LogoLogin().Displayed());
		Assert.assertTrue(loginPage.InputUsername().Displayed());
		Assert.assertEquals(loginPage.InputUsername().getPlaceholder(),"Username");
		Assert.assertTrue(loginPage.InputPassword().Displayed());
		Assert.assertEquals(loginPage.InputPassword().getPlaceholder(),"Password");
		Assert.assertTrue(loginPage.BtnLogin().Displayed());
		
		Finalize();
	}
}
