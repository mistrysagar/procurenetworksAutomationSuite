package com.procurenetworks.pages;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.IFutureResult;

import com.procurenetworks.init.Common;
import com.procurenetworks.pages.abstractpage.AbstractPage;

public class Main_Page extends AbstractPage {

	Common common = new Common(driver);

	String preurl = driver.getCurrentUrl();
	String PREURL = "https://inv-pre.qa.procurenetworks.com/auth/login";

	String inv1 = driver.getCurrentUrl();
	String INV01URL = "https://inv-01.qa.procurenetworks.com/auth/login";

	String inv2 = driver.getCurrentUrl();
	String INV02URL = "https://inv-02.qa.procurenetworks.com/auth/login";

	String inv3 = driver.getCurrentUrl();
	String INV03URL = "https://inv-03.qa.procurenetworks.com/auth/login";

	String inv4 = driver.getCurrentUrl();
	String INV04URL = "https://inv-04.qa.procurenetworks.com/auth/login";

	private String username = "ADMIN";
	private String password = "admin";

	// Procure_Inventory proc = new Procure_Inventory(driver);

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public Main_Page(WebDriver driver) {
		super(driver);

	}

	public void Procure_login()

	{

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: URL >> https://inv-pre.qa.procurenetworks.com/auth/login");
			System.out.println("Step :: Verify Logo Image");
			common.log("Step :: Verify Logo Image");
			common.assertElementPresent(
					"//img[@src='https://inv-pre.qa.procurenetworks.com/img/ProcureNetworks_flat.png']");
			common.pause(5);

			System.out.println("Step :: Verify Username field");
			common.log("Step :: Verify Username field");
			common.assertElementPresent("//input[@name='username']");

			System.out.println("Step :: Verify Password field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@name='password']");

			System.out.println("Step :: Verify Login Button");
			common.log("Step :: Verify Login Button");
			common.assertElementPresent("//input[@value='Login']");

			System.out.println("Step :: Verify Forgot Username ? Link");
			common.log("Step :: Verify Forgot Username ? Link");
			common.assertElementPresent("//a[@href='https://inv-pre.qa.procurenetworks.com/auth/email']");

			System.out.println("Step :: Verify Forgot Password ? Link");
			common.log("Step :: Verify Forgot Password ? Link");
			common.assertElementPresent("//a[@href='https://inv-pre.qa.procurenetworks.com/password/email']");

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(15);
			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(15);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			common.pause(15);

		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: URL >> https://inv-01.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Verify Logo Image");
			common.log("Step :: Verify Logo Image");
			common.assertElementPresent(
					"//img[@src='https://inv-01.qa.procurenetworks.com/img/ProcureNetworks_flat.png']");
			common.pause(5);

			System.out.println("Step :: Verify Username field");
			common.log("Step :: Verify Username field");
			common.assertElementPresent("//input[@name='username']");

			System.out.println("Step :: Verify Password field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@name='password']");

			System.out.println("Step :: Verify Login Button");
			common.log("Step :: Verify Login Button");
			common.assertElementPresent("//input[@value='Login']");

			System.out.println("Step :: Verify Forgot Username ? Link");
			common.log("Step :: Verify Forgot Username ? Link");
			common.assertElementPresent("//a[@href='https://inv-01.qa.procurenetworks.com/auth/email']");

			System.out.println("Step :: Verify Forgot Password ? Link");
			common.log("Step :: Verify Forgot Password ? Link");
			common.assertElementPresent("//a[@href='https://inv-01.qa.procurenetworks.com/password/email']");

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(15);
			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(15);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			common.pause(15);
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: URL >> https://inv-02.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Verify Logo Image");
			common.log("Step :: Verify Logo Image");
			common.assertElementPresent(
					"//img[@src='https://inv-02.qa.procurenetworks.com/img/ProcureNetworks_flat.png']");
			common.pause(5);

			System.out.println("Step :: Verify Username field");
			common.log("Step :: Verify Username field");
			common.assertElementPresent("//input[@name='username']");

			System.out.println("Step :: Verify Password field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@name='password']");

			System.out.println("Step :: Verify Login Button");
			common.log("Step :: Verify Login Button");
			common.assertElementPresent("//input[@value='Login']");

			System.out.println("Step :: Verify Forgot Username ? Link");
			common.log("Step :: Verify Forgot Username ? Link");
			common.assertElementPresent("//a[@href='https://inv-02.qa.procurenetworks.com/auth/email']");

			System.out.println("Step :: Verify Forgot Password ? Link");
			common.log("Step :: Verify Forgot Password ? Link");
			common.assertElementPresent("//a[@href='https://inv-02.qa.procurenetworks.com/password/email']");
			common.pause(15);
			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("ADMIN");
			common.pause(15);
			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(15);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			common.pause(15);

		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: URL >> https://inv-03.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Verify Logo Image");
			common.log("Step :: Verify Logo Image");
			common.assertElementPresent(
					"//img[@src='https://inv-03.qa.procurenetworks.com/img/ProcureNetworks_flat.png']");
			common.pause(5);

			System.out.println("Step :: Verify Username field");
			common.log("Step :: Verify Username field");
			common.assertElementPresent("//input[@name='username']");

			System.out.println("Step :: Verify Password field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@name='password']");

			System.out.println("Step :: Verify Login Button");
			common.log("Step :: Verify Login Button");
			common.assertElementPresent("//input[@value='Login']");

			System.out.println("Step :: Verify Forgot Username ? Link");
			common.log("Step :: Verify Forgot Username ? Link");
			common.assertElementPresent("//a[@href='https://inv-03.qa.procurenetworks.com/auth/email']");

			System.out.println("Step :: Verify Forgot Password ? Link");
			common.log("Step :: Verify Forgot Password ? Link");
			common.assertElementPresent("//a[@href='https://inv-03.qa.procurenetworks.com/password/email']");

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(15);
			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(15);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			common.pause(15);
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: URL >> https://inv-04.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Verify Logo Image");
			common.log("Step :: Verify Logo Image");
			common.assertElementPresent(
					"//img[@src='https://inv-04.qa.procurenetworks.com/img/ProcureNetworks_flat.png']");
			common.pause(5);

			System.out.println("Step :: Verify Username field");
			common.log("Step :: Verify Username field");
			common.assertElementPresent("//input[@name='username']");

			System.out.println("Step :: Verify Password field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@name='password']");

			System.out.println("Step :: Verify Login Button");
			common.log("Step :: Verify Login Button");
			common.assertElementPresent("//input[@value='Login']");

			System.out.println("Step :: Verify Forgot Username ? Link");
			common.log("Step :: Verify Forgot Username ? Link");
			common.assertElementPresent("//a[@href='https://inv-04.qa.procurenetworks.com/auth/email']");

			System.out.println("Step :: Verify Forgot Password ? Link");
			common.log("Step :: Verify Forgot Password ? Link");
			common.assertElementPresent("//a[@href='https://inv-04.qa.procurenetworks.com/password/email']");

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(15);
			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(15);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			common.pause(15);

		}
	}

	/**
	 * Invalid Procure Login
	 * 
	 */

	public void Invalid_Procure_login()

	{
		if (PREURL.equals(preurl)) {
			String URL = "https://inv-pre.qa.procurenetworks.com/auth/login";
			String username = "admin123";
			String password = "admin";

			driver.get(URL);

			System.out.println("Step :: Open URL >> " + URL);
			common.log("Step :: Open URL >> " + URL);
			common.pause(20);

			// Verify_Login_Page_Elements(); // Verify All the Webpage Elements.

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(10);

			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(10);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Alert Message");
			common.log("Step :: Verify Alert Message");
			common.assertElementPresent("//div[@class='alert alert-danger']");

			String alert_msg = driver.findElement(By.xpath("//div[@class='alert alert-danger']//ul//li")).getText();
			System.out.println("Step :: Verify Alert Message >> " + alert_msg);
			common.log("Step :: Verify Alert Message >> " + alert_msg);
		} else if (INV01URL.equals(inv1)) {

			String URL = "https://inv-01.qa.procurenetworks.com/auth/login";
			String username = "admin123";
			String password = "admin";

			System.out.println("Step :: Open URL >> " + URL);
			common.log("Step :: Open URL >> " + URL);
			common.pause(20);

			// Verify_Login_Page_Elements(); // Verify All the Webpage Elements.

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(10);

			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(10);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Alert Message");
			common.log("Step :: Verify Alert Message");
			common.assertElementPresent("//div[@class='alert alert-danger']");

			String alert_msg = driver.findElement(By.xpath("//div[@class='alert alert-danger']//ul//li")).getText();
			System.out.println("Step :: Verify Alert Message >> " + alert_msg);
			common.log("Step :: Verify Alert Message >> " + alert_msg);

		} else if (INV02URL.equals(inv2)) {
			String URL = "https://inv-02.qa.procurenetworks.com/auth/login";
			String username = "admin123";
			String password = "admin";

			System.out.println("Step :: Open URL >> " + URL);
			common.log("Step :: Open URL >> " + URL);
			common.pause(20);

			// Verify_Login_Page_Elements(); // Verify All the Webpage Elements.

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(10);

			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(10);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Alert Message");
			common.log("Step :: Verify Alert Message");
			common.assertElementPresent("//div[@class='alert alert-danger']");

			String alert_msg = driver.findElement(By.xpath("//div[@class='alert alert-danger']//ul//li")).getText();
			System.out.println("Step :: Verify Alert Message >> " + alert_msg);
			common.log("Step :: Verify Alert Message >> " + alert_msg);
		}

		else if (INV03URL.equals(inv3)) {
			String URL = "https://inv-03.qa.procurenetworks.com/auth/login";
			String username = "admin123";
			String password = "admin";

			System.out.println("Step :: Open URL >> " + URL);
			common.log("Step :: Open URL >> " + URL);
			common.pause(20);

			// Verify_Login_Page_Elements(); // Verify All the Webpage Elements.

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(10);

			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(10);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Alert Message");
			common.log("Step :: Verify Alert Message");
			common.assertElementPresent("//div[@class='alert alert-danger']");

			String alert_msg = driver.findElement(By.xpath("//div[@class='alert alert-danger']//ul//li")).getText();
			System.out.println("Step :: Verify Alert Message >> " + alert_msg);
			common.log("Step :: Verify Alert Message >> " + alert_msg);
		}

		else if (INV04URL.equals(inv4)) {
			String URL = "https://inv-04.qa.procurenetworks.com/auth/login";
			String username = "admin123";
			String password = "admin";

			System.out.println("Step :: Open URL >> " + URL);
			common.log("Step :: Open URL >> " + URL);
			common.pause(20);

			// Verify_Login_Page_Elements(); // Verify All the Webpage Elements.

			System.out.println("Step :: Enter User Name >> " + username);
			common.log("Step :: Enter User Name >> " + username);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			common.pause(10);

			System.out.println("Step :: Enter Password >> " + password);
			common.log("Step :: Enter Password >> " + password);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			common.pause(10);

			System.out.println("Step :: Click on Login Button");
			common.log("Step :: Click on Login Button");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Alert Message");
			common.log("Step :: Verify Alert Message");
			common.assertElementPresent("//div[@class='alert alert-danger']");

			String alert_msg = driver.findElement(By.xpath("//div[@class='alert alert-danger']//ul//li")).getText();
			System.out.println("Step :: Verify Alert Message >> " + alert_msg);
			common.log("Step :: Verify Alert Message >> " + alert_msg);
		}

	}

	/**
	 * Search Assets
	 * 
	 */

	public void Search_Assets()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Enter Search Keyword");
			common.log("Step :: Enter Search Keyword");
			//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("AST1217938");
			common.pause(20);

			
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Enter Search Keyword");
			common.log("Step :: Enter Search Keyword");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Amazon");
			common.pause(20);

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Enter Search Keyword");
			common.log("Step :: Enter Search Keyword");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("AST1376892");
			common.pause(20);

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Enter Search Keyword");
			common.log("Step :: Enter Search Keyword");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Amazon");
			common.pause(20);

		
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Enter Search Keyword");
			common.log("Step :: Enter Search Keyword");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Amazon");
			common.pause(20);

			
		}
	}

	/**
	 * Create New Assets
	 * 
	 * @return
	 * @throws AWTException
	 */

	public String New_Asset(String assetcode) throws AWTException

	{

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: URL >> https://inv-pre.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: Click on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);
			common.pause(5);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);
			common.pause(5);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);
			common.pause(5);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);
			common.pause(5);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);
			common.pause(5);

			// Category Dropdown

			System.out.println("Step :: Click on Category Dropdown Arrow");
			common.log("Step :: Click on Category Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String Categoryname = driver
					.findElement(By.xpath("//label[text()='Category']//..//span[@class='selection']")).getText();
			System.out.println("Step :: Select Vendor >> " + Categoryname);
			common.log("Step :: Select Vendor >> " + Categoryname);
			common.pause(10);
			common.Scrollpage();
			// Vendor Dropdown

			System.out.println("Step :: Click on Vendor  Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String vendor = driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Vendor >> " + vendor);
			common.log("Step :: Select Vendor >> " + vendor);
			common.pause(10);

			// Site Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);
			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);

			String Site = driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Site >> " + Site);
			common.log("Step :: Select Site >> " + Site);
			common.pause(10);

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);
			common.pause(10);

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(15);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);
			common.pause(10);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);
			common.pause(20);

			common.Scrollpage();
			common.pause(10);

			// Depreciation Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();

			String Depreciation = driver
					.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.getText();
			System.out.println("Step :: Select Depreciation >> " + Depreciation);
			common.log("Step :: Select Depreciation >> " + Depreciation);
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			for (int i = 0; i < 10; i++) {

				if (common.isElementPresent("//h4[@class='modal-title'][text()='Warning!']")) {

					System.out.println("Step :: Click on Close Icon");
					common.log("Step :: Click on Close Icon");
					driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();
					common.pause(10);

					String assetcode2 = common.generateRandomNumber1();
					System.out.println("Step :: Enter Asset Code >> " + assetcode2);
					common.log("Step :: Enter Asset Code >> " + assetcode2);
					driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode2);

					System.out.println("Step :: Click on Save Button");
					common.log("Step :: Click on Save Button");
					driver.findElement(By.xpath("//button[@id='btn-save']")).click();
					common.pause(15);
					break;

				} else {
					System.out.println("Step :: New Asset Number");
					common.log("Step :: New Asset Number");
					break;
				}
			}

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: URL >> https://inv-01.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);
			common.pause(5);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);
			common.pause(5);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);
			common.pause(5);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);
			common.pause(5);

			// Category Dropdown

			System.out.println("Step :: Click on Category Dropdown Arrow");
			common.log("Step :: Click on Category Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String Categoryname = driver
					.findElement(By.xpath("//label[text()='Category']//..//span[@class='selection']")).getText();
			System.out.println("Step :: Select Vendor >> " + Categoryname);
			common.log("Step :: Select Vendor >> " + Categoryname);
			common.pause(10);
			common.Scrollpage();
			// Vendor Dropdown

			System.out.println("Step :: Click on Vendor  Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String vendor = driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Vendor >> " + vendor);
			common.log("Step :: Select Vendor >> " + vendor);
			common.pause(10);

			// Site Dropdown

			System.out.println("Step :: Click on Site Dropdown Arrow");
			common.log("Step :: Click on Site Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);
			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);

			String Site = driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Site >> " + Site);
			common.log("Step :: Select Site >> " + Site);
			common.pause(10);

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);
			common.pause(10);

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(15);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);
			common.pause(10);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);
			common.pause(20);

			common.Scrollpage();
			common.pause(10);

			// Depreciation Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Depreciation Class ']//..//span[@role='presentation']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();

			String Depreciation = driver
					.findElement(By.xpath("//label[text()='Depreciation Class ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Depreciation >> " + Depreciation);
			common.log("Step :: Select Depreciation >> " + Depreciation);
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			for (int i = 0; i < 10; i++) {

				if (common.isElementPresent("//h4[@class='modal-title'][text()='Warning!']")) {

					System.out.println("Step :: Click on Close Icon");
					common.log("Step :: Click on Close Icon");
					driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();
					common.pause(10);

					String assetcode2 = common.generateRandomNumber1();
					System.out.println("Step :: Enter Asset Code >> " + assetcode2);
					common.log("Step :: Enter Asset Code >> " + assetcode2);
					driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode2);

					System.out.println("Step :: Click on Save Button");
					common.log("Step :: Click on Save Button");
					driver.findElement(By.xpath("//button[@id='btn-save']")).click();
					common.pause(15);
					break;

				} else {
					System.out.println("Step :: New Asset Number");
					common.log("Step :: New Asset Number");
					break;
				}
			}
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: URL >> https://inv-02.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			
			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: Click on No product code check box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();
			
			
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);
			common.pause(5);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);
			common.pause(5);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);
			common.pause(5);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);
			common.pause(5);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);
			common.pause(5);

			// Category Dropdown

			System.out.println("Step :: Click on Category Dropdown Arrow");
			common.log("Step :: Click on Category Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String Categoryname = driver
					.findElement(By.xpath("//label[text()='Category']//..//span[@class='selection']")).getText();
			System.out.println("Step :: Select Vendor >> " + Categoryname);
			common.log("Step :: Select Vendor >> " + Categoryname);
			common.pause(10);
			common.Scrollpage();
			// Vendor Dropdown

			System.out.println("Step :: Click on Vendor  Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String vendor = driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Vendor >> " + vendor);
			common.log("Step :: Select Vendor >> " + vendor);
			common.pause(10);

			// Site Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);
			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);

			String Site = driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Site >> " + Site);
			common.log("Step :: Select Site >> " + Site);
			common.pause(10);

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);
			common.pause(10);

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(15);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);
			common.pause(10);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);
			common.pause(20);

			common.Scrollpage();
			common.pause(10);

			// Depreciation Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();

			String Depreciation = driver
					.findElement(By.xpath("//label[text()='Depreciation Class ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Depreciation >> " + Depreciation);
			common.log("Step :: Select Depreciation >> " + Depreciation);
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			for (int i = 0; i < 10; i++) {

				if (common.isElementPresent("//h4[@class='modal-title'][text()='Warning!']")) {

					System.out.println("Step :: Click on Close Icon");
					common.log("Step :: Click on Close Icon");
					driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();
					common.pause(10);

					String assetcode2 = common.generateRandomNumber1();
					System.out.println("Step :: Enter Asset Code >> " + assetcode2);
					common.log("Step :: Enter Asset Code >> " + assetcode2);
					driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode2);

					System.out.println("Step :: Click on Save Button");
					common.log("Step :: Click on Save Button");
					driver.findElement(By.xpath("//button[@id='btn-save']")).click();
					common.pause(15);
					break;

				} else {
					System.out.println("Step :: New Asset Number");
					common.log("Step :: New Asset Number");
					break;
				}
			}
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: URL >> https://inv-03.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: Click on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);
			common.pause(5);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);
			common.pause(5);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);
			common.pause(5);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);
			common.pause(5);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);
			common.pause(5);

			// Category Dropdown

			System.out.println("Step :: Click on Category Dropdown Arrow");
			common.log("Step :: Click on Category Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String Categoryname = driver
					.findElement(By.xpath("//label[text()='Category']//..//span[@class='selection']")).getText();
			System.out.println("Step :: Select Vendor >> " + Categoryname);
			common.log("Step :: Select Vendor >> " + Categoryname);
			common.pause(10);
			common.Scrollpage();
			// Vendor Dropdown

			System.out.println("Step :: Click on Vendor  Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String vendor = driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Vendor >> " + vendor);
			common.log("Step :: Select Vendor >> " + vendor);
			common.pause(10);

			// Site Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);
			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);

			String Site = driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Site >> " + Site);
			common.log("Step :: Select Site >> " + Site);
			common.pause(10);

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);
			common.pause(10);

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(15);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);
			common.pause(10);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);
			common.pause(20);

			common.Scrollpage();
			common.pause(10);

			// Depreciation Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();

			String Depreciation = driver
					.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.getText();
			System.out.println("Step :: Select Depreciation >> " + Depreciation);
			common.log("Step :: Select Depreciation >> " + Depreciation);
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			for (int i = 0; i < 10; i++) {

				if (common.isElementPresent("//h4[@class='modal-title'][text()='Warning!']")) {

					System.out.println("Step :: Click on Close Icon");
					common.log("Step :: Click on Close Icon");
					driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();
					common.pause(10);

					String assetcode2 = common.generateRandomNumber1();
					System.out.println("Step :: Enter Asset Code >> " + assetcode2);
					common.log("Step :: Enter Asset Code >> " + assetcode2);
					driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode2);

					System.out.println("Step :: Click on Save Button");
					common.log("Step :: Click on Save Button");
					driver.findElement(By.xpath("//button[@id='btn-save']")).click();
					common.pause(15);
					break;

				} else {
					System.out.println("Step :: New Asset Number");
					common.log("Step :: New Asset Number");
					break;
				}
			}

		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: URL >> https://inv-04.qa.procurenetworks.com/auth/login");

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);
			common.pause(5);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);
			common.pause(5);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);
			common.pause(5);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);
			common.pause(5);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);
			common.pause(5);

			// Category Dropdown

			System.out.println("Step :: Click on Category Dropdown Arrow");
			common.log("Step :: Click on Category Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String Categoryname = driver
					.findElement(By.xpath("//label[text()='Category']//..//span[@class='selection']")).getText();
			System.out.println("Step :: Select Vendor >> " + Categoryname);
			common.log("Step :: Select Vendor >> " + Categoryname);
			common.pause(10);
			common.Scrollpage();
			// Vendor Dropdown

			System.out.println("Step :: Click on Vendor  Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);
			String vendor = driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Vendor >> " + vendor);
			common.log("Step :: Select Vendor >> " + vendor);
			common.pause(10);

			// Site Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);
			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();
			common.pause(10);

			String Site = driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Site >> " + Site);
			common.log("Step :: Select Site >> " + Site);
			common.pause(10);

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);
			common.pause(10);

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(15);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);
			common.pause(10);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);
			common.pause(20);

			common.Scrollpage();
			common.pause(10);

			// Depreciation Dropdown

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Depreciation Class ']//..//span[@role='presentation']"))
					.click();
			common.pause(10);

			driver.findElement(By.xpath("//ul//li[@class='select2-results__option']//..//li[2]")).click();

			String Depreciation = driver
					.findElement(By.xpath("//label[text()='Depreciation Class ']//..//span[@class='selection']"))
					.getText();
			System.out.println("Step :: Select Depreciation >> " + Depreciation);
			common.log("Step :: Select Depreciation >> " + Depreciation);
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			for (int i = 0; i < 10; i++) {

				if (common.isElementPresent("//h4[@class='modal-title'][text()='Warning!']")) {

					System.out.println("Step :: Click on Close Icon");
					common.log("Step :: Click on Close Icon");
					driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();
					common.pause(10);

					String assetcode2 = common.generateRandomNumber1();
					System.out.println("Step :: Enter Asset Code >> " + assetcode2);
					common.log("Step :: Enter Asset Code >> " + assetcode2);
					driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode2);

					System.out.println("Step :: Click on Save Button");
					common.log("Step :: Click on Save Button");
					driver.findElement(By.xpath("//button[@id='btn-save']")).click();
					common.pause(15);
					break;

				} else {
					System.out.println("Step :: New Asset Number");
					common.log("Step :: New Asset Number");
					break;
				}
			}

		}
		return assetcode;

	}

	/**
	 * Search Created Assets
	 * 
	 */

	public void Search_Created_Asset(String assetcode)

	{
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Search tab");
			common.log("Step :: CLick on Search tab");
			driver.findElement(By.xpath("//a[@href='/assets']")).click();

			common.pause(20);
			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(50);


		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Search tab");
			common.log("Step :: CLick on Search tab");
			driver.findElement(By.xpath("//a[@href='/assets']")).click();

			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(50);


			

		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Search tab");
			common.log("Step :: CLick on Search tab");
			driver.findElement(By.xpath("//a[@href='/assets']")).click();

			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(50);

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Search tab");
			common.log("Step :: CLick on Search tab");
			driver.findElement(By.xpath("//a[@href='/assets']")).click();

			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(50);

			
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Search tab");
			common.log("Step :: CLick on Search tab");
			driver.findElement(By.xpath("//a[@href='/assets']")).click();

			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(50);

			
		}
	}

	/**
	 * Open Asset Search page dropdown list
	 * 
	 */
	public void Asset_Dropdown() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Asset search page Dropdown list");
			common.log("Step:: Open Asset search page Dropdown list");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			// verify table record
			System.out.println("Step :: Verify the record is 10 perpage");
			common.log("Step :: Verify recode is 10 per page");
			driver.findElement(By.xpath("//option[text()='10 per page']")).click();

			common.assertElementNotPresent("//table//tr[11]");

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Asset search page Dropdown list");
			common.log("Step:: Open Asset search page Dropdown list");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			// verify table record
			System.out.println("Step :: Verify the record is 10 perpage");
			common.log("Step :: Verify recode is 10 per page");
			driver.findElement(By.xpath("//option[text()='10 per page']")).click();

			common.assertElementNotPresent("//table//tr[11]");
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Open Asset search page Dropdown list");
			common.log("Step:: Open Asset search page Dropdown list");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			// verify table record
			System.out.println("Step :: Verify the record is 10 perpage");
			common.log("Step :: Verify recode is 10 per page");
			driver.findElement(By.xpath("//option[text()='10 per page']")).click();

			common.assertElementNotPresent("//table//tr[11]");

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Asset search page Dropdown list");
			common.log("Step:: Open Asset search page Dropdown list");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			// verify table record
			System.out.println("Step :: Verify the record is 10 perpage");
			common.log("Step :: Verify recode is 10 per page");
			driver.findElement(By.xpath("//option[text()='10 per page']")).click();

			common.assertElementNotPresent("//table//tr[11]");
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Open Asset search page Dropdown list");
			common.log("Step:: Open Asset search page Dropdown list");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			// verify table record
			System.out.println("Step :: Verify the record is 10 perpage");
			common.log("Step :: Verify recode is 10 per page");
			driver.findElement(By.xpath("//option[text()='10 per page']")).click();

			common.assertElementNotPresent("//table//tr[11]");
		}
	}

	/**
	 * Open Site dropdown list
	 */
	public void Asset_site() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Asset Site Dropdown list");
			common.log("Step :: Open Asser Site Dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			// Verify Asset site Search
			System.out.println("Step :: Enter the Search Keyword");
			common.log("Step :: Enter the Search keyword");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");
			

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Asset Site Dropdown list");
			common.log("Step :: Open Asser Site Dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			// Verify Asset site Search
			System.out.println("Step :: Enter the Search Keyword");
			common.log("Step :: Enter the Search keyword");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH - Anthem");

			

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Asset Site Dropdown list");
			common.log("Step :: Open Asser Site Dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			// Verify Asset site Search
			System.out.println("Step :: Enter the Search Keyword");
			common.log("Step :: Enter the Search keyword");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH - Anthem");


		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Asset Site Dropdown list");
			common.log("Step :: Open Asser Site Dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			// Verify Asset site Search
			System.out.println("Step :: Enter the Search Keyword");
			common.log("Step :: Enter the Search keyword");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");

		
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Asset Site Dropdown list");
			common.log("Step :: Open Asser Site Dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			// Verify Asset site Search
			System.out.println("Step :: Enter the Search Keyword");
			common.log("Step :: Enter the Search keyword");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");

	
		}
	}

	/**
	 * Verify Asset Search pagination
	 */

	public void Pagination() {
		// verify second page element present or not
		if (PREURL.equals(preurl)) {

			if (!common.isElementPresent("//div[@id='assets-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='assets-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			if (!common.isElementPresent("//div[@id='assets-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='assets-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {
			if (!common.isElementPresent("//div[@id='assets-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='assets-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='assets-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='assets-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//div[@id='assets-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='assets-table_paginate']//a[text()='2']")).click();
			}

		}

	}

	/**
	 * Verify Table checkbox
	 */
	public void Check_table() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Check Select all  table Checkbox");
			common.log("Step :: Check the Select all table CHeckbox");

			driver.findElement(By.xpath("//input[@class='group-checkable']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Check Select all  table Checkbox");
			common.log("Step :: Check the Select all table CHeckbox");

			driver.findElement(By.xpath("//input[@class='group-checkable']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Check Select all  table Checkbox");
			common.log("Step :: Check the Select all table CHeckbox");

			driver.findElement(By.xpath("//input[@class='group-checkable']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Check Select all  table Checkbox");
			common.log("Step :: Check the Select all table CHeckbox");

			driver.findElement(By.xpath("//input[@class='group-checkable']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Check Select all  table Checkbox");
			common.log("Step :: Check the Select all table CHeckbox");

			driver.findElement(By.xpath("//input[@class='group-checkable']")).click();
		}
	}

	/**
	 * Edit Created record
	 * 
	 */

	public void Edit_Created_Asset(String assetcode)

	{
		if (PREURL.equals(preurl)) {
			common.pause(50);
			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(30);

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input"))
					.click();
			common.pause(20);

			System.out.println("Step :: Check the Edit button of Asset Search page");
			common.log("Step :: Check the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(50);
			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(30);

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//td//a[text()='" + assetcode + "']//..//..//input[@type='checkbox']"))
					.click();
			common.pause(20);

			System.out.println("Step :: Check the Edit button of Asset Search page");
			common.log("Step :: Check the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			common.pause(50);
			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(30);

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//td//a[text()='" + assetcode + "']//..//..//input[@type='checkbox']"))
					.click();
			common.pause(20);

			System.out.println("Step :: Check the Edit button of Asset Search page");
			common.log("Step :: Check the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			common.pause(50);
			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(30);

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input"))
					.click();
			common.pause(20);

			System.out.println("Step :: Check the Edit button of Asset Search page");
			common.log("Step :: Check the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		} else if (INV04URL.equals(inv4)) {

			common.pause(50);
			System.out.println("Step :: Enter Search Keyword >> " + assetcode);
			common.log("Step :: Enter Search Keyword >> " + assetcode);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
			common.pause(30);

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//td//a[text()='" + assetcode + "']//..//..//input[@type='checkbox']"))
					.click();
			common.pause(20);

			System.out.println("Step :: Check the Edit button of Asset Search page");
			common.log("Step :: Check the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

		}

	}

	/**
	 * Edit Asset with two selected record
	 */
	public void Edit_TwoAsset() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit With Two Assets");
			common.log("Step :: Open Edit With Two Assets");
			common.pause(10);
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//table//tr[3]//input[@type='checkbox']")).click();
			common.pause(30);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Edit With Two Assets");
			common.log("Step :: Open Edit With Two Assets");
			common.pause(10);
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//table//tr[3]//input[@type='checkbox']")).click();
			common.pause(30);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Edit With Two Assets");
			common.log("Step :: Open Edit With Two Assets");
			common.pause(10);
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//table//tr[3]//input[@type='checkbox']")).click();
			common.pause(30);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		} else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Open Edit With Two Assets");
			common.log("Step :: Open Edit With Two Assets");
			common.pause(10);
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//table//tr[3]//input[@type='checkbox']")).click();
			common.pause(30);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Open Edit With Two Assets");
			common.log("Step :: Open Edit With Two Assets");
			common.pause(10);
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//table//tr[3]//input[@type='checkbox']")).click();
			common.pause(30);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		}

	}
	// input[@id='chkparent_asset_id']

	/**
	 * Edit Parent Asset of Edit Asset
	 */
	public void Edit_ParentAsset() {
		// check the Asset code from table
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();
		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);
			// Edit parent asset

			System.out.println("Step :: Edit Parent Asset ");
			common.log("Step:: Edit Parent Asset");
			driver.findElement(By.xpath("//input[@id='chkparent_asset_id']")).click();

			// click on Listbox of parent asset
			System.out.println("Step :: Click on Listbox of parent Asset");
			common.log("Step :: Click on Listbox of Parent Asset");

			driver.findElement(By.xpath("//span[@id='select2-parent_asset_id-container']")).click();

			// select item from list
			System.out.println("Step :: Select Item from listbox");
			common.log("Step :: Select item from listbox");
			driver.findElement(By.xpath("//ul[@id='select2-parent_asset_id-results']//li[3]")).click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);
			// Edit parent asset

			System.out.println("Step :: Edit Parent Asset ");
			common.log("Step:: Edit Parent Asset");
			driver.findElement(By.xpath("//input[@id='chkparent_asset_id']")).click();

			// click on Listbox of parent asset
			System.out.println("Step :: Click on Listbox of parent Asset");
			common.log("Step :: Click on Listbox of Parent Asset");

			driver.findElement(By.xpath("//span[@id='select2-parent_asset_id-container']")).click();

			// select item from list
			System.out.println("Step :: Select Item from listbox");
			common.log("Step :: Select item from listbox");
			driver.findElement(By.xpath("//ul[@id='select2-parent_asset_id-results']//li[3]")).click();
		}

		else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

		
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);
			// Edit parent asset

			System.out.println("Step :: Edit Parent Asset ");
			common.log("Step:: Edit Parent Asset");
			driver.findElement(By.xpath("//input[@id='chkparent_asset_id']")).click();

			// click on Listbox of parent asset
			System.out.println("Step :: Click on Listbox of parent Asset");
			common.log("Step :: Click on Listbox of Parent Asset");

			driver.findElement(By.xpath("//span[@id='select2-parent_asset_id-container']")).click();

			// select item from list
			System.out.println("Step :: Select Item from listbox");
			common.log("Step :: Select item from listbox");
			driver.findElement(By.xpath("//ul[@id='select2-parent_asset_id-results']//li[3]")).click();
		}

	}

	/**
	 * Edit Category of Asset
	 */

	public void Edit_Category() {
		// check the Asset code from table
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Edit Category of Asset

			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			// CLick on Listbox of category
			System.out.println("Step :: Click on Listbox of Category ");
			common.log("Step :: Click on Listvbox of Category");
			driver.findElement(By.xpath("//span[@id='select2-category_id-container']")).click();

			common.pause(20);
			// Select the item from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-category_id-results']//li[3]")).click();
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Edit Category of Asset

			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			// CLick on Listbox of category
			System.out.println("Step :: Click on Listbox of Category ");
			common.log("Step :: Click on Listvbox of Category");
			driver.findElement(By.xpath("//span[@id='select2-category_id-container']")).click();

			common.pause(20);
			// Select the item from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-category_id-results']//li[3]")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Edit Category of Asset

			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			// CLick on Listbox of category
			System.out.println("Step :: Click on Listbox of Category ");
			common.log("Step :: Click on Listvbox of Category");
			driver.findElement(By.xpath("//span[@id='select2-category_id-container']")).click();

			common.pause(20);
			// Select the item from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-category_id-results']//li[3]")).click();

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Edit Category of Asset

			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			// CLick on Listbox of category
			System.out.println("Step :: Click on Listbox of Category ");
			common.log("Step :: Click on Listvbox of Category");
			driver.findElement(By.xpath("//span[@id='select2-category_id-container']")).click();

			common.pause(20);
			// Select the item from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-category_id-results']//li[3]")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Edit Category of Asset

			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			// CLick on Listbox of category
			System.out.println("Step :: Click on Listbox of Category ");
			common.log("Step :: Click on Listvbox of Category");
			driver.findElement(By.xpath("//span[@id='select2-category_id-container']")).click();

			common.pause(20);
			// Select the item from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-category_id-results']//li[3]")).click();
		}

	}

	/**
	 * Edit Cost 31/08
	 */
	public void Cost()

	{
		// check the Asset code from table
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Cost Checkbox
			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@name='purchase_cost_check']")).click();

			// Enter Cost amount

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Model Name >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Cost Checkbox
			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@name='purchase_cost_check']")).click();

			// Enter Cost amount

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Model Name >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Cost Checkbox
			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@name='purchase_cost_check']")).click();

			// Enter Cost amount

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Model Name >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Cost Checkbox
			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@name='purchase_cost_check']")).click();

			// Enter Cost amount

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Model Name >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Cost Checkbox
			System.out.println("Step :: Edit Category of Asset");
			common.log("Step :: Edit Category of Asset");
			driver.findElement(By.xpath("//input[@name='purchase_cost_check']")).click();

			// Enter Cost amount

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Model Name >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);
		}

	}

	/**
	 * Edit Depreciation Class
	 */
	public void Depreciation_Class() {
		// check the Asset code from table

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on the Depreciation class checkbox

			System.out.println("Step :: Click on Depreciation class checkbox");
			common.log("Step :: Click on Depreciation class checkbox");
			driver.findElement(By.xpath("//input[@name='depreciation_class_id_check']")).click();

			// Click on Depreciation class listbox
			System.out.println("Step :: Click on Depreciation class list box");
			common.log("Step :: Click on Depreciation class list box");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']//..")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on the Depreciation class checkbox

			System.out.println("Step :: Click on Depreciation class checkbox");
			common.log("Step :: Click on Depreciation class checkbox");
			driver.findElement(By.xpath("//input[@name='depreciation_class_id_check']")).click();

			// Click on Depreciation class listbox
			System.out.println("Step :: Click on Depreciation class list box");
			common.log("Step :: Click on Depreciation class list box");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']//..")).click();

		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on the Depreciation class checkbox

			System.out.println("Step :: Click on Depreciation class checkbox");
			common.log("Step :: Click on Depreciation class checkbox");
			driver.findElement(By.xpath("//input[@name='depreciation_class_id_check']")).click();

			// Click on Depreciation class listbox
			System.out.println("Step :: Click on Depreciation class list box");
			common.log("Step :: Click on Depreciation class list box");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']//..")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on the Depreciation class checkbox

			System.out.println("Step :: Click on Depreciation class checkbox");
			common.log("Step :: Click on Depreciation class checkbox");
			driver.findElement(By.xpath("//input[@name='depreciation_class_id_check']")).click();

			// Click on Depreciation class listbox
			System.out.println("Step :: Click on Depreciation class list box");
			common.log("Step :: Click on Depreciation class list box");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']//..")).click();
		} else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on the Depreciation class checkbox

			System.out.println("Step :: Click on Depreciation class checkbox");
			common.log("Step :: Click on Depreciation class checkbox");
			driver.findElement(By.xpath("//input[@name='depreciation_class_id_check']")).click();

			// Click on Depreciation class listbox
			System.out.println("Step :: Click on Depreciation class list box");
			common.log("Step :: Click on Depreciation class list box");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']//..")).click();
		}

	}

	// input[@name='asset_model_code_check']

	/**
	 * Edit Asset Model
	 */
	public void ModelNumber() {
		// check the Asset code from table

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Asset Model Number

			System.out.println("Step :: Click on Asset Model number checkbox");
			common.log("Step :: Click on ASset Modelnumber checkbox");
			driver.findElement(By.xpath("// input[@name='asset_model_code_check']")).click();

			// Enter Model Number

			String ModelNumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Modelnumber >> " + ModelNumber);
			common.log("Step :: Enter Model Name >> " + ModelNumber);
			driver.findElement(By.xpath("//input[@name='asset_model_code']")).sendKeys(ModelNumber);

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Asset Modle Number

			System.out.println("Step :: Click on Asset Model number checkbox");
			common.log("Step :: Click on ASset Modelnumber checkbox");
			driver.findElement(By.xpath("// input[@name='asset_model_code_check']")).click();

			// Enter Model Number

			String ModelNumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Modelnumber >> " + ModelNumber);
			common.log("Step :: Enter Model Name >> " + ModelNumber);
			driver.findElement(By.xpath("//input[@name='asset_model_code']")).sendKeys(ModelNumber);
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Asset Model Number

			System.out.println("Step :: Click on Asset Model number checkbox");
			common.log("Step :: Click on ASset Modelnumber checkbox");
			driver.findElement(By.xpath("// input[@name='asset_model_code_check']")).click();

			// Enter Model Number

			String ModelNumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Modelnumber >> " + ModelNumber);
			common.log("Step :: Enter Model Name >> " + ModelNumber);
			driver.findElement(By.xpath("//input[@name='asset_model_code']")).sendKeys(ModelNumber);
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Asset Model Number

			System.out.println("Step :: Click on Asset Model number checkbox");
			common.log("Step :: Click on ASset Modelnumber checkbox");
			driver.findElement(By.xpath("// input[@name='asset_model_code_check']")).click();

			// Enter Model Number

			String ModelNumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Modelnumber >> " + ModelNumber);
			common.log("Step :: Enter Model Name >> " + ModelNumber);
			driver.findElement(By.xpath("//input[@name='asset_model_code']")).sendKeys(ModelNumber);
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Asset Model Number

			System.out.println("Step :: Click on Asset Model number checkbox");
			common.log("Step :: Click on ASset Modelnumber checkbox");
			driver.findElement(By.xpath("// input[@name='asset_model_code_check']")).click();

			// Enter Model Number

			String ModelNumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Modelnumber >> " + ModelNumber);
			common.log("Step :: Enter Model Name >> " + ModelNumber);
			driver.findElement(By.xpath("//input[@name='asset_model_code']")).sendKeys(ModelNumber);
		}
	}

	/**
	 * Edit Purchase date
	 * 
	 */
	public void PurchaseDate() {
		// check the Asset code from table
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Puchase date checkbox

			System.out.println("Step :: Click on Purchase date checkbox");
			common.log("Step :: Click on Purchase date checkbox");
			driver.findElement(By.xpath("//input[@name='purchase_date_check']")).click();

			// Click on Purchase datebox

			System.out.println("Step :: Click on Purchase date box");
			common.log("Click on Purchase Date box");
			driver.findElement(By.xpath("//input[@id='purchase_date']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Puchase date checkbox

			System.out.println("Step :: Click on Purchase date checkbox");
			common.log("Step :: Click on Purchase date checkbox");
			driver.findElement(By.xpath("//input[@name='purchase_date_check']")).click();

			// Click on Purchase datebox

			System.out.println("Step :: Click on Purchase date box");
			common.log("Click on Purchase Date box");
			driver.findElement(By.xpath("//input[@id='purchase_date']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Puchase date checkbox

			System.out.println("Step :: Click on Purchase date checkbox");
			common.log("Step :: Click on Purchase date checkbox");
			driver.findElement(By.xpath("//input[@name='purchase_date_check']")).click();

			// Click on Purchase datebox

			System.out.println("Step :: Click on Purchase date box");
			common.log("Click on Purchase Date box");
			driver.findElement(By.xpath("//input[@id='purchase_date']")).click();

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Puchase date checkbox

			System.out.println("Step :: Click on Purchase date checkbox");
			common.log("Step :: Click on Purchase date checkbox");
			driver.findElement(By.xpath("//input[@name='purchase_date_check']")).click();

			// Click on Purchase datebox

			System.out.println("Step :: Click on Purchase date box");
			common.log("Click on Purchase Date box");
			driver.findElement(By.xpath("//input[@id='purchase_date']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Puchase date checkbox

			System.out.println("Step :: Click on Purchase date checkbox");
			common.log("Step :: Click on Purchase date checkbox");
			driver.findElement(By.xpath("//input[@name='purchase_date_check']")).click();

			// Click on Purchase datebox

			System.out.println("Step :: Click on Purchase date box");
			common.log("Click on Purchase Date box");
			driver.findElement(By.xpath("//input[@id='purchase_date']")).click();

		}

	}

	// input[@name='company_id_check']
	/**
	 * check the vendor field
	 */
	public void Vendor() {
		// check the Asset code from table
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Vendor Checkbox

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Venndor checkbox");
			driver.findElement(By.xpath("// input[@name='company_id_check']")).click();

			// Click on Vendor Listbox
			System.out.println("Step :: Click on Vendor Listbox");
			common.log("Step :: Click on Vendor Listbox");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			// select vendor from list

			common.pause(10);
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[3]")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Vendor Checkbox

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Venndor checkbox");
			driver.findElement(By.xpath("// input[@name='company_id_check']")).click();

			// Click on Vendor Listbox
			System.out.println("Step :: Click on Vendor Listbox");
			common.log("Step :: Click on Vendor Listbox");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[3]")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Vendor Checkbox

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Venndor checkbox");
			driver.findElement(By.xpath("// input[@name='company_id_check']")).click();

			// Click on Vendor Listbox
			System.out.println("Step :: Click on Vendor Listbox");
			common.log("Step :: Click on Vendor Listbox");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			// select vendor from list

			common.pause(10);
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[3]")).click();

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Vendor Checkbox

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Venndor checkbox");
			driver.findElement(By.xpath("// input[@name='company_id_check']")).click();

			// Click on Vendor Listbox
			System.out.println("Step :: Click on Vendor Listbox");
			common.log("Step :: Click on Vendor Listbox");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			// select vendor from list

			common.pause(10);
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[3]")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Vendor Checkbox

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Venndor checkbox");
			driver.findElement(By.xpath("// input[@name='company_id_check']")).click();

			// Click on Vendor Listbox
			System.out.println("Step :: Click on Vendor Listbox");
			common.log("Step :: Click on Vendor Listbox");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			// select vendor from list

			common.pause(10);
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[3]")).click();

		}

	}

	/**
	 * Check the site field
	 */
	public void Site() {
		// check the Asset code from table
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Site Checkbox
			System.out.println("Step :: Click on Site checkbox");
			common.log("Step :: Click on Site checkbox");
			driver.findElement(By.xpath("//input[@id='chksite_id']")).click();

			// Click on Site listbox

			System.out.println("Step :: Click on Site List box");
			common.log("Step :: Click on Site List box");
			driver.findElement(By.xpath("//span[@id='select2-site_id-container']")).click();

			common.pause(10);
			// select site from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-site_id-results']//li[3]")).click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Site Checkbox
			System.out.println("Step :: Click on Site checkbox");
			common.log("Step :: Click on Site checkbox");
			driver.findElement(By.xpath("//input[@id='chksite_id']")).click();

			// Click on Site listbox

			System.out.println("Step :: Click on Site List box");
			common.log("Step :: Click on Site List box");
			driver.findElement(By.xpath("//span[@id='select2-site_id-container']")).click();

			common.pause(10);
			// select site from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-site_id-results']//li[3]")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Site Checkbox
			System.out.println("Step :: Click on Site checkbox");
			common.log("Step :: Click on Site checkbox");
			driver.findElement(By.xpath("//input[@id='chksite_id']")).click();

			// Click on Site listbox

			System.out.println("Step :: Click on Site List box");
			common.log("Step :: Click on Site List box");
			driver.findElement(By.xpath("//span[@id='select2-site_id-container']")).click();

			common.pause(10);
			// select site from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-site_id-results']//li[3]")).click();

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Site Checkbox
			System.out.println("Step :: Click on Site checkbox");
			common.log("Step :: Click on Site checkbox");
			driver.findElement(By.xpath("//input[@id='chksite_id']")).click();

			// Click on Site listbox

			System.out.println("Step :: Click on Site List box");
			common.log("Step :: Click on Site List box");
			driver.findElement(By.xpath("//span[@id='select2-site_id-container']")).click();

			common.pause(10);
			// select site from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-site_id-results']//li[3]")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);
			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// Click on Site Checkbox
			System.out.println("Step :: Click on Site checkbox");
			common.log("Step :: Click on Site checkbox");
			driver.findElement(By.xpath("//input[@id='chksite_id']")).click();

			// Click on Site listbox

			System.out.println("Step :: Click on Site List box");
			common.log("Step :: Click on Site List box");
			driver.findElement(By.xpath("//span[@id='select2-site_id-container']")).click();

			common.pause(10);
			// select site from list
			System.out.println("Step :: Select Item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-site_id-results']//li[3]")).click();

		}
	}

	/**
	 * Check Save button
	 */

	public void Save() {
		// check the Asset code from table
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Open Edit Assets");
			common.log("Step :: Open Edit With Two Assets");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button
			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}

	}

	/**
	 * Check the Cancel button
	 */

	public void Cancel() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Select Asset from table");
			common.log("Step :: Select Asset from table");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// click on cancel button
			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Select Asset from table");
			common.log("Step :: Select Asset from table");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// click on cancel button
			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Select Asset from table");
			common.log("Step :: Select Asset from table");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// click on cancel button
			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Select Asset from table");
			common.log("Step :: Select Asset from table");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// click on cancel button
			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Select Asset from table");
			common.log("Step :: Select Asset from table");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			// Click on Edit button

			System.out.println("Step :: Click on Edit button of Asset Search page");
			common.log("Step :: Click on the Edit button of Asset Search Page");
			driver.findElement(By.xpath("//input[@class='button edit-btn']")).click();

			common.pause(20);

			// click on cancel button
			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		}

	}

	/**
	 * Check Delete button of Asset Search
	 */

	public void Asset_Delete()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(20);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on Yes button of delete conformation");
			common.log("Step :: Click on Yes button of delete conformation");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

			common.pause(20);
			System.out.println("Step :: Verify Deleted Element not present");
			common.log("Step :: Verify Deleted Element not present");

		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(20);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on Yes button of delete conformation");
			common.log("Step :: Click on Yes button of delete conformation");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

			common.pause(20);
			System.out.println("Step :: Verify Deleted Element not present");
			common.log("Step :: Verify Deleted Element not present");
			common.assertElementPresent("//td[text()='No matching records found']");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(20);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on Yes button of delete conformation");
			common.log("Step :: Click on Yes button of delete conformation");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

			common.pause(20);
			System.out.println("Step :: Verify Deleted Element not present");
			common.log("Step :: Verify Deleted Element not present");
			common.assertElementPresent("//td[text()='No matching records found']");

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(20);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on Yes button of delete conformation");
			common.log("Step :: Click on Yes button of delete conformation");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

			common.pause(20);
			System.out.println("Step :: Verify Deleted Element not present");
			common.log("Step :: Verify Deleted Element not present");

		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(20);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on Yes button of delete conformation");
			common.log("Step :: Click on Yes button of delete conformation");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

			common.pause(20);
			System.out.println("Step :: Verify Deleted Element not present");
			common.log("Step :: Verify Deleted Element not present");

		}

	}

	/**
	 * Check No button of Delete conformation
	 */

	public void Asset_Delete_nobutton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on No button of delete conformation");
			common.log("Step :: Click on NO  button of delete conformation");
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on No button of delete conformation");
			common.log("Step :: Click on NO  button of delete conformation");
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on No button of delete conformation");
			common.log("Step :: Click on NO  button of delete conformation");
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on No button of delete conformation");
			common.log("Step :: Click on NO  button of delete conformation");
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Table value Checkbox");
			common.log("Step :: Click on Table value Checkbox");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='checkbox']")).click();
			common.pause(10);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()=' Delete ']")).click();

			common.pause(20);
			System.out.println("Step :: Click on No button of delete conformation");
			common.log("Step :: Click on NO  button of delete conformation");
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		}

	}

	/**
	 * Verify User Account page
	 * 
	 */

	public void User_Account()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Profile");
			common.log("Step :: Click on Admin Profile");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/user/profile']")).click();
			common.pause(50);
			System.out.println("Step :: Verify Profile Image");
			common.log("Step :: Verify Profile Image");
			common.assertElementPresent("//div[@id='dropzoneFileUpload']");

			System.out.println("Step :: Verify UserName Field");
			common.log("Step :: Verify UserName Field");
			common.assertElementPresent("//input[@id='u_name']");

			System.out.println("Step :: Verify First Name Field");
			common.log("Step :: Verify First Name Field");
			common.assertElementPresent("//input[@id='f_name']");

			System.out.println("Step :: Verify Last Name Field");
			common.log("Step :: Verify Last Name Field");
			common.assertElementPresent("//input[@id='l_name']");

			System.out.println("Step :: Verify Password Field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@id='password']");

			System.out.println("Step :: Verify Confirm Password Field");
			common.log("Step :: Verify Confirm Password Field");
			common.assertElementPresent("//input[@id='confirm_password']");

			System.out.println("Step :: Verify Email Field");
			common.log("Step :: Verify Email Field");
			common.assertElementPresent("//input[@id='email']");

			System.out.println("Step :: Verify Default Site Dropdown");
			common.log("Step :: Verify Default Site Dropdown");
			common.assertElementPresent("//span[@id='select2-site_id-container']");

			System.out.println("Step :: Verify User Role Dropdown");
			common.log("Step :: Verify User Role Dropdown");
			common.assertElementPresent("//span[@id='select2-user_role-container']");

			System.out.println("Step :: Verify  Active Checkbox");
			common.log("Step :: Verify Active Checkbox");
			common.assertElementPresent("//input[@id='active']");

			System.out.println("Step :: Verify  Category Manager Checkbox");
			common.log("Step :: Verify Category Manager Checkbox");
			common.assertElementPresent("//input[@id='categoryManager']");

			System.out.println("Step :: Verify  Site Manager Checkbox");
			common.log("Step :: Verify Site Manager Checkbox");
			common.assertElementPresent("//input[@id='locationManager']");
			
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Profile");
			common.log("Step :: Click on Admin Profile");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/user/profile']")).click();
			common.pause(50);
			System.out.println("Step :: Verify Profile Image");
			common.log("Step :: Verify Profile Image");
			common.assertElementPresent("//div[@id='dropzoneFileUpload']");

			System.out.println("Step :: Verify UserName Field");
			common.log("Step :: Verify UserName Field");
			common.assertElementPresent("//input[@id='u_name']");

			System.out.println("Step :: Verify First Name Field");
			common.log("Step :: Verify First Name Field");
			common.assertElementPresent("//input[@id='f_name']");

			System.out.println("Step :: Verify Last Name Field");
			common.log("Step :: Verify Last Name Field");
			common.assertElementPresent("//input[@id='l_name']");

			System.out.println("Step :: Verify Password Field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@id='password']");

			System.out.println("Step :: Verify Confirm Password Field");
			common.log("Step :: Verify Confirm Password Field");
			common.assertElementPresent("//input[@id='confirm_password']");

			System.out.println("Step :: Verify Email Field");
			common.log("Step :: Verify Email Field");
			common.assertElementPresent("//input[@id='email']");

			System.out.println("Step :: Verify Default Site Dropdown");
			common.log("Step :: Verify Default Site Dropdown");
			common.assertElementPresent("//span[@id='select2-site_id-container']");

			System.out.println("Step :: Verify User Role Dropdown");
			common.log("Step :: Verify User Role Dropdown");
			common.assertElementPresent("//span[@id='select2-user_role-container']");

			System.out.println("Step :: Verify  Active Checkbox");
			common.log("Step :: Verify Active Checkbox");
			common.assertElementPresent("//input[@id='active']");

			System.out.println("Step :: Verify  Category Manager Checkbox");
			common.log("Step :: Verify Category Manager Checkbox");
			common.assertElementPresent("//input[@id='categoryManager']");

			System.out.println("Step :: Verify  Site Manager Checkbox");
			common.log("Step :: Verify Site Manager Checkbox");
			common.assertElementPresent("//input[@id='locationManager']");

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Profile");
			common.log("Step :: Click on Admin Profile");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/user/profile']")).click();
			common.pause(50);
			System.out.println("Step :: Verify Profile Image");
			common.log("Step :: Verify Profile Image");
			common.assertElementPresent("//div[@id='dropzoneFileUpload']");

			System.out.println("Step :: Verify UserName Field");
			common.log("Step :: Verify UserName Field");
			common.assertElementPresent("//input[@id='u_name']");

			System.out.println("Step :: Verify First Name Field");
			common.log("Step :: Verify First Name Field");
			common.assertElementPresent("//input[@id='f_name']");

			System.out.println("Step :: Verify Last Name Field");
			common.log("Step :: Verify Last Name Field");
			common.assertElementPresent("//input[@id='l_name']");

			System.out.println("Step :: Verify Password Field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@id='password']");

			System.out.println("Step :: Verify Confirm Password Field");
			common.log("Step :: Verify Confirm Password Field");
			common.assertElementPresent("//input[@id='confirm_password']");

			System.out.println("Step :: Verify Email Field");
			common.log("Step :: Verify Email Field");
			common.assertElementPresent("//input[@id='email']");

			System.out.println("Step :: Verify Default Site Dropdown");
			common.log("Step :: Verify Default Site Dropdown");
			common.assertElementPresent("//span[@id='select2-site_id-container']");

			System.out.println("Step :: Verify User Role Dropdown");
			common.log("Step :: Verify User Role Dropdown");
			common.assertElementPresent("//span[@id='select2-user_role-container']");

			System.out.println("Step :: Verify  Active Checkbox");
			common.log("Step :: Verify Active Checkbox");
			common.assertElementPresent("//input[@id='active']");

			System.out.println("Step :: Verify  Category Manager Checkbox");
			common.log("Step :: Verify Category Manager Checkbox");
			common.assertElementPresent("//input[@id='categoryManager']");

			System.out.println("Step :: Verify  Site Manager Checkbox");
			common.log("Step :: Verify Site Manager Checkbox");
			common.assertElementPresent("//input[@id='locationManager']");

		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Profile");
			common.log("Step :: Click on Admin Profile");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/user/profile']")).click();
			common.pause(50);
			System.out.println("Step :: Verify Profile Image");
			common.log("Step :: Verify Profile Image");
			common.assertElementPresent("//div[@id='dropzoneFileUpload']");

			System.out.println("Step :: Verify UserName Field");
			common.log("Step :: Verify UserName Field");
			common.assertElementPresent("//input[@id='u_name']");

			System.out.println("Step :: Verify First Name Field");
			common.log("Step :: Verify First Name Field");
			common.assertElementPresent("//input[@id='f_name']");

			System.out.println("Step :: Verify Last Name Field");
			common.log("Step :: Verify Last Name Field");
			common.assertElementPresent("//input[@id='l_name']");

			System.out.println("Step :: Verify Password Field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@id='password']");

			System.out.println("Step :: Verify Confirm Password Field");
			common.log("Step :: Verify Confirm Password Field");
			common.assertElementPresent("//input[@id='confirm_password']");

			System.out.println("Step :: Verify Email Field");
			common.log("Step :: Verify Email Field");
			common.assertElementPresent("//input[@id='email']");

			System.out.println("Step :: Verify Default Site Dropdown");
			common.log("Step :: Verify Default Site Dropdown");
			common.assertElementPresent("//span[@id='select2-site_id-container']");

			System.out.println("Step :: Verify User Role Dropdown");
			common.log("Step :: Verify User Role Dropdown");
			common.assertElementPresent("//span[@id='select2-user_role-container']");

			System.out.println("Step :: Verify  Active Checkbox");
			common.log("Step :: Verify Active Checkbox");
			common.assertElementPresent("//input[@id='active']");

			System.out.println("Step :: Verify  Category Manager Checkbox");
			common.log("Step :: Verify Category Manager Checkbox");
			common.assertElementPresent("//input[@id='categoryManager']");

			System.out.println("Step :: Verify  Site Manager Checkbox");
			common.log("Step :: Verify Site Manager Checkbox");
			common.assertElementPresent("//input[@id='locationManager']");
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Profile");
			common.log("Step :: Click on Admin Profile");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/user/profile']")).click();
			common.pause(50);
			System.out.println("Step :: Verify Profile Image");
			common.log("Step :: Verify Profile Image");
			common.assertElementPresent("//div[@id='dropzoneFileUpload']");

			System.out.println("Step :: Verify UserName Field");
			common.log("Step :: Verify UserName Field");
			common.assertElementPresent("//input[@id='u_name']");

			System.out.println("Step :: Verify First Name Field");
			common.log("Step :: Verify First Name Field");
			common.assertElementPresent("//input[@id='f_name']");

			System.out.println("Step :: Verify Last Name Field");
			common.log("Step :: Verify Last Name Field");
			common.assertElementPresent("//input[@id='l_name']");

			System.out.println("Step :: Verify Password Field");
			common.log("Step :: Verify Password Field");
			common.assertElementPresent("//input[@id='password']");

			System.out.println("Step :: Verify Confirm Password Field");
			common.log("Step :: Verify Confirm Password Field");
			common.assertElementPresent("//input[@id='confirm_password']");

			System.out.println("Step :: Verify Email Field");
			common.log("Step :: Verify Email Field");
			common.assertElementPresent("//input[@id='email']");

			System.out.println("Step :: Verify Default Site Dropdown");
			common.log("Step :: Verify Default Site Dropdown");
			common.assertElementPresent("//span[@id='select2-site_id-container']");

			System.out.println("Step :: Verify User Role Dropdown");
			common.log("Step :: Verify User Role Dropdown");
			common.assertElementPresent("//span[@id='select2-user_role-container']");

			System.out.println("Step :: Verify  Active Checkbox");
			common.log("Step :: Verify Active Checkbox");
			common.assertElementPresent("//input[@id='active']");

			System.out.println("Step :: Verify  Category Manager Checkbox");
			common.log("Step :: Verify Category Manager Checkbox");
			common.assertElementPresent("//input[@id='categoryManager']");

			System.out.println("Step :: Verify  Site Manager Checkbox");
			common.log("Step :: Verify Site Manager Checkbox");
			common.assertElementPresent("//input[@id='locationManager']");
		}

	}

	/**
	 * Verify User Lotout
	 * 
	 */

	public void User_Logout()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Logout Button");
			common.log("Step :: Click on Admin LogOut Button");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/auth/logout']")).click();
			common.pause(20);
			common.pause(20);
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Logout Button");
			common.log("Step :: Click on Admin LogOut Button");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/auth/logout']")).click();
			common.pause(20);
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Logout Button");
			common.log("Step :: Click on Admin LogOut Button");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/auth/logout']")).click();
			common.pause(20);
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Logout Button");
			common.log("Step :: Click on Admin LogOut Button");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/auth/logout']")).click();
			common.pause(20);
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Admin Dropdown");
			common.log("Step :: Click on Admin Dropdown");
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Admin Logout Button");
			common.log("Step :: Click on Admin LogOut Button");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/auth/logout']")).click();
			common.pause(20);
		}

	}

	/**
	 * Verify User Asset Code Validation
	 * 
	 */

	public void AssetCode_Validation()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
			
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

		}

	}

	/**
	 * Verify User Model Validation
	 * 
	 */

	public void Model_Validation()

	{

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Category");
			common.log("Step :: Select Category");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
			
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Category");
			common.log("Step :: Select Category");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Category");
			common.log("Step :: Select Category");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Category");
			common.log("Step :: Select Category");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Category");
			common.log("Step :: Select Category");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

		}

	}

	/**
	 * Verify User Model number Validation
	 * 
	 */

	public void Model_Number_Validation()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Advertising");
			common.log("Step :: Select Advertising");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Advertising");
			common.log("Step :: Select Advertising");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Advertising");
			common.log("Step :: Select Advertising");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Advertising");
			common.log("Step :: Select Advertising");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(30);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Advertising");
			common.log("Step :: Select Advertising");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");

		}

	}

	/**
	 * Vendor Validation
	 * 
	 * @throws AWTException
	 */

	public void Vendor_Validation() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			common.pause(5);
			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Select Site");
			common.log("Step :: Select Site");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			common.pause(5);
			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			common.pause(5);
			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			common.pause(5);
			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Select Site");
			common.log("Step :: Select Site");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			common.pause(5);
			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");

		}
	}

	/**
	 * Site Validation
	 * 
	 * @throws AWTException
	 */

	public void Site_Validation() throws AWTException

	{

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//span[@id='select2-depreciation_class_id-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			

		}

		else if (INV04URL.equals(inv4))

		{

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(10);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();
			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);
			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(
					By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Straight Line 60 Months");
			common.log("Step :: Select Straight Line 60 Months");
			driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		}
	}

	/**
	 * Depreciation Class
	 * 
	 * @throws AWTException
	 */

	public void Depreciation_Class_Validation() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(50);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(50);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(50);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Adult Ministries']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='USPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(50);

			System.out.println("Step :: Click on No product code check box");
			common.log("Step :: CLick on No product code chekc box");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

		
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(50);

			String assetcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Asset Code >> " + assetcode);
			common.log("Step :: Enter Asset Code >> " + assetcode);
			driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title Name >> " + title);
			common.log("Step :: Enter Title Name >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			String modelname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model Name >> " + modelname);
			common.log("Step :: Enter Model Name >> " + modelname);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

			String modelcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Model Code >> " + modelcode);
			common.log("Step :: Enter Model Code >> " + modelcode);
			driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

			String serialnumber = common.generateRandomNumber1();
			System.out.println("Step :: Enter Serial Number >> " + serialnumber);
			common.log("Step :: Enter Serial Number >> " + serialnumber);
			driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);
			common.Scrollpage();

			System.out.println("Step :: Select Adult Ministries");
			common.log("Step :: Select Adult Ministries");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			String desc = common.generateRandomChars(100);
			System.out.println("Step :: Enter Description >> " + desc);
			common.log("Step :: Enter Description >> " + desc);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Vendor");
			common.log("Step :: Select Vendor");
			driver.findElement(By.xpath("//li[text()='UPS']")).click();

			String brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + brand);
			common.log("Step :: Enter Brand >> " + brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

			System.out.println("Step :: Click on Dropdown Arrow");
			common.log("Step :: Click on Dropdown Arrow");
			driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select ATH");
			common.log("Step :: Select ATH");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter Quantity >> " + quantity);
			common.log("Step :: Enter Quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter Cost >> " + cost);
			common.log("Step :: Enter Cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

			common.Scrollpage();
			common.pause(10);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//button[@id='btn-save']")).click();
			common.pause(15);

			common.assertElementPresent("//div[@id='errorsBox']//div//ul//li");
			System.out.println("Step :: Verify Error Message Present");
			common.log("Step :: Verify Error Message Present");
		}
	}

	/**
	 * Create New Asset With Image
	 * 
	 * @return
	 * @throws AWTException
	 */

	public String Asset_Image_Upload() throws AWTException

	{
		System.out.println("Step :: Click on New");
		common.log("Step :: Click on New");
		driver.findElement(By.xpath("//li//a[text()='New']")).click();
		common.pause(10);

		String assetcode = common.generateRandomNumber1();
		System.out.println("Step :: Enter Asset Code >> " + assetcode);
		common.log("Step :: Enter Asset Code >> " + assetcode);
		driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode);

		String modelname = common.generateRandomChars(5);
		System.out.println("Step :: Enter Model Name >> " + modelname);
		common.log("Step :: Enter Model Name >> " + modelname);
		driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(modelname);

		String modelcode = common.generateRandomNumber1();
		System.out.println("Step :: Enter Model Code >> " + modelcode);
		common.log("Step :: Enter Model Code >> " + modelcode);
		driver.findElement(By.xpath("//input[@id='asset_model_code']")).sendKeys(modelcode);

		String serialnumber = common.generateRandomNumber1();
		System.out.println("Step :: Enter Serial Number >> " + serialnumber);
		common.log("Step :: Enter Serial Number >> " + serialnumber);
		driver.findElement(By.xpath("//input[@id='serial_number']")).sendKeys(serialnumber);

		System.out.println("Step :: Click on Dropdown Arrow");
		common.log("Step :: Click on Dropdown Arrow");
		driver.findElement(By.xpath("//label[text()='Category']//..//span[@class='select2-selection__arrow']")).click();
		common.pause(5);

		System.out.println("Step :: Select Advertising");
		common.log("Step :: Select Advertising");
		driver.findElement(By.xpath("//li[text()='Advertising']")).click();

		String desc = common.generateRandomChars(100);
		System.out.println("Step :: Enter Description >> " + desc);
		common.log("Step :: Enter Description >> " + desc);
		driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(desc);

		System.out.println("Step :: Click on Dropdown Arrow");
		common.log("Step :: Click on Dropdown Arrow");
		driver.findElement(By.xpath("//label[text()='Vendor ']//..//span[@class='select2-selection__arrow']")).click();
		common.pause(5);

		System.out.println("Step :: Select Vendor");
		common.log("Step :: Select Vendor");
		driver.findElement(By.xpath("//li[text()='UPS']")).click();

		String brand = common.generateRandomChars(5);
		System.out.println("Step :: Enter Brand >> " + brand);
		common.log("Step :: Enter Brand >> " + brand);
		driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(brand);

		System.out.println("Step :: Click on Dropdown Arrow");
		common.log("Step :: Click on Dropdown Arrow");
		driver.findElement(By.xpath("//label[text()='Site ']//..//span[@class='select2-selection__arrow']")).click();
		common.pause(5);

		System.out.println("Step :: Select ATH");
		common.log("Step :: Select ATH");
		driver.findElement(By.xpath("//li[text()='ATH']")).click();

		String quantity = common.generateRandomNumber1();
		System.out.println("Step :: Enter Quantity >> " + quantity);
		common.log("Step :: Enter Quantity >> " + quantity);
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

		String cost = common.generateRandomNumber1();
		System.out.println("Step :: Enter Cost >> " + cost);
		common.log("Step :: Enter Cost >> " + cost);
		driver.findElement(By.xpath("//input[@id='purchase_cost']")).sendKeys(cost);

		common.Scrollpage();
		common.pause(10);

		System.out.println("Step :: Click on Dropdown Arrow");
		common.log("Step :: Click on Dropdown Arrow");
		driver.findElement(
				By.xpath("//span[@id='select2-depreciation_class_id-container']")).click();
		common.pause(5);

		System.out.println("Step :: Select Depreciation class");
		common.log("Step :: Select  Depreciation class");
		driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

		System.out.println("Step :: Click on upload image");
		common.log("Step :: Click on upload image");
		driver.findElement(By.xpath("//div[@id='dropzoneFileUpload']")).click();
		common.pause(20);

		String path = "C:\\Users\\Rahul\\Pictures\\download.jpg";

		StringSelection filepath = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		Robot robot2 = new Robot();
		robot2.delay(20);

		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);

		common.pause(20);

		System.out.println("Step :: Verify Image");
		common.log("Step :: Verifuy Image");
		// common.assertElementPresent("//img[@class='img-responsive a-thumb']");

		System.out.println("Step :: Click on Save Button");
		common.log("Step :: Click on Save Button");
		driver.findElement(By.xpath("//button[@id='btn-save']")).click();
		common.pause(15);

		for (int i = 0; i < 10; i++) {

			if (common.isElementPresent("//h4[@class='modal-title'][text()='Warning!']")) {

				System.out.println("Step :: Click on Close Icon");
				common.log("Step :: Click on Close Icon");
				driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();
				common.pause(10);

				String assetcode1 = common.generateRandomNumber1();
				System.out.println("Step :: Enter Asset Code >> " + assetcode1);
				common.log("Step :: Enter Asset Code >> " + assetcode1);
				driver.findElement(By.xpath("//input[@id='asset_code']")).sendKeys(assetcode1);

				System.out.println("Step :: Click on Save Button");
				common.log("Step :: Click on Save Button");
				driver.findElement(By.xpath("//button[@id='btn-save']")).click();
				common.pause(15);
				break;

			} else {
				System.out.println("Step :: New Asset Number");
				common.log("Step :: New Asset Number");
				break;
			}

		}

		return assetcode;
	}

	/**
	 * Verify Cancel
	 * 
	 */

	public void Verify_Cancel()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/assets']")).click();
			common.pause(40);

			System.out.println("Step :: Search Box Dispaly");
			common.log("Step :: Search Box Display");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(20);

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/assets']")).click();
			common.pause(40);

			System.out.println("Step :: Search Box Dispaly");
			common.log("Step :: Search Box Display");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(20);

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/assets']")).click();
			common.pause(40);

			System.out.println("Step :: Search Box Dispaly");
			common.log("Step :: Search Box Display");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/assets']")).click();
			common.pause(40);

			System.out.println("Step :: Search Box Dispaly");
			common.log("Step :: Search Box Display");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on New");
			common.log("Step :: Click on New");
			driver.findElement(By.xpath("//li//a[text()='New']")).click();
			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/assets']")).click();
			common.pause(40);

			System.out.println("Step :: Search Box Dispaly");
			common.log("Step :: Search Box Display");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");

		}
	}

	/**
	 * Move Assets
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Move_Assets() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Asset Code Searchbox");
			common.log("Step :: Verify Asset Code Searchbox");
			common.assertElementPresent("//input[@id='searchItm']");

			System.out.println("Step :: Verify Source Dropdown");
			common.log("Step :: Verify Source Dropdown");
			common.assertElementPresent("//span[@id='select2-source_loct_site-container']");

			System.out.println("Step :: Verify Destination Dropdown");
			common.log("Step :: Verify Destiantion Dropdown");
			common.assertElementPresent("//span[@id='select2-move_to_site-container']");

		
			System.out.println("Step :: Verify Quantity Field");
			common.log("Step :: Verify Qunatity Filed");
			common.assertElementPresent("//input[@id='txtQuantity']");
			
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Asset Code Searchbox");
			common.log("Step :: Verify Asset Code Searchbox");
			common.assertElementPresent("//input[@id='searchItm']");

			System.out.println("Step :: Verify Source Dropdown");
			common.log("Step :: Verify Source Dropdown");
			common.assertElementPresent("//span[@id='select2-source_loct_site-container']");

			System.out.println("Step :: Verify Destination Dropdown");
			common.log("Step :: Verify Destiantion Dropdown");
			common.assertElementPresent("//span[@id='select2-move_to_site-container']");

			System.out.println("Step :: Verify Department Dropdown");
			common.log("Step :: Verify Department Dropdown");
			common.assertElementPresent("//span[@id='select2-department_id-container']");

			System.out.println("Step :: Verify Quantity Field");
			common.log("Step :: Verify Qunatity Filed");
			common.assertElementPresent("//input[@id='txtQuantity']");
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Asset Code Searchbox");
			common.log("Step :: Verify Asset Code Searchbox");
			common.assertElementPresent("//input[@id='searchItm']");

			System.out.println("Step :: Verify Source Dropdown");
			common.log("Step :: Verify Source Dropdown");
			common.assertElementPresent("//span[@id='select2-source_loct_site-container']");

			System.out.println("Step :: Verify Destination Dropdown");
			common.log("Step :: Verify Destiantion Dropdown");
			common.assertElementPresent("//span[@id='select2-move_to_site-container']");

			System.out.println("Step :: Verify Department Dropdown");
			common.log("Step :: Verify Department Dropdown");
			common.assertElementPresent("//span[@id='select2-department_id-container']");

			System.out.println("Step :: Verify Quantity Field");
			common.log("Step :: Verify Qunatity Filed");
			common.assertElementPresent("//input[@id='txtQuantity']");
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Asset Code Searchbox");
			common.log("Step :: Verify Asset Code Searchbox");
			common.assertElementPresent("//input[@id='searchItm']");

			System.out.println("Step :: Verify Source Dropdown");
			common.log("Step :: Verify Source Dropdown");
			common.assertElementPresent("//span[@id='select2-source_loct_site-container']");

			System.out.println("Step :: Verify Destination Dropdown");
			common.log("Step :: Verify Destiantion Dropdown");
			common.assertElementPresent("//span[@id='select2-move_to_site-container']");

		
			System.out.println("Step :: Verify Quantity Field");
			common.log("Step :: Verify Qunatity Filed");
			common.assertElementPresent("//input[@id='txtQuantity']");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Verify Asset Code Searchbox");
			common.log("Step :: Verify Asset Code Searchbox");
			common.assertElementPresent("//input[@id='searchItm']");

			System.out.println("Step :: Verify Source Dropdown");
			common.log("Step :: Verify Source Dropdown");
			common.assertElementPresent("//span[@id='select2-source_loct_site-container']");

			System.out.println("Step :: Verify Destination Dropdown");
			common.log("Step :: Verify Destiantion Dropdown");
			common.assertElementPresent("//span[@id='select2-move_to_site-container']");

			System.out.println("Step :: Verify Department Dropdown");
			common.log("Step :: Verify Department Dropdown");
			common.assertElementPresent("//span[@id='select2-department_id-container']");

			System.out.println("Step :: Verify Quantity Field");
			common.log("Step :: Verify Qunatity Filed");
			common.assertElementPresent("//input[@id='txtQuantity']");

		}

	}

	/**
	 * Move Assets Search Box
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Move_Assets_Searchbox() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");

			System.out.println("Step :: Click on Close Button");
			common.log("Step :: Click on Close Button");
			driver.findElement(By.xpath("//button[@class='close']")).click();
			
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");

			System.out.println("Step :: Click on Close Button");
			common.log("Step :: Click on Close Button");
			driver.findElement(By.xpath("//button[@class='close']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");

			System.out.println("Step :: Click on Close Button");
			common.log("Step :: Click on Close Button");
			driver.findElement(By.xpath("//button[@class='close']")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");

			System.out.println("Step :: Click on Close Button");
			common.log("Step :: Click on Close Button");
			driver.findElement(By.xpath("//button[@class='close']")).click();
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");

			System.out.println("Step :: Click on Close Button");
			common.log("Step :: Click on Close Button");
			driver.findElement(By.xpath("//button[@class='close']")).click();
		}

	}

	/**
	 * Search Invalid Value in Asset Move
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Move_Assets_Invalid_Value_Search() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("123465ee789");
			common.pause(10);

			System.out.println("Step :: Verify Element not present");
			common.log("Step :: Verify Element not present");
			common.assertElementPresent("//td[text()='No matching records found']");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("123465ee789");
			common.pause(10);

			System.out.println("Step :: Verify Element not present");
			common.log("Step :: Verify Element not present");
			common.assertElementPresent("//td[text()='No matching records found']");
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("123465ee789");
			common.pause(10);

			System.out.println("Step :: Verify Element not present");
			common.log("Step :: Verify Element not present");
			common.assertElementPresent("//td[text()='No matching records found']");
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("123465ee789");
			common.pause(10);

			System.out.println("Step :: Verify Element not present");
			common.log("Step :: Verify Element not present");
			common.assertElementPresent("//td[text()='No matching records found']");
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("123465ee789");
			common.pause(10);

			System.out.println("Step :: Verify Element not present");
			common.log("Step :: Verify Element not present");
			common.assertElementPresent("//td[text()='No matching records found']");
		}
	}

	/**
	 * Search Valid Value in Asset Move
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Move_Assets_Valid_Value_Search() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(Assetcode);
			common.pause(10);

			System.out.println("Step :: Verify Element present");
			common.log("Step :: Verify Element present");
			common.assertElementPresent("//table//td//a[text()='" + Assetcode + "']");
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(Assetcode);
			common.pause(10);

			System.out.println("Step :: Verify Element present");
			common.log("Step :: Verify Element present");
			common.assertElementPresent("//table//td//a[text()='" + Assetcode + "']");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);

			System.out.println("Step :: Enter Search Value");
			common.log("Step :: Enter Search Value");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(Assetcode);
			common.pause(10);

			System.out.println("Step :: Verify Element present");
			common.log("Step :: Verify Element present");
			common.assertElementPresent("//table//td//a[text()='" + Assetcode + "']");
		}
	}

	/**
	 * Add Asset Values from Search
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Add_Asset_Values_Search() throws AWTException

	{
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	}

	/**
	 * Source Dropdown
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Move_Source_Dropdown() throws AWTException

	{
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD']")).click();
			common.pause(10);
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH - Anthem");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();
			common.pause(10);
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH - Anthem");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();
			common.pause(10);
		}
	}

	/**
	 * Destination Dropdown
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Move_Destination_Dropdown() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Destination ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD']")).click();
			common.pause(10);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Destination ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD - Avondale Value");
			common.log("Step :: Click on AVD - Avondale Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD - Avondale");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD - Avondale']")).click();
			common.pause(10);
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Destination ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD - Avondale Value");
			common.log("Step :: Click on AVD - Avondale Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD - Avondale");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD - Avondale']")).click();
			common.pause(10);
		}

	}

	/**
	 * Department Dropdown
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Move_Department_DropDown() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Department Dropdown");
			common.log("Step :: Click on Department Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on Balance Sheet Value");
			common.log("Step :: Click on Balance Sheet Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Balance");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='Balance Sheet']")).click();
			common.pause(10);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Department Dropdown");
			common.log("Step :: Click on Department Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on IT Value");
			common.log("Step :: Click on IT Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("IT");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='IT']")).click();
			common.pause(10);
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Department Dropdown");
			common.log("Step :: Click on Department Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on IT Value");
			common.log("Step :: Click on IT Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("IT");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='IT']")).click();
			common.pause(10);
		}

	}

	/**
	 * Enter Quantity
	 * 
	 */

	public void Move_Enter_Quantity() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");

			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move");
			common.log("Step :: Click on Move");
			driver.findElement(By.xpath("//li//a[text()='Move']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
		}

	}

	/**
	 * Move Asset Cancel button
	 * 
	 * @throws AWTException
	 * 
	 */

	public void Verify_MoveAsset_Cancel_Button() throws AWTException {

		if (PREURL.equals(preurl))

		{
			Add_Asset_Values_Search();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Destination ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on Balance Sheet Value");
			common.log("Step :: Click on Balance Sheet Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Balance");
			common.pause(5);

			driver.findElement(By.xpath("//li[text()='Balance Sheet']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
			common.pause(20);

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//input[@value='Cancel']")).click();
		} else if (INV01URL.equals(inv1)) {
			Add_Asset_Values_Search();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on East Valley Value");
			common.log("Step :: Click on East Valley Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("East Valley");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='East Valley']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Destination Dropdown");
			common.log("Step :: Click on Destination Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on IT Value");
			common.log("Step :: Click on IT Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("IT");
			common.pause(5);

			driver.findElement(By.xpath("//li[text()='IT']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
			common.pause(20);

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//input[@value='Cancel']")).click();
		} else if (INV02URL.equals(inv2)) {
			Add_Asset_Values_Search();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on ATH - Anthem Value");
			common.log("Step :: Click on ATH - Anthem Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH - Anthem");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Destination Dropdown");
			common.log("Step :: Click on Destination Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on IT Value");
			common.log("Step :: Click on IT Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("IT");
			common.pause(5);

			driver.findElement(By.xpath("//li[text()='IT']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
			common.pause(20);

			System.out.println("Step :: Click on Cancel Button");
			common.log("Step :: Click on Cancel Button");
			driver.findElement(By.xpath("//input[@value='Cancel']")).click();
		}

	}

	/**
	 * Move Asset Save button
	 * 
	 * @throws AWTException
	 * 
	 */

	public void Verify_MoveAsset_Save_Button() throws AWTException {

		if (PREURL.equals(preurl)) {
			Add_Asset_Values_Search();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Destination ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on Balance Sheet Value");
			common.log("Step :: Click on Balance Sheet Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Balance");
			common.pause(5);

			driver.findElement(By.xpath("//li[text()='Balance Sheet']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
			common.pause(20);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			Add_Asset_Values_Search();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on East Valley Value");
			common.log("Step :: Click on East Valley Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("East Valley");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='East Valley']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Destination Dropdown");
			common.log("Step :: Click on Destination Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on IT Value");
			common.log("Step :: Click on IT Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("IT");
			common.pause(5);

			driver.findElement(By.xpath("//li[text()='IT']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
			common.pause(20);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		} else if (INV02URL.equals(inv2)) {
			Add_Asset_Values_Search();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on ATH - Anthem Value");
			common.log("Step :: Click on ATH - Anthem Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH - Anthem");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Destination Dropdown");
			common.log("Step :: Click on Destination Dropdown");
			driver.findElement(By.xpath("//label[text()=' Department']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on IT Value");
			common.log("Step :: Click on IT Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("IT");
			common.pause(5);

			driver.findElement(By.xpath("//li[text()='IT']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Quanity");
			common.log("Step :: Enter Qunaity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("50");
			common.pause(20);

			System.out.println("Step :: Click on Save Button");
			common.log("Step :: Click on Save Button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

	}

	/**
	 * Remove Asset Values from Search
	 * 
	 * @return
	 * @throws AWTException
	 */

	public void Remove_Asset_Values_Search() throws AWTException

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	}

	/**
	 * Check the Add button of Remove asset
	 */
	public void Asset_poupbox_cancelbutton()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();
		} else if (INV04URL.equals(inv4))

		{

			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();
		}

	}

	/**
	 * Check Remove Asset source field
	 * 
	 */

	public void Remvoe_Asset_Sourcefield() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			common.pause(25);
			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//span[@id='select2-location-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Source");
			common.log("Step :: Select Source");
		 
			
			
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();
			common.pause(10);

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD - Avondale");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD - Avondale']")).click();
			common.pause(10);
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(10);

			System.out.println("Step :: Click on AVD Value");
			common.log("Step :: Click on AVD Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("AVD - Avondale");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='AVD - Avondale']")).click();
			common.pause(10);
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			common.pause(25);
			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//span[@id='select2-location-container']"))
					.click();
			common.pause(5);

			System.out.println("Step :: Select Source");
			common.log("Step :: Select Source");
		 
			
			
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();
			common.pause(10);
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Remove");
			common.log("Step :: Click on Rermove");
			driver.findElement(By.xpath("//li//a[text()='Remove']")).click();
			common.pause(50);

			System.out.println("Step :: Click on Asset Code Searchbox");
			common.log("Step :: Click on Asset Code Searchbox");
			driver.findElement(By.xpath("//button[@data-target='#search_model']")).click();
			common.pause(15);

			System.out.println("Step :: Verify Searchbox");
			common.log("Step :: Verify Searchbox");
			common.assertElementPresent("//h4[@id='myModalLabel']");
			common.pause(15);

			System.out.println("Step :: Click on radio button");
			common.log("Step :: Click on radio button");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();
			common.pause(15);

			String Assetcode = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
			System.out.println("Step :: Enter Search Value >> " + Assetcode);
			common.log("Step :: Enter Search Value >> " + Assetcode);
			common.pause(10);

			System.out.println("Step :: Click on Add Button");
			common.log("Step :: Click on Add Button");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

			System.out.println("Step :: Click on Source Dropdown");
			common.log("Step :: Click on Source Dropdown");
			driver.findElement(By.xpath("//label[text()=' Source ']//..//span[@class='select2-selection__arrow']"))
					.click();
			common.pause(15);

			System.out.println("Step :: Click on ATH Value");
			common.log("Step :: Click on ATH Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH");
			common.pause(5);
			driver.findElement(By.xpath("//li[text()='ATH']")).click();
			common.pause(10);

		}

	}


	/**
	 * Check the Reason checkbox
	 */

	public void RemoveAsset_Sale_Reasonradiobutton() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Sale Checkbox in Reason");
			common.log("Step :: Click on Sale checkbox in Reason");
			driver.findElement(By.xpath("//input[@value='Sale']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Sale Checkbox in Reason");
			common.log("Step :: Click on Sale checkbox in Reason");
			driver.findElement(By.xpath("//input[@value='Sale']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Sale Checkbox in Reason");
			common.log("Step :: Click on Sale checkbox in Reason");
			driver.findElement(By.xpath("//input[@value='Sale']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Sale Checkbox in Reason");
			common.log("Step :: Click on Sale checkbox in Reason");
			driver.findElement(By.xpath("//input[@value='Sale']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Sale Checkbox in Reason");
			common.log("Step :: Click on Sale checkbox in Reason");
			driver.findElement(By.xpath("//input[@value='Sale']")).click();
		}
	}

	/**
	 * Click on Damagecheckbox
	 */

	public void RemoveAsset_Reason_Damageradiobutton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Damage Radiobutton of Reason");
			common.log("Step :: Click on Damage Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Damaged']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Damage Radiobutton of Reason");
			common.log("Step :: Click on Damage Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Damaged']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Damage Radiobutton of Reason");
			common.log("Step :: Click on Damage Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Damaged']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Damage Radiobutton of Reason");
			common.log("Step :: Click on Damage Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Damaged']")).click();
		} else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Damage Radiobutton of Reason");
			common.log("Step :: Click on Damage Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Damaged']")).click();
		}
	}

	/**
	 * Click on Donation checkbox
	 * 
	 */
	public void RemoveAsset_Reaon_Donationradiobutton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Donation Radiobutton of reason");
			common.log("Step :: Click on Donation Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Donation']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Donation Radiobutton of reason");
			common.log("Step :: Click on Donation Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Donation']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Donation Radiobutton of reason");
			common.log("Step :: Click on Donation Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Donation']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Donation Radiobutton of reason");
			common.log("Step :: Click on Donation Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Donation']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Donation Radiobutton of reason");
			common.log("Step :: Click on Donation Radiobutton of Reason");
			driver.findElement(By.xpath("//input[@value='Donation']")).click();
		}
	}

	/**
	 * Click on Other radio button
	 */
	public void RemoveAsset_Reason_Otherradiobutton()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Other Radiobutton of Reason");
			common.log("Step :: Click on Other Radiobuton of Reason");
			driver.findElement(By.xpath("//input[@value='Other']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Other Radiobutton of Reason");
			common.log("Step :: Click on Other Radiobuton of Reason");
			driver.findElement(By.xpath("//input[@value='Other']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Other Radiobutton of Reason");
			common.log("Step :: Click on Other Radiobuton of Reason");
			driver.findElement(By.xpath("//input[@value='Other']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Other Radiobutton of Reason");
			common.log("Step :: Click on Other Radiobuton of Reason");
			driver.findElement(By.xpath("//input[@value='Other']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Other Radiobutton of Reason");
			common.log("Step :: Click on Other Radiobuton of Reason");
			driver.findElement(By.xpath("//input[@value='Other']")).click();
		}
	}

	/**
	 * Enter value in Quantity field
	 */

	public void Remove_QuantityField() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Enter Value in Quantity");
			common.log("Step :: Enter Value in Quantity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Enter Value in Quantity");
			common.log("Step :: Enter Value in Quantity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Enter Value in Quantity");
			common.log("Step :: Enter Value in Quantity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Enter Value in Quantity");
			common.log("Step :: Enter Value in Quantity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Enter Value in Quantity");
			common.log("Step :: Enter Value in Quantity");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		}
	}
	// button[@id='btnAdd']

	public void Addbutton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		}
	}

	/**
	 * Verify Checkin/out tab
	 * 
	 */
	public void Checkinout_tab() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Checkin/out page");
			common.log("Step :: Open Checkin/out page");
			common.pause(10);
			driver.findElement(By.xpath("//a[@href='/assets/checkin']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Checkin/out page");
			common.log("Step :: Open Checkin/out page");
			common.pause(10);
			driver.findElement(By.xpath("//a[@href='/assets/checkin']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Checkin/out page");
			common.log("Step :: Open Checkin/out page");
			common.pause(10);
			driver.findElement(By.xpath("//a[@href='/assets/checkin']")).click();
		}

	}

	/**
	 * Verify Assetcode field in checkin/out
	 */

	public void Checkinout_Assetcodefield() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Verify Asset code field");
			common.log("Step :: Verify Assetcode field");

			System.out.println("Step :: Click on Searchbox of Assetcode field");
			common.log("Step :: Click on Searchbox of Assetcode field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkOutModelAdd']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Verify Asset code field");
			common.log("Step :: Verify Assetcode field");

			System.out.println("Step :: Click on Searchbox of Assetcode field");
			common.log("Step :: Click on Searchbox of Assetcode field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkOutModelAdd']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Verify Asset code field");
			common.log("Step :: Verify Assetcode field");

			System.out.println("Step :: Click on Searchbox of Assetcode field");
			common.log("Step :: Click on Searchbox of Assetcode field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkOutModelAdd']")).click();
		}
	}

	// /**
	// * Verify Source field
	// */
	// public void checkinout_sourcefield()
	// {
	//
	// System.out.println("Step :: Click on Source field");
	// common.log("Step :: Click on Source field");
	// driver.findElement(By.xpath("//span[@id='select2-chkOutSource-container']")).click();
	//
	//
	// System.out.println("Step :: Select source from list");
	// common.log("Step :: Select source from list");
	//
	// System.out.println("Step :: Click on ATH Value");
	// common.log("Step :: Click on ATH Value");
	// driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH");
	// common.pause(15);
	// driver.findElement(By.xpath("//li[text()='ATH']")).click();
	// common.pause(100);
	//
	//
	// }

	/**
	 * Verify Restock Asset
	 */
	public void Restock_Asset() {
		if (PREURL.equals(preurl)) {
			System.out.println("Open Restock Asset page");
			common.log("Step :: Open Restock Asset page");
			driver.findElement(By.xpath("//a[@href='/assets/restock']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Open Restock Asset page");
			common.log("Step :: Open Restock Asset page");
			driver.findElement(By.xpath("//a[@href='/assets/restock']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Open Restock Asset page");
			common.log("Step :: Open Restock Asset page");
			driver.findElement(By.xpath("//a[@href='/assets/restock']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Open Restock Asset page");
			common.log("Step :: Open Restock Asset page");
			driver.findElement(By.xpath("//a[@href='/assets/restock']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Open Restock Asset page");
			common.log("Step :: Open Restock Asset page");
			driver.findElement(By.xpath("//a[@href='/assets/restock']")).click();
		}
	}

	/**
	 * Verify the Asset code field
	 */
	public void Restock_Assetcode() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

		
			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			

			System.out.println("Step :: Click on Destination drop-doen list");
			common.log("Step :: Click on Destination drop-doen list");
			driver.findElement(By.xpath("//span[@id='select2-destination-container']")).click();
			
			driver.findElement(By.xpath("//span//ul//li[2]")).click();
			
			
			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

		
			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();

		}

	}

	/**
	 * Verify Cancel button of Asset search pop-up box
	 */
	public void RestockAsset_Popup_cancel() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button ");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button ");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button ");
			driver.findElement(By.xpath("//button[@class='btn btn-default pull-left']")).click();
		}
	}

	/**
	 * Verify Destination field
	 */
	public void Restock_Destination_Dropdown() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			common.pause(10);
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();

			common.pause(15);
			
			System.out.println("Step :: Click on Destination field");
			common.log("Step :: Click on Destination field");
			driver.findElement(By.xpath("//span[@id='select2-destination-container']")).click();
			common.pause(10);

		

			System.out.println("Step :: Select Destination From Dropdown list");
			common.log("Step :: Select Destination from Drop-down list ");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			common.pause(10);
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();

			System.out.println("Step :: Click on Destination field");
			common.log("Step :: Click on Destination field");
			driver.findElement(By.xpath("//span[@id='select2-destination-container']")).click();
			common.pause(10);

			System.out.println("Step :: Click on ATH Value");
			common.log("Step :: Click on ATH Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH - Anthem");

			System.out.println("Step :: Select Destination From Dropdown list");
			common.log("Step :: Select Destination from Drop-down list ");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			common.pause(10);
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();

			System.out.println("Step :: Click on Destination field");
			common.log("Step :: Click on Destination field");
			driver.findElement(By.xpath("//span[@id='select2-destination-container']")).click();
			common.pause(10);

			System.out.println("Step :: Click on ATH Value");
			common.log("Step :: Click on ATH Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH - Anthem");

			System.out.println("Step :: Select Destination From Dropdown list");
			common.log("Step :: Select Destination from Drop-down list ");
			driver.findElement(By.xpath("//li[text()='ATH - Anthem']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			common.pause(10);
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();

			common.pause(15);
			
			System.out.println("Step :: Click on Destination field");
			common.log("Step :: Click on Destination field");
			driver.findElement(By.xpath("//span[@id='select2-destination-container']")).click();
			common.pause(10);

		

			System.out.println("Step :: Select Destination From Dropdown list");
			common.log("Step :: Select Destination from Drop-down list ");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Assetcode searchbox");
			common.log("Step :: Click on Asset code searhbox");
			common.pause(10);
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Asset code from table");
			common.log("Step :: Click on Assetcode from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1][@class='sorting_1']//input[@type='radio']")).click();

			System.out.println("Step :: Add Assetcode in field");
			common.log("Step :: Add Assetcode in field");
			driver.findElement(By.xpath("//button[@id='btnChkInModelAdd']")).click();

			System.out.println("Step :: Click on Destination field");
			common.log("Step :: Click on Destination field");
			driver.findElement(By.xpath("//span[@id='select2-destination-container']")).click();
			common.pause(10);

			System.out.println("Step :: Click on ATH Value");
			common.log("Step :: Click on ATH Value");
			driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ATH");

			System.out.println("Step :: Select Destination From Dropdown list");
			common.log("Step :: Select Destination from Drop-down list ");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();
		}
	}

	
	
	/**
	 * Verify Quantity field
	 */
	public void Restock_Quantity() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Enter Quantity in Quantity field");
			common.log("Step :: Enter Quantity in Quantity field");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Enter Quantity in Quantity field");
			common.log("Step :: Enter Quantity in Quantity field");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Enter Quantity in Quantity field");
			common.log("Step :: Enter Quantity in Quantity field");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Enter Quantity in Quantity field");
			common.log("Step :: Enter Quantity in Quantity field");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Enter Quantity in Quantity field");
			common.log("Step :: Enter Quantity in Quantity field");
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys("10");
		}
	}

	/**
	 * Verify Add button
	 */
	public void Restock_Add() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();
		}
	}

	/**
	 * Verify table in Restock page
	 */

	public void Restock_Table_Removebutton()

	{
		if (PREURL.equals(preurl)) {
			common.pause(20);
			System.out.println("Step :: Clcik on Remove button of Table");
			common.log("Step :: Click on Remove button of Table");
			driver.findElement(By.xpath("//a[@class='remove']")).click();

		}

		else if (INV01URL.equals(inv1)) {
			common.pause(20);
			System.out.println("Step :: Clcik on Remove button of Table");
			common.log("Step :: Click on Remove button of Table");
			driver.findElement(By.xpath("//a[@class='remove']")).click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(20);
			System.out.println("Step :: Clcik on Remove button of Table");
			common.log("Step :: Click on Remove button of Table");
			driver.findElement(By.xpath("//a[@class='remove']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(20);
			System.out.println("Step :: Clcik on Remove button of Table");
			common.log("Step :: Click on Remove button of Table");
			driver.findElement(By.xpath("//a[@class='remove']")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(20);
			System.out.println("Step :: Clcik on Remove button of Table");
			common.log("Step :: Click on Remove button of Table");
			driver.findElement(By.xpath("//a[@class='remove']")).click();
		}
	}

	/**
	 * Verify Resotck Save button
	 */
	public void Restock_Save() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			common.pause(20);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			common.pause(20);
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			common.pause(20);
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			common.pause(20);
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			common.pause(20);
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			common.pause(20);
		}
	}

	/**
	 * Verify Restock Cancel button
	 */
	public void Restock_Cancel() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();

		}

	}

}