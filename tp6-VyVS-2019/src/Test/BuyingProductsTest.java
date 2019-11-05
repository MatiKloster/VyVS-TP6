package Test;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.CheckoutPageFinalStep;
import Pages.FakeDataPage;
import Pages.FinishPage;
import Pages.LoginPage;
import Pages.ProductPageAleatorio;
import junit.framework.Assert;

public class BuyingProductsTest extends BaseTest{
	private ArrayList<String> tabs;
	private LoginPage loginPage;
	private ProductPageAleatorio pPage;
	private CartPage cPage;
	private FakeDataPage fdPage;
	private CheckoutPage checkoutPage;
	private CheckoutPageFinalStep checkoutPage2;
	private FinishPage finishPage;
	@Before 
	public void setUp() throws Exception{}
	@Test
	public void verifyProperties() throws Exception
	{
		
		loginToPage();
		
		addItemToCart();
		
		clickCart();
		
		clickCheckout();
		
		openNewTab();
		
		copyValues();
		
		clickAndContinue();
		
		verifyText();
		
		Finalize();
		
	}
	private void verifyText() {
		Assert.assertEquals(finishPage.getThxLabel().Text(), "THANK YOU FOR YOUR ORDER");
		Assert.assertEquals(finishPage.getUrOrderHasBeenDispatched().Text(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	}
	private void clickAndContinue() {
		checkoutPage.getContinueButton().Click();
		checkoutPage2=new CheckoutPageFinalStep();
		checkoutPage2.getFinishButton().Click();
		finishPage=new FinishPage();
	}
	private void copyValues() {
		fdPage= new FakeDataPage();
		String fn=fdPage.getName().Text().split(" ")[0];
		String ln=fdPage.getName().Text().split(" ")[2];
		String zip=fdPage.getZip().Text();
		Driver().switchTo().window(tabs.get(0));
		checkoutPage.getfName().Write(fn);
		checkoutPage.getlName().Write(ln);
		checkoutPage.getzip().Write(zip);
	}
	private void openNewTab() {
		((JavascriptExecutor)Driver()).executeScript("window.open()");
		tabs = new ArrayList<String>(Driver().getWindowHandles());
		Driver().switchTo().window(tabs.get(1));
		Driver().get("https://www.fakepersongenerator.com/Index/generate​");
	}
	private void clickCheckout() {
		cPage=new CartPage();
		cPage.checkoutBtn().Click();
		checkoutPage= new CheckoutPage();
	}
	private void clickCart() {
		pPage.gotCartButton().Click();
	}
	private void addItemToCart() {	
		pPage = new ProductPageAleatorio();
		pPage.getButtons().get(new Random().nextInt(6)).Click();
	}
	private void loginToPage() {
		loginPage = new LoginPage();
		loginPage.InputUsername().Write("standard_user");
		loginPage.InputPassword().Write("secret_sauce");
		loginPage.BtnLogin().Click();
	}

}
