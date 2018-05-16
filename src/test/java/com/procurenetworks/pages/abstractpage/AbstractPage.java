package test.java.com.procurenetworks.pages.abstractpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;



public abstract class AbstractPage extends test.java.com.procurenetworks.init.SeleniumInit {

	protected test.java.com.procurenetworks.init.Common common = new test.java.com.procurenetworks.init.Common(driver);

	String customFiled1 = common.generateRandomChars(5);

	public int DRIVER_WAIT = 5;

	
	/**
	 * Initialize UserAbstractPage.
	 * 
	 * @param Driver
	 */
	public AbstractPage(WebDriver driver) {

		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,
				DRIVER_WAIT);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}


	
	
}
