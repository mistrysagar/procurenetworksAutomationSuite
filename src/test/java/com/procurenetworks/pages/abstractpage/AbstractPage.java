package com.procurenetworks.pages.abstractpage;

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

import com.procurenetworks.init.Common;
import com.procurenetworks.init.SeleniumInit;

public abstract class AbstractPage extends SeleniumInit {

	protected Common common = new Common(driver);

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
