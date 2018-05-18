package com.procurenetworks.pages.abstractpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import com.procurenetworks.init.Common;
import com.procurenetworks.init.SeleniumInit;

public abstract class AbstractPage extends SeleniumInit {

	Common common = new Common(driver);

	String customFiled1 = common.generateRandomChars(5);

	public int DRIVER_WAIT = 5;

	public String LEGACY_LOGIN_URL_PRE = "https://inv-pre.qa.procurenetworks.com/auth/login";
	public String LEGACY_LOGIN_URL_INV01 = "https://inv-01.qa.procurenetworks.com/auth/login";
	public String LEGACY_LOGIN_URL_INV02 = "https://inv-02.qa.procurenetworks.com/auth/login";
	public String LEGACY_LOGIN_TXT_USERNAME_VALUE = "ADMIN";
	public String LEGACY_LOGIN_TXT_PASSWORD_VALUE = "admin";
	public String LEGACY_LOGIN_TXT_USERNAME = "username";
	public String LEGACY_LOGIN_TXT_PASSWORD = "password";
	public String LEGACY_LOGIN_BTN_SUBMIT = "submit";
	public String LEGACY_LOGIN_IMAGE_PATH_QA = "https://inv-pre.qa.procurenetworks.com/img/ProcureNetworks_flat.png";

	/**
	 * Initialize UserAbstractPage.
	 * 
	 * @param Driver
	 */
	public AbstractPage(WebDriver driver) {

		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, DRIVER_WAIT);
		PageFactory.initElements(finder, this);
		this.driver = (ChromeDriver) driver;
	}

}
