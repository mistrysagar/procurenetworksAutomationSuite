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

public class Procure_Inventory extends AbstractPage {

	Common common = new Common(driver);

	String preurl = driver.getCurrentUrl();
	String PREURL = "https://inv-pre.qa.procurenetworks.com/inventory";

	String inv1 = driver.getCurrentUrl();
	String INV01URL = "https://inv-01.qa.procurenetworks.com/inventory";

	String inv2 = driver.getCurrentUrl();
	String INV02URL = "https://inv-02.qa.procurenetworks.com/inventory";

	String inv3 = driver.getCurrentUrl();
	String INV03URL = "https://inv-03.qa.procurenetworks.com/inventory";

	String inv4 = driver.getCurrentUrl();
	String INV04URL = "https://inv-04.qa.procurenetworks.com/inventory";

	String username = "ADMIN";
	String password = "admin";

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public Procure_Inventory(WebDriver driver) {
		super(driver);

	}

	/**
	 * Verify Inventory tab
	 */

	public void Inventory() {
		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Click on Inventory tab");
			common.log("Step :: Click on Inventory tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/inventory']")).click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Click on Inventory tab1");
			common.log("Step :: Click on Inventory tab1");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/inventory']")).click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Click on Inventory tab");
			common.log("Step :: Click on Inventory tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/inventory']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Click on Inventory tab");
			common.log("Step :: Click on Inventory tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/inventory']")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step :: Click on Inventory tab");
			common.log("Step :: Click on Inventory tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/inventory']")).click();
		}

	}

	/**
	 * Verify Search tab
	 */
	public void Inventory_Searchtab() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Inventory search page");
			common.log("Step :: Open Inventory Search page");
			driver.findElement(By.xpath("//a[@href='/inventory']")).click();
			common.pause(20);
			System.out.println("Step :: Verify Inventory Searchbox");
			common.log("Step ::Verify Inventory Searchbox");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");

			System.out.println("Step :: Check the Searchbox of invemtory page");
			common.log("Step :: Check the searchbox of inventory page");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys("704");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Inventory search page");
			common.log("Step :: Open Inventory Search page");
			driver.findElement(By.xpath("//a[@href='/inventory']")).click();
			common.pause(20);
			System.out.println("Step :: Verify Inventory Searchbox");
			common.log("Step ::Verify Inventory Searchbox");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");

			System.out.println("Step :: Check the Searchbox of invemtory page");
			common.log("Step :: Check the searchbox of inventory page");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys("704");
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Inventory search page");
			common.log("Step :: Open Inventory Search page");
			driver.findElement(By.xpath("//a[@href='/inventory']")).click();
			common.pause(20);
			System.out.println("Step :: Verify Inventory Searchbox");
			common.log("Step ::Verify Inventory Searchbox");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");

			System.out.println("Step :: Check the Searchbox of invemtory page");
			common.log("Step :: Check the searchbox of inventory page");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys("704");
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Inventory search page");
			common.log("Step :: Open Inventory Search page");
			driver.findElement(By.xpath("//a[@href='/inventory']")).click();
			common.pause(20);
			System.out.println("Step :: Verify Inventory Searchbox");
			common.log("Step ::Verify Inventory Searchbox");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");

			System.out.println("Step :: Check the Searchbox of invemtory page");
			common.log("Step :: Check the searchbox of inventory page");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys("704");
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Inventory search page");
			common.log("Step :: Open Inventory Search page");
			driver.findElement(By.xpath("//a[@href='/inventory']")).click();
			common.pause(20);
			System.out.println("Step :: Verify Inventory Searchbox");
			common.log("Step ::Verify Inventory Searchbox");
			common.assertElementPresent("//input[@class='form-control input-sm search-input']");

			System.out.println("Step :: Check the Searchbox of invemtory page");
			common.log("Step :: Check the searchbox of inventory page");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys("704");

		}
	}

	/**
	 * Verify Inventory search table
	 */

	public void InventorySearch_Table() {
		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Verify Page Dropdown page");
			common.log("Step :: Verify Page Dropdown page");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			System.out.println("Step :: Select value from Dropdown Page list");
			common.log("Step :: Select value from Dropdown Page list");
			driver.findElement(By.xpath(" //option[text()='25 per page']")).click();

			System.out.println("Step:: Verify table data as per selected");
			common.log("Step :: Verify table data as per selected");
			common.assertElementNotPresent("//table//tr[26]");

			common.pause(10);
			System.out.println("Step :: Open Second page of Table");
			common.log("Step :: Open Second page of Table");
			driver.findElement(By.xpath("//div[@id='inventory-table_paginate']//a[text()='2']")).click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Verify Page Dropdown page");
			common.log("Step :: Verify Page Dropdown page");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			System.out.println("Step :: Select value from Dropdown Page list");
			common.log("Step :: Select value from Dropdown Page list");
			driver.findElement(By.xpath(" //option[text()='25 per page']")).click();

			System.out.println("Step:: Verify table data as per selected");
			common.log("Step :: Verify table data as per selected");
			common.assertElementNotPresent("//table//tr[26]");

			common.pause(10);
			System.out.println("Step :: Open Second page of Table");
			common.log("Step :: Open Second page of Table");
			driver.findElement(By.xpath("//div[@id='inventory-table_paginate']//a[text()='2']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Verify Page Dropdown page");
			common.log("Step :: Verify Page Dropdown page");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			System.out.println("Step :: Select value from Dropdown Page list");
			common.log("Step :: Select value from Dropdown Page list");
			driver.findElement(By.xpath(" //option[text()='25 per page']")).click();

			System.out.println("Step:: Verify table data as per selected");
			common.log("Step :: Verify table data as per selected");
			common.assertElementNotPresent("//table//tr[26]");

			common.pause(10);
			System.out.println("Step :: Open Second page of Table");
			common.log("Step :: Open Second page of Table");
			driver.findElement(By.xpath("//div[@id='inventory-table_paginate']//a[text()='2']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Verify Page Dropdown page");
			common.log("Step :: Verify Page Dropdown page");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			System.out.println("Step :: Select value from Dropdown Page list");
			common.log("Step :: Select value from Dropdown Page list");
			driver.findElement(By.xpath(" //option[text()='25 per page']")).click();

			System.out.println("Step:: Verify table data as per selected");
			common.log("Step :: Verify table data as per selected");
			common.assertElementNotPresent("//table//tr[26]");

			common.pause(10);
			System.out.println("Step :: Open Second page of Table");
			common.log("Step :: Open Second page of Table");
			driver.findElement(By.xpath("//div[@id='inventory-table_paginate']//a[text()='2']")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step :: Verify Page Dropdown page");
			common.log("Step :: Verify Page Dropdown page");
			driver.findElement(By.xpath("//select[@class='form-control input-sm']")).click();

			System.out.println("Step :: Select value from Dropdown Page list");
			common.log("Step :: Select value from Dropdown Page list");
			driver.findElement(By.xpath(" //option[text()='25 per page']")).click();

			System.out.println("Step:: Verify table data as per selected");
			common.log("Step :: Verify table data as per selected");
			common.assertElementNotPresent("//table//tr[26]");

			common.pause(10);
			System.out.println("Step :: Open Second page of Table");
			common.log("Step :: Open Second page of Table");
			driver.findElement(By.xpath("//div[@id='inventory-table_paginate']//a[text()='2']")).click();

		}
	}

	/**
	 * Verify site dropdown list box
	 */

	public void Inventory_sitebox() {
		if (PREURL.equals(preurl)) {
			common.pause(20);
			System.out.println("Step ::Click on Inventory Site Dropdown list box");
			common.log("Step :: Click on Inventory Site Dropdown list box");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select Inventory Site from Dropdown list");
			common.log("Step :: Select Inventory Site from Dropdown list");
			driver.findElement(
					By.xpath("//span[@class='select2-results']//ul[@id='select2-drdlocation-results']//li[2]")).click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(20);
			System.out.println("Step ::Click on Inventory Site Dropdown list box");
			common.log("Step :: Click on Inventory Site Dropdown list box");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select Inventory Site from Dropdown list");
			common.log("Step :: Select Inventory Site from Dropdown list");
			driver.findElement(
					By.xpath("//span[@class='select2-results']//ul[@id='select2-drdlocation-results']//li[2]")).click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(20);
			System.out.println("Step ::Click on Inventory Site Dropdown list box");
			common.log("Step :: Click on Inventory Site Dropdown list box");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();
			common.pause(10);

			System.out.println("Step :: Enter Value in Site dropdown list searchbox");
			common.log("Step :: ENter Value in Site dropdown list searchbox");
			driver.findElement(By.xpath(" //input[@class='select2-search__field']")).sendKeys("ATH");
			common.pause(10);
			System.out.println("Step :: Select Inventory Site from Dropdown list");
			common.log("Step :: Select Inventory Site from Dropdown list");
			driver.findElement(
					By.xpath("//span[@class='select2-results']//ul[@id='select2-drdlocation-results']//li[2]")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(20);
			System.out.println("Step ::Click on Inventory Site Dropdown list box");
			common.log("Step :: Click on Inventory Site Dropdown list box");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select Inventory Site from Dropdown list");
			common.log("Step :: Select Inventory Site from Dropdown list");
			driver.findElement(
					By.xpath("//span[@class='select2-results']//ul[@id='select2-drdlocation-results']//li[2]")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(20);
			System.out.println("Step ::Click on Inventory Site Dropdown list box");
			common.log("Step :: Click on Inventory Site Dropdown list box");
			driver.findElement(By.xpath("//span[@id='select2-drdlocation-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select Inventory Site from Dropdown list");
			common.log("Step :: Select Inventory Site from Dropdown list");
			driver.findElement(
					By.xpath("//span[@class='select2-results']//ul[@id='select2-drdlocation-results']//li[2]")).click();
		}
	}

	/**
	 * Verify Inventory table checkbox
	 */

	public void Inventory_tablecheckbox() {
		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			System.out.println("Step :: Click on Table Select all checkbox");
			common.log("Step :: Click on Table Select all checkbox");
			driver.findElement(By.xpath("//input[@id='group-checkable']")).click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			System.out.println("Step :: Click on Table Select all checkbox");
			common.log("Step :: Click on Table Select all checkbox");
			driver.findElement(By.xpath("//input[@id='group-checkable']")).click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			System.out.println("Step :: Click on Table Select all checkbox");
			common.log("Step :: Click on Table Select all checkbox");
			driver.findElement(By.xpath("//input[@id='group-checkable']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			System.out.println("Step :: Click on Table Select all checkbox");
			common.log("Step :: Click on Table Select all checkbox");
			driver.findElement(By.xpath("//input[@id='group-checkable']")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			System.out.println("Step :: Click on Table Select all checkbox");
			common.log("Step :: Click on Table Select all checkbox");
			driver.findElement(By.xpath("//input[@id='group-checkable']")).click();
		}
	}

	/**
	 * Verify Edit button of Inventory
	 */

	public void Inventory_Edit() {
		if (PREURL.equals(preurl)) {

			common.pause(10);
			driver.findElement(By.xpath(" //option[text()='10 per page']")).click();
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();
		} else if (INV01URL.equals(inv1)) {

			common.pause(10);
			driver.findElement(By.xpath(" //option[text()='10 per page']")).click();
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,700)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);

			driver.findElement(By.xpath(" //option[text()='10 per page']")).click();
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,700)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);

			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,700)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			common.pause(10);

			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,700)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();
		}

	}

	/**
	 * Verify Edit pop-up box
	 */
	public void Inventory_Edit_popup_box() {
		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();
		}

		else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();

		}
	}

	/**
	 * Verify Edit Pop-up box fields
	 */
	public void Inventory_Edit_category() {

		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();

			System.out.println("Step :: Enter value in Search box");
			common.log("Step :: ENter the value in Search box");
			// driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Adult
			// Ministry");

			System.out.println("Step :: Select category from Dropdownlist");
			common.log("Step :: Select Category from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();

			System.out.println("Step :: Enter value in Search box");
			common.log("Step :: ENter the value in Search box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Adult Ministry");

			System.out.println("Step :: Select category from Dropdownlist");
			common.log("Step :: Select Category from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();

			System.out.println("Step :: Enter value in Search box");
			common.log("Step :: ENter the value in Search box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Adult Ministry");

			System.out.println("Step :: Select category from Dropdownlist");
			common.log("Step :: Select Category from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();

			System.out.println("Step :: Enter value in Search box");
			common.log("Step :: ENter the value in Search box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Adult Ministry");

			System.out.println("Step :: Select category from Dropdownlist");
			common.log("Step :: Select Category from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();
		} else if (INV04URL.equals(inv4)) {

			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Category checkbox");
			common.log("Step :: Click on Category checkbox");
			driver.findElement(By.xpath("//input[@id='chkcategory_id']")).click();

			System.out.println("Step :: Click on Category edit dropdown list");
			common.log("Step :: Click on Category edit dropdown list");
			driver.findElement(By.xpath(
					"//span[@class='select2-selection select2-selection--single']//span[@id='select2-category_id-container']"))
					.click();

			System.out.println("Step :: Enter value in Search box");
			common.log("Step :: ENter the value in Search box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Adult Ministry");

			System.out.println("Step :: Select category from Dropdownlist");
			common.log("Step :: Select Category from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Adult Ministry']")).click();

		}
	}

	/**
	 * Verify Inventory edit vendor
	 */
	public void Inventory_Edit_Vendor() {

		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Enter value in Searchbox");
			common.log("Step :: Enter value in Searchbox");
			// driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Amazon.com");

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Art Supplies Wholesale']")).click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Enter value in Searchbox");
			common.log("Step :: Enter value in Searchbox");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Amazon");

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Amazon']")).click();
		} else if (INV02URL.equals(inv2))

		{
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[2]")).click();
		} else if (INV03URL.equals(inv3)) {

			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[2]")).click();
		} else if (INV04URL.equals(inv4)) {

			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//ul//li[3]")).click();
		}

	}

	/**
	 * Verify Edit save button
	 */
	public void Edit_save_button() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Enter value in Searchbox");
			common.log("Step :: Enter value in Searchbox");
			// driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Amazon.com");

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[2]")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		} else if (INV01URL.equals(inv1)) {

			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Enter value in Searchbox");
			common.log("Step :: Enter value in Searchbox");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Amazon");

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Amazon']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[2]")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//ul[@id='select2-company_id-results']//li[2]")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: Click on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkcompany_id']")).click();

			System.out.println("Step :: Click on Vendor dropdown list");
			common.log("Step :: Click on Vendor dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-company_id-container']")).click();

			System.out.println("Step :: Select Vendor from Dropdownlist");
			common.log("Step :: Select Vendor from dropdownlist ");
			common.pause(10);
			driver.findElement(By.xpath("//li[text()='Amazon.com111']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//button[@class='btn btn btn-success']")).click();
		}
	}

	/**
	 * Verdiy Edit Cancwel button
	 * 
	 */
	public void Edit_cancel_button() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);
			System.out.println("Step::Click on Edit pop-up box cancel button");
			common.log("Step:: Click on Edit pop-up box cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);

			System.out.println("Step::Click on Edit pop-up box cancel button");
			common.log("Step:: Click on Edit pop-up box cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);

			System.out.println("Step::Click on Edit pop-up box cancel button");
			common.log("Step:: Click on Edit pop-up box cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);

			System.out.println("Step::Click on Edit pop-up box cancel button");
			common.log("Step:: Click on Edit pop-up box cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//div[@class='pull-right']//input[@value='Edit']")).click();

			common.pause(10);

			System.out.println("Step::Click on Edit pop-up box cancel button");
			common.log("Step:: Click on Edit pop-up box cancel button");
			driver.findElement(By.xpath("//button[@class='btn button btn-grays']")).click();

		}
	}

	/**
	 * verify pagination button
	 */
	public void Pagination_button() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step:: Click on 2nd number pagination button");
			common.log("Step :: CLick on 2nd number pagination button");
			driver.findElement(By.xpath("//a[text()='2']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step:: Click on 2nd number pagination button");
			common.log("Step :: CLick on 2nd number pagination button");
			driver.findElement(By.xpath("//a[text()='2']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step:: Click on 2nd number pagination button");
			common.log("Step :: CLick on 2nd number pagination button");
			driver.findElement(By.xpath("//a[text()='2']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step:: Click on 2nd number pagination button");
			common.log("Step :: CLick on 2nd number pagination button");
			driver.findElement(By.xpath("//a[text()='2']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step:: Click on 2nd number pagination button");
			common.log("Step :: CLick on 2nd number pagination button");
			driver.findElement(By.xpath("//a[text()='2']")).click();
		}
	}

	/**
	 * Verfiy Delete button
	 */
	public void Inventory_Delete_button() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: CLick on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()='Delete']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: CLick on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()='Delete']")).click();
		} else if (INV02URL.equals(inv2)) {

			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: CLick on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()='Delete']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: CLick on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()='Delete']")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step :: Click on Table row checkbox");
			common.log("Step :: Click on Table row checkbox ");
			driver.findElement(By.xpath("//table//tr[2]//input[@type='checkbox']")).click();

			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
			common.pause(10);

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: CLick on Delete button");
			driver.findElement(By.xpath("//div[@class='pull-right']//..//a[text()='Delete']")).click();
		}
	}

	/**
	 * Check the yes button of delete alert box
	 */
	public void Delte_yes_button() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Yes button of delete alert box");
			common.log("Step :: Click on YEs button of delete alert box");
			common.pause(10);
			// driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Yes button of delete alert box");
			common.log("Step :: Click on YEs button of delete alert box");
			common.pause(10);
			// driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Yes button of delete alert box");
			common.log("Step :: Click on YEs button of delete alert box");
			common.pause(10);
			// driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Yes button of delete alert box");
			common.log("Step :: Click on YEs button of delete alert box");
			common.pause(10);
			// driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Yes button of delete alert box");
			common.log("Step :: Click on YEs button of delete alert box");
			common.pause(10);
		}
	}

	/**
	 * Check the No button of delete alert box
	 */
	public void Delete_No_button() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on No button of delete alert box");
			common.log("Step :: Click on No button of delete alert box");
			common.pause(10);
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on No button of delete alert box");
			common.log("Step :: Click on No button of delete alert box");
			common.pause(10);
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on No button of delete alert box");
			common.log("Step :: Click on No button of delete alert box");
			common.pause(10);
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on No button of delete alert box");
			common.log("Step :: Click on No button of delete alert box");
			common.pause(10);
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on No button of delete alert box");
			common.log("Step :: Click on No button of delete alert box");
			common.pause(10);
			driver.findElement(By.xpath("//button[@class='btn btn-red-cancel']")).click();
		}
	}

	/**
	 * Verify New tab from header menu
	 * 
	 */
	public void New_inventory_tab() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New product checkbox");
			common.log("Step :: Click on New product checkbox");
			driver.findElement(By.xpath("//input[@value='inventory']")).click();

			common.pause(10);
			System.out.println("Step :: Enter Product code");
			common.log("Step :: Enter Product code");
			long productcode = common.numbGen();
			String abc = String.valueOf(productcode);
			System.out.println("Step :: Enter Product code >> " + abc);
			common.log("Step :: Enter Product  >> " + abc);
			driver.findElement(By.xpath("//input[@id='product_code']")).sendKeys(abc);

			common.pause(10);
			System.out.println("Step :: Enter the Inventory code");
			common.log("Step :: Enter the inventory code");
			String inventorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >> " + inventorycode);
			common.log("Step :: Enter Inventory code >> " + inventorycode);
			driver.findElement(By.xpath("//input[@id='inventory_model_code']")).sendKeys(inventorycode);
			common.pause(20);

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New product checkbox");
			common.log("Step :: Click on New product checkbox");
			driver.findElement(By.xpath("//input[@value='inventory']")).click();

			common.pause(10);
			System.out.println("Step :: Enter Product code");
			common.log("Step :: Enter Product code");
			long productcode = common.numbGen();
			String abc = String.valueOf(productcode);
			System.out.println("Step :: Enter Product code >> " + abc);
			common.log("Step :: Enter Product  >> " + abc);
			driver.findElement(By.xpath("//input[@id='product_code']")).sendKeys(abc);

			common.pause(10);
			System.out.println("Step :: Enter the Inventory code");
			common.log("Step :: Enter the inventory code");
			String inventorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >> " + inventorycode);
			common.log("Step :: Enter Inventory code >> " + inventorycode);
			driver.findElement(By.xpath("//input[@id='inventory_model_code']")).sendKeys(inventorycode);
			common.pause(20);

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New product checkbox");
			common.log("Step :: Click on New product checkbox");
			driver.findElement(By.xpath("//input[@value='inventory']")).click();

			common.pause(10);
			System.out.println("Step :: Enter Product code");
			common.log("Step :: Enter Product code");
			long productcode = common.numbGen();
			String abc = String.valueOf(productcode);
			System.out.println("Step :: Enter Product code >> " + abc);
			common.log("Step :: Enter Product  >> " + abc);
			driver.findElement(By.xpath("//input[@id='product_code']")).sendKeys(abc);

			common.pause(10);
			System.out.println("Step :: Enter the Inventory code");
			common.log("Step :: Enter the inventory code");
			String inventorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >> " + inventorycode);
			common.log("Step :: Enter Inventory code >> " + inventorycode);
			driver.findElement(By.xpath("//input[@id='inventory_model_code']")).sendKeys(inventorycode);
			common.pause(20);

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();
			common.pause(10);

			driver.findElement(By.xpath("//span[@id='select2-inventoryType-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select New product");
			common.log("Step :: Select New product");
			driver.findElement(By.xpath("//span//ul//li[2]")).click();

			common.pause(10);
			System.out.println("Step :: Enter Product code");
			common.log("Step :: Enter Product code");
			long productcode = common.numbGen();
			String abc = String.valueOf(productcode);
			System.out.println("Step :: Enter Product code >> " + abc);
			common.log("Step :: Enter Product  >> " + abc);
			driver.findElement(By.xpath("//input[@id='product_code']")).sendKeys(abc);

			common.pause(10);
			System.out.println("Step :: Enter the Inventory code");
			common.log("Step :: Enter the inventory code");
			String inventorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >> " + inventorycode);
			common.log("Step :: Enter Inventory code >> " + inventorycode);
			driver.findElement(By.xpath("//input[@id='inventory_model_code']")).sendKeys(inventorycode);
			common.pause(20);

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New product checkbox");
			common.log("Step :: Click on New product checkbox");
			driver.findElement(By.xpath("//input[@value='inventory']")).click();

			common.pause(10);
			System.out.println("Step :: Enter Product code");
			common.log("Step :: Enter Product code");
			long productcode = common.numbGen();
			String abc = String.valueOf(productcode);
			System.out.println("Step :: Enter Product code >> " + abc);
			common.log("Step :: Enter Product  >> " + abc);
			driver.findElement(By.xpath("//input[@id='product_code']")).sendKeys(abc);

			common.pause(10);
			System.out.println("Step :: Enter the Inventory code");
			common.log("Step :: Enter the inventory code");
			String inventorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >> " + inventorycode);
			common.log("Step :: Enter Inventory code >> " + inventorycode);
			driver.findElement(By.xpath("//input[@id='inventory_model_code']")).sendKeys(inventorycode);
			common.pause(20);

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

		}

		/**
		 * check New inventory with checkboxes
		 */

	}

	public void Inventory_No_checkbox()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: CLick on No product code checkbox");
			common.log("Step :: CLick on No Product code chekcbox");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			System.out.println("Step :: CLick on Auto generate inventory code checkbox");
			common.log("Step :: CLicko n Auto generate inventory checkbox");
			driver.findElement(By.xpath("//input[@name='auto_generate']")).click();

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: CLick on No product code checkbox");
			common.log("Step :: CLick on No Product code chekcbox");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			System.out.println("Step :: CLick on Auto generate inventory code checkbox");
			common.log("Step :: CLicko n Auto generate inventory checkbox");
			driver.findElement(By.xpath("//input[@name='auto_generate']")).click();

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: CLick on No product code checkbox");
			common.log("Step :: CLick on No Product code chekcbox");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			System.out.println("Step :: CLick on Auto generate inventory code checkbox");
			common.log("Step :: CLicko n Auto generate inventory checkbox");
			driver.findElement(By.xpath("//input[@name='auto_generate']")).click();

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			
			driver.findElement(By.xpath("//span[@id='select2-inventoryType-container']")).click();
			
			System.out.println("Step :: Select the Type ");
			common.log("Step :: Select the Type");
			driver.findElement(By.xpath("//span[@class='select2-results']//ul//li[2]")).click();
			
			System.out.println("Step :: CLick on No product code checkbox");
			common.log("Step :: CLick on No Product code chekcbox");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			String inventorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the Inventory code");
			common.log("Step :: Enter the Inventory code");
			driver.findElement(By.xpath("//input[@id='inventory_model_code']")).sendKeys(inventorycode);
			
			
			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: CLick on No product code checkbox");
			common.log("Step :: CLick on No Product code chekcbox");
			driver.findElement(By.xpath("//input[@name='no_product_code']")).click();

			System.out.println("Step :: CLick on Auto generate inventory code checkbox");
			common.log("Step :: CLicko n Auto generate inventory checkbox");
			driver.findElement(By.xpath("//input[@name='auto_generate']")).click();

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			String Model = common.generateRandomChars(5);
			System.out.println("Step :: Enter Model >> " + Model);
			common.log("Step :: Enter  Model >> " + Model);
			driver.findElement(By.xpath("//input[@id='short_description']")).sendKeys(Model);

			common.pause(10);

			System.out.println("Step :: Click on Category drop-down list");
			common.log("Step :: Click on Category drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-category-container']")).click();

			System.out.println("Step :: Select Category from list");
			common.log("Step :: Select cagegory from list");
			driver.findElement(By.xpath("//ul[@id='select2-category-results']//li[2]")).click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >> " + Description);
			common.log("Step :: Enter  Description >> " + Description);
			driver.findElement(By.xpath("//textarea[@id='long_description']")).sendKeys(Description);
			common.pause(10);
			common.Scrollpage();
			System.out.println("Step :: Click on Vendor drop-down list");
			common.log("Step :: Click on Vendor drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-vendor-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select  Vendor from list");
			common.log("Step :: Select Vendor from  list");
			driver.findElement(By.xpath("//ul[@id='select2-vendor-results']//li[2]")).click();

			String Brand = common.generateRandomChars(5);
			System.out.println("Step :: Enter Brand >> " + Brand);
			common.log("Step :: Enter  Brand >> " + Brand);
			driver.findElement(By.xpath("//input[@id='brand']")).sendKeys(Brand);

			System.out.println("Step :: Click on Site drop-down list");
			common.log("Step :: Click on Site drop-down list");
			driver.findElement(By.xpath("//span[@id='select2-source_location_site-container']")).click();

			common.pause(10);
			System.out.println("Step :: Select Site from list");
			common.log("Step :: Select Site from  list");
			driver.findElement(By.xpath("//ul[@id='select2-source_location_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(quantity);

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter cost >> " + cost);
			common.log("Step :: Enter  cost >> " + cost);
			driver.findElement(By.xpath("//input[@id='cost']")).sendKeys(cost);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();
		}
	}

	/**
	 * Check the inventory New kit summary
	 */

	public void New_kit_Box() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New kit radio button");
			common.log("Step :: Click on New kit radio button");
			driver.findElement(By.xpath("//input[@value='kit']")).click();

			System.out.println("Step :: Click on  Add kit summary items field Search icon");
			common.log("Step :: Click on  Add kit summary items field Search icon");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();

			common.pause(200);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button of inventory search page");
			common.log("Step :: Click on Add button of invnetory search page");
			driver.findElement(By.xpath("//button[@id='btnModelAddKit']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='kitQuantity']")).sendKeys(quantity);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New kit radio button");
			common.log("Step :: Click on New kit radio button");
			driver.findElement(By.xpath("//input[@value='kit']")).click();

			System.out.println("Step :: Click on  Add kit summary items field Search icon");
			common.log("Step :: Click on  Add kit summary items field Search icon");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();

			common.pause(200);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button of inventory search page");
			common.log("Step :: Click on Add button of invnetory search page");
			driver.findElement(By.xpath("//button[@id='btnModelAddKit']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='kitQuantity']")).sendKeys(quantity);
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New kit radio button");
			common.log("Step :: Click on New kit radio button");
			driver.findElement(By.xpath("//input[@value='kit']")).click();

			System.out.println("Step :: Click on  Add kit summary items field Search icon");
			common.log("Step :: Click on  Add kit summary items field Search icon");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();

			common.pause(200);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button of inventory search page");
			common.log("Step :: Click on Add button of invnetory search page");
			driver.findElement(By.xpath("//button[@id='btnModelAddKit']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='kitQuantity']")).sendKeys(quantity);
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			driver.findElement(By.xpath("//span[@id='select2-inventoryType-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select bundle from type drop-down list");
			common.log("Step :: Select bundle from type drop-down list");
			driver.findElement(By.xpath("//span//ul//li[3]")).click();

			System.out.println("Step :: Click on  Add kit summary items field Search icon");
			common.log("Step :: Click on  Add kit summary items field Search icon");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();

			common.pause(200);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button of inventory search page");
			common.log("Step :: Click on Add button of invnetory search page");
			driver.findElement(By.xpath("//button[@id='btnModelAddBundle']")).click();

			String inventorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >> " + inventorycode);
			common.log("Step :: Enter Inventory code >> " + inventorycode);
			driver.findElement(By.xpath("//input[@id='inventory_model_code']")).sendKeys(inventorycode);
			common.pause(20);

			String Title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + Title);
			common.log("Step :: Enter  TItle >> " + Title);
			driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys(Title);

			System.out.println("Step :: Click on Save button ");
			common.log("Step ::  Click on Save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on New tab from header menu");
			common.log("Step :: Click on New tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/new']")).click();

			System.out.println("Step :: Click on New kit radio button");
			common.log("Step :: Click on New kit radio button");
			driver.findElement(By.xpath("//input[@value='kit']")).click();

			System.out.println("Step :: Click on  Add kit summary items field Search icon");
			common.log("Step :: Click on  Add kit summary items field Search icon");
			driver.findElement(By.xpath("//span[@id='sizing-addon2']")).click();

			common.pause(200);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button of inventory search page");
			common.log("Step :: Click on Add button of invnetory search page");
			driver.findElement(By.xpath("//button[@id='btnModelAddKit']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='kitQuantity']")).sendKeys(quantity);

		}
	}

	/**
	 * Verify Move tab from header menu
	 */
	public void Inventory_Move() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(50);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Source drop downlist");
			common.log("Sttep ::Click on source drop down list");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();
			common.pause(10);
			System.out.println("Step :: Select item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[2]")).click();

			System.out.println("Step :: Click on Destination Drop down list");
			common.log("Step :: Click on Destionation drop diown list");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//ul[@id='select2-move_to_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(50);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Source drop downlist");
			common.log("Sttep ::Click on source drop down list");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();
			common.pause(10);
			System.out.println("Step :: Select item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[2]")).click();

			System.out.println("Step :: Click on Destination Drop down list");
			common.log("Step :: Click on Destionation drop diown list");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//ul[@id='select2-move_to_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(50);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Source drop downlist");
			common.log("Sttep ::Click on source drop down list");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();
			common.pause(10);
			System.out.println("Step :: Select item from list");
			common.log("Step :: Select item from list");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[2]")).click();

			System.out.println("Step :: Click on Destination Drop down list");
			common.log("Step :: Click on Destionation drop diown list");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//ul[@id='select2-move_to_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(100);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);

			System.out.println("Step :: Click on From field");
			common.log("Step :: Click on From field");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span//ul//li[2]")).click();

			System.out.println("Step :: Click on To field");
			common.log("Step :: Click on To field");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(100);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);

			System.out.println("Step :: Click on From field");
			common.log("Step :: Click on From field");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			System.out.println("Step :: Enter the value in Search box");
			common.log("Step :: Enter the value in Search box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("AVD");

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='AVD']")).click();

			System.out.println("Step :: Click on To field");
			common.log("Step :: Click on To field");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();

			System.out.println("Step :: ENter the value in search box");
			common.log("Step :: Enter the value in seach box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		}
	}

	public void Move_inventory_Yes_toogle_button() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(30);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			common.pause(10);
			System.out.println("Step :: Click on From drop downlist");
			common.log("Sttep ::Click on source drop down list");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();
			common.pause(30);

			System.out.println("Step :: Select value Source drop down  list");
			common.log("Step :: Select value source drop down list");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[2]")).click();

			System.out.println("Step :: Click on Destination Drop down list");
			common.log("Step :: Click on Destionation drop diown list");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//ul[@id='select2-move_to_site-results']//li[2]")).click();

			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();
			common.assertElementPresent("//div[@class='make-switch has-switch']");

			System.out.println("Step :: Click on Yes Toggle button");
			common.log("Step :: Click on Tooggle button");
			driver.findElement(By.xpath("//div[@class='make-switch has-switch']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(30);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Source drop downlist");
			common.log("Sttep ::Click on source drop down list");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();
			common.pause(30);

			System.out.println("Step :: Select value Source drop down  list");
			common.log("Step :: Select value source drop down list");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[2]")).click();

			System.out.println("Step :: Click on Destination Drop down list");
			common.log("Step :: Click on Destionation drop diown list");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//ul[@id='select2-move_to_site-results']//li[2]")).click();

			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(30);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Source drop downlist");
			common.log("Sttep ::Click on source drop down list");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();
			common.pause(30);

			System.out.println("Step :: Select value Source drop down  list");
			common.log("Step :: Select value source drop down list");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[2]")).click();

			System.out.println("Step :: Click on Destination Drop down list");
			common.log("Step :: Click on Destionation drop diown list");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();
			common.pause(10);

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//ul[@id='select2-move_to_site-results']//li[2]")).click();

			common.pause(10);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();
			common.pause(100);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);

			System.out.println("Step :: Click on From field");
			common.log("Step :: Click on From field");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span//ul//li[2]")).click();

			System.out.println("Step :: Click on To field");
			common.log("Step :: Click on To field");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Move tab from header menu");
			common.log("Step :: Click on Move tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/move']")).click();

			System.out.println("Step :: CLick on Search icon of invneotry code field");
			common.log("Step :: Click on Search icon of inventory code field");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(100);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on From field");
			common.log("Step :: Click on From field");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			System.out.println("Step :: Enter the value in Search box");
			common.log("Step :: Enter the value in Search box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			System.out.println("Step :: Click on To field");
			common.log("Step :: Click on To field");
			driver.findElement(By.xpath("//span[@id='select2-move_to_site-container']")).click();

			System.out.println("Step :: ENter the value in search box");
			common.log("Step :: Enter the value in seach box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		}
	}

	public void Remove_invnetory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Remove tabl from header menu");
			common.log("Step :: Click on Remove tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/remove']")).click();

			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(100);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Source drop downlist ");
			common.log("Step :: Click on Source drop dowlist");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			System.out.println("Select value from Source dropdownlist");
			common.log("Step :: Select value from Soure dropdownlist");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[1]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Remove tabl from header menu");
			common.log("Step :: Click on Remove tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/remove']")).click();

			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(20);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Source drop downlist ");
			common.log("Step :: Click on Source drop dowlist");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			System.out.println("Select value from Source dropdownlist");
			common.log("Step :: Select value from Soure dropdownlist");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[1]")).click();

			System.out.println("Step:: Click on Department Dropdown list");
			common.log("Step :: Click on Department Dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-department_id-container']")).click();

			System.out.println("Step ::Select value from Department dropdownlist");
			common.log("Step :: Select value from Department dropdownlist");
			driver.findElement(By.xpath("//ul[@id='select2-department_id-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Remove tabl from header menu");
			common.log("Step :: Click on Remove tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/remove']")).click();

			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(25);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			common.pause(10);

			System.out.println("Step :: Click on from drop downlist ");
			common.log("Step :: Click on from drop dowlist");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			common.pause(20);

			System.out.println("Select value from Source dropdownlist");
			common.log("Step :: Select value from Soure dropdownlist");
			driver.findElement(By.xpath("//ul[@id='select2-source_site-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Remove tabl from header menu");
			common.log("Step :: Click on Remove tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/remove']")).click();

			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(100);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
common.pause(10);
			
			System.out.println("Step :: Click on From field");
			common.log("Step :: Click on From field");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

		common.pause(10);
			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span//ul//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Remove tabl from header menu");
			common.log("Step :: Click on Remove tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/remove']")).click();

			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(100);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on From field");
			common.log("Step :: Click on From field");
			driver.findElement(By.xpath("//span[@id='select2-source_site-container']")).click();

			System.out.println("Step :: Enter the value in Search box");
			common.log("Step :: Enter the value in Search box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		}

	}

	// Blocker issue when toggle button on with yes ,project item does not
	// display

	// Verify Restock inventory

	public void Restock_Inventroy() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Restock tab from header menu");
			common.log("Step :: Click on Restock tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/restock']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(20);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on To drop-down list");
			common.log("Step :: Click on To Drop downlist");
			driver.findElement(By.xpath("//span[@id='select2-restockToSite-container']")).click();

			System.out.println("Step :: Select value from TO dropdown list");
			common.log("Step :: Select value from TO  dropdown list");
			driver.findElement(By.xpath("//ul[@id='select2-restockToSite-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Restock tab from header menu");
			common.log("Step :: Click on Restock tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/restock']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(20);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Destination Drop downlist");
			common.log("Step :: Click on Destination Drop downlist");
			driver.findElement(By.xpath("//span[@id='select2-restockToSite-container']")).click();

			System.out.println("Step :: Select value from Destiantion dropdown list");
			common.log("Step :: Select value from Destination sropdown list");
			driver.findElement(By.xpath("//ul[@id='select2-restockToSite-results']//li[2]")).click();

			System.out.println("Step :: Click on Department dropdownl list");
			common.log("Step :: Click on Department dropdown list");
			driver.findElement(By.xpath("//span[@id='select2-department_id-container']")).click();

			System.out.println("Step :: Select value from Department dropdown list");
			common.log("Step :: Select value from Department sropdown list");
			driver.findElement(By.xpath("//ul[@id='select2-department_id-results']//li[2]")).click();

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + cost);
			common.log("Step :: Enter  quantity >> " + cost);
			driver.findElement(By.xpath("//input[@id='txtCost']")).sendKeys(cost);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Restock tab from header menu");
			common.log("Step :: Click on Restock tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/restock']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(20);
			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on To Drop downlist");
			common.log("Step :: Click on To Drop downlist");
			driver.findElement(By.xpath("//span[@id='select2-restockToSite-container']")).click();

			System.out.println("Step :: Select value from To dropdown list");
			common.log("Step :: Select value from To sropdown list");
			driver.findElement(By.xpath("//ul[@id='select2-restockToSite-results']//li[2]")).click();

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Restock tab from header menu");
			common.log("Step :: Click on Restock tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/restock']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(100);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[2]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on To field");
			common.log("Step :: Click on To field");
			driver.findElement(By.xpath("//span[@id='select2-restockToSite-container']")).click();

			common.pause(10);

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//span//ul//li[2]")).click();

			

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Restock tab from header menu");
			common.log("Step :: Click on Restock tab from header menu");
			driver.findElement(By.xpath("//a[@href='/inventory/restock']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Inventory code search icon button");
			common.log("Step :: Click on Inventory code search icon button");
			driver.findElement(By.xpath("//span[@class='input-group-addon addon-search']")).click();

			common.pause(100);

			System.out.println("Step :: Select value from table ");
			common.log("Step :: Select value from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//input[@type='radio']")).click();

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on To field");
			common.log("Step :: Click on To field");
			driver.findElement(By.xpath("//span[@id='select2-restockToSite-container']")).click();

			System.out.println("Step :: Enter the value in search box");
			common.log("Step :: Enter the value in seach box");
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ATH");

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			driver.findElement(By.xpath("//li[text()='ATH']")).click();

			String cost = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + cost);
			common.log("Step :: Enter  quantity >> " + cost);
			driver.findElement(By.xpath("//input[@id='txtCost']")).sendKeys(cost);

			String quantity = common.generateRandomNumber1();
			System.out.println("Step :: Enter quantity >> " + quantity);
			common.log("Step :: Enter  quantity >> " + quantity);
			driver.findElement(By.xpath("//input[@id='txtQuantity']")).sendKeys(quantity);

			System.out.println("Step :: Click on Add button");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();

		}
	}

}
