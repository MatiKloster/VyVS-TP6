package Pages;

import org.openqa.selenium.By;
import controls.Button;
import controls.Input;

public class CheckoutPage extends BasePage{
	public CheckoutPage() {
		super(By.xpath("//div[contains(text(),'Checkout: Your Information')]"));
	}
	public Button getContinueButton() {
		return new Button(By.xpath("//div[@id='checkout_info_container']/div/form/div[2]/input"));
	}
	public Input getfName() {
		return new Input(By.xpath("//input[@id='first-name']"));
	}
	public Input getlName() {
		return new Input(By.xpath("//input[@id='last-name']"));
	}
	public Input getzip() {
		return new Input(By.xpath("//input[@id='postal-code']"));
	}
	
}
	