package controls;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Driver.DriverWrapper;

public class BaseControl {
	protected By by;
	
	public BaseControl(By findBy) {
		this.by= findBy;
	}
	
	public WebDriver Driver() {
		return DriverWrapper.Driver();
	}
	
	public WebElement Element() {
		try {
			return this.Driver().findElement(this.by);
		}
		catch(NoSuchElementException e) {
			return null;
		}
	}
	
	public boolean Visible() {
		try {
			return DriverWrapper.isVisible(this.by);
		}
		catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean Displayed() {
		try {
			return DriverWrapper.isDisplayed(this.by);
		}
		catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean Enabled() {
		try {
			return DriverWrapper.isEnabled(this.by);
		}
		catch(NoSuchElementException e) {
			return false;
		}
	}
	public By getBy() {
		return by;
	}
	
}
