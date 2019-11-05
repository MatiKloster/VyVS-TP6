package Pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import controls.Button;

public class ProductPageAleatorio extends BasePage{	
	public ProductPageAleatorio() {
		super(By.xpath("//div[contains(text(),'Products')]"));	
	}
	
	public ArrayList<Button> getButtons() {
		ArrayList<Button>items = new ArrayList<Button>();
		for(int i=1; i <= 6; i++) {
			items.add(new Button(By.xpath("//div[@class='inventory_list']/div["+i+"]/div[@class='pricebar']/button")));			
		}
		return items;	
	}
	public Button gotCartButton() {
		return new Button(By.xpath("//span[contains(@class, 'shopping_cart_badge')]/.."));
	}
}