package Pages;

import org.openqa.selenium.By;

import controls.Label;

public class FakeDataPage extends BasePage {
	public FakeDataPage() {
		super(By.xpath("//div[contains(text(),'Person Generator')]"));
	
	}
	public Label getZip() {
		return new Label(By.xpath("//p[5]/b"));
	}
	public Label getName() {
		return  new Label(By.xpath("//div[@class='col-md-4 col-sm-6 col-xs-12']/p[@class='text-center name']"));
	}
}
