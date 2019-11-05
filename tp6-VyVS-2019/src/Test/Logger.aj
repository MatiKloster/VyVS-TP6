package Test;
import controls.Input;
import junit.framework.Assert;
import controls.BaseControl;
import org.openqa.selenium.WebDriver;

public aspect Logger {
	private Log log=new Log();
	
	before(String name):
		call(void WebDriver.get(String))&& args(name){
			log.show("Se ingreso a la pagina "+name);
	}
	after(BaseControl control) returning(String cadenaConsultada):
		call(String BaseControl+.Text()) && target(control){
			log.show("-Se solicito el texto de un "+control.getClass().getSimpleName());
			log.show("--Con identificador "+control.getBy().toString());
			log.show("---Texto leido fue: "+cadenaConsultada);
	}
	after(BaseControl control):
		call(void BaseControl+.Click()) && target(control){
		log.show("-Se clickeo sobre "+control.getClass().getSimpleName());
		log.show("--Con identificador: "+control.getBy().toString());
	}
	after(String str):
		call(void Input.Write(String)) && args(str){
		log.show("Se escribio sobre un Input la cadena: "+str);
	}
	before():
		call(private void BuyingProductsTest.openNewTab()){
		log.show("Se abre una pestaña nueva");
	}
	after(String str1,String str2):
		call(void Assert.assertEquals(String,String)) && args(str1,str2){
		log.show("--ASSERT EQUALS--");
		log.show("Se comparo el string: "+str1);
		log.show("Con la cadena: "+str2);
	}
	after():
		call(void BaseTest+.Finalize()){
		log.show("Se finalizo el test exitosamente");
	}
}
