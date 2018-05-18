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

public class Procure_Report extends AbstractPage {

	Common common = new Common(driver);

	String preurl = driver.getCurrentUrl();
	String PREURL = "https://inv-pre.qa.procurenetworks.com/reports";

	String inv1 = driver.getCurrentUrl();
	String INV01URL = "https://inv-01.qa.procurenetworks.com/reports";

	String inv2 = driver.getCurrentUrl();
	String INV02URL = "https://inv-02.qa.procurenetworks.com/reports";

	String inv3 = driver.getCurrentUrl();
	String INV03URL = "https://inv-03.qa.procurenetworks.com/reports";

	String inv4 = driver.getCurrentUrl();
	String INV04URL = "https://inv-04.qa.procurenetworks.com/reports";

	String username = "ADMIN";
	String password = "admin";

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public Procure_Report(WebDriver driver) {
		super(driver);

	}

	/**
	 * Verify Report
	 * 
	 * @throws AWTException
	 * 
	 */
	public void Reports() throws AWTException {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: CLick on Audit Reports Asset");
			common.log("Step :: Click on Audit Reports Assets");
			driver.findElement(By.xpath("//a[@href='/reports/asset-audit-reports']"));

			common.pause(20);
			System.out.println("Step :: CLick on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-asset-audit']")).click();

			System.out.println("Step :: Enter the value in Search box");
			common.log("Step :: Enter the value in Search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("01234");

			common.pause(20);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: CLick on Site drop-downlist");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select Site from drop-down list");
			common.log("Step :: Select Site from  drop-downlist");
			driver.findElement(By.xpath("//ul//li[text()='ATH']")).click();

			System.out.println("Step :: Enter the value in Actual text field in table");
			common.log("Step :: Enter the value in Actual text field in table");
			driver.findElement(By.xpath("//input[@name='reconciled_quantity']")).sendKeys("20");
			common.pause(10);
			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			common.pause(20);
			System.out.println("Step :: Check the variance for Asset code quantity");
			common.log("Step :: Check the variance for Asset code quantity");

			System.out.println("Step :: Enter the value Notes field in table");
			common.log("Step :: Enter the value in Notes field in table");
			driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Hello Notes");

			System.out.println("Step :: CLick on Save button");
			common.log("Step:: Click on Save button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Yes button of Save alert box");
			common.log("Step :: Click on Yes button of Save alert box");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			common.pause(10);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: CLick on Audit Reports Asset");
			common.log("Step :: Click on Audit Reports Assets");
			driver.findElement(By.xpath("//a[@href='/reports/asset-audit-reports']"));

			common.pause(20);
			System.out.println("Step :: CLick on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-asset-audit']")).click();

			System.out.println("Step :: Enter the value in Search box");
			common.log("Step :: Enter the value in Search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("16991");

			common.pause(20);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: CLick on Site drop-downlist");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select Site from drop-down list");
			common.log("Step :: Select Site from  drop-downlist");
			driver.findElement(By.xpath("//ul//li[text()='ATH']")).click();

			System.out.println("Step :: Enter the value in Actual text field in table");
			common.log("Step :: Enter the value in Actual text field in table");
			driver.findElement(By.xpath("//input[@name='reconciled_quantity']")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			common.pause(20);
			System.out.println("Step :: Check the variance for Asset code quantity");
			common.log("Step :: Check the variance for Asset code quantity");

			System.out.println("Step :: Enter the value Notes field in table");
			common.log("Step :: Enter the value in Notes field in table");
			driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Hello Notes");

			System.out.println("Step :: CLick on Save button");
			common.log("Step:: Click on Save button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Yes button of Save alert box");
			common.log("Step :: Click on Yes button of Save alert box");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			common.pause(10);
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: CLick on Audit Reports Asset");
			common.log("Step :: Click on Audit Reports Assets");
			driver.findElement(By.xpath("//a[@href='/reports/asset-audit-reports']"));

			common.pause(20);
			System.out.println("Step :: CLick on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-asset-audit']")).click();

			System.out.println("Step :: Enter the value in Search box");
			common.log("Step :: Enter the value in Search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("01112");

			common.pause(20);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: CLick on Site drop-downlist");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select Site from drop-down list");
			common.log("Step :: Select Site from  drop-downlist");
			driver.findElement(By.xpath("//ul//li[text()='ATH']")).click();

			System.out.println("Step :: Enter the value in Actual text field in table");
			common.log("Step :: Enter the value in Actual text field in table");
			driver.findElement(By.xpath("//input[@name='reconciled_quantity']")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			common.pause(20);
			System.out.println("Step :: Check the variance for Asset code quantity");
			common.log("Step :: Check the variance for Asset code quantity");

			System.out.println("Step :: Enter the value Notes field in table");
			common.log("Step :: Enter the value in Notes field in table");
			driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Hello Notes");

			System.out.println("Step :: CLick on Save button");
			common.log("Step:: Click on Save button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Yes button of Save alert box");
			common.log("Step :: Click on Yes button of Save alert box");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			common.pause(10);
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: CLick on Audit Reports Asset");
			common.log("Step :: Click on Audit Reports Assets");
			driver.findElement(By.xpath("//a[@href='/reports/asset-audit-reports']"));

			common.pause(20);
			System.out.println("Step :: CLick on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-asset-audit']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: CLick on Site drop-downlist");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select Site from drop-down list");
			common.log("Step :: Select Site from  drop-downlist");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(20);
			System.out.println("Step :: Enter the value in Actual text field in table");
			common.log("Step :: Enter the value in Actual text field in table");
			driver.findElement(By.xpath("//table//tr[1]//input")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			common.pause(20);
			System.out.println("Step :: Check the variance for Asset code quantity");
			common.log("Step :: Check the variance for Asset code quantity");

			System.out.println("Step :: Enter the value Notes field in table");
			common.log("Step :: Enter the value in Notes field in table");
			driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Hello Notes");

			System.out.println("Step :: CLick on Save button");
			common.log("Step:: Click on Save button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Yes button of Save alert box");
			common.log("Step :: Click on Yes button of Save alert box");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			common.pause(10);
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: CLick on Audit Reports Asset");
			common.log("Step :: Click on Audit Reports Assets");
			driver.findElement(By.xpath("//a[@href='/reports/asset-audit-reports']"));

			common.pause(20);
			System.out.println("Step :: CLick on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-asset-audit']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: CLick on Site drop-downlist");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select Site from drop-down list");
			common.log("Step :: Select Site from  drop-downlist");
			driver.findElement(By.xpath("//ul//li[text()='ATH']")).click();

			common.pause(20);
			System.out.println("Step :: Enter the value in Actual text field in table");
			common.log("Step :: Enter the value in Actual text field in table");
			driver.findElement(By.xpath("//table//tr[1]//input")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			common.pause(20);
			System.out.println("Step :: Check the variance for Asset code quantity");
			common.log("Step :: Check the variance for Asset code quantity");

			System.out.println("Step :: Enter the value Notes field in table");
			common.log("Step :: Enter the value in Notes field in table");
			driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Hello Notes");

			System.out.println("Step :: CLick on Save button");
			common.log("Step:: Click on Save button");
			driver.findElement(By.xpath("//input[@value='Save']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Yes button of Save alert box");
			common.log("Step :: Click on Yes button of Save alert box");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			common.pause(10);

		}
	}

	public void Asset_AuditPagination_button() {
		// verify second page element present or not
		if (PREURL.equals(preurl)) {

			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {
			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

	}

	public void Auditreport_Inventory() throws AWTException {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Audit report inventory");
			common.log("Step :: Click on Audit report inventory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-audit-reports']")).click();

			System.out.println("Step :: Click on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-inventory-audit']")).click();

			common.pause(20);

			System.out.println("Step :: Enter value in Actual textbox ");
			common.log("Step :: Enter value in Actaul text box");
			driver.findElement(By.xpath("//table//tr[1]//input")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			System.out.println("Step :: Enter value in Notes textbox ");
			common.log("Step :: Enter value in Notes text box");
			driver.findElement(By.xpath("//table//tr[1]//td[9]//textarea")).sendKeys("hello notes");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(
					By.xpath("//div[@class='col-lg-2 pull-right col-md-3 col-sm-12 col-xs-12']//input[@id='btnSave']"))
					.click();

			System.out.println("Step :: Click on yes button");
			common.log("Step :: CLick on Yes button");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Audit report inventory");
			common.log("Step :: Click on Audit report inventory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-audit-reports']")).click();

			System.out.println("Step :: Click on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-inventory-audit']")).click();

			common.pause(20);

			System.out.println("Step :: Enter value in Actual textbox ");
			common.log("Step :: Enter value in Actaul text box");
			driver.findElement(By.xpath("//table//tr[1]//input")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			System.out.println("Step :: Enter value in Notes textbox ");
			common.log("Step :: Enter value in Notes text box");
			driver.findElement(By.xpath("//table//tr[1]//td[9]//textarea")).sendKeys("hello notes");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(
					By.xpath("//div[@class='col-lg-2 pull-right col-md-3 col-sm-12 col-xs-12']//input[@id='btnSave']"))
					.click();

			System.out.println("Step :: Click on yes button");
			common.log("Step :: CLick on Yes button");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Audit report inventory");
			common.log("Step :: Click on Audit report inventory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-audit-reports']")).click();

			System.out.println("Step :: Click on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-inventory-audit']")).click();

			common.pause(20);

			System.out.println("Step :: Enter value in Actual textbox ");
			common.log("Step :: Enter value in Actaul text box");
			driver.findElement(By.xpath("//table//tr[1]//input")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			System.out.println("Step :: Enter value in Notes textbox ");
			common.log("Step :: Enter value in Notes text box");
			driver.findElement(By.xpath("//table//tr[1]//td[9]//textarea")).sendKeys("hello notes");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(
					By.xpath("//div[@class='col-lg-2 pull-right col-md-3 col-sm-12 col-xs-12']//input[@id='btnSave']"))
					.click();

			System.out.println("Step :: Click on yes button");
			common.log("Step :: CLick on Yes button");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Audit report inventory");
			common.log("Step :: Click on Audit report inventory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-audit-reports']")).click();

			System.out.println("Step :: Click on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-inventory-audit']")).click();

			common.pause(20);

			System.out.println("Step :: Enter value in Actual textbox ");
			common.log("Step :: Enter value in Actaul text box");
			driver.findElement(By.xpath("//table//tr[1]//input")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			System.out.println("Step :: Enter value in Notes textbox ");
			common.log("Step :: Enter value in Notes text box");
			driver.findElement(By.xpath("//table//tr[1]//td[9]//textarea")).sendKeys("hello notes");

			common.Scrollpage();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(
					By.xpath("//div[@class='col-lg-2 pull-right col-md-3 col-sm-12 col-xs-12']//input[@id='btnSave']"))
					.click();
			common.pause(10);
			System.out.println("Step :: Click on yes button");
			common.log("Step :: CLick on Yes button");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Audit report inventory");
			common.log("Step :: Click on Audit report inventory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-audit-reports']")).click();

			System.out.println("Step :: Click on New Audit button");
			common.log("Step :: Click on New Audit button");
			driver.findElement(By.xpath("//a[@href='/reports/new-inventory-audit']")).click();

			common.pause(20);

			System.out.println("Step :: Enter value in Actual textbox ");
			common.log("Step :: Enter value in Actaul text box");
			driver.findElement(By.xpath("//table//tr[1]//input")).sendKeys("20");

			Robot robot = new Robot(); // Robot class throws AWT Exception

			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			System.out.println("Step :: Enter value in Notes textbox ");
			common.log("Step :: Enter value in Notes text box");
			driver.findElement(By.xpath("//table//tr[1]//td[9]//textarea")).sendKeys("hello notes");

			common.Scrollpage();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(
					By.xpath("//div[@class='col-lg-2 pull-right col-md-3 col-sm-12 col-xs-12']//input[@id='btnSave']"))
					.click();

			System.out.println("Step :: Click on yes button");
			common.log("Step :: CLick on Yes button");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		}

	}

	public void Costreports_Assets()

	{
		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//span[@role='presentation']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(
					By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//input[@type='search']"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//span[@role='presentation']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(
					By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//input[@type='search']"))
					.sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Category);
			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"))
					.sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			// System.out.println("Step :: Click on Cost field");
			// common.log("Step :: Click on Cost field");
			// driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();
			////
			// System.out.println("Step :: Enter cost" + Cost);
			// common.log("Step :: Enter cost" + Cost);
			// driver.findElement(By.xpath(
			// "//span[@class='select2-search
			// select2-search--dropdown']//input[@class='select2-search__field']"))
			// .sendKeys(Cost);
			//
			// System.out.println("Select cost");
			// common.log("Select cost");
			// driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='Review Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}
	}

	public void Inventory_Pagination_button() {

		System.out.println("Step :: Click on Audit report inventory");
		common.log("Step :: Click on Audit report inventory");
		driver.findElement(By.xpath("//a[@href='/reports/inventory-audit-reports']")).click();

		if (PREURL.equals(preurl)) {

			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {
			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			}

		}

	}

	public void Costreport_Asset_GenerateCSVreport() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//span[@role='presentation']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(
					By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//input[@type='search']"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//span[@role='presentation']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(
					By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//input[@type='search']"))
					.sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Category);
			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"))
					.sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();

		}
	}

	public void Costreport_GeneratePDFReport() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//span[@role='presentation']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(
					By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//input[@type='search']"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//span[@role='presentation']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(
					By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//input[@type='search']"))
					.sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Category);
			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"))
					.sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input"))
					.sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();
		} else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			String assetcode = driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]"))
					.getText();
			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Asset code >>" + assetcode);
			common.log("Step :: Click on Asset code >>" + assetcode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(assetcode);
			common.pause(10);

			String Category = driver.findElement(By.xpath("//tr//td[8]")).getText();
			System.out.println("Step :: Get Category from table" + Category);
			common.log("Step :: Get Category from table" + Category);
			common.pause(10);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(20);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			common.pause(20);

			System.out.println("Step :: Click on Asset module ");
			common.log("Step :: Click on Asset module");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/assets']")).click();

			common.pause(20);

			String Cost = driver.findElement(By.xpath("//tr//td[12]")).getText();
			System.out.println("Step :: Get Cost from table" + Cost);
			common.log("Step :: Get Cost from table" + Cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Asset tab");
			common.log("Step :: Click on Cost report Asset tab");
			driver.findElement(By.xpath("//a[@href='/reports/asset-cost-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Selected Asset code :: " + assetcode);
			common.log("Step :: Selected Asset code :: " + assetcode);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//ul[@id='select2-asset_code-results']//..//li[1]")).click();
			common.pause(10);
			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Enter the category" + Category);
			common.log("Step :: Enter the category " + Category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(Category);

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//..//li[1]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Enter cost" + Cost);
			common.log("Step :: Enter cost" + Cost);
			driver.findElement(By.xpath(
					"//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']"))
					.sendKeys(Cost);

			System.out.println("Select cost");
			common.log("Select cost");
			driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select report type from list");
			common.log("Step :: Select report type from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Genrate button");
			driver.findElement(By.xpath("//input[@id='c27']")).click();

		}

	}

	public void Costreports_Inventory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			String inventorycode = driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]"))
					.getText();

			System.out.println("Step :: Select  Inventory code from list" + inventorycode);
			common.log("Step :: Select inventory code from list" + inventorycode);

			System.out.println("Step :: Select Inventory code from list");
			common.log("Step :: Select Inventory code from list");
			driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]")).click();

			common.pause(20);

			System.out.println("Step :: Click on Invnetory module ");
			common.log("Step :: Click on Invnetory module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/inventory']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Inventory code" + inventorycode);
			common.log("Step :: Enter Inventory code" + inventorycode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys(inventorycode);

			String category = driver.findElement(By.xpath("//tr//td[6]")).getText();
			System.out.println("Step :: Get Category from table" + category);
			common.log("Step :: Get Category form table" + category);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Inventory  tab");
			common.log("Step :: Click on Cost report invntory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Enter Inventory code " + inventorycode);
			common.log("Step :: Enter inventory code" + inventorycode);
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).sendKeys(inventorycode);

			common.pause(10);

			System.out.println("Step :: Select Inventory code from list");
			common.log("Step :: Select Inventory code from list");
			driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: ENter category" + category);
			common.log("Step :: ENter category" + category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(category);

			System.out.println("Step :: Click on Invnetory module ");
			common.log("Step :: Click on Invnetory module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/inventory']")).click();

			common.pause(20);

			String cost = driver.findElement(By.xpath("//tr//td[11]")).getText();
			System.out.println("Step :: select cost from list" + cost);
			common.log("Step :: select cost from list" + cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Inventory  tab");
			common.log("Step :: Click on Cost report invntory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Enter Inventory code " + inventorycode);
			common.log("Step :: Enter inventory code" + inventorycode);
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).sendKeys(inventorycode);

			System.out.println("Step :: Select Inventory code from list");
			common.log("Step :: Select Inventory code from list");
			driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: ENter category" + category);
			common.log("Step :: ENter category" + category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(category);

			// System.out.println("Step :: Click on Cost field");
			// common.log("Step :: Click on Cost field");
			// driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();
			//
			// System.out.println("Step :: Enter cost" + cost);
			// common.log("Step :: Enter cost" + cost);
			// driver.findElement(By.xpath(
			// "//span[@class='select2-search
			// select2-search--dropdown']//input[@class='select2-search__field']"))
			// .sendKeys(cost);

			// System.out.println("Select cost");
			// common.log("Select cost");
			// driver.findElement(By.xpath("//ul[@id='select2-c13-results']//..//li[1]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.08']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='21.87']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Review Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

	}

	public void CostInventory_GenerateCSVReport() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.08']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='0.00']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.46']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}
	}

	public void CostInventory_GeneratePDFReport() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.08']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='21.87']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();
			
			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.46']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

	}

	public void Depreciation_ReportAsset() {

		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select Report from list");
			common.log("Step :: Select Report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select Report from list");
			common.log("Step :: Select Report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select Report from list");
			common.log("Step :: Select Report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select Report from list");
			common.log("Step :: Select Report from list");
			driver.findElement(By.xpath("//li[text()='Review Report']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select Report from list");
			common.log("Step :: Select Report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

	}

	public void DepreciationAssetReport_GenerateCSVReport() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select CSV Export  from list");
			common.log("Step :: Select CSV Export from  list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

		else if (INV01URL.equals(inv1))

		{

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select CSV Export  from list");
			common.log("Step :: Select CSV Export from  list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select CSV Export  from list");
			common.log("Step :: Select CSV Export from  list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select CSV Export  from list");
			common.log("Step :: Select CSV Export from  list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select CSV Export  from list");
			common.log("Step :: Select CSV Export from  list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();

		}

	}

	public void DepreciationAssetReport_GeneratePDFReport() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();
			
			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();

		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: CLick on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@id='c11']")).click();

		}
	}

	public void Site_ReportAsset() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(20);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='17991']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Review Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}
	}

	public void SiteReport_Asset_GenerateCSVReport() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Furniture/Furnishings']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export  from list");
			common.log("Step :: Select CSV from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();



			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

	}

	public void Site_Asset_GeneratePDFReport() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Furniture/Furnishings']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF  Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();



			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();
			

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF  Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV04URL.equals(inv4))

		{

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF  Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

	}

	public void Site_Report_Asset_Clearbutton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Furniture/Furnishings']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF  Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		} else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF  Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report Asset");
			common.log("Step :: CLick on Site Report Asset");
			driver.findElement(By.xpath("//a[@href='/reports/asset-site-report']")).click();

			System.out.println("Step :: Click on Assetcode field");
			common.log("Step :: Click on Assetcode field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='25243']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select Site from list");
			common.log("Step ::Select site fromn list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF  Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();

		}

	}

	public void Site_Report_Inventory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list ");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step ::Click on Category field ");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list ");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select sitye from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Review Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

	}

	public void Site_ReportInventory_GenerateCSVReport() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list ");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step ::Click on Category field ");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list ");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select sitye from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV Export from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}
	}

	public void SiteReport_Inventory_GeneratePDFReport() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list ");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step ::Click on Category field ");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list ");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select sitye from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

	}

	public void Site_Report_Invnetory_Clearbutton() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list ");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step ::Click on Category field ");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list ");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select sitye from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		} else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Site Report invnetory tab");
			common.log("Click on Site Report invnetory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-site-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field ");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();

		}

	}

	public void TransactionReport_Asset() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Furniture/Furnishings']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Review Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='25243']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}
	}

	public void Transaction_Report_Asset_GenerateCSVReport() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV report from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Furniture/Furnishings']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='25243']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

	}

	public void Transaction_Report_Asset_GeneratePDFReport() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV report from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Furniture/Furnishings']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();


			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='25243']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}
	}

	public void Transaction_Report_Asset_clearbutton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Audio']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select CSV report from list");
			common.log("Step :: Select CSV Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Furniture/Furnishings']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report asset tab");
			common.log("Step ::Click on Transaction report asset tab ");
			driver.findElement(By.xpath("//a[@href='/reports/asset-transaction-report']")).click();

			System.out.println("Step :: Click on Asset code field");
			common.log("Step :: Click on Asset code field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			common.pause(10);

			System.out.println("Step :: Select Asset code from list");
			common.log("Step :: Select Asset code from list");
			driver.findElement(By.xpath("//li[text()='25243']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select value from category field");
			common.log("Step :: Select value from category field");
			driver.findElement(By.xpath("//li[text()='Advertising']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();

		}

	}

	public void Transaction_Report_Inventory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//li[text()='Application Development']")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//li[text()='CCV Admin']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Review Report']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}
	}

	public void Transaction_Report_Inventory_GenerateCSVReport() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='CSV Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

	}

	public void Transaction_Report_Inventory_GeneratePDFReport() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: CLick on Department field");
			common.log("Step :: Click on Department field");
			driver.findElement(By.xpath("//span[text()='Department']//..//div//input")).click();

			System.out.println("Step :: Select Department from list");
			common.log("Step :: Select Department from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Users field");
			common.log("Step :: Click on Users field");
			driver.findElement(By.xpath("//span[text()='Users']//..//div//input")).click();

			System.out.println("Step :: Select Users from list");
			common.log("Step :: Select Users from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Generate button");
			common.log("Step :: Click on Generate button");
			driver.findElement(By.xpath("//input[@value='Generate']")).click();
		}

	}

	public void Trasaction_Report_Invnetory_Clearbutton() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on clear button");
			common.log("Step :: CLick on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Stp :: CLikc on Clear button");
			common.log("Step :: CLick on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Stp :: CLikc on Clear button");
			common.log("Step :: CLick on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();

		}

		else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Stp :: CLikc on Clear button");
			common.log("Step :: CLick on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Transaction report Inventory tab");
			common.log("Step :: Click on Transaction report Inventory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-transaction-report']")).click();

			System.out.println("Step :: Click on Inventory code tab");
			common.log("Step :: Click on Inventory code tab");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select inventory code field");
			common.log("Step :: Select invnetory code field");
			driver.findElement(By.xpath("//li[text()='703']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select category from list");
			common.log("Step :: Select category from list");
			driver.findElement(By.xpath("//li[text()='Baptism / Dedication']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site form list");
			common.log("Step :: Select site form list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on  Transaction Date mode ");
			common.log("Step :: Click on  Transaction Date mode ");
			driver.findElement(By.xpath("//span[@id='select2-c11-container']")).click();

			System.out.println("Step :: Select  Transaction Date mode from list ");
			common.log("Step :: Select  Transaction Date mode from list ");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select PDF Export from list");
			common.log("Step :: Select PDF Export from list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Stp :: CLikc on Clear button");
			common.log("Step :: CLick on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();

		}
	}

	public void Depreciation_Report_Asset_Clearbutton() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='01234']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: CLick on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1217938']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: CLick on Clear button");
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AST1071700']")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Depreciation Report Asset menu tab");
			common.log("Step :: Click on Depreciation Report Asset menu tab");
			driver.findElement(By.xpath("//a[@href='/reports/depreciation-report']")).click();

			System.out.println("Step :: Click on Asset field");
			common.log("Step :: Click on Asset field");
			driver.findElement(By.xpath("//span[text()='Asset Code']//..//div//input")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");
			driver.findElement(By.xpath("//span[text()='Site']//..//div//input")).click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();

			System.out.println("Step :: Click on Purchase date dropdown list");
			common.log("Step :: Click on Purchase date dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-c6-container']")).click();

			System.out.println("Step :: Select date from  list");
			common.log("Step :: Select date from listlist");
			driver.findElement(By.xpath("//li[text()='None']")).click();

			System.out.println("Step :: Click on Sort by date field");
			common.log("Step :: Click on Sort by date field");
			driver.findElement(By.xpath("//span[@id='select2-c10-container']")).click();

			System.out.println("Step :: Select sort by date form list");
			common.log("Step :: Select sort by date from list");
			driver.findElement(By.xpath("//li[text()='Ascending']")).click();

			System.out.println("Step :: click on Report field");
			common.log("Step :: click on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c7-container']")).click();

			System.out.println("Step :: Select PDF Export  from list");
			common.log("Step :: Select PDF Export from  list");
			driver.findElement(By.xpath("//li[text()='PDF Export']")).click();
		}
	}

	public void CostReport_inventory_clearbutton() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			String inventorycode = driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]"))
					.getText();

			System.out.println("Step :: Select  Inventory code from list" + inventorycode);
			common.log("Step :: Select inventory code from list" + inventorycode);

			System.out.println("Step :: Select Inventory code from list");
			common.log("Step :: Select Inventory code from list");
			driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]")).click();

			common.pause(20);

			System.out.println("Step :: Click on Invnetory module ");
			common.log("Step :: Click on Invnetory module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/inventory']")).click();

			common.pause(20);

			System.out.println("Step :: Enter Inventory code" + inventorycode);
			common.log("Step :: Enter Inventory code" + inventorycode);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys(inventorycode);

			String category = driver.findElement(By.xpath("//tr//td[6]")).getText();
			System.out.println("Step :: Get Category from table" + category);
			common.log("Step :: Get Category form table" + category);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Inventory  tab");
			common.log("Step :: Click on Cost report invntory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Enter Inventory code " + inventorycode);
			common.log("Step :: Enter inventory code" + inventorycode);
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).sendKeys(inventorycode);

			common.pause(10);

			System.out.println("Step :: Select Inventory code from list");
			common.log("Step :: Select Inventory code from list");
			driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: ENter category" + category);
			common.log("Step :: ENter category" + category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(category);

			System.out.println("Step :: Click on Invnetory module ");
			common.log("Step :: Click on Invnetory module");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/inventory']")).click();

			common.pause(20);

			String cost = driver.findElement(By.xpath("//tr//td[11]")).getText();
			System.out.println("Step :: select cost from list" + cost);
			common.log("Step :: select cost from list" + cost);

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report Inventory  tab");
			common.log("Step :: Click on Cost report invntory tab");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Enter Inventory code " + inventorycode);
			common.log("Step :: Enter inventory code" + inventorycode);
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).sendKeys(inventorycode);

			System.out.println("Step :: Select Inventory code from list");
			common.log("Step :: Select Inventory code from list");
			driver.findElement(By.xpath("//ul[@id='select2-inventoryCode-results']//li[1]")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: ENter value in category" + category);
			common.log("Step :: ENter value in category" + category);
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).sendKeys(category);

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@id='c28']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.08']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@id='c28']")).click();
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='0.01']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@id='c28']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.46']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@id='c28']")).click();

		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Reports tab");
			common.log("Step :: Click on Reports tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/reports']")).click();

			System.out.println("Step :: Click on Cost report inventory");
			common.log("Step :: Click on Cost report invnetory");
			driver.findElement(By.xpath("//a[@href='/reports/inventory-cost-report']")).click();

			System.out.println("Step :: Click on Inventory code field");
			common.log("Step :: Click on Inventory code field");
			driver.findElement(By.xpath("//span[text()='Inventory Code']//..//div//input")).click();

			System.out.println("Step :: Select  Inventory code from list");
			common.log("Step :: Select inventory code from list");
			driver.findElement(By.xpath("//li[text()='100']")).click();

			System.out.println("Step :: Click on Category field");
			common.log("Step :: Click on Category field");
			driver.findElement(By.xpath("//span[text()='Category']//..//div//input")).click();

			System.out.println("Step :: Select  Category from list");
			common.log("Step :: Select Category from list");
			driver.findElement(By.xpath("//li[text()='In Stock Office Supplies']")).click();

			System.out.println("Step :: CLick on Cost field");
			common.log("Step :: Click on Cost field");
			driver.findElement(By.xpath("//span[@id='select2-c13-container']")).click();

			System.out.println("Step :: Select  cost from list");
			common.log("Step :: Select cost from list");
			driver.findElement(By.xpath("//li[text()='1.46']")).click();

			System.out.println("Step :: Click on Report field");
			common.log("Step :: Clic on Report field");
			driver.findElement(By.xpath("//span[@id='select2-c12-container']")).click();

			System.out.println("Step :: Select  report from list");
			common.log("Step :: Select report from list");
			driver.findElement(By.xpath("//li[text()='Report']")).click();

			System.out.println("Step :: Click on Clear button");
			common.log("Step :: Click on Clear button");
			driver.findElement(By.xpath("//input[@id='c28']")).click();

		}

	}

}
