package Pages;

import org.openqa.selenium.By;

import controls.Label;

public class FinishPage extends BasePage {
	public FinishPage() {
		super(By.xpath("//div[contains(text(),'Finish')]"));
	}
	public Label getThxLabel() {
		return new Label(By.xpath("//div[@id='checkout_complete_container']/h2"));
	}
	public Label getUrOrderHasBeenDispatched() {
		return new Label(By.xpath("//div[@id='checkout_complete_container']/div"));
	}
}
