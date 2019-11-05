package Pages;

import org.openqa.selenium.By;
import controls.Button;
import controls.Label;

public class ProductPage extends BasePage{
	public ProductPage() {
		super(By.xpath("//div[contains(text(),'Products')]"));
	}
		
	public Label lblProduct() {
		return new Label(By.xpath("//div[contains(text(),'Products')]"));
	}
	
	public Button btnFirstProduct() {
		return new Button(By.xpath("//div[@class='inventory_list']/div[2]/div[@class='pricebar']/button"));
	}
	
	public Button btnSecondProduct() {
		return new Button(By.xpath("//div[@class='inventory_list']/div[1]/div[@class='pricebar']/button"));
	}
	
	public Button btnThirdProduct() {
		return new Button(By.xpath("//div[@class='inventory_list']/div[3]/div[@class='pricebar']/button"));
	}
	
	public Label howMany() {
		return new Label(By.xpath("//span[contains(@class, 'shopping_cart_badge')]/.."));
	}
	
	
	
}
