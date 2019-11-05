package Pages;

import org.openqa.selenium.By;
import controls.Button;

public class CartPage extends BasePage{

	public CartPage() {
		super(By.xpath("//div[contains(text(),'Your Cart')]"));
	}
	
	public Button cartPageBtn() {
		return new Button(By.xpath("//span[contains(@class, 'shopping_cart_badge')]/.."));
	}
	
	public Button checkoutBtn() {
		return new Button(By.xpath("//a[contains(text(),'CHECKOUT')]"));
	}
	
	public Button myFirstProduct() {
		return new Button(By.xpath("//div[@class='cart_item'][1]"));
	}
	
	public Button mySecondProduct() {
		return new Button(By.xpath("//div[@class='cart_item'][2]"));
	}

	public Button myThirdProduct() {
		return new Button(By.xpath("//div[@class='cart_item'][3]"));
	}

}
