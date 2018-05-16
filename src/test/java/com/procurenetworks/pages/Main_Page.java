package test.java.com.procurenetworks.pages;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.IFutureResult;



public class Main_Page extends test.java.com.procurenetworks.pages.abstractpage.AbstractPage {

	test.java.com.procurenetworks.init.Common common = new test.java.com.procurenetworks.init.Common(driver);
	

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public Main_Page(WebDriver driver) {
		super(driver);

	}

	/**
	 * Verify Login Page Elements
	 * 
	 */

	public void Verify_Login_Page_Elements()

	{

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

	}

	/**
	 * Procure Login
	 * 
	 */

	public void Procure_login()

	{
		String URL = "https://inv-pre.qa.procurenetworks.com/auth/login";
		String username = "ADMIN";
		String password = "admin";

		driver.get(URL);

		System.out.println("Step :: Open URL >> " + URL);
		common.log("Step :: Open URL >> " + URL);
		common.pause(15);

		Verify_Login_Page_Elements(); // Verify All the Webpage Elements.

		System.out.println("Step :: Enter User Name >> " + username);
		common.log("Step :: Enter User Name >> " + username);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		common.pause(5);
		System.out.println("Step :: Enter Password >> " + password);
		common.log("Step :: Enter Password >> " + password);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		common.pause(5);

		System.out.println("Step :: Click on Login Button");
		common.log("Step :: Click on Login Button");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		common.pause(15);

	}

	/**
	 * Invalid Procure Login
	 * 
	 */

	public void Invalid_Procure_login()

	{
		String URL = "https://inv-pre.qa.procurenetworks.com/auth/login";
		String username = "admin123";
		String password = "admin";

		driver.get(URL);

		System.out.println("Step :: Open URL >> " + URL);
		common.log("Step :: Open URL >> " + URL);
		common.pause(20);

		Verify_Login_Page_Elements(); // Verify All the Webpage Elements.

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

	/**
	 * Search Assets
	 * 
	 */

	public void Search_Assets()

	{
		System.out.println("Step :: Enter Search Keyword");
		common.log("Step :: Enter Search Keyword");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("amazon");
		common.pause(20);

		System.out.println("Step :: Verify Amazon Displays in Table");
		common.log("Step :: Verify Amazon Displays in Table");
		common.assertElementPresent("//table//tr[1][@class='odd']//td//a[text()='Amazon.com']");
		common.pause(10);

	}

	public String New_Asset() throws AWTException

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

		System.out.println("Step :: Click on Dropdown Arrow");
		common.log("Step :: Click on Dropdown Arrow");
		driver.findElement(
				By.xpath("//label[text()='Depreciation Class ']//..//span[@class='select2-selection__arrow']")).click();
		common.pause(5);

		System.out.println("Step :: Select Straight Line 60 Months");
		common.log("Step :: Select Straight Line 60 Months");
		driver.findElement(By.xpath("//li[text()='Straight Line 60 Months']")).click();
			
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
	 * Search Created Assets
	 * 
	 */

	public void Search_Created_Asset(String assetcode)

	{
		
		common.pause(25);
		System.out.println("Step :: Enter Search Keyword >> "+assetcode);
		common.log("Step :: Enter Search Keyword >> "+assetcode);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(assetcode);
		common.pause(20);

		System.out.println("Step :: Verify Asset Code in Table");
		common.log("Step :: Verify Asset Code in Table");
		common.assertElementPresent("//table//td//a[text()='" + assetcode + "']");
		common.pause(10);

	}

}