package Pages;

import org.openqa.selenium.By;
import controls.Button;
import controls.Input;
import controls.Label;
import controls.Logo;

public class LoginPage extends BasePage{
	public LoginPage() {
		super(By.cssSelector("div#main"));
	}
	public Input InputUsername() {
		return new Input(By.id("user-name"));
	}
	public Input InputPassword() {
		return new Input(By.id("password"));
	}
	public Button BtnLogin() {
		return new Button(By.xpath("//input[@value='LOGIN']"));
	}
	public Logo LogoLogin() {
		return new Logo(By.className("login_logo"));
		}
	public Label getErrorLabel() {
		return new Label(By.xpath("//div[@id='login_button_container']/div/form/h3"));
	}
	
}
