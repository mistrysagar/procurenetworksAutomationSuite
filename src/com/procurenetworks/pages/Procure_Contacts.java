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

public class Procure_Contacts extends AbstractPage {

	Common common = new Common(driver);

	String preurl = driver.getCurrentUrl();
	String PREURL = "https://inv-pre.qa.procurenetworks.com/companies";

	String inv1 = driver.getCurrentUrl();
	String INV01URL = "https://inv-01.qa.procurenetworks.com/companies";

	String inv2 = driver.getCurrentUrl();
	String INV02URL = "https://inv-02.qa.procurenetworks.com/companies";

	String inv3 = driver.getCurrentUrl();
	String INV03URL = "https://inv-03.qa.procurenetworks.com/companies";

	String inv4 = driver.getCurrentUrl();
	String INV04URL = "https://inv-04.qa.procurenetworks.com/companies";

	String username = "ADMIN";
	String password = "admin";

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public Procure_Contacts(WebDriver driver) {
		super(driver);

	}

	/**
	 * Verify Contacts
	 * 
	 */
	public void Contacts() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Contacts tab");
			common.log("Step :: Click on Contacts tab");
			driver.findElement(By.xpath("//a[@href='https://inv-pre.qa.procurenetworks.com/companies']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Contacts tab");
			common.log("Step :: Click on Contacts tab");
			driver.findElement(By.xpath("//a[@href='https://inv-01.qa.procurenetworks.com/companies']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Contacts tab");
			common.log("Step :: Click on Contacts tab");
			driver.findElement(By.xpath("//a[@href='https://inv-02.qa.procurenetworks.com/companies']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Contacts tab");
			common.log("Step :: Click on Contacts tab");
			driver.findElement(By.xpath("//a[@href='https://inv-03.qa.procurenetworks.com/companies']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Contacts tab");
			common.log("Step :: Click on Contacts tab");
			driver.findElement(By.xpath("//a[@href='https://inv-04.qa.procurenetworks.com/companies']")).click();
		}
	}

	/**
	 * Verify Company Tab
	 * 
	 */
	public void Companytab() {
		if (PREURL.equals(preurl)) {
			System.out.print("Step:: Click on Companies tab from header menu");
			common.log("Step :: Click on Companies tab from header menu");
			driver.findElement(By.xpath("//a[@href='/companies']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.print("Step:: Click on Companies tab from header menu");
			common.log("Step :: Click on Companies tab from header menu");
			driver.findElement(By.xpath("//a[@href='/companies']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.print("Step:: Click on Companies tab from header menu");
			common.log("Step :: Click on Companies tab from header menu");
			driver.findElement(By.xpath("//a[@href='/companies']")).click();

		} else if (INV03URL.equals(inv3)) {
			System.out.print("Step:: Click on Companies tab from header menu");
			common.log("Step :: Click on Companies tab from header menu");
			driver.findElement(By.xpath("//a[@href='/companies']")).click();
		} else if (INV04URL.equals(inv4)) {

			System.out.print("Step:: Click on Companies tab from header menu");
			common.log("Step :: Click on Companies tab from header menu");
			driver.findElement(By.xpath("//a[@href='/companies']")).click();
		}
	}

	/**
	 * Verify Company Search Box
	 * 
	 */

	public void Comapny_Searchbox() {
		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Enter the value in Compnay Search box");
			common.log("Step :: Enter the value in Comapny Search box");
			driver.findElement(
					By.xpath("//div[@id='company-table_filter']//input[@class='form-control input-sm search-input']"))
					.sendKeys("Amazon.com");

		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step :: Enter the value in Compnay Search box");
			common.log("Step :: Enter the value in Comapny Search box");
			driver.findElement(
					By.xpath("//div[@id='company-table_filter']//input[@class='form-control input-sm search-input']"))
					.sendKeys("Amazon.com");
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Enter the value in Compnay Search box");
			common.log("Step :: Enter the value in Comapny Search box");
			driver.findElement(
					By.xpath("//div[@id='company-table_filter']//input[@class='form-control input-sm search-input']"))
					.sendKeys("Amazon.com");
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step :: Enter the value in Compnay Search box");
			common.log("Step :: Enter the value in Comapny Search box");
			driver.findElement(
					By.xpath("//div[@id='company-table_filter']//input[@class='form-control input-sm search-input']"))
					.sendKeys("Amazon.com");
		} else if (INV04URL.equals(inv4)) {

			common.pause(10);
			System.out.println("Step :: Enter the value in Compnay Search box");
			common.log("Step :: Enter the value in Comapny Search box");
			driver.findElement(
					By.xpath("//div[@id='company-table_filter']//input[@class='form-control input-sm search-input']"))
					.sendKeys("Amazon.com");
		}
	}

	/**
	 * Verify Create New Company
	 * 
	 */

	public void Create_Newcompany() {

		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step :: Click on New company button");
			common.log("Step :: Click on New company button");
			driver.findElement(By.xpath("//button[@id='btn-newCompany']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Company Name >> " + Companyname);
			common.log("Step :: Enter Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: CLick on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkVendor']")).click();

			String website = common.generateRandomChars(5);
			System.out.println("Step :: Enter website Name >> " + website);
			common.log("Step :: Enter website Name >> " + website);
			driver.findElement(By.xpath("//input[@id='txtWebsite']")).sendKeys(website);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String telephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Telephone  >> " + telephone);
			common.log("Step :: Enter Telephone >> " + telephone);
			driver.findElement(By.xpath(" //input[@id='txtPhone']")).sendKeys(telephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath("//div[@id='new-save-cancel']//input[@id='save']")).click();
			common.pause(20);
		}

		else if (INV01URL.equals(inv1)) {
			common.pause(30);
			System.out.println("Step :: Click on New company button");
			common.log("Step :: Click on New company button");
			driver.findElement(By.xpath("//button[@id='btn-newCompany']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Company Name >> " + Companyname);
			common.log("Step :: Enter Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: CLick on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkVendor']")).click();

			String website = common.generateRandomChars(5);
			System.out.println("Step :: Enter website Name >> " + website);
			common.log("Step :: Enter website Name >> " + website);
			driver.findElement(By.xpath("//input[@id='txtWebsite']")).sendKeys(website);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String telephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Telephone  >> " + telephone);
			common.log("Step :: Enter Telephone >> " + telephone);
			driver.findElement(By.xpath(" //input[@id='txtPhone']")).sendKeys(telephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath("//div[@id='new-save-cancel']//input[@id='save']")).click();

		}

		else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step :: Click on New company button");
			common.log("Step :: Click on New company button");
			driver.findElement(By.xpath("//button[@id='btn-newCompany']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Company Name >> " + Companyname);
			common.log("Step :: Enter Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: CLick on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkVendor']")).click();

			String website = common.generateRandomChars(5);
			System.out.println("Step :: Enter website Name >> " + website);
			common.log("Step :: Enter website Name >> " + website);
			driver.findElement(By.xpath("//input[@id='txtWebsite']")).sendKeys(website);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String telephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Telephone  >> " + telephone);
			common.log("Step :: Enter Telephone >> " + telephone);
			driver.findElement(By.xpath(" //input[@id='txtPhone']")).sendKeys(telephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath("//div[@id='new-save-cancel']//input[@id='save']")).click();

		} else if (INV03URL.equals(inv3)) {

			common.pause(10);
			System.out.println("Step :: Click on New company button");
			common.log("Step :: Click on New company button");
			driver.findElement(By.xpath("//button[@id='btn-newCompany']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Company Name >> " + Companyname);
			common.log("Step :: Enter Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: CLick on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkVendor']")).click();

			String website = common.generateRandomChars(5);
			System.out.println("Step :: Enter website Name >> " + website);
			common.log("Step :: Enter website Name >> " + website);
			driver.findElement(By.xpath("//input[@id='txtWebsite']")).sendKeys(website);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String telephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Telephone  >> " + telephone);
			common.log("Step :: Enter Telephone >> " + telephone);
			driver.findElement(By.xpath(" //input[@id='txtPhone']")).sendKeys(telephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath("//div[@id='new-save-cancel']//input[@id='save']")).click();
		}
		else if (INV04URL.equals(inv4))
		{
			

			common.pause(20);
			System.out.println("Step :: Click on New company button");
			common.log("Step :: Click on New company button");
			driver.findElement(By.xpath("//button[@id='btn-newCompany']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Company Name >> " + Companyname);
			common.log("Step :: Enter Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			System.out.println("Step :: Click on Vendor checkbox");
			common.log("Step :: CLick on Vendor checkbox");
			driver.findElement(By.xpath("//input[@id='chkVendor']")).click();

			String website = common.generateRandomChars(5);
			System.out.println("Step :: Enter website Name >> " + website);
			common.log("Step :: Enter website Name >> " + website);
			driver.findElement(By.xpath("//input[@id='txtWebsite']")).sendKeys(website);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String telephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Telephone  >> " + telephone);
			common.log("Step :: Enter Telephone >> " + telephone);
			driver.findElement(By.xpath(" //input[@id='txtPhone']")).sendKeys(telephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath("//div[@id='new-save-cancel']//input[@id='save']")).click();
		}
	}

	// BLocker for Inv-01 and INV-02
	public void Edit_Comapny() {
		if (PREURL.equals(preurl)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for edit");
			common.log("Step :: Select comapny for edit");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter New Company Name >> " + Companyname);
			common.log("Step :: Enter New Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			common.pause(10);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath(
					"//div[@id='save-cancel']//div[@class='col-lg-offset-2 col-lg-4 col-md-offset-3 col-md-8 text-right']//input[@value='Save']"))
					.click();
		}

		else if (INV01URL.equals(inv1)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for edit");
			common.log("Step :: Select comapny for edit");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter New Company Name >> " + Companyname);
			common.log("Step :: Enter New Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			common.pause(10);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath(
					"//div[@id='save-cancel']//div[@class='col-lg-offset-2 col-lg-4 col-md-offset-3 col-md-8 text-right']//input[@value='Save']"))
					.click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for edit");
			common.log("Step :: Select comapny for edit");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter New Company Name >> " + Companyname);
			common.log("Step :: Enter New Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			common.pause(10);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath(
					"//div[@id='save-cancel']//div[@class='col-lg-offset-2 col-lg-4 col-md-offset-3 col-md-8 text-right']//input[@value='Save']"))
					.click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for edit");
			common.log("Step :: Select comapny for edit");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter New Company Name >> " + Companyname);
			common.log("Step :: Enter New Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			common.pause(10);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath(
					"//div[@id='save-cancel']//div[@class='col-lg-offset-2 col-lg-4 col-md-offset-3 col-md-8 text-right']//input[@value='Save']"))
					.click();
		}
		else if (INV04URL.equals(inv4))
		{
			common.pause(30);
			System.out.println("Step ::Select comapny for edit");
			common.log("Step :: Select comapny for edit");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String Companyname = common.generateRandomChars(5);
			System.out.println("Step :: Enter New Company Name >> " + Companyname);
			common.log("Step :: Enter New Company Name >> " + Companyname);
			driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(Companyname);

			common.pause(10);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: CLick on Save button");
			driver.findElement(By.xpath(
					"//div[@id='save-cancel']//div[@class='col-lg-offset-2 col-lg-4 col-md-offset-3 col-md-8 text-right']//input[@value='Save']"))
					.click();
			
		}
		
	}

	public void Delete_Company() {
		if (PREURL.equals(preurl)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for Delete");
			common.log("Step :: Select comapny for Delete");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@id='delete']")).click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for Delete");
			common.log("Step :: Select comapny for Delete");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@id='delete']")).click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for Delete");
			common.log("Step :: Select comapny for Delete");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@id='delete']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(30);
			System.out.println("Step ::Select comapny for Delete");
			common.log("Step :: Select comapny for Delete");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@id='delete']")).click();
		}
		else if (INV04URL.equals(inv4))
		{
			common.pause(30);
			System.out.println("Step ::Select comapny for Delete");
			common.log("Step :: Select comapny for Delete");
			driver.findElement(By.xpath("//table//tr[3]")).click();

			common.pause(20);

			System.out.println("Step :: CLick on Edit button");
			common.log("Step :: CLick onEdit button");
			driver.findElement(By.xpath("//a[@id='delete']")).click();
			
		}
	}

	public void Create_Newcontact() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btnCompany']")).click();

			common.pause(10);
			//
			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@id='select2-companyName-container']")).click();

			// common.pause(10);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath(""))

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='phone_home']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='fax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btnCompany']")).click();

			common.pause(10);
			//
			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@id='select2-companyName-container']")).click();

			// common.pause(10);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath(""))

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='phone_home']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='fax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");

		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: CLick on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btnCompany']")).click();

			common.pause(10);
			//
			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@id='select2-companyName-container']")).click();

			// common.pause(10);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath(""))

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='phone_home']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='fax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: CLick on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btnCompany']")).click();

			common.pause(10);
			//
			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@id='select2-companyName-container']")).click();

			// common.pause(10);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath(""))

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='phone_home']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='fax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
		}
		
		else if (INV04URL.equals(inv4))
		{
			
			System.out.println("Step :: CLick on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btnCompany']")).click();

			common.pause(10);
			//
			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@id='select2-companyName-container']")).click();

			// common.pause(10);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath(""))

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='phone_home']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='fax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
		}
	}

	public void Create_NewAddress()

	{

		if (PREURL.equals(preurl)) {
			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step:: Click on New Address button");
			common.log("Step :: Click on New Address button");
			driver.findElement(By.xpath("//button[@id='btnAddress']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();

		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step:: Click on New Address button");
			common.log("Step :: Click on New Address button");
			driver.findElement(By.xpath("//button[@id='btnAddress']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step:: Click on New Address button");
			common.log("Step :: Click on New Address button");
			driver.findElement(By.xpath("//button[@id='btnAddress']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step:: Click on New Address button");
			common.log("Step :: Click on New Address button");
			driver.findElement(By.xpath("//button[@id='btnAddress']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
		}
		else if (INV04URL.equals(inv4))
			
		{
			common.pause(10);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			common.pause(10);

			System.out.println("Step:: Click on New Address button");
			common.log("Step :: Click on New Address button");
			driver.findElement(By.xpath("//button[@id='btnAddress']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			
		}
	}

	public void Verfiy_Contactstab() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();

			common.pause(10);

			System.out.println("Step :: Enter the value in Contact searchbox");
			common.log("Step :: Enter the value in Contact searchbox");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("sagar mistry");

			common.pause(20);
			System.out.println("Step :: Click on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btn-newContact']")).click();

			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();
			//
			// common.pause(20);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();

			common.pause(10);
			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//a[@id='save-contact']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();

			common.pause(10);

			System.out.println("Step :: Enter the value in Contact searchbox");
			common.log("Step :: Enter the value in Contact searchbox");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("sagar mistry");

			common.pause(20);
			System.out.println("Step :: Click on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btn-newContact']")).click();

			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();
			//
			// common.pause(20);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();

			common.pause(10);
			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(10);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//a[@id='save-contact']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();

			common.pause(10);

			System.out.println("Step :: Enter the value in Contact searchbox");
			common.log("Step :: Enter the value in Contact searchbox");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("sagar mistry");

			common.pause(20);
			System.out.println("Step :: Click on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btn-newContact']")).click();

			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();
			//
			// common.pause(20);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();

			common.pause(10);
			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//a[@id='save-contact']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();

			

			common.pause(20);
			System.out.println("Step :: Click on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btn-newContact']")).click();

			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();
			//
			// common.pause(20);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();

			common.pause(10);
			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//a[@id='save-contact']")).click();
		}
		else if (INV04URL.equals(inv4))
		{
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();

			common.pause(10);

			System.out.println("Step :: Enter the value in Contact searchbox");
			common.log("Step :: Enter the value in Contact searchbox");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']"))
					.sendKeys("sagar mistry");

			common.pause(20);
			System.out.println("Step :: Click on New contact button");
			common.log("Step :: Click on New contact button");
			driver.findElement(By.xpath("//button[@id='btn-newContact']")).click();

			// System.out.println("Step :: CLick on Company name drop-downlist");
			// common.log("Step :: Click on Company name drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();
			//
			// common.pause(20);
			// System.out.println("Step :: Select Company name from drop-downlist");
			// common.log("Step :: Select Company name from drop-downlist");
			// driver.findElement(By.xpath("//span[@class='selection']//span[@id='select2-txtName-container']")).click();

			common.pause(10);
			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Enter First Name >> " + firstname);
			common.log("Step :: Enter First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Last Name >> " + lastname);
			common.log("Step :: Enter New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Enter Title >> " + title);
			common.log("Step :: Enter Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@procurenetworks.com");

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//a[@id='save-contact']")).click();
			
		}
		
	}

	public void Edit_ContactfromContacttab() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);
			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Edit button ");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Edit First Name >> " + firstname);
			common.log("Step :: Edit First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Edit Last Name >> " + lastname);
			common.log("Step :: Editr New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Edit Title >> " + title);
			common.log("Step :: Edit Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='save']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);
			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Edit button ");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Edit First Name >> " + firstname);
			common.log("Step :: Edit First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Edit Last Name >> " + lastname);
			common.log("Step :: Editr New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Edit Title >> " + title);
			common.log("Step :: Edit Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='save']")).click();
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);
			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Edit button ");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Edit First Name >> " + firstname);
			common.log("Step :: Edit First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Edit Last Name >> " + lastname);
			common.log("Step :: Editr New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Edit Title >> " + title);
			common.log("Step :: Edit Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='save']")).click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);
			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Edit button ");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Edit First Name >> " + firstname);
			common.log("Step :: Edit First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Edit Last Name >> " + lastname);
			common.log("Step :: Editr New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Edit Title >> " + title);
			common.log("Step :: Edit Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='save']")).click();
		}
		else if (INV04URL.equals(inv4))
		{
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);
			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			common.pause(10);

			System.out.println("Step :: Click on Edit button ");
			common.log("Step :: Click on Edit button");
			driver.findElement(By.xpath("//a[@class='button edit-btn']")).click();

			String firstname = common.generateRandomChars(5);
			System.out.println("Step :: Edit First Name >> " + firstname);
			common.log("Step :: Edit First Name >> " + firstname);
			driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys(firstname);

			String lastname = common.generateRandomChars(5);
			System.out.println("Step :: Edit Last Name >> " + lastname);
			common.log("Step :: Editr New Last Name >> " + lastname);
			driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys(lastname);

			String title = common.generateRandomChars(5);
			System.out.println("Step :: Edit Title >> " + title);
			common.log("Step :: Edit Title >> " + title);
			driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys(title);

			String officephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Office phone  >> " + officephone);
			common.log("Step :: Enter Office phone >> " + officephone);
			driver.findElement(By.xpath("//input[@id='txtOfficePhone']")).sendKeys(officephone);

			String Homephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Home phone  >> " + Homephone);
			common.log("Step :: Enter Home phone >> " + Homephone);
			driver.findElement(By.xpath("//input[@id='txtHomePhone']")).sendKeys(Homephone);

			String mobilephone = common.generateRandomNumber1();
			System.out.println("Step :: Enter Mobile phone  >> " + mobilephone);
			common.log("Step :: Enter Mobile phone >> " + mobilephone);
			driver.findElement(By.xpath("//input[@id='txtMobilePhone']")).sendKeys(mobilephone);

			String Fax = common.generateRandomNumber1();
			System.out.println("Step :: Enter Fax  >> " + Fax);
			common.log("Step :: Enter Fax >> " + Fax);
			driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(Fax);

			System.out.println("Step :: Click on Address button to add address");
			common.log("Step :: Click onAddress button to add address");
			driver.findElement(By.xpath("//button[@id='btnSearch']")).click();

			String addressname = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address Name >> " + addressname);
			common.log("Step :: Enter Address Name >> " + addressname);
			driver.findElement(By.xpath("//input[@id='add']")).sendKeys(addressname);

			String addressline1 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line >> " + addressline1);
			common.log("Step :: Enter Address line >> " + addressline1);
			driver.findElement(By.xpath("//input[@id='add_line1']")).sendKeys(addressline1);

			String addressline2 = common.generateRandomChars(5);
			System.out.println("Step :: Enter Address line1 >> " + addressline2);
			common.log("Step :: Enter Address line2 >> " + addressline2);
			driver.findElement(By.xpath("//input[@id='add_line2']")).sendKeys(addressline2);

			String city = common.generateRandomChars(5);
			System.out.println("Step :: Enter City >> " + city);
			common.log("Step :: Enter City >> " + city);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

			String zipcode = common.generateRandomChars(5);
			System.out.println("Step :: Enter Zip code >> " + zipcode);
			common.log("Step :: Enter Zip code >> " + zipcode);
			driver.findElement(By.xpath("//input[@id='p_code']")).sendKeys(zipcode);

			System.out.println("Step :: Click on Add button ");
			common.log("Step :: Click on Add button");
			driver.findElement(By.xpath("//button[@id='btnModelAdd']")).click();
			common.pause(20);
			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@id='save']")).click();
			
		}
	}

	public void Delete_contact_fromcontactstab() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);

			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//a[@id='delete']"));
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);

			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//a[@id='delete']"));
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);

			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//a[@id='delete']"));
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);

			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//a[@id='delete']"));
		}
		
		else if (INV04URL.equals(inv4))
		{
			
			System.out.println("Step :: Click on Contact tab");
			common.log("Step :: Click on Contact tab");
			driver.findElement(By.xpath("//a[@href='/companies/contacts']")).click();
			common.pause(20);

			System.out.println("Step :: Select Contact from list ");
			common.log("Step :: Select Contact from list");
			driver.findElement(By.xpath("//table//tr[2]")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			driver.findElement(By.xpath("//a[@id='delete']"));
		}
	}

}
