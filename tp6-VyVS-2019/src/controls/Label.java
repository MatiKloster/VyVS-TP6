package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Label extends BaseControl {

	public Label(By findBy) {
		super(findBy);
		// TODO Auto-generated constructor stub
	}
	public String Text() {
		try {return this.Element().getText();}
		catch(NoSuchElementException e) {
			return null;
		}
	}


}
