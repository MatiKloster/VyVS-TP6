package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Input extends BaseControl{
	public Input(By findBy) {
		super(findBy);
		// TODO Auto-generated constructor stub
	}
	public String Text() {
		try {return this.Element().getText();}
		catch(NoSuchElementException e) {
			return null;
		}
	}
	
	public void Write(String text) {
		this.Element().clear();
		this.Element().sendKeys(text);
	}
	
	public String getPlaceholder() {
		return this.Element().getAttribute("placeholder");
	}

}
