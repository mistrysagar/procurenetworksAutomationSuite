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
import org.openqa.selenium.remote.server.handler.UploadFile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.IFutureResult;

import com.procurenetworks.init.Common;
import com.procurenetworks.pages.abstractpage.AbstractPage;

public class Procure_Admin extends AbstractPage {

	Common common = new Common(driver);

	String preurl = driver.getCurrentUrl();
	String PREURL = "https://inv-pre.qa.procurenetworks.com/admin/categories";

	String inv1 = driver.getCurrentUrl();
	String INV01URL = "https://inv-01.qa.procurenetworks.com/admin/categories";

	String inv2 = driver.getCurrentUrl();
	String INV02URL = "https://inv-02.qa.procurenetworks.com/admin/categories";

	String inv3 = driver.getCurrentUrl();
	String INV03URL = "https://inv-03.qa.procurenetworks.com/admin/categories";

	String inv4 = driver.getCurrentUrl();
	String INV04URL = "https://inv-04.qa.procurenetworks.com/admin/categories";

	@FindBy(xpath = "//a[text()='Admin")
	private WebElement admin;

	@FindBy(xpath = "//a[text()='New Category']")
	private WebElement newCategory;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchTypeElememt;

	@FindBy(xpath = "//select//option[@value='-1']")
	private WebElement viewAllSelectionFromPagination;

	@FindBy(xpath = "//tr//th[text()='Category']")
	private WebElement categoryText;

	@FindBy(xpath = "//tr//th[text()='Description']")
	private WebElement descriptionText;

	@FindBy(xpath = "//tr//th[text()='Category Code']")
	private WebElement categoryCodeText;

	@FindBy(xpath = "//tr//th[text()='Category Manager(s)']")
	private WebElement categoryManagers;

	@FindBy(xpath = "//tr//th[text()='Assets']")
	private WebElement assertsText;

	@FindBy(xpath = "//tr//th[text()='Inventory']")
	private WebElement inventoryText;

	@FindBy(xpath = "//tr//th[text()='Created By']")
	private WebElement createdByText;

	@FindBy(xpath = "//tr//th[text()='Updated By']")
	private WebElement updatedByText;

	@FindBy(xpath = "//tr//th[text()='Last Updated']")
	private WebElement lastUpdatedByText;

	@FindBy(xpath = "//div[@class='btn-group']//label[@type='button']")
	private WebElement settingButton;

	@FindBy(xpath = "//input[@id='category_name']")
	private WebElement categoryname;

	@FindBy(xpath = "//textarea[@id='desc']")
	private WebElement Descriptionfield;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
	private WebElement catgorymanagerfield;

	@FindBy(xpath = "//input[@name='account_code']")
	private WebElement categorycodefield;

	@FindBy(xpath = "//input[@id='asset_category']")
	private WebElement assetcategory;

	@FindBy(xpath = "//input[@id='inventory_category']")
	private WebElement invntorycategory;

	@FindBy(xpath = "//input[@class='button btn-green-color pull-right']")
	private WebElement save;

	@FindBy(xpath = "//input[@class='button btn-green-color']")
	private WebElement Editsavebutton;

	@FindBy(xpath = "//input[@class='form-control input-sm search-input']")
	private WebElement searchbox;

	@FindBy(xpath = "//table//tr[1]//td[1]//a")
	private WebElement CreatedAssetcategory;

	@FindBy(xpath = "//table//tr[1]//td[6]//i[@class='fa fa-check yes-color']")
	private WebElement inventorygreenmark;

	@FindBy(xpath = "//table//tr[1]//td[5]//i[@class='fa fa-check yes-color']")
	private WebElement assetgreenmark;

	@FindBy(xpath = "//li[text()='Locations']")
	private WebElement locationssection;

	@FindBy(xpath = "//a[text()='New Location']")
	private WebElement newlocationbutton;

	@FindBy(xpath = "//input[@id='location_name']")
	private WebElement Locationfield;

	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement descriptiofield;

	@FindBy(xpath = "//span[@id='select2-site-container']")
	private WebElement site;

	@FindBy(xpath = "//span//ul[@id='select2-site-results']//li[2]")
	private WebElement sitename;

	@FindBy(xpath = "//input[@value='asset']")
	private WebElement Assetradiobutto;

	@FindBy(xpath = "//input[@value='inventory']")
	private WebElement invnetoryradiobutton;

	@FindBy(xpath = "//table//tr[1]//td[2]//a")
	private WebElement createdlocationame;

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deletebutton;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesalertbox;

	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement cancelbutton;

	@FindBy(xpath = "//table//tr[1]//td[1]//input")
	private WebElement tablecheckbox;

	@FindBy(xpath = "//div[@id='toolbar']//input[@class='button edit-btn']")
	private WebElement editbutton;

	@FindBy(xpath = "//input[@id='chkparent_id']")
	private WebElement sitechekbox;

	@FindBy(xpath = "//div[@id='chklong_description']//input[@type='checkbox']")
	private WebElement descriptioncheckbox;

	@FindBy(xpath = "//textarea[@id='long_description']")
	private WebElement editdescriptionfield;

	@FindBy(xpath = "//button[@class='btn btn btn-success']")
	private WebElement editboxsavebutton;

	@FindBy(xpath = "//button[@class='btn button btn-grays']")
	private WebElement editboxcancelbutton;

	@FindBy(xpath = "//a[@class='remove delete-btn']")
	private WebElement locationpagedeletebutton;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement deleteyesbutton;

	@FindBy(xpath = "//button[@class='btn btn-red-cancel']")
	private WebElement deletenobutton;

	// Department section

	@FindBy(xpath = "//li[text()='Departments']")
	private WebElement Departmentsection;

	@FindBy(xpath = "//a[text()='New Department']")
	private WebElement NewDepartmentbutton;

	@FindBy(xpath = "//input[@id='department_name']")
	private WebElement Departmentnamefield;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement descriptionfield;

	@FindBy(xpath = "//input[@id='department_code']")
	private WebElement departmencodefield;

	@FindBy(xpath = "//input[@class='button btn-green-color pull-right']")
	private WebElement departmentsaveutton;

	@FindBy(xpath = "//input[@class='button btn-gray-color pull-right']")
	private WebElement departmentcancelbutton;

	@FindBy(xpath = "//table//tr[1]//td[1]//a")
	private WebElement departmentnameintable;

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deletebuttoneditform;

	// projects tab

	@FindBy(xpath = "//li[text()='Projects']")
	private WebElement projectsection;

	@FindBy(xpath = "//a[text()='New Project']")
	private WebElement newprojectbutton;

	@FindBy(xpath = "//input[@id='project_name']")
	private WebElement projectnamefield;

	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement descriptionareafield;

	@FindBy(xpath = "//input[@id='project_code']")
	private WebElement projectcodefield;

	@FindBy(xpath = "//input[@class='button btn-green-color pull-right']")
	private WebElement Projectsavebutton;

	@FindBy(xpath = "//table//tr[1]//td[1]//a")
	private WebElement projectnameintable;

	@FindBy(xpath = "//input[@class=\"button btn-green-color\"]")
	private WebElement projecteditsavebutton;

	// Sites section

	@FindBy(xpath = "//li[text()='Sites']")
	private WebElement Sites;

	@FindBy(xpath = "//a[text()='New Site']")
	private WebElement NewSitebutton;

	@FindBy(xpath = "//input[@name='short_description']")
	private WebElement sitenamefield;

	@FindBy(xpath = "//textarea[@name='long_description']")
	private WebElement sitedescriptionfield;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
	private WebElement sitemanagerfield;

	@FindBy(xpath = "//ul[@id='select2-multipleSelect-results']//li[1]")
	private WebElement sitemanageritem;

	@FindBy(xpath = "//input[@name='account_code']")
	private WebElement sitecodefield;

	@FindBy(xpath = "//input[@class='button btn-green-color pull-right']")
	private WebElement sitesavebutton;

	@FindBy(xpath = "//table//tr[1]//td[1]//a")
	private WebElement sitenameintable;

	@FindBy(xpath = "//input[@class='button btn-green-color']")
	private WebElement editsavebutton;

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement sitedeletebutton;

	// Depreciation section

	@FindBy(xpath = "//li[text()='Depreciation']")
	private WebElement depreciationsection;

	@FindBy(xpath = "//a[text()='New Depreciation Class']")
	private WebElement newdepreciationbutton;

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement depreciationclassnamefield;

	@FindBy(xpath = "//select[@id='method']")
	private WebElement depreciationmethod;

	@FindBy(xpath = "//select//option[1]")
	private WebElement depreciationmethoditem;

	@FindBy(xpath = "//input[@id='life_year']")
	private WebElement assetlifeyear;

	@FindBy(xpath = "//input[@id='life_month']")
	private WebElement assetlifemonth;

	@FindBy(xpath = "//input[@id='dep_depreciate']")
	private WebElement fullydepriciatecheckbox;

	@FindBy(xpath = "//input[@class='button btn-green-color pull-right']")
	private WebElement dereciationsavebutton;

	@FindBy(xpath = "//input[@class='form-control input-sm search-input']")
	private WebElement depreciationsearchbox;

	@FindBy(xpath = "//input[@id='delete']")
	private WebElement depreciationdeletebutton;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement yesbutton;

	// label section

	@FindBy(xpath = "//li[text()='Labels']")
	private WebElement labelsection;

	@FindBy(xpath = "//select[@id='drdModule']")
	private WebElement labeltypedropdown;

	@FindBy(xpath = "//select[@id='drdModule']//option[text()='Inventory']")
	private WebElement inventoryitem;

	@FindBy(xpath = "//select[@id='drdStock']")
	private WebElement labelstock;

	@FindBy(xpath = "//input[@class='group-checkable-inventory']")
	private WebElement labelSelectallcheckbox;

	@FindBy(xpath = "//div[@class='col-lg-12']//input[@id='btnPrintInventory']")
	private WebElement Printlabelbutton;

	@FindBy(xpath = "//span[@id='select2-ware_site-container']")
	private WebElement Warehousesitefield;

	@FindBy(xpath = "//ul[@id='select2-ware_site-results']//li[2]")
	private WebElement sitelistitem;

	@FindBy(xpath = "//input[@name='zones']")
	private WebElement Warehousezones;

	@FindBy(xpath = "//input[@name='aisles']")
	private WebElement waregouseaisles;

	@FindBy(xpath = "//input[@name='racks']")
	private WebElement racksfields;

	@FindBy(xpath = "//input[@name='shelves']")
	private WebElement shelvesfield;

	@FindBy(xpath = "//input[@name='bins']")
	private WebElement binsfields;

	// UserRoles

	@FindBy(xpath = "//li[text()='User Roles']")
	private WebElement userrolessection;

	@FindBy(xpath = "//a[@href='/admin/new-role']")
	private WebElement newrolebutton;

	@FindBy(xpath = "//input[@id='r_name']")
	private WebElement rolenamefield;

	@FindBy(xpath = "//textarea[@id='desc']")
	private WebElement userrolesdescriptionfield;

	@FindBy(xpath = "//label[@class='chk-label']")
	private WebElement selectallviewbutton;

	@FindBy(xpath = "//input[@id='c38']")
	private WebElement userrolesavebutton;

	// User Accounts

	@FindBy(xpath = "//li[text()='User Accounts']")
	private WebElement useraccountsection;

	@FindBy(xpath = "//a[text()=' New User ']")
	private WebElement Newuserbutton;

	@FindBy(xpath = "//input[@id='u_name']")
	private WebElement Usernamefield;

	@FindBy(xpath = "//input[@id='f_name']")
	private WebElement Firstnamefield;

	@FindBy(xpath = "//input[@id='l_name']")
	private WebElement Lastnamefield;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordfield;

	@FindBy(xpath = "//input[@id='confirm_password']")
	private WebElement confirmpasswordfield;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailfield;

	@FindBy(xpath = "//span[@id='select2-u_role-container']")
	private WebElement userroledropdown;

	@FindBy(xpath = "//span//ul//li[2]")
	private WebElement userroleitem;

	// import section
	@FindBy(xpath = "//li[text()='Import']")
	private WebElement importsection;

	@FindBy(xpath = "//span[@class='button btn-primary btn-default btn-file']")
	private WebElement Attachfilebutton;

	@FindBy(xpath = "//input[@id='btn-next']")
	private WebElement nextbutton;

	// UPC Automator
	@FindBy(xpath = "//li[text()='UPC Automator']")
	private WebElement UPCautomatorsection;

	@FindBy(xpath = "//a[@href='/admin/review-inventory']")
	private WebElement StartReviewbutton;

	@FindBy(xpath = "//select[@name='source_loct']")
	private WebElement statusdropdown;

	@FindBy(xpath = "//input[@id='product_code']")
	private WebElement productcodefield;

	@FindBy(xpath = "//input[@id='inventory_model_code']")
	private WebElement invnetorycodefield;

	@FindBy(xpath = "//input[@id='short_description']")
	private WebElement modelfield;

	@FindBy(xpath = "//textarea[@id='long_description']")
	private WebElement UPCdescriptionfield;

	@FindBy(xpath = "//input[@id='brand']")
	private WebElement Brandfield;

	@FindBy(xpath = "//input[@id='btn-save']")
	private WebElement UPCsavebutton;

	String username = "ADMIN";
	String password = "admin";

	/**
	 * Constructor
	 * 
	 * @param Dashboard
	 *            driver
	 */
	public Procure_Admin(WebDriver driver) {
		super(driver);

	}

	/**
	 * Verify Admin Module
	 * 
	 * @throws AWTException
	 * 
	 */

	/**
	 * Verify Admin Module Page Verification
	 * 
	 */
	public void Verify_Admin_Module() {

		verify_AdminPage_Elements();

	}

	private void verify_AdminPage_Elements() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Verify New Category button ");
			common.log("Step :: Verify New Category button");
			common.assertElementPresent("//a[text()='New Category']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Category column header is present on table");
			common.log("Step :: Verify  Category column is present on table");
			common.assertElementPresent("//tr//th[text()='Category']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  category code column header is present on table");
			common.log("Step :: Verify  category code column is present on table");
			common.assertElementPresent("//tr//th[text()='Category Code']");

			System.out.println("Step :: Verify  category manager column header is present on table");
			common.log("Step :: Verify  category managegr is present on table");
			common.assertElementPresent("//tr//th[text()='Category Manager(s)']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Verify New Category button ");
			common.log("Step :: Verify New Category button");
			common.assertElementPresent("//a[text()='New Category']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Category column header is present on table");
			common.log("Step :: Verify  Category column is present on table");
			common.assertElementPresent("//tr//th[text()='Category']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  category code column header is present on table");
			common.log("Step :: Verify  category code column is present on table");
			common.assertElementPresent("//tr//th[text()='Category Code']");

			System.out.println("Step :: Verify  category manager column header is present on table");
			common.log("Step :: Verify  category managegr is present on table");
			common.assertElementPresent("//tr//th[text()='Category Manager(s)']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		} else if (INV02URL.equals(inv2))

		{

			System.out.println("Step :: Verify New Category button ");
			common.log("Step :: Verify New Category button");
			common.assertElementPresent("//a[text()='New Category']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Category column header is present on table");
			common.log("Step :: Verify  Category column is present on table");
			common.assertElementPresent("//tr//th[text()='Category']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  category code column header is present on table");
			common.log("Step :: Verify  category code column is present on table");
			common.assertElementPresent("//tr//th[text()='Category Code']");

			System.out.println("Step :: Verify  category manager column header is present on table");
			common.log("Step :: Verify  category managegr is present on table");
			common.assertElementPresent("//tr//th[text()='Category Manager(s)']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Verify New Category button ");
			common.log("Step :: Verify New Category button");
			common.assertElementPresent("//a[text()='New Category']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Category column header is present on table");
			common.log("Step :: Verify  Category column is present on table");
			common.assertElementPresent("//tr//th[text()='Category']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  category code column header is present on table");
			common.log("Step :: Verify  category code column is present on table");
			common.assertElementPresent("//tr//th[text()='Category Code']");

			System.out.println("Step :: Verify  category manager column header is present on table");
			common.log("Step :: Verify  category managegr is present on table");
			common.assertElementPresent("//tr//th[text()='Category Manager(s)']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Verify New Category button ");
			common.log("Step :: Verify New Category button");
			common.assertElementPresent("//a[text()='New Category']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Category column header is present on table");
			common.log("Step :: Verify  Category column is present on table");
			common.assertElementPresent("//tr//th[text()='Category']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  category code column header is present on table");
			common.log("Step :: Verify  category code column is present on table");
			common.assertElementPresent("//tr//th[text()='Category Code']");

			System.out.println("Step :: Verify  category manager column header is present on table");
			common.log("Step :: Verify  category managegr is present on table");
			common.assertElementPresent("//tr//th[text()='Category Manager(s)']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}

	}

	public void Verify_New_AssetCategory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		} else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		}

		else if (INV04URL.equals(inv4))

		{

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		}
	}

	public void Verify_New_Inventorycategory() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Invnetory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Invnetory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Invnetory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		} else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Inventory categoty");
			common.log("Step :: Click on Inventory categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		}

		else if (INV04URL.equals(inv4))

		{

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Invnetory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		}

	}

	public void Verify_Created_AssetCategory_Intable() throws AWTException {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Assset categoty");
			common.log("Step :: Click on Assset categoty");
			assetcategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

	}

	public void Verfiy_Created_Invnetory_Intable() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Inventory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Inventory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Inventory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Inventory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on New Category Button");
			common.log("Step :: Click on New Category Button");
			newCategory.click();

			String category = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(10);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Category manager field");
			common.log("Step :: Click on Category manager field");
			catgorymanagerfield.click();

			common.pause(10);
			System.out.println("Step :: Select value from Category manager field");
			common.log("Step :: Select value from  Category manager field");
			driver.findElement(By.xpath("//li[text()='Demo Coder']")).click();

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Inventory categoty");
			common.log("Step :: Click on Inventory categoty");
			invntorycategory.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			common.pause(15);

			System.out.println("Step :: Enter category name in search box >>" + category);
			common.log("Step :: Enter category name in search box >>" + category);
			searchbox.sendKeys(category);

			common.pause(10);

		}

	}

	public void Edit_Assetcategory() {
		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);

		} else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);

		} else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);
		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);
		}

		else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);
		}
	}

	public void Edit_Inventorycategory() {
		if (PREURL.equals(preurl)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);

		}

		else if (INV01URL.equals(inv1)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);

		} else if (INV02URL.equals(inv2)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);

		} else if (INV03URL.equals(inv3)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);

		}

		else if (INV04URL.equals(inv4)) {
			common.pause(10);
			System.out.println("Step: Click on Category name from table");
			common.log("Step :: Click on Category name form table");
			CreatedAssetcategory.click();

			String category = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Category Name field >>" + category);
			common.log("Step :: Enter value in Category Name field >>" + category);
			categoryname.sendKeys(category);
			categoryname.getText();

			String Description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			Descriptionfield.sendKeys(Description);

			String categorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Category code field >>" + categorycode);
			common.log("Step :: Enter value in Category code field >>" + categorycode);
			categorycodefield.sendKeys(categorycode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Editsavebutton.click();

			common.pause(15);

		}
	}

	public void Verify_Locationpage_Elements() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Newlocation button is present");
			common.log("Step :: Verfiy Newlocation button is present");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  location column header is present on table");
			common.log("Step :: Verify  location column is present on table");
			common.assertElementPresent("//tr//th[text()='Location']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Newlocation button is present");
			common.log("Step :: Verfiy Newlocation button is present");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  location column header is present on table");
			common.log("Step :: Verify  location column is present on table");
			common.assertElementPresent("//tr//th[text()='Location']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Newlocation button is present");
			common.log("Step :: Verfiy Newlocation button is present");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  location column header is present on table");
			common.log("Step :: Verify  location column is present on table");
			common.assertElementPresent("//tr//th[text()='Location']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Newlocation button is present");
			common.log("Step :: Verfiy Newlocation button is present");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  location column header is present on table");
			common.log("Step :: Verify  location column is present on table");
			common.assertElementPresent("//tr//th[text()='Location']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Newlocation button is present");
			common.log("Step :: Verfiy Newlocation button is present");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  location column header is present on table");
			common.log("Step :: Verify  location column is present on table");
			common.assertElementPresent("//tr//th[text()='Location']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Asset column header is present on table");
			common.log("Step :: Verify Asset is present on table");
			common.assertElementPresent("//tr//th[text()='Assets']");

			System.out.println("Step :: Verify  Invnetory column header is present on table");
			common.log("Step :: Verify Inventory  is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}
	}

	public void Verify_NewAssetLocation() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}
	}

	public void Verify_NewInventoryLocaiton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

		}
	}

	public void Verify_Createdassetlocation_Intable() {
		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on asset Location radio button");
			common.log("Step :: Click on asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);
		} else if (INV01URL.equals(inv1))

		{

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on asset Location radio button");
			common.log("Step :: Click on asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on asset Location radio button");
			common.log("Step :: Click on asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on asset Location radio button");
			common.log("Step :: Click on asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on asset Location radio button");
			common.log("Step :: Click on asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

		}

	}

	public void Verify_Created_Inventorylocation_Intable() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);
		}
	}

	public void Edit_AssetLocation() {
		if (PREURL.equals(preurl)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(15);

		}

		else if (INV01URL.equals(inv1)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);
		}

		else if (INV03URL.equals(inv3)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);
		}

		else if (INV04URL.equals(inv4)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);
		}
	}

	public void Edit_Invnetorylocation() {

		if (PREURL.equals(preurl)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);

		} else if (INV01URL.equals(inv1)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);

		}

		else if (INV03URL.equals(inv3)) {
			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);
		} else if (INV04URL.equals(inv4)) {

			common.pause(10);

			System.out.println("Step :: Click on Created Asset category name from list");
			common.log("Step :: Click on Created Asset category name fomr list");
			createdlocationame.click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			Editsavebutton.click();

			common.pause(5);
		}
	}

	public void Delete_Created_Location() {

		if (PREURL.equals(preurl)) {
			common.pause(10);

			System.out.println("Step :: Click on Created  locatoin name from list");
			common.log("Step :: Click on Created  locatoin name fomr list");
			createdlocationame.click();

			common.pause(10);

			System.out.println("Step :: Click on Delete button ");
			common.log("Step :: Click on Delete button ");
			deletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button from alert box");
			common.log("Step :: Click on Yes button from alert box");
			yesalertbox.click();

		} else if (INV01URL.equals(inv1)) {

			common.pause(10);

			System.out.println("Step :: Click on Created  locatoin name from list");
			common.log("Step :: Click on Created  locatoin name fomr list");
			createdlocationame.click();

			common.pause(10);

			System.out.println("Step :: Click on Delete button ");
			common.log("Step :: Click on Delete button ");
			deletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button from alert box");
			common.log("Step :: Click on Yes button from alert box");
			yesalertbox.click();

		} else if (INV02URL.equals(inv2)) {
			common.pause(10);

			System.out.println("Step :: Click on Created  locatoin name from list");
			common.log("Step :: Click on Created  locatoin name fomr list");
			createdlocationame.click();

			common.pause(10);

			System.out.println("Step :: Click on Delete button ");
			common.log("Step :: Click on Delete button ");
			deletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button from alert box");
			common.log("Step :: Click on Yes button from alert box");
			yesalertbox.click();

		} else if (INV03URL.equals(inv3)) {
			common.pause(10);

			System.out.println("Step :: Click on Created  locatoin name from list");
			common.log("Step :: Click on Created  locatoin name fomr list");
			createdlocationame.click();

			common.pause(10);

			System.out.println("Step :: Click on Delete button ");
			common.log("Step :: Click on Delete button ");
			deletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button from alert box");
			common.log("Step :: Click on Yes button from alert box");
			yesalertbox.click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);

			System.out.println("Step :: Click on Created  locatoin name from list");
			common.log("Step :: Click on Created  locatoin name fomr list");
			createdlocationame.click();

			common.pause(10);

			System.out.println("Step :: Click on Delete button ");
			common.log("Step :: Click on Delete button ");
			deletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button from alert box");
			common.log("Step :: Click on Yes button from alert box");
			yesalertbox.click();
		}
	}

	public void Verify_Cancelbutton_In_Newlocationpage() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			cancelbutton.click();

		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			cancelbutton.click();

		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			cancelbutton.click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			cancelbutton.click();

		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Inventory Location radio button");
			common.log("Step :: Click on Inventory Location radio button");
			invnetoryradiobutton.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			cancelbutton.click();
		}

	}

	public void Verify_Editbutton_of_Locationspage() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button ");
			editboxsavebutton.click();
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button ");
			editboxsavebutton.click();

		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button ");
			editboxsavebutton.click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

		
			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button ");
			editboxsavebutton.click();
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button ");
			editboxsavebutton.click();
		}

	}

	public void Verfiy_Editbox_Cancelbutton() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on cancel button ");
			editboxcancelbutton.click();
		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on cancel button ");
			editboxcancelbutton.click();

		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on cancel button ");
			editboxcancelbutton.click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on cancel button ");
			editboxcancelbutton.click();
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Site check box");
			common.log("Step :: CLick on Site check box");
			sitechekbox.click();

			System.out.println("Step :: Click on Description chekcbox");
			common.log("Step :: Click on Description checkbox");
			descriptioncheckbox.click();

			String Description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Description field >>" + Description);
			common.log("Step :: Enter value in Description field >>" + Description);
			editdescriptionfield.sendKeys(Description);

			System.out.println("Step :: Click on cancel button");
			common.log("Step :: Click on cancel button ");
			editboxcancelbutton.click();
		}

	}

	public void Verfiy_Editbutton_without_select_Location() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Verfiy that please select at leaset one record error displays");
			common.log("Step :: Verfiy that please select at leaset one record error displays");
			common.assertElementPresent("//div[text()='Please select at least one record.']");

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Verfiy that please select at leaset one record error displays");
			common.log("Step :: Verfiy that please select at leaset one record error displays");
			common.assertElementPresent("//div[text()='Please select at least one record.']");
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Verfiy that please select at leaset one record error displays");
			common.log("Step :: Verfiy that please select at leaset one record error displays");
			common.assertElementPresent("//div[text()='Please select at least one record.']");
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Verfiy that please select at leaset one record error displays");
			common.log("Step :: Verfiy that please select at leaset one record error displays");
			common.assertElementPresent("//div[text()='Please select at least one record.']");
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Edit button");
			common.log("Step :: Click on Edit button");
			editbutton.click();

			common.pause(10);

			System.out.println("Step :: Verfiy that please select at leaset one record error displays");
			common.log("Step :: Verfiy that please select at leaset one record error displays");
			common.assertElementPresent("//div[text()='Please select at least one record.']");
		}

	}

	public void Verify_Deletebutton_of_Locationpage() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			common.pause(10);
			
			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();


			
			
			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();
		}

	}

	public void Verify_Yesbutton_of_Deleteconfirmationbox() {

		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button of delete confirmation box");
			common.log("Step :: Click on Yes button of delete confirmation box");
			deleteyesbutton.click();

		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button of delete confirmation box");
			common.log("Step :: Click on Yes button of delete confirmation box");
			deleteyesbutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button of delete confirmation box");
			common.log("Step :: Click on Yes button of delete confirmation box");
			deleteyesbutton.click();
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button of delete confirmation box");
			common.log("Step :: Click on Yes button of delete confirmation box");
			deleteyesbutton.click();

		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			common.pause(10);
			
			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			
			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button of delete confirmation box");
			common.log("Step :: Click on Yes button of delete confirmation box");
			deleteyesbutton.click();
		}
	}

	public void verify_Nobutton_of_delete_confirmationbox() {

		if (PREURL.equals(preurl)) 

		{
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(20);

			System.out.println("Step :: Click on No button of delete confirmation box");
			common.log("Step :: Click on No button of delete confirmation box");
			deletenobutton.click();
			
		}
		else if (INV01URL.equals(inv1)) 
		{
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(20);

			System.out.println("Step :: Click on No button of delete confirmation box");
			common.log("Step :: Click on No button of delete confirmation box");
			deletenobutton.click();
		}
		
		else if (INV02URL.equals(inv2))
		{
			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			System.out.println("Step :: Click on New location button");
			common.log("Step :: Click on New Location button");
			driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

			String Location = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in location Name field >>" + Location);
			common.log("Step :: Enter value in Locaiton Name field >>" + Location);
			Locationfield.sendKeys(Location);

			String description = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in description  field >>" + description);
			common.log("Step :: Enter value in Description  field >>" + description);
			descriptiofield.sendKeys(description);

			System.out.println("Step :: Click on Site Drop-down list");
			common.log("Step :: Click on Site Drop-downlist ");
			site.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select site from list");
			sitename.click();

			System.out.println("Step :: Click on Asset Location radio button");
			common.log("Step :: Click on Asset Location radio button");
			Assetradiobutto.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			save.click();

			System.out.println("Step :: Enter created location in Search box >>" + Location);
			common.log("Step :: Enter the created location in search box >>" + Location);
			searchbox.sendKeys(Location);

			System.out.println("Step :: Click on location check box from table ");
			common.log("Step:: Click on location check box from table ");
			tablecheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			locationpagedeletebutton.click();

			common.pause(20);

			System.out.println("Step :: Click on No button of delete confirmation box");
			common.log("Step :: Click on No button of delete confirmation box");
			deletenobutton.click();
		}
		
		 else if (INV03URL.equals(inv3))
		 {
			 System.out.println("Step :: Click on Location Section");
				common.log("Step :: Click on Locaiton Section");
				locationssection.click();

				System.out.println("Step :: Click on New location button");
				common.log("Step :: Click on New Location button");
				driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

				String Location = common.generateRandomChars(5);
				System.out.println("Step :: Enter value in location Name field >>" + Location);
				common.log("Step :: Enter value in Locaiton Name field >>" + Location);
				Locationfield.sendKeys(Location);

				String description = common.generateRandomChars(5);
				System.out.println("Step :: Enter value in description  field >>" + description);
				common.log("Step :: Enter value in Description  field >>" + description);
				descriptiofield.sendKeys(description);

				System.out.println("Step :: Click on Site Drop-down list");
				common.log("Step :: Click on Site Drop-downlist ");
				site.click();

				System.out.println("Step :: Select site from list");
				common.log("Step :: Select site from list");
				sitename.click();

				System.out.println("Step :: Click on Asset Location radio button");
				common.log("Step :: Click on Asset Location radio button");
				Assetradiobutto.click();

				System.out.println("Step :: Click on Save button");
				common.log("Step :: Click on Save button");
				save.click();

				System.out.println("Step :: Enter created location in Search box >>" + Location);
				common.log("Step :: Enter the created location in search box >>" + Location);
				searchbox.sendKeys(Location);

				System.out.println("Step :: Click on location check box from table ");
				common.log("Step:: Click on location check box from table ");
				tablecheckbox.click();

				common.Scrollpage();

				System.out.println("Step :: Click on Delete button");
				common.log("Step :: Click on Delete button");
				locationpagedeletebutton.click();

				common.pause(20);

				System.out.println("Step :: Click on No button of delete confirmation box");
				common.log("Step :: Click on No button of delete confirmation box");
				deletenobutton.click();
		 }
		
		 else if (INV04URL.equals(inv4))
		 {
			 System.out.println("Step :: Click on Location Section");
				common.log("Step :: Click on Locaiton Section");
				locationssection.click();

				System.out.println("Step :: Click on New location button");
				common.log("Step :: Click on New Location button");
				driver.findElement(By.xpath("//a[@href='/admin/new-location']")).click();

				String Location = common.generateRandomChars(5);
				System.out.println("Step :: Enter value in location Name field >>" + Location);
				common.log("Step :: Enter value in Locaiton Name field >>" + Location);
				Locationfield.sendKeys(Location);

				String description = common.generateRandomChars(5);
				System.out.println("Step :: Enter value in description  field >>" + description);
				common.log("Step :: Enter value in Description  field >>" + description);
				descriptiofield.sendKeys(description);

				common.pause(10);
				
				System.out.println("Step :: Click on Site Drop-down list");
				common.log("Step :: Click on Site Drop-downlist ");
				site.click();

				
				
				System.out.println("Step :: Select site from list");
				common.log("Step :: Select site from list");
				sitename.click();
				
				System.out.println("Step :: Click on Asset Location radio button");
				common.log("Step :: Click on Asset Location radio button");
				Assetradiobutto.click();

				System.out.println("Step :: Click on Save button");
				common.log("Step :: Click on Save button");
				save.click();

				System.out.println("Step :: Enter created location in Search box >>" + Location);
				common.log("Step :: Enter the created location in search box >>" + Location);
				searchbox.sendKeys(Location);

				System.out.println("Step :: Click on location check box from table ");
				common.log("Step:: Click on location check box from table ");
				tablecheckbox.click();

				common.Scrollpage();

				System.out.println("Step :: Click on Delete button");
				common.log("Step :: Click on Delete button");
				locationpagedeletebutton.click();

				common.pause(20);

				System.out.println("Step :: Click on No button of delete confirmation box");
				common.log("Step :: Click on No button of delete confirmation box");
				deletenobutton.click();
		 }
	}

	public void Location_Pagination() {
		// verify second page element present or not
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			common.pause(10);

			if (!common.isElementPresent("//div[@id='location-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='location-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			if (!common.isElementPresent("//div[@id='location-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='location-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			if (!common.isElementPresent("//div[@id='location-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='location-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='location-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='location-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//div[@id='location-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='location-table_paginate']//a[text()='2']")).click();
			}

		}

	}

	public void Verfiy_Departmentpage_Elements() {

		System.out.println("Step :: Open Department section");
		common.log("Step :: Open Department Section");
		Departmentsection.click();

		System.out.println("Step :: Verify New Department button ");
		common.log("Step :: Verify New Department button");
		common.assertElementPresent("//a[text()='New Department']");

		System.out.println("Step :: Verify search box is  present ");
		common.log("Step :: Verify search box is  present");
		common.assertElementPresent("//input[@type='search']");

		System.out.println("Step :: Verify View all item present in drop-down list");
		common.log("Step :: Verify View all item present in drop-down list");
		common.assertElementPresent("//select//option[@value='-1']");

		System.out.println("Step :: Verify  Department column header is present on table");
		common.log("Step :: Verify  Department column is present on table");
		common.assertElementPresent("//tr//th[text()='Department']");

		System.out.println("Step :: Verify  Description column header is present on table");
		common.log("Step :: Verify  Description column is present on table");
		common.assertElementPresent("//tr//th[text()='Description']");

		System.out.println("Step :: Verify  Department code column header is present on table");
		common.log("Step :: Verify  Department code column is present on table");
		common.assertElementPresent("//tr//th[text()='Department Code']");

		System.out.println("Step :: Verify  Created By column header is present on table");
		common.log("Verify  Created By column header is present on table");
		common.assertElementPresent("//tr//th[text()='Created By']");

		System.out.println("Step :: Verify  Last Updated column header is present on table");
		common.log("Verify  Last Updated  header is present on table");
		common.assertElementPresent("//tr//th[text()='Last Updated']");

	}

	public void New_Department() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on Save button ");
			common.log("Step :: Click on Save button");
			departmentsaveutton.click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on Save button ");
			common.log("Step :: Click on Save button");
			departmentsaveutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on Save button ");
			common.log("Step :: Click on Save button");
			departmentsaveutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on Save button ");
			common.log("Step :: Click on Save button");
			departmentsaveutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on Save button ");
			common.log("Step :: Click on Save button");
			departmentsaveutton.click();
		}
	}

	public void Verify_cancelbutton_of_NewDepartment() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step :: Click on cancel button");
			departmentcancelbutton.click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step :: Click on cancel button");
			departmentcancelbutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step :: Click on cancel button");
			departmentcancelbutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step :: Click on cancel button");
			departmentcancelbutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step :: Click on cancel button");
			departmentcancelbutton.click();

		}
	}

	public void Verify_Created_Department_intable() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click on New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on save button");
			departmentsaveutton.click();

			System.out.println("Step :: Enter created department in Search box >>" + departmentname);
			common.log("Step :: Enter the department location in search box >>" + departmentname);
			searchbox.sendKeys(departmentname);
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on save button");
			departmentsaveutton.click();

			System.out.println("Step :: Enter created department in Search box >>" + departmentname);
			common.log("Step :: Enter the department location in search box >>" + departmentname);
			searchbox.sendKeys(departmentname);
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on save button");
			departmentsaveutton.click();

			System.out.println("Step :: Enter created department in Search box >>" + departmentname);
			common.log("Step :: Enter the department location in search box >>" + departmentname);
			searchbox.sendKeys(departmentname);

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on save button");
			departmentsaveutton.click();

			System.out.println("Step :: Enter created department in Search box >>" + departmentname);
			common.log("Step :: Enter the department location in search box >>" + departmentname);
			searchbox.sendKeys(departmentname);
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Open Department section");
			common.log("Step :: Open Department Section");
			Departmentsection.click();

			System.out.println("Step:: CLick on New Department button");
			common.log("Step :: Click onh New Department button");
			NewDepartmentbutton.click();

			String departmentname = common.generateRandomChars(5);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(7);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on save button");
			departmentsaveutton.click();

			System.out.println("Step :: Enter created department in Search box >>" + departmentname);
			common.log("Step :: Enter the department location in search box >>" + departmentname);
			searchbox.sendKeys(departmentname);

		}
	}

	public void Edit_Created_Department() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			String departmentname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

		} else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			String departmentname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			String departmentname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

		} else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			String departmentname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

		} else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			String departmentname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Department  Name field >>" + departmentname);
			common.log("Step :: Enter value in Department Name field >>" + departmentname);
			Departmentnamefield.sendKeys(departmentname);

			String desc = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Deacription field >>" + desc);
			common.log("Step :: Enter value in Description field >>" + desc);
			descriptiofield.click();

			String departmentcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Department code field >>" + departmentcode);
			common.log("Step :: Enter value in Department code field >>" + departmentcode);
			departmencodefield.sendKeys(departmentcode);

		}

	}

	public void Delete_Departmentfrom_Editform() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			deletebuttoneditform.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			yesalertbox.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Successfully message for delete department");
			common.log("Step :: Verfiy Successfully message for delete department");
			common.assertElementPresent("//div[@class='alert alert-success']//ul//li");
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			deletebuttoneditform.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			yesalertbox.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Successfully message for delete department");
			common.log("Step :: Verfiy Successfully message for delete department");
			common.assertElementPresent("//div[@class='alert alert-success']//ul//li");
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			deletebuttoneditform.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			yesalertbox.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Successfully message for delete department");
			common.log("Step :: Verfiy Successfully message for delete department");
			common.assertElementPresent("//div[@class='alert alert-success']//ul//li");

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			deletebuttoneditform.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			yesalertbox.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Successfully message for delete department");
			common.log("Step :: Verfiy Successfully message for delete department");
			common.assertElementPresent("//div[@class='alert alert-success']//ul//li");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Departmentname from table ");
			common.log("Step :: Click on Department name from table");
			departmentnameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			deletebuttoneditform.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			yesalertbox.click();

			common.pause(15);

			System.out.println("Step :: Verfiy Successfully message for delete department");
			common.log("Step :: Verfiy Successfully message for delete department");
			common.assertElementPresent("//div[@class='alert alert-success']//ul//li");
		}

	}

	public void Department_Pagination() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on department Section");
			common.log("Step :: Click on department Section");
			Departmentsection.click();

			common.pause(10);

			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Department Section");
			common.log("Step :: Click on Department Section");
			Departmentsection.click();

			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}
	}

	public void Create_New_Project() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

		}

	}

	public void Search_Created_project() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

			System.out.println("Step :: Enter created project name in Search box >>" + projectname);
			common.log("Step :: Enter the created projectname in search box >>" + projectname);
			searchbox.sendKeys(projectname);

		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

			System.out.println("Step :: Enter created project name in Search box >>" + projectname);
			common.log("Step :: Enter the created projectname in search box >>" + projectname);
			searchbox.sendKeys(projectname);
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

			System.out.println("Step :: Enter created project name in Search box >>" + projectname);
			common.log("Step :: Enter the created projectname in search box >>" + projectname);
			searchbox.sendKeys(projectname);

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

			System.out.println("Step :: Enter created project name in Search box >>" + projectname);
			common.log("Step :: Enter the created projectname in search box >>" + projectname);
			searchbox.sendKeys(projectname);

		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on projects section");
			common.log("Step :: Click on Projects section");
			projectsection.click();

			System.out.println("Step :: Click on New Project button");
			common.log("Step :: Click on New Project button");
			newprojectbutton.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			Projectsavebutton.click();

			System.out.println("Step :: Enter created project name in Search box >>" + projectname);
			common.log("Step :: Enter the created projectname in search box >>" + projectname);
			searchbox.sendKeys(projectname);
		}

	}

	public void Edit_Project() {

		if (PREURL.equals(preurl))

		{
			common.pause(20);

			System.out.println("Step :: Click on Project name fron table");
			common.log("Step :: Click on Project name from table");
			projectnameintable.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			projecteditsavebutton.click();

		}

		else if (INV01URL.equals(inv1)) {

			common.pause(20);

			System.out.println("Step :: Click on Project name fron table");
			common.log("Step :: Click on Project name from table");
			projectnameintable.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			projecteditsavebutton.click();

		} else if (INV02URL.equals(inv2)) {

			common.pause(20);

			System.out.println("Step :: Click on Project name fron table");
			common.log("Step :: Click on Project name from table");
			projectnameintable.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			projecteditsavebutton.click();
		}

		else if (INV03URL.equals(inv3)) {
			common.pause(20);

			System.out.println("Step :: Click on Project name fron table");
			common.log("Step :: Click on Project name from table");
			projectnameintable.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			projecteditsavebutton.click();

		}

		else if (INV04URL.equals(inv4)) {
			common.pause(20);

			System.out.println("Step :: Click on Project name fron table");
			common.log("Step :: Click on Project name from table");
			projectnameintable.click();

			String projectname = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + projectname);
			common.log("Step :: Enter value in Project Name field >>" + projectname);
			projectnamefield.sendKeys(projectname);

			String description = common.generateRandomChars(2);
			System.out.println("Step :: Enter value in Project Name field >>" + description);
			common.log("Step :: Enter value in Project Name field >>" + description);
			descriptionareafield.sendKeys(description);

			String projectcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter value in Project code field >>" + projectcode);
			common.log("Step :: Enter value in Project code field >>" + projectcode);
			projectcodefield.sendKeys(projectcode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			projecteditsavebutton.click();
		}

	}

	public void Project_Pagination() {
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on department Section");
			common.log("Step :: Click on department Section");
			Departmentsection.click();

			common.pause(10);
			// div[@id='project-table_paginate']//a[text()='2']
			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Location Section");
			common.log("Step :: Click on Locaiton Section");
			locationssection.click();

			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Department Section");
			common.log("Step :: Click on Department Section");
			Departmentsection.click();

			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//div[@id='project-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='project-table_paginate']//a[text()='2']")).click();
			}

		}

	}

	public void Verify_Sites() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Site Section");
			common.log("Step :: Click on Site Section");
			Sites.click();

			System.out.println("Step :: Verify New Department button ");
			common.log("Step :: Verify New Department button");
			common.assertElementPresent("//a[text()='New Site']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Site column header is present on table");
			common.log("Step :: Verify  Site column is present on table");
			common.assertElementPresent("//tr//th[text()='Site']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  site code column header is present on table");
			common.log("Step :: Verify  site code column is present on table");
			common.assertElementPresent("//tr//th[text()='Site Code']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Site Section");
			common.log("Step :: Click on Site Section");
			Sites.click();

			System.out.println("Step :: Verify New Department button ");
			common.log("Step :: Verify New Department button");
			common.assertElementPresent("//a[text()='New Site']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Site column header is present on table");
			common.log("Step :: Verify  Site column is present on table");
			common.assertElementPresent("//tr//th[text()='Site']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  site code column header is present on table");
			common.log("Step :: Verify  site code column is present on table");
			common.assertElementPresent("//tr//th[text()='Site Code']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Site Section");
			common.log("Step :: Click on Site Section");
			Sites.click();

			System.out.println("Step :: Verify New Department button ");
			common.log("Step :: Verify New Department button");
			common.assertElementPresent("//a[text()='New Site']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Site column header is present on table");
			common.log("Step :: Verify  Site column is present on table");
			common.assertElementPresent("//tr//th[text()='Site']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  site code column header is present on table");
			common.log("Step :: Verify  site code column is present on table");
			common.assertElementPresent("//tr//th[text()='Site Code']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");

		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Site Section");
			common.log("Step :: Click on Site Section");
			Sites.click();

			System.out.println("Step :: Verify New Department button ");
			common.log("Step :: Verify New Department button");
			common.assertElementPresent("//a[text()='New Site']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Site column header is present on table");
			common.log("Step :: Verify  Site column is present on table");
			common.assertElementPresent("//tr//th[text()='Site']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  site code column header is present on table");
			common.log("Step :: Verify  site code column is present on table");
			common.assertElementPresent("//tr//th[text()='Site Code']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Site Section");
			common.log("Step :: Click on Site Section");
			Sites.click();

			System.out.println("Step :: Verify New Department button ");
			common.log("Step :: Verify New Department button");
			common.assertElementPresent("//a[text()='New Site']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Site column header is present on table");
			common.log("Step :: Verify  Site column is present on table");
			common.assertElementPresent("//tr//th[text()='Site']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  site code column header is present on table");
			common.log("Step :: Verify  site code column is present on table");
			common.assertElementPresent("//tr//th[text()='Site Code']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Verify  Created By column header is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Verify  Last Updated  header is present on table");
		}
	}

	public void Create_NewSite() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();
		}
	}

	public void Created_Site_intable() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();

			common.pause(15);

			System.out.println("Step :: Enter the created sites in search box" + sitename);
			common.log("Step :: Enter the created site in searchbox" + sitename);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(sitename);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();

			common.pause(15);

			System.out.println("Step :: Enter the created sites in search box" + sitename);
			common.log("Step :: Enter the created site in searchbox" + sitename);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(sitename);
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();

			common.pause(15);

			System.out.println("Step :: Enter the created sites in search box" + sitename);
			common.log("Step :: Enter the created site in searchbox" + sitename);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(sitename);
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();

			common.pause(15);

			System.out.println("Step :: Enter the created sites in search box" + sitename);
			common.log("Step :: Enter the created site in searchbox" + sitename);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(sitename);
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Sites section");
			common.log("Step :: Click on Sites sectrion");
			Sites.click();

			common.pause(10);

			System.out.println("Step :: Click on New Sites section");
			common.log("Step :: Click on New Sites sectrion");
			NewSitebutton.click();

			String sitename = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in description field");
			common.log("Step :: Enter the value in site code field");
			sitedescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Sitemanager field");
			common.log("Step :: Click on Sitemanager field");
			sitemanagerfield.click();

			System.out.println("Step :: Select value from list");
			common.log("Step :: Select value from list");
			sitemanageritem.click();

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			sitesavebutton.click();

			common.pause(15);

			System.out.println("Step :: Enter the created sites in search box" + sitename);
			common.log("Step :: Enter the created site in searchbox" + sitename);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(sitename);
		}

	}

	public void Edit_Created_site() {

		if (PREURL.equals(preurl)) {

			common.pause(10);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			String sitename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on  save button");
			editsavebutton.click();

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			String sitename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on  save button");
			editsavebutton.click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			String sitename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on  save button");
			editsavebutton.click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			String sitename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on  save button");
			editsavebutton.click();
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			String sitename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in site name field>>" + sitename);
			common.log("Step :: Enter the value in site name field >>" + sitename);
			sitenamefield.sendKeys(sitename);

			String sitecode = common.generateRandomNumber1();
			System.out.println("Step :: Enter the value in sitecode" + sitecode);
			common.log("Step :: Enter the value in site code" + sitecode);
			sitecodefield.sendKeys(sitecode);

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on  save button");
			editsavebutton.click();
		}

	}

	public void Delete_Created_site() {
		if (PREURL.equals(preurl)) {

			common.pause(20);

			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on delete button");
			sitedeletebutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		}

		else if (INV01URL.equals(inv1)) {

			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on delete button");
			sitedeletebutton.click();
			common.pause(10);
			
			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

		} else if (INV02URL.equals(inv2)) {

			common.pause(20);

			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on delete button");
			sitedeletebutton.click();

			common.pause(10);
			
			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

		}

		else if (INV03URL.equals(inv3)) {

			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on delete button");
			sitedeletebutton.click();
			common.pause(10);
			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on delete button");
			sitedeletebutton.click();
			common.pause(10);
			System.out.println("Step :: Click on Yes button");
			common.log("Step :: Click on Yes button");
			driver.findElement(By.xpath("//button[text()='Yes']")).click();

		}
	}

	public void Edit_cancelbutton() {
		if (PREURL.equals(preurl)) {
			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Clic on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Clic on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Clic on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV03URL.equals(inv3)) {
			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Clic on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV04URL.equals(inv4)) {
			common.pause(20);
			System.out.println("Step :: Click on Created site");
			common.log("Step :: Click on Created site");
			sitenameintable.click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Clic on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}
	}
	// Verify Depreciation section

	public void Verfiy_Depreciation_section_PageElements() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Verify New Depreciation button ");
			common.log("Step :: Verify New Depreciation button");
			common.assertElementPresent("//a[text()='New Depreciation Class']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify  Depreciation class column header is present on table");
			common.log("Step :: Verify  Site Depreciation class is present on table");
			common.assertElementPresent("//tr//th[text()='Depreciation Class']");

			System.out.println("Step :: Verify  Method column header is present on table");
			common.log("Step :: Verify  Method column is present on table");
			common.assertElementPresent("//tr//th[text()='Method']");

			System.out.println("Step :: Verify  Custom Percentage column header is present on table");
			common.log("Step :: Verify  Custom Percentage is present on table");
			common.assertElementPresent("//tr//th[text()='Custom Percentage']");

			System.out.println("Step :: Verify   Asset Life Year column header is present on table");
			common.log("Verify   Asset Life Year is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Year']");

			System.out.println("Step :: Verify    Asset Life Months column header is present on table");
			common.log("Verify  Asset Life Months is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Months']");

			System.out.println("Step :: Verify Fully Depreciate column header is present on table");
			common.log("Verify   Fully Depreciates is present on table");
			common.assertElementPresent("//tr//th[text()=' Fully Depreciate']");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Verify New Depreciation button ");
			common.log("Step :: Verify New Depreciation button");
			common.assertElementPresent("//a[text()='New Depreciation Class']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify  Depreciation class column header is present on table");
			common.log("Step :: Verify  Site Depreciation class is present on table");
			common.assertElementPresent("//tr//th[text()='Depreciation Class']");

			System.out.println("Step :: Verify  Method column header is present on table");
			common.log("Step :: Verify  Method column is present on table");
			common.assertElementPresent("//tr//th[text()='Method']");

			System.out.println("Step :: Verify  Custom Percentage column header is present on table");
			common.log("Step :: Verify  Custom Percentage is present on table");
			common.assertElementPresent("//tr//th[text()='Custom Percentage']");

			System.out.println("Step :: Verify   Asset Life Year column header is present on table");
			common.log("Verify   Asset Life Year is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Year']");

			System.out.println("Step :: Verify    Asset Life Months column header is present on table");
			common.log("Verify  Asset Life Months is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Months']");

			System.out.println("Step :: Verify Fully Depreciate column header is present on table");
			common.log("Verify   Fully Depreciates is present on table");
			common.assertElementPresent("//tr//th[text()=' Fully Depreciate']");
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Verify New Depreciation button ");
			common.log("Step :: Verify New Depreciation button");
			common.assertElementPresent("//a[text()='New Depreciation Class']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify  Depreciation class column header is present on table");
			common.log("Step :: Verify  Site Depreciation class is present on table");
			common.assertElementPresent("//tr//th[text()='Depreciation Class']");

			System.out.println("Step :: Verify  Method column header is present on table");
			common.log("Step :: Verify  Method column is present on table");
			common.assertElementPresent("//tr//th[text()='Method']");

			System.out.println("Step :: Verify  Custom Percentage column header is present on table");
			common.log("Step :: Verify  Custom Percentage is present on table");
			common.assertElementPresent("//tr//th[text()='Custom Percentage']");

			System.out.println("Step :: Verify   Asset Life Year column header is present on table");
			common.log("Verify   Asset Life Year is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Year']");

			System.out.println("Step :: Verify    Asset Life Months column header is present on table");
			common.log("Verify  Asset Life Months is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Months']");

			System.out.println("Step :: Verify Fully Depreciate column header is present on table");
			common.log("Verify   Fully Depreciates is present on table");
			common.assertElementPresent("//tr//th[text()=' Fully Depreciate']");
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Verify New Depreciation button ");
			common.log("Step :: Verify New Depreciation button");
			common.assertElementPresent("//a[text()='New Depreciation Class']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify  Depreciation class column header is present on table");
			common.log("Step :: Verify  Site Depreciation class is present on table");
			common.assertElementPresent("//tr//th[text()='Depreciation Class']");

			System.out.println("Step :: Verify  Method column header is present on table");
			common.log("Step :: Verify  Method column is present on table");
			common.assertElementPresent("//tr//th[text()='Method']");

			System.out.println("Step :: Verify  Custom Percentage column header is present on table");
			common.log("Step :: Verify  Custom Percentage is present on table");
			common.assertElementPresent("//tr//th[text()='Custom Percentage']");

			System.out.println("Step :: Verify   Asset Life Year column header is present on table");
			common.log("Verify   Asset Life Year is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Year']");

			System.out.println("Step :: Verify    Asset Life Months column header is present on table");
			common.log("Verify  Asset Life Months is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Months']");

			System.out.println("Step :: Verify Fully Depreciate column header is present on table");
			common.log("Verify   Fully Depreciates is present on table");
			common.assertElementPresent("//tr//th[text()=' Fully Depreciate']");
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Verify New Depreciation button ");
			common.log("Step :: Verify New Depreciation button");
			common.assertElementPresent("//a[text()='New Depreciation Class']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify  Depreciation class column header is present on table");
			common.log("Step :: Verify  Site Depreciation class is present on table");
			common.assertElementPresent("//tr//th[text()='Depreciation Class']");

			System.out.println("Step :: Verify  Method column header is present on table");
			common.log("Step :: Verify  Method column is present on table");
			common.assertElementPresent("//tr//th[text()='Method']");

			System.out.println("Step :: Verify  Custom Percentage column header is present on table");
			common.log("Step :: Verify  Custom Percentage is present on table");
			common.assertElementPresent("//tr//th[text()='Custom Percentage']");

			System.out.println("Step :: Verify   Asset Life Year column header is present on table");
			common.log("Verify   Asset Life Year is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Year']");

			System.out.println("Step :: Verify    Asset Life Months column header is present on table");
			common.log("Verify  Asset Life Months is present on table");
			common.assertElementPresent("//tr//th[text()=' Asset Life Months']");

			System.out.println("Step :: Verify Fully Depreciate column header is present on table");
			common.log("Verify   Fully Depreciates is present on table");
			common.assertElementPresent("//tr//th[text()=' Fully Depreciate']");
		}
	}

	public void Create_New_DepreciationClass_With_FullyDepreciate() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		}

	}

	public void Create_New_Depreciationclass_Without_Fullydepreciuate() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();

		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();
		}

	}

	public void Created_Depreciattionclass_Intable() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();

			common.pause(10);

			System.out.println("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			depreciationsearchbox.sendKeys(depreciationname);

			common.assertElementPresent("//table//tr[1]//td[1]//a");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();

			common.pause(10);

			System.out.println("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			depreciationsearchbox.sendKeys(depreciationname);

			common.assertElementPresent("//table//tr[1]//td[1]//a");
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();

			common.pause(10);

			System.out.println("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			depreciationsearchbox.sendKeys(depreciationname);

			common.assertElementPresent("//table//tr[1]//td[1]//a");
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();

			common.pause(10);

			System.out.println("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			depreciationsearchbox.sendKeys(depreciationname);

			common.assertElementPresent("//table//tr[1]//td[1]//a");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Fully Depreciation");
			common.log("Step :: Click on Fully Depreciation");
			fullydepriciatecheckbox.click();

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			dereciationsavebutton.click();

			common.pause(10);

			System.out.println("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation search box >>" + depreciationname);
			depreciationsearchbox.sendKeys(depreciationname);

			common.assertElementPresent("//table//tr[1]//td[1]//a");
		}
	}

	public void Edit_Created_Depreciationclass()

	{

		if (PREURL.equals(preurl)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String depreciationname = common.generateRandomChars(1);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color']")).click();

			common.pause(10);

		}

		else if (INV01URL.equals(inv1)) {

			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String depreciationname = common.generateRandomChars(1);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color']")).click();

			common.pause(10);
		}

		else if (INV02URL.equals(inv2)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String depreciationname = common.generateRandomChars(1);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color']")).click();

			common.pause(10);

		}

		else if (INV03URL.equals(inv3)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String depreciationname = common.generateRandomChars(1);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color']")).click();

			common.pause(10);
		} else if (INV04URL.equals(inv4)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String depreciationname = common.generateRandomChars(1);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Save button");
			common.log("Step :: Click on Save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color']")).click();

			common.pause(10);
		}

	}

	public void Delete_Created_Depreciationclass() {

		if (PREURL.equals(preurl)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			depreciationdeletebutton.click();

			common.pause(10);
			System.out.println("Step :: Click on yes button");
			common.log("Step :: Click on yes button");
			yesbutton.click();
		} else if (INV01URL.equals(inv1)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			depreciationdeletebutton.click();

			common.pause(10);
			System.out.println("Step :: Click on yes button");
			common.log("Step :: Click on yes button");
			yesbutton.click();
		} else if (INV02URL.equals(inv2)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			depreciationdeletebutton.click();

			common.pause(10);
			System.out.println("Step :: Click on yes button");
			common.log("Step :: Click on yes button");
			yesbutton.click();
		}

		else if (INV03URL.equals(inv3)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			depreciationdeletebutton.click();

			common.pause(10);
			System.out.println("Step :: Click on yes button");
			common.log("Step :: Click on yes button");
			yesbutton.click();
		}

		else if (INV04URL.equals(inv4)) {
			common.pause(10);

			System.out.println("Step :: Click on Created depreciation class from table");
			common.log("Step :: Click on Created depreciation class from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			System.out.println("Step :: Click on Delete button");
			common.log("Step :: Click on Delete button");
			depreciationdeletebutton.click();

			common.pause(10);
			System.out.println("Step :: Click on yes button");
			common.log("Step :: Click on yes button");
			yesbutton.click();
		}
	}

	public void Verify_Cancelbutton() {

		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();

		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();

		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();

		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			System.out.println("Step :: Click on New Depreciation class button");
			common.log("Step :: Click on New Depreciation class button");
			newdepreciationbutton.click();

			common.pause(10);

			String depreciationname = common.generateRandomChars(4);

			System.out.println("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			common.log("Step:: Enter the value in Depreciation Name field >>" + depreciationname);
			depreciationclassnamefield.sendKeys(depreciationname);

			System.out.println("Step :: Click on Depreciation Method");
			common.log("Step :: Click on Depreciation Method");
			depreciationmethod.click();

			System.out.println("Step :: Select Depreciation Method");
			common.log("Step :: Select Depreciation Method");
			depreciationmethoditem.click();

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifeyear.sendKeys("2");

			System.out.println("Step:: Enter the value in Depreciation Name field ");
			common.log("Step:: Enter the value in Depreciation Name field ");
			assetlifemonth.sendKeys("1");

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();
		}
	}

	public void Verify_Depreciationclass_Pagination() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			common.pause(10);

			if (!common.isElementPresent("//div[@id='depr-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='depr-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			if (!common.isElementPresent("//div[@id='depr-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='depr-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Depreciation Section");
			common.log("Step :: Click on Depreciation Section");
			depreciationsection.click();

			if (!common.isElementPresent("//div[@id='depr-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='depr-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='depr-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='depr-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//div[@id='depr-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='depr-table_paginate']//a[text()='2']")).click();
			}

		}
	}

	public void Label_Section_page_Elements()

	{
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step ::Verify  Label Type present on page");
			common.log("Step ::Verify  Label Type present on page");
			common.assertElementPresent("//span[text()='Label Type']");

			System.out.println("Step ::Verify  Label stock present on page");
			common.log("Step ::Verify  Label stock present on page");
			common.assertElementPresent("//span[text()='Label Stock']");

			System.out.println("Step ::Verify  Label offset present on page");
			common.log("Step ::Verify  Label offset present on page");
			common.assertElementPresent("//span[text()='Label Offset']");

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step ::Verify  Label Type present on page");
			common.log("Step ::Verify  Label Type present on page");
			common.assertElementPresent("//span[text()='Label Type']");

			System.out.println("Step ::Verify  Label stock present on page");
			common.log("Step ::Verify  Label stock present on page");
			common.assertElementPresent("//span[text()='Label Stock']");

			System.out.println("Step ::Verify  Label offset present on page");
			common.log("Step ::Verify  Label offset present on page");
			common.assertElementPresent("//span[text()='Label Offset']");
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step ::Verify  Label Type present on page");
			common.log("Step ::Verify  Label Type present on page");
			common.assertElementPresent("//span[text()='Label Type']");

			System.out.println("Step ::Verify  Label stock present on page");
			common.log("Step ::Verify  Label stock present on page");
			common.assertElementPresent("//span[text()='Label Stock']");

			System.out.println("Step ::Verify  Label offset present on page");
			common.log("Step ::Verify  Label offset present on page");
			common.assertElementPresent("//span[text()='Label Offset']");
		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step ::Verify  Label Type present on page");
			common.log("Step ::Verify  Label Type present on page");
			common.assertElementPresent("//span[text()='Label Type']");

			System.out.println("Step ::Verify  Label stock present on page");
			common.log("Step ::Verify  Label stock present on page");
			common.assertElementPresent("//span[text()='Label Stock']");

			System.out.println("Step ::Verify  Label offset present on page");
			common.log("Step ::Verify  Label offset present on page");
			common.assertElementPresent("//span[text()='Label Offset']");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step ::Verify  Label Type present on page");
			common.log("Step ::Verify  Label Type present on page");
			common.assertElementPresent("//span[text()='Label Type']");

			System.out.println("Step ::Verify  Label stock present on page");
			common.log("Step ::Verify  Label stock present on page");
			common.assertElementPresent("//span[text()='Label Stock']");

			System.out.println("Step ::Verify  Label offset present on page");
			common.log("Step ::Verify  Label offset present on page");
			common.assertElementPresent("//span[text()='Label Offset']");

		}
	}

	public void LabelType_Inventory_Items_Print() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select inventory item from list");
			common.log("Step :: Select inventory item from list");
			inventoryitem.click();

			System.out.println("Step :: Click on Label stock drop down list");
			common.log("Step :: Click on Label stock dropdown list");
			labelstock.click();

			common.pause(80);

			System.out.println("Step :: Click on Select all check box of invnetory list");
			common.log("Step ::  Click on Select all check box of invnetory list");
			labelSelectallcheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label");
			common.log("Step :: Click on Print Labe button");
			Printlabelbutton.click();

			common.pause(10);

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select inventory item from list");
			common.log("Step :: Select inventory item from list");
			inventoryitem.click();

			System.out.println("Step :: Click on Label stock drop down list");
			common.log("Step :: Click on Label stock dropdown list");
			labelstock.click();

			common.pause(80);

			System.out.println("Step :: Click on Select all check box of invnetory list");
			common.log("Step ::  Click on Select all check box of invnetory list");
			labelSelectallcheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label");
			common.log("Step :: Click on Print Labe button");
			Printlabelbutton.click();

			common.pause(10);
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select inventory item from list");
			common.log("Step :: Select inventory item from list");
			inventoryitem.click();

			System.out.println("Step :: Click on Label stock drop down list");
			common.log("Step :: Click on Label stock dropdown list");
			labelstock.click();

			common.pause(80);

			System.out.println("Step :: Click on Select all check box of invnetory list");
			common.log("Step ::  Click on Select all check box of invnetory list");
			labelSelectallcheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label");
			common.log("Step :: Click on Print Labe button");
			Printlabelbutton.click();

			common.pause(10);

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select inventory item from list");
			common.log("Step :: Select inventory item from list");
			inventoryitem.click();

			System.out.println("Step :: Click on Label stock drop down list");
			common.log("Step :: Click on Label stock dropdown list");
			labelstock.click();

			common.pause(80);

			System.out.println("Step :: Click on Select all check box of invnetory list");
			common.log("Step ::  Click on Select all check box of invnetory list");
			labelSelectallcheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label");
			common.log("Step :: Click on Print Labe button");
			Printlabelbutton.click();

			common.pause(10);
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select inventory item from list");
			common.log("Step :: Select inventory item from list");
			inventoryitem.click();

			System.out.println("Step :: Click on Label stock drop down list");
			common.log("Step :: Click on Label stock dropdown list");
			labelstock.click();

			common.pause(80);

			System.out.println("Step :: Click on Select all check box of invnetory list");
			common.log("Step ::  Click on Select all check box of invnetory list");
			labelSelectallcheckbox.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label");
			common.log("Step :: Click on Print Labe button");
			Printlabelbutton.click();

			common.pause(10);
		}

	}

	public void Label_Asset_Item_Print() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Asset']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Assets list");
			common.log("Step ::  Click on Select all check box of Assets list");
			driver.findElement(By.xpath("//input[@class='group-checkable-asset']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintAsset']")).click();

			common.pause(10);
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Asset']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Assets list");
			common.log("Step ::  Click on Select all check box of Assets list");
			driver.findElement(By.xpath("//input[@class='group-checkable-asset']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintAsset']")).click();

			common.pause(10);

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Asset']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Assets list");
			common.log("Step ::  Click on Select all check box of Assets list");
			driver.findElement(By.xpath("//input[@class='group-checkable-asset']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintAsset']")).click();

			common.pause(10);
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Asset']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Assets list");
			common.log("Step ::  Click on Select all check box of Assets list");
			driver.findElement(By.xpath("//input[@class='group-checkable-asset']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintAsset']")).click();

			common.pause(10);
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Asset']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Assets list");
			common.log("Step ::  Click on Select all check box of Assets list");
			driver.findElement(By.xpath("//input[@class='group-checkable-asset']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintAsset']")).click();

			common.pause(10);
		}

	}

	public void Label_Location_item_print() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Location']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Locations list");
			common.log("Step ::  Click on Select all check box of Locations list");
			driver.findElement(By.xpath("//input[@class='group-checkable-location']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintLocation']")).click();

			common.pause(10);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Location']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Locations list");
			common.log("Step ::  Click on Select all check box of Locations list");
			driver.findElement(By.xpath("//input[@class='group-checkable-location']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintLocation']")).click();

			common.pause(10);
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Location']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Locations list");
			common.log("Step ::  Click on Select all check box of Locations list");
			driver.findElement(By.xpath("//input[@class='group-checkable-location']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintLocation']")).click();

			common.pause(10);
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Location']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Locations list");
			common.log("Step ::  Click on Select all check box of Locations list");
			driver.findElement(By.xpath("//input[@class='group-checkable-location']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintLocation']")).click();

			common.pause(10);
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Asset item from list");
			common.log("Step :: Select Asset item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Location']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Select all check box of Locations list");
			common.log("Step ::  Click on Select all check box of Locations list");
			driver.findElement(By.xpath("//input[@class='group-checkable-location']")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//input[@id='btnPrintLocation']")).click();

			common.pause(10);
		}
	}

	public void Label_WarehouseSetup_print_Validation() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

			common.assertElementPresent("//li[text()='Please add site.']");
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

			common.assertElementPresent("//li[text()='Please add site.']");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

			common.assertElementPresent("//li[text()='Please add site.']");
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

			common.assertElementPresent("//li[text()='Please add site.']");

		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			common.Scrollpage();

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

			common.assertElementPresent("//li[text()='Please add site.']");
		}

	}

	public void Warehouse_setupfields() {

		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");

			Warehousesitefield.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select item from list");
			sitelistitem.click();

			String zones = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Zones will you have? >>" + zones);
			common.log("Step ::Enter the value in How many Zones will you have? >>" + zones);
			Warehousezones.sendKeys(zones);

			String Aisles = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			waregouseaisles.sendKeys(Aisles);

			String racks = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			racksfields.sendKeys(racks);

			String Bins = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			binsfields.sendKeys(Bins);

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);
		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");

			Warehousesitefield.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select item from list");
			sitelistitem.click();

			String zones = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Zones will you have? >>" + zones);
			common.log("Step ::Enter the value in How many Zones will you have? >>" + zones);
			Warehousezones.sendKeys(zones);

			String Aisles = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			waregouseaisles.sendKeys(Aisles);

			String racks = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			racksfields.sendKeys(racks);

			String Bins = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			binsfields.sendKeys(Bins);

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");

			Warehousesitefield.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select item from list");
			sitelistitem.click();

			String zones = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Zones will you have? >>" + zones);
			common.log("Step ::Enter the value in How many Zones will you have? >>" + zones);
			Warehousezones.sendKeys(zones);

			String Aisles = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			waregouseaisles.sendKeys(Aisles);

			String racks = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			racksfields.sendKeys(racks);

			String Bins = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			binsfields.sendKeys(Bins);

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

		} else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");

			Warehousesitefield.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select item from list");
			sitelistitem.click();

			String zones = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Zones will you have? >>" + zones);
			common.log("Step ::Enter the value in How many Zones will you have? >>" + zones);
			Warehousezones.sendKeys(zones);

			String Aisles = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			waregouseaisles.sendKeys(Aisles);

			String racks = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			racksfields.sendKeys(racks);

			String Bins = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			binsfields.sendKeys(Bins);

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);

		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Label Section");
			common.log("Step :: Click on Label section");
			labelsection.click();

			System.out.println("Step :: Click on Label Type drop down list");
			common.log("Step :: Click on Label section");
			labeltypedropdown.click();

			System.out.println("Step :: Select Warehouse Setup item from list");
			common.log("Step :: Select Warehouse Setup item from list");
			driver.findElement(By.xpath("//select[@id='drdModule']//option[text()='Warehouse Setup']")).click();

			common.pause(20);

			System.out.println("Step :: Click on Site field");
			common.log("Step :: Click on Site field");

			Warehousesitefield.click();

			System.out.println("Step :: Select site from list");
			common.log("Step :: Select item from list");
			sitelistitem.click();

			String zones = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Zones will you have? >>" + zones);
			common.log("Step ::Enter the value in How many Zones will you have? >>" + zones);
			Warehousezones.sendKeys(zones);

			String Aisles = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Aisles);
			waregouseaisles.sendKeys(Aisles);

			String racks = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + racks);
			racksfields.sendKeys(racks);

			String Bins = common.generateRandomNumber1();
			System.out.println("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			common.log("Step ::Enter the value in How many Aisles will you have?  >>" + Bins);
			binsfields.sendKeys(Bins);

			System.out.println("Step :: Click on Print label button");
			common.log("Step :: Click on Print Label button");
			driver.findElement(By.xpath("//button[@id='warehouse-btn']")).click();

			common.pause(10);
		}

	}

	public void Verify_UserRoles_page_Elements() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Verify New Role  button ");
			common.log("Step :: Verify New Role button");
			common.assertElementPresent("//a[text()=' New Role ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Role column header is present on table");
			common.log("Step :: Verify  Role column is present on table");
			common.assertElementPresent("//tr//th[text()='Role']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Step :: Verify  Created Bycolumn is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Updated By column header is present on table");
			common.log("Step :: Verify  Updated By is present on table");
			common.assertElementPresent("//tr//th[text()='Updated By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated column header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Verify New Role  button ");
			common.log("Step :: Verify New Role button");
			common.assertElementPresent("//a[text()=' New Role ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Role column header is present on table");
			common.log("Step :: Verify  Role column is present on table");
			common.assertElementPresent("//tr//th[text()='Role']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Step :: Verify  Created Bycolumn is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Updated By column header is present on table");
			common.log("Step :: Verify  Updated By is present on table");
			common.assertElementPresent("//tr//th[text()='Updated By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated column header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Verify New Role  button ");
			common.log("Step :: Verify New Role button");
			common.assertElementPresent("//a[text()=' New Role ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Role column header is present on table");
			common.log("Step :: Verify  Role column is present on table");
			common.assertElementPresent("//tr//th[text()='Role']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Step :: Verify  Created Bycolumn is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Updated By column header is present on table");
			common.log("Step :: Verify  Updated By is present on table");
			common.assertElementPresent("//tr//th[text()='Updated By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated column header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Verify New Role  button ");
			common.log("Step :: Verify New Role button");
			common.assertElementPresent("//a[text()=' New Role ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Role column header is present on table");
			common.log("Step :: Verify  Role column is present on table");
			common.assertElementPresent("//tr//th[text()='Role']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Step :: Verify  Created Bycolumn is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Updated By column header is present on table");
			common.log("Step :: Verify  Updated By is present on table");
			common.assertElementPresent("//tr//th[text()='Updated By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated column header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Verify New Role  button ");
			common.log("Step :: Verify New Role button");
			common.assertElementPresent("//a[text()=' New Role ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Role column header is present on table");
			common.log("Step :: Verify  Role column is present on table");
			common.assertElementPresent("//tr//th[text()='Role']");

			System.out.println("Step :: Verify  Description column header is present on table");
			common.log("Step :: Verify  Description column is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify  Created By column header is present on table");
			common.log("Step :: Verify  Created Bycolumn is present on table");
			common.assertElementPresent("//tr//th[text()='Created By']");

			System.out.println("Step :: Verify  Updated By column header is present on table");
			common.log("Step :: Verify  Updated By is present on table");
			common.assertElementPresent("//tr//th[text()='Updated By']");

			System.out.println("Step :: Verify  Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated column header is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

		}
	}

	public void Create_New_Role() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Menu permission Select all view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			selectallviewbutton.click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Menu permission Select all view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			selectallviewbutton.click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Menu permission Select all view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			selectallviewbutton.click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Menu permission Select all view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			selectallviewbutton.click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Menu permission Select all view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			selectallviewbutton.click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}
	}

	public void Create_NewRole_With_Asset_Menupermission() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Asset Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='asset_view']")).click();

			System.out.println("Step :: Click on  New Asset Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_asset']")).click();

			System.out.println("Step :: Click on Asset Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='asset_edit']")).click();

			System.out.println("Step :: Click on Delete Asset Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_asset']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on  New Asset Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_asset']")).click();

			System.out.println("Step :: Click on Asset Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='asset_view']")).click();

			System.out.println("Step :: Click on Asset Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='asset_edit']")).click();

			System.out.println("Step :: Click on Delete Asset Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_asset']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on  New Asset Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_asset']")).click();

			System.out.println("Step :: Click on Asset Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='asset_view']")).click();

			System.out.println("Step :: Click on Asset Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='asset_edit']")).click();

			System.out.println("Step :: Click on Delete Asset Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_asset']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on  New Asset Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_asset']")).click();

			System.out.println("Step :: Click on Asset Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='asset_view']")).click();

			System.out.println("Step :: Click on Asset Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='asset_edit']")).click();

			System.out.println("Step :: Click on Delete Asset Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_asset']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on  New Asset Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_asset']")).click();

			System.out.println("Step :: Click on Asset Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='asset_view']")).click();

			System.out.println("Step :: Click on Asset Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='asset_edit']")).click();

			System.out.println("Step :: Click on Delete Asset Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_asset']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}
	}

	public void Created_NewRole_With_Inventory_Menu_permission() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Invnetory Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='inventory_view']")).click();

			System.out.println("Step :: Click on  New Inventory Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_inventory']")).click();

			System.out.println("Step :: Click on Invnetory Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='inventory_edit']")).click();

			System.out.println("Step :: Click on Delete Invnetory Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_inventory']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Invnetory Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='inventory_view']")).click();

			System.out.println("Step :: Click on  New Inventory Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_inventory']")).click();

			System.out.println("Step :: Click on Invnetory Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='inventory_edit']")).click();

			System.out.println("Step :: Click on Delete Invnetory Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_inventory']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Invnetory Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='inventory_view']")).click();

			System.out.println("Step :: Click on  New Inventory Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_inventory']")).click();

			System.out.println("Step :: Click on Invnetory Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='inventory_edit']")).click();

			System.out.println("Step :: Click on Delete Invnetory Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_inventory']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Invnetory Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='inventory_view']")).click();

			System.out.println("Step :: Click on  New Inventory Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_inventory']")).click();

			System.out.println("Step :: Click on Invnetory Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='inventory_edit']")).click();

			System.out.println("Step :: Click on Delete Invnetory Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_inventory']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Invnetory Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='inventory_view']")).click();

			System.out.println("Step :: Click on  New Inventory Menu permission   button ");
			common.log("Step ::Click on New Asset  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_inventory']")).click();

			System.out.println("Step :: Click on Invnetory Menu permission  Edit button ");
			common.log("Step ::Click on Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='inventory_edit']")).click();

			System.out.println("Step :: Click on Delete Invnetory Menu permission button ");
			common.log("Step ::Click on Delete Asset Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_inventory']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}
	}

	public void Create_NewRole_With_Contact_MenuPermission() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on conacts Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='contacts_view']")).click();

			System.out.println("Step :: Click on  New contacts Menu permission   button ");
			common.log("Step ::Click on New contacts  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_contacts']")).click();

			System.out.println("Step :: Click on contacts Menu permission  Edit button ");
			common.log("Step ::Click on contacts Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='contacts_edit']")).click();

			System.out.println("Step :: Click on Delete contancts Menu permission button ");
			common.log("Step ::Click on Delete contacts Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_contacts']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on conacts Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='contacts_view']")).click();

			System.out.println("Step :: Click on  New contacts Menu permission   button ");
			common.log("Step ::Click on New contacts  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_contacts']")).click();

			System.out.println("Step :: Click on contacts Menu permission  Edit button ");
			common.log("Step ::Click on contacts Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='contacts_edit']")).click();

			System.out.println("Step :: Click on Delete contancts Menu permission button ");
			common.log("Step ::Click on Delete contacts Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_contacts']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on conacts Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='contacts_view']")).click();

			System.out.println("Step :: Click on  New contacts Menu permission   button ");
			common.log("Step ::Click on New contacts  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_contacts']")).click();

			System.out.println("Step :: Click on contacts Menu permission  Edit button ");
			common.log("Step ::Click on contacts Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='contacts_edit']")).click();

			System.out.println("Step :: Click on Delete contancts Menu permission button ");
			common.log("Step ::Click on Delete contacts Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_contacts']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on conacts Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='contacts_view']")).click();

			System.out.println("Step :: Click on  New contacts Menu permission   button ");
			common.log("Step ::Click on New contacts  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_contacts']")).click();

			System.out.println("Step :: Click on contacts Menu permission  Edit button ");
			common.log("Step ::Click on contacts Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='contacts_edit']")).click();

			System.out.println("Step :: Click on Delete contancts Menu permission button ");
			common.log("Step ::Click on Delete contacts Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_contacts']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on conacts Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='contacts_view']")).click();

			System.out.println("Step :: Click on  New contacts Menu permission   button ");
			common.log("Step ::Click on New contacts  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_contacts']")).click();

			System.out.println("Step :: Click on contacts Menu permission  Edit button ");
			common.log("Step ::Click on contacts Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='contacts_edit']")).click();

			System.out.println("Step :: Click on Delete contancts Menu permission button ");
			common.log("Step ::Click on Delete contacts Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_contacts']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}
	}

	public void Create_NewRole_With_Shipping_MenuPermission() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on shipping  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='shipping_view']")).click();

			System.out.println("Step :: Click on  New Shipping Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_shipping']")).click();

			System.out.println("Step :: Click on Shipping Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='shipping_edit']")).click();

			System.out.println("Step :: Click on Delete Shipping Menu permission button ");
			common.log("Step ::Click on Delete Shipping Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_shipping']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on shipping  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='shipping_view']")).click();

			System.out.println("Step :: Click on  New Shipping Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_shipping']")).click();

			System.out.println("Step :: Click on Shipping Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='shipping_edit']")).click();

			System.out.println("Step :: Click on Delete Shipping Menu permission button ");
			common.log("Step ::Click on Delete Shipping Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_shipping']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on shipping  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='shipping_view']")).click();

			System.out.println("Step :: Click on  New Shipping Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_shipping']")).click();

			System.out.println("Step :: Click on Shipping Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='shipping_edit']")).click();

			System.out.println("Step :: Click on Delete Shipping Menu permission button ");
			common.log("Step ::Click on Delete Shipping Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_shipping']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on shipping  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='shipping_view']")).click();

			System.out.println("Step :: Click on  New Shipping Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_shipping']")).click();

			System.out.println("Step :: Click on Shipping Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='shipping_edit']")).click();

			System.out.println("Step :: Click on Delete Shipping Menu permission button ");
			common.log("Step ::Click on Delete Shipping Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_shipping']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on shipping  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='shipping_view']")).click();

			System.out.println("Step :: Click on  New Shipping Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_shipping']")).click();

			System.out.println("Step :: Click on Shipping Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='shipping_edit']")).click();

			System.out.println("Step :: Click on Delete Shipping Menu permission button ");
			common.log("Step ::Click on Delete Shipping Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_shipping']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}
	}

	public void Create_NewRole_With_Reciving_MenuPermission() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Receving  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='receiving_view']")).click();

			System.out.println("Step :: Click on  New Receiving Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_receiving']")).click();

			System.out.println("Step :: Click on Receiving Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='receiving_edit']")).click();

			System.out.println("Step :: Click on Delete Receiving Menu permission button ");
			common.log("Step ::Click on Delete Receiving Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_Receiving']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		} else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Receving  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='receiving_view']")).click();

			System.out.println("Step :: Click on  New Receiving Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_receiving']")).click();

			System.out.println("Step :: Click on Receiving Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='receiving_edit']")).click();

			System.out.println("Step :: Click on Delete Receiving Menu permission button ");
			common.log("Step ::Click on Delete Receiving Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_Receiving']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Receving  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='receiving_view']")).click();

			System.out.println("Step :: Click on  New Receiving Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_receiving']")).click();

			System.out.println("Step :: Click on Receiving Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='receiving_edit']")).click();

			System.out.println("Step :: Click on Delete Receiving Menu permission button ");
			common.log("Step ::Click on Delete Receiving Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_Receiving']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Receving  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='receiving_view']")).click();

			System.out.println("Step :: Click on  New Receiving Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_receiving']")).click();

			System.out.println("Step :: Click on Receiving Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='receiving_edit']")).click();

			System.out.println("Step :: Click on Delete Receiving Menu permission button ");
			common.log("Step ::Click on Delete Receiving Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_Receiving']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Receving  Menu permission  view button ");
			common.log("Step ::Click on Menu permission Select all view button");
			driver.findElement(By.xpath("//label[@for='receiving_view']")).click();

			System.out.println("Step :: Click on  New Receiving Menu permission   button ");
			common.log("Step ::Click on New Shipping  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_receiving']")).click();

			System.out.println("Step :: Click on Receiving Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='receiving_edit']")).click();

			System.out.println("Step :: Click on Delete Receiving Menu permission button ");
			common.log("Step ::Click on Delete Receiving Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_Receiving']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}
	}

	public void Create_NewRole_With_Reports_Menupermission() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Reports  Menu permission  view button ");
			common.log("Step ::Click on Reports Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='report_view']")).click();

			System.out.println("Step :: Click on  New Reports Menu permission   button ");
			common.log("Step ::Click on New Reports  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_report']")).click();

			System.out.println("Step :: Click on Reports Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='report_edit']")).click();

			System.out.println("Step :: Click on Delete Reports Menu permission button ");
			common.log("Step ::Click on Delete Reports Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_report']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Reports  Menu permission  view button ");
			common.log("Step ::Click on Reports Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='report_view']")).click();

			System.out.println("Step :: Click on  New Reports Menu permission   button ");
			common.log("Step ::Click on New Reports  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_report']")).click();

			System.out.println("Step :: Click on Reports Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='report_edit']")).click();

			System.out.println("Step :: Click on Delete Reports Menu permission button ");
			common.log("Step ::Click on Delete Reports Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_report']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Reports  Menu permission  view button ");
			common.log("Step ::Click on Reports Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='report_view']")).click();

			System.out.println("Step :: Click on  New Reports Menu permission   button ");
			common.log("Step ::Click on New Reports  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_report']")).click();

			System.out.println("Step :: Click on Reports Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='report_edit']")).click();

			System.out.println("Step :: Click on Delete Reports Menu permission button ");
			common.log("Step ::Click on Delete Reports Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_report']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Reports  Menu permission  view button ");
			common.log("Step ::Click on Reports Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='report_view']")).click();

			System.out.println("Step :: Click on  New Reports Menu permission   button ");
			common.log("Step ::Click on New Reports  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_report']")).click();

			System.out.println("Step :: Click on Reports Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='report_edit']")).click();

			System.out.println("Step :: Click on Delete Reports Menu permission button ");
			common.log("Step ::Click on Delete Reports Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_report']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Reports  Menu permission  view button ");
			common.log("Step ::Click on Reports Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='report_view']")).click();

			System.out.println("Step :: Click on  New Reports Menu permission   button ");
			common.log("Step ::Click on New Reports  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_report']")).click();

			System.out.println("Step :: Click on Reports Menu permission  Edit button ");
			common.log("Step ::Click on Shipping Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='report_edit']")).click();

			System.out.println("Step :: Click on Delete Reports Menu permission button ");
			common.log("Step ::Click on Delete Reports Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_report']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}
	}

	public void Create_NewRole_With_Admin_MenuPermission() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Admin  Menu permission  view button ");
			common.log("Step ::Click on Admin Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='admin_view']")).click();

			System.out.println("Step :: Click on  New Admin Menu permission   button ");
			common.log("Step ::Click on New Admin  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_admin']")).click();

			System.out.println("Step :: Click on Admin Menu permission  Edit button ");
			common.log("Step ::Click on Admin Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='admin_edit']")).click();

			System.out.println("Step :: Click on Delete Admin Menu permission button ");
			common.log("Step ::Click on Delete Admin Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_admin']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Admin  Menu permission  view button ");
			common.log("Step ::Click on Admin Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='admin_view']")).click();

			System.out.println("Step :: Click on  New Admin Menu permission   button ");
			common.log("Step ::Click on New Admin  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_admin']")).click();

			System.out.println("Step :: Click on Admin Menu permission  Edit button ");
			common.log("Step ::Click on Admin Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='admin_edit']")).click();

			System.out.println("Step :: Click on Delete Admin Menu permission button ");
			common.log("Step ::Click on Delete Admin Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_admin']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Admin  Menu permission  view button ");
			common.log("Step ::Click on Admin Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='admin_view']")).click();

			System.out.println("Step :: Click on  New Admin Menu permission   button ");
			common.log("Step ::Click on New Admin  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_admin']")).click();

			System.out.println("Step :: Click on Admin Menu permission  Edit button ");
			common.log("Step ::Click on Admin Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='admin_edit']")).click();

			System.out.println("Step :: Click on Delete Admin Menu permission button ");
			common.log("Step ::Click on Delete Admin Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_admin']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		} else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Admin  Menu permission  view button ");
			common.log("Step ::Click on Admin Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='admin_view']")).click();

			System.out.println("Step :: Click on  New Admin Menu permission   button ");
			common.log("Step ::Click on New Admin  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_admin']")).click();

			System.out.println("Step :: Click on Admin Menu permission  Edit button ");
			common.log("Step ::Click on Admin Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='admin_edit']")).click();

			System.out.println("Step :: Click on Delete Admin Menu permission button ");
			common.log("Step ::Click on Delete Admin Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_admin']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);

			System.out.println("Step :: Click on Admin  Menu permission  view button ");
			common.log("Step ::Click on Admin Menu permission  view button");
			driver.findElement(By.xpath("//label[@for='admin_view']")).click();

			System.out.println("Step :: Click on  New Admin Menu permission   button ");
			common.log("Step ::Click on New Admin  Menu permission  button");
			driver.findElement(By.xpath("//label[@for='new_admin']")).click();

			System.out.println("Step :: Click on Admin Menu permission  Edit button ");
			common.log("Step ::Click on Admin Menu permission Edit  button");
			driver.findElement(By.xpath("//label[@for='admin_edit']")).click();

			System.out.println("Step :: Click on Delete Admin Menu permission button ");
			common.log("Step ::Click on Delete Admin Menu permission  button");
			driver.findElement(By.xpath("//label[@for='delete_admin']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}
	}

	public void Verfiy_All_Asset_Transactionpermission() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of asset transaction permission ");
			common.log("Step ::Click on Select all button of asset transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_asset_chk_all']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of asset transaction permission ");
			common.log("Step ::Click on Select all button of asset transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_asset_chk_all']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of asset transaction permission ");
			common.log("Step ::Click on Select all button of asset transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_asset_chk_all']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of asset transaction permission ");
			common.log("Step ::Click on Select all button of asset transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_asset_chk_all']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}

		else if (INV04URL.equals(inv4))

		{

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of asset transaction permission ");
			common.log("Step ::Click on Select all button of asset transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_asset_chk_all']")).click();

			common.pause(10);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		}
	}

	public void Create_Role_With_Inventory_TrnasactionPermission() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Inventory transaction permission ");
			common.log("Step ::Click on Select all button of Inventroy transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_inventory_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Inventory transaction permission ");
			common.log("Step ::Click on Select all button of Inventroy transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_inventory_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Inventory transaction permission ");
			common.log("Step ::Click on Select all button of Inventroy transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_inventory_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Inventory transaction permission ");
			common.log("Step ::Click on Select all button of Inventroy transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_inventory_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(10);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Inventory transaction permission ");
			common.log("Step ::Click on Select all button of Inventroy transaction permission");
			driver.findElement(By.xpath("//label[@for='tran_inventory_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

	}

	public void Create_NewRole_With_AdminPermission() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(20);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Admin permission ");
			common.log("Step ::Click on Select all button of Admin permission");
			driver.findElement(By.xpath("//label[@for='admin_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(20);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Admin permission ");
			common.log("Step ::Click on Select all button of Admin permission");
			driver.findElement(By.xpath("//label[@for='admin_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(20);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Admin permission ");
			common.log("Step ::Click on Select all button of Admin permission");
			driver.findElement(By.xpath("//label[@for='admin_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(20);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Admin permission ");
			common.log("Step ::Click on Select all button of Admin permission");
			driver.findElement(By.xpath("//label[@for='admin_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			common.pause(20);
			System.out.println("Step :: Click on View select all button of permission");
			common.log("Step :: Click on View select all button of permission");
			selectallviewbutton.click();

			System.out.println("Step :: Click on select all New button of Menu permission  ");
			common.log("Step ::Click on  select  New button of Menu permission  ");
			driver.findElement(By.xpath("//label[@for='new_chk']")).click();

			System.out.println("Step :: Click on Select all button of Admin permission ");
			common.log("Step ::Click on Select all button of Admin permission");
			driver.findElement(By.xpath("//label[@for='admin_chk_all']")).click();

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();
		}

	}

	public void Delete_CreatedRole() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);

			System.out.println("Step :: Enter the Role name in search box");
			common.log("Step :: Enterthe Role name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(rolename);

			common.pause(20);
			System.out.println("Step :: Click on Rolename from table");
			common.log("Step :: Click on Role name from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on delete  button");
			common.log("Step :: Click on delete button");
			driver.findElement(By.xpath("//input[@class='button']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);

			System.out.println("Step :: Enter the Role name in search box");
			common.log("Step :: Enterthe Role name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(rolename);

			common.pause(20);
			System.out.println("Step :: Click on Rolename from table");
			common.log("Step :: Click on Role name from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on delete  button");
			common.log("Step :: Click on delete button");
			driver.findElement(By.xpath("//input[@class='button']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);

			System.out.println("Step :: Enter the Role name in search box");
			common.log("Step :: Enterthe Role name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(rolename);

			common.pause(20);
			System.out.println("Step :: Click on Rolename from table");
			common.log("Step :: Click on Role name from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on delete  button");
			common.log("Step :: Click on delete button");
			driver.findElement(By.xpath("//input[@class='button']")).click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);

			System.out.println("Step :: Enter the Role name in search box");
			common.log("Step :: Enterthe Role name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(rolename);

			common.pause(20);
			System.out.println("Step :: Click on Rolename from table");
			common.log("Step :: Click on Role name from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on delete  button");
			common.log("Step :: Click on delete button");
			driver.findElement(By.xpath("//input[@class='button']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			String rolename = common.generateRandomChars(3);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter the value in role name field >>" + desc);
			common.log("Step :: Enter the value in role name field >>" + desc);
			userrolesdescriptionfield.sendKeys(desc);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);

			System.out.println("Step :: Enter the Role name in search box");
			common.log("Step :: Enterthe Role name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(rolename);

			common.pause(20);
			System.out.println("Step :: Click on Rolename from table");
			common.log("Step :: Click on Role name from table");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			common.Scrollpage();

			System.out.println("Step :: Click on delete  button");
			common.log("Step :: Click on delete button");
			driver.findElement(By.xpath("//input[@class='button']")).click();

		}
	}

	public void Verfiy_Cancelbutton_ofNewRole() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			System.out.println("Step :: Click on New Role button ");
			common.log("Step :: Click on New Role button");
			newrolebutton.click();

			common.Scrollpage();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();

		}

	}

	public void Edit_Created_Rolename() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			common.pause(30);

			System.out.println("Step :: Click on Role name from list");
			common.log("Step :: Click on Role name from list");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String rolename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			common.pause(30);

			System.out.println("Step :: Click on Role name from list");
			common.log("Step :: Click on Role name from list");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String rolename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			common.pause(30);

			System.out.println("Step :: Click on Role name from list");
			common.log("Step :: Click on Role name from list");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String rolename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			common.pause(30);

			System.out.println("Step :: Click on Role name from list");
			common.log("Step :: Click on Role name from list");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String rolename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			common.pause(30);

			System.out.println("Step :: Click on Role name from list");
			common.log("Step :: Click on Role name from list");
			driver.findElement(By.xpath("//table//tr[1]//td[1]//a")).click();

			String rolename = common.generateRandomChars(1);
			System.out.println("Step :: Enter the value in role name field >>" + rolename);
			common.log("Step :: Enter the value in role name field >>" + rolename);
			rolenamefield.sendKeys(rolename);

			System.out.println("Step :: Click on Save  button");
			common.log("Step :: Click on Save button");
			userrolesavebutton.click();

			common.pause(20);
		}
	}

	public void Verfiy_Paginationbutton_of_UserRoles() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			common.pause(10);

			if (!common.isElementPresent("//div[@id='roles-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='roles-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			if (!common.isElementPresent("//div[@id='roles-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='roles-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on User Roles Section");
			common.log("Step :: Click on User Roles Sections");
			userrolessection.click();

			if (!common.isElementPresent("//div[@id='roles-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='roles-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='roles-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='roles-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//div[@id='roles-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='roles-table_paginate']//a[text()='2']")).click();
			}

		}
	}

	public void Verfiy_UserAccounts_pageElements() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Account section");
			common.log("Step :: Click on User Account section");
			useraccountsection.click();

			System.out.println("Step :: Verify New User  button ");
			common.log("Step :: Verify New User button");
			common.assertElementPresent("//a[text()=' New User ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  First Name column header is present on table");
			common.log("Step :: Verify  First Name column is present on table");
			common.assertElementPresent("//tr//th[text()='First Name']");

			System.out.println("Step :: Verify  Last Name column header is present on table");
			common.log("Step :: Verify  Last Name column is present on table");
			common.assertElementPresent("//tr//th[text()='Last Name']");

			System.out.println("Step :: Verify Username column header is present on table");
			common.log("Step :: Verify  Username is present on table");
			common.assertElementPresent("//tr//th[text()='Username']");

			System.out.println("Step :: Verify  Email column header is present on table");
			common.log("Step :: Verify  Email is present on table");
			common.assertElementPresent("//tr//th[text()='Email']");

			System.out.println("Step :: Verify  User Role column header is present on table");
			common.log("Step :: Verify User Rolecolumn header is present on table");
			common.assertElementPresent("//tr//th[text()='User Role']");

			System.out.println("Step :: Verify Created On column header is present on table");
			common.log("Step :: Verify  Created On header is present on table");
			common.assertElementPresent("//tr//th[text()='Created On']");

			System.out.println("Step :: Verify Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

			System.out.println("Step :: Verify Last Login column header is present on table");
			common.log("Step :: Verify Last Login  is present on table");
			common.assertElementPresent("//tr//th[text()='Last Login']");

			System.out.println("Step :: Verify Active column header is present on table");
			common.log("Step :: Verify Active  is present on table");
			common.assertElementPresent("//tr//th[text()='Active']");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account section");
			common.log("Step :: Click on User Account section");
			useraccountsection.click();

			System.out.println("Step :: Verify New User  button ");
			common.log("Step :: Verify New User button");
			common.assertElementPresent("//a[text()=' New User ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  First Name column header is present on table");
			common.log("Step :: Verify  First Name column is present on table");
			common.assertElementPresent("//tr//th[text()='First Name']");

			System.out.println("Step :: Verify  Last Name column header is present on table");
			common.log("Step :: Verify  Last Name column is present on table");
			common.assertElementPresent("//tr//th[text()='Last Name']");

			System.out.println("Step :: Verify Username column header is present on table");
			common.log("Step :: Verify  Username is present on table");
			common.assertElementPresent("//tr//th[text()='Username']");

			System.out.println("Step :: Verify  Email column header is present on table");
			common.log("Step :: Verify  Email is present on table");
			common.assertElementPresent("//tr//th[text()='Email']");

			System.out.println("Step :: Verify  User Role column header is present on table");
			common.log("Step :: Verify User Rolecolumn header is present on table");
			common.assertElementPresent("//tr//th[text()='User Role']");

			System.out.println("Step :: Verify Created On column header is present on table");
			common.log("Step :: Verify  Created On header is present on table");
			common.assertElementPresent("//tr//th[text()='Created On']");

			System.out.println("Step :: Verify Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

			System.out.println("Step :: Verify Last Login column header is present on table");
			common.log("Step :: Verify Last Login  is present on table");
			common.assertElementPresent("//tr//th[text()='Last Login']");

			System.out.println("Step :: Verify Active column header is present on table");
			common.log("Step :: Verify Active  is present on table");
			common.assertElementPresent("//tr//th[text()='Active']");
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on User Account section");
			common.log("Step :: Click on User Account section");
			useraccountsection.click();

			System.out.println("Step :: Verify New User  button ");
			common.log("Step :: Verify New User button");
			common.assertElementPresent("//a[text()=' New User ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  First Name column header is present on table");
			common.log("Step :: Verify  First Name column is present on table");
			common.assertElementPresent("//tr//th[text()='First Name']");

			System.out.println("Step :: Verify  Last Name column header is present on table");
			common.log("Step :: Verify  Last Name column is present on table");
			common.assertElementPresent("//tr//th[text()='Last Name']");

			System.out.println("Step :: Verify Username column header is present on table");
			common.log("Step :: Verify  Username is present on table");
			common.assertElementPresent("//tr//th[text()='Username']");

			System.out.println("Step :: Verify  Email column header is present on table");
			common.log("Step :: Verify  Email is present on table");
			common.assertElementPresent("//tr//th[text()='Email']");

			System.out.println("Step :: Verify  User Role column header is present on table");
			common.log("Step :: Verify User Rolecolumn header is present on table");
			common.assertElementPresent("//tr//th[text()='User Role']");

			System.out.println("Step :: Verify Created On column header is present on table");
			common.log("Step :: Verify  Created On header is present on table");
			common.assertElementPresent("//tr//th[text()='Created On']");

			System.out.println("Step :: Verify Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

			System.out.println("Step :: Verify Last Login column header is present on table");
			common.log("Step :: Verify Last Login  is present on table");
			common.assertElementPresent("//tr//th[text()='Last Login']");

			System.out.println("Step :: Verify Active column header is present on table");
			common.log("Step :: Verify Active  is present on table");
			common.assertElementPresent("//tr//th[text()='Active']");
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account section");
			common.log("Step :: Click on User Account section");
			useraccountsection.click();

			System.out.println("Step :: Verify New User  button ");
			common.log("Step :: Verify New User button");
			common.assertElementPresent("//a[text()=' New User ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  First Name column header is present on table");
			common.log("Step :: Verify  First Name column is present on table");
			common.assertElementPresent("//tr//th[text()='First Name']");

			System.out.println("Step :: Verify  Last Name column header is present on table");
			common.log("Step :: Verify  Last Name column is present on table");
			common.assertElementPresent("//tr//th[text()='Last Name']");

			System.out.println("Step :: Verify Username column header is present on table");
			common.log("Step :: Verify  Username is present on table");
			common.assertElementPresent("//tr//th[text()='Username']");

			System.out.println("Step :: Verify  Email column header is present on table");
			common.log("Step :: Verify  Email is present on table");
			common.assertElementPresent("//tr//th[text()='Email']");

			System.out.println("Step :: Verify  User Role column header is present on table");
			common.log("Step :: Verify User Rolecolumn header is present on table");
			common.assertElementPresent("//tr//th[text()='User Role']");

			System.out.println("Step :: Verify Created On column header is present on table");
			common.log("Step :: Verify  Created On header is present on table");
			common.assertElementPresent("//tr//th[text()='Created On']");

			System.out.println("Step :: Verify Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

			System.out.println("Step :: Verify Last Login column header is present on table");
			common.log("Step :: Verify Last Login  is present on table");
			common.assertElementPresent("//tr//th[text()='Last Login']");

			System.out.println("Step :: Verify Active column header is present on table");
			common.log("Step :: Verify Active  is present on table");
			common.assertElementPresent("//tr//th[text()='Active']");
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on User Account section");
			common.log("Step :: Click on User Account section");
			useraccountsection.click();

			System.out.println("Step :: Verify New User  button ");
			common.log("Step :: Verify New User button");
			common.assertElementPresent("//a[text()=' New User ']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  First Name column header is present on table");
			common.log("Step :: Verify  First Name column is present on table");
			common.assertElementPresent("//tr//th[text()='First Name']");

			System.out.println("Step :: Verify  Last Name column header is present on table");
			common.log("Step :: Verify  Last Name column is present on table");
			common.assertElementPresent("//tr//th[text()='Last Name']");

			System.out.println("Step :: Verify Username column header is present on table");
			common.log("Step :: Verify  Username is present on table");
			common.assertElementPresent("//tr//th[text()='Username']");

			System.out.println("Step :: Verify  Email column header is present on table");
			common.log("Step :: Verify  Email is present on table");
			common.assertElementPresent("//tr//th[text()='Email']");

			System.out.println("Step :: Verify  User Role column header is present on table");
			common.log("Step :: Verify User Rolecolumn header is present on table");
			common.assertElementPresent("//tr//th[text()='User Role']");

			System.out.println("Step :: Verify Created On column header is present on table");
			common.log("Step :: Verify  Created On header is present on table");
			common.assertElementPresent("//tr//th[text()='Created On']");

			System.out.println("Step :: Verify Last Updated column header is present on table");
			common.log("Step :: Verify Last Updated is present on table");
			common.assertElementPresent("//tr//th[text()='Last Updated']");

			System.out.println("Step :: Verify Last Login column header is present on table");
			common.log("Step :: Verify Last Login  is present on table");
			common.assertElementPresent("//tr//th[text()='Last Login']");

			System.out.println("Step :: Verify Active column header is present on table");
			common.log("Step :: Verify Active  is present on table");
			common.assertElementPresent("//tr//th[text()='Active']");

		}
	}

	public void UserAccount_Pagination_Button() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			common.pause(10);

			if (!common.isElementPresent("//div[@id='user-account-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='user-account-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			if (!common.isElementPresent("//div[@id='user-account-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='user-account-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			if (!common.isElementPresent("//div[@id='user-account-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='user-account-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='user-account-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='roles-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {
			if (!common.isElementPresent("//div[@id='user-account-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='user-account-table_paginate']//a[text()='2']")).click();
			}

		}

	}

	public void Verify_NewUser_form_validatoin() {
		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

		}
	}

	public void Create_NewUser_Account() {
		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			emailfield.sendKeys("test111@gmial.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			emailfield.sendKeys("test111@gmial.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			emailfield.sendKeys("test111@gmial.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			emailfield.sendKeys("test111@gmial.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		} else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

		}
	}

	public void Verfiy_Created_UserAccount_intable() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);

		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on Active check box");
			common.log("Step :: Click on Click on Active check box");
			driver.findElement(By.xpath("//input[@name='active_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);

		}
	}

	public void Create_UserAccount_With_CategoryManager() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

	}

	public void Create_NewUserAccount_With_Sitemanager() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();
		}
	}

	public void Verfiy_cancel_button_of_NewUserForm() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();

		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: Enter first name >>" + firstname);
			common.log("Step :: Enter first name >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step :: Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color pull-right']")).click();
		}

	}

	public void Verfiy_Created_UserAccount_with_categorymanager_intalbe() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);

		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on category check box");
			common.log("Step :: Click on Click on category check box");
			driver.findElement(By.xpath("//input[@name='category_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box");
			common.log("Step :: Enter created user account first name in search box");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		}
	}

	public void Verify_Created_Useraccount_with_sitemanager_Intable() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box >>" + firstname);
			common.log("Step :: Enter created user account first name in search box >>" + firstname);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box >>" + firstname);
			common.log("Step :: Enter created user account first name in search box >>" + firstname);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box >>" + firstname);
			common.log("Step :: Enter created user account first name in search box >>" + firstname);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);

		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box >>" + firstname);
			common.log("Step :: Enter created user account first name in search box >>" + firstname);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on User Account Section");
			common.log("Step :: Click on User Account Sections");
			useraccountsection.click();

			System.out.println("Step :: Click on New User button");
			common.log("Step :: Click on New User button");
			Newuserbutton.click();

			String Username = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + Username);
			common.log("Step :: EnterUsername >>" + Username);
			Usernamefield.sendKeys(Username);

			String firstname = common.generateRandomChars(3);
			System.out.println("Step :: EnterUsername >>" + firstname);
			common.log("Step :: EnterUsername >>" + firstname);
			Firstnamefield.sendKeys(firstname);

			System.out.println("Step :: Enter the value in Lastname field");
			common.log("Step :: Enter the value in Lastname field");
			Lastnamefield.sendKeys("Admin");

			System.out.println("Step :: Enter the value in password field");
			common.log("Step :: Enter the value in password field");
			passwordfield.sendKeys("admin");

			System.out.println("Step :: Enter the confirm password");
			common.log("Step :: Enter the confirm password");
			confirmpasswordfield.sendKeys("admin");

			System.out.println("Step :: Enter Email");
			common.log("Step :: Enter Email");
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			emailfield.sendKeys("username" + randomInt + "@gmail.com");

			System.out.println("Step :: Click on User Account Drop-down list");
			common.log("Step :: Click on User Account Drop-down list");
			userroledropdown.click();

			System.out.println("Step :: Select User Account Drop-down list item");
			common.log("Step :: Select  User Account Drop-down list item");
			userroleitem.click();

			System.out.println("Step :: Click on sitemanager check box");
			common.log("Step :: Click on Click on sitemanager check box");
			driver.findElement(By.xpath("//input[@name='site_manager_flag']")).click();

			System.out.println("Step :: Click on save button");
			common.log("Step :: Click on save button");
			driver.findElement(By.xpath("//input[@class='button btn-green-color pull-right']")).click();

			common.pause(30);

			System.out.println("Step :: Enter created user account first name in search box >>" + firstname);
			common.log("Step :: Enter created user account first name in search box >>" + firstname);
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(firstname);

			common.pause(10);
		}
	}

	public void Importsection_pageElements() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Verify Asset radio button on page");
			common.log("Step :: Verify Asset radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='assets']");

			System.out.println("Step :: Verify Inventory radio button on page");
			common.log("Step :: Verify Inventory radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='inventories']");

			System.out.println("Step :: Verify categories radio button on page");
			common.log("Step :: Verify categories radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='categories']");

			System.out.println("Step :: Verify locations radio button on page");
			common.log("Step :: Verify locatons radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='locations']");

			System.out.println("Step :: Verify companies radio button on page");
			common.log("Step :: Verify companies radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='companies']");

			System.out.println("Step :: Verify sites radio button on page");
			common.log("Step :: Verify sites radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='sites']");

			System.out.println("Step :: Verify contacts radio button on page");
			common.log("Step :: Verify contacts radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='contacts']");

			System.out.println("Step :: Verify users radio button on page");
			common.log("Step :: Verify users radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='users']");

			System.out.println("Step :: Verify Attach file  button on page");
			common.log("Step :: Verify  Attach file button on page");
			common.assertElementPresent("//span[@class='button btn-primary btn-default btn-file']");

			System.out.println("Step :: Verify create records radio button on page");
			common.log("Step :: Verify  Create records radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create']");

			System.out.println("Step :: Verify create and update records radio button on page");
			common.log("Step :: Verify  create and update records  button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create_and_update']");

		} else if (INV01URL.equals(inv1))

		{

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Verify Asset radio button on page");
			common.log("Step :: Verify Asset radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='assets']");

			System.out.println("Step :: Verify Inventory radio button on page");
			common.log("Step :: Verify Inventory radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='inventories']");

			System.out.println("Step :: Verify categories radio button on page");
			common.log("Step :: Verify categories radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='categories']");

			System.out.println("Step :: Verify locations radio button on page");
			common.log("Step :: Verify locatons radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='locations']");

			System.out.println("Step :: Verify companies radio button on page");
			common.log("Step :: Verify companies radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='companies']");

			System.out.println("Step :: Verify sites radio button on page");
			common.log("Step :: Verify sites radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='sites']");

			System.out.println("Step :: Verify contacts radio button on page");
			common.log("Step :: Verify contacts radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='contacts']");

			System.out.println("Step :: Verify users radio button on page");
			common.log("Step :: Verify users radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='users']");

			System.out.println("Step :: Verify Attach file  button on page");
			common.log("Step :: Verify  Attach file button on page");
			common.assertElementPresent("//span[@class='button btn-primary btn-default btn-file']");

			System.out.println("Step :: Verify create records radio button on page");
			common.log("Step :: Verify  Create records radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create']");

			System.out.println("Step :: Verify create and update records radio button on page");
			common.log("Step :: Verify  create and update records  button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create_and_update']");
		} else if (INV02URL.equals(inv2))

		{

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Verify Asset radio button on page");
			common.log("Step :: Verify Asset radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='assets']");

			System.out.println("Step :: Verify Inventory radio button on page");
			common.log("Step :: Verify Inventory radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='inventories']");

			System.out.println("Step :: Verify categories radio button on page");
			common.log("Step :: Verify categories radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='categories']");

			System.out.println("Step :: Verify locations radio button on page");
			common.log("Step :: Verify locatons radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='locations']");

			System.out.println("Step :: Verify companies radio button on page");
			common.log("Step :: Verify companies radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='companies']");

			System.out.println("Step :: Verify sites radio button on page");
			common.log("Step :: Verify sites radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='sites']");

			System.out.println("Step :: Verify contacts radio button on page");
			common.log("Step :: Verify contacts radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='contacts']");

			System.out.println("Step :: Verify users radio button on page");
			common.log("Step :: Verify users radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='users']");

			System.out.println("Step :: Verify Attach file  button on page");
			common.log("Step :: Verify  Attach file button on page");
			common.assertElementPresent("//span[@class='button btn-primary btn-default btn-file']");

			System.out.println("Step :: Verify create records radio button on page");
			common.log("Step :: Verify  Create records radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create']");

			System.out.println("Step :: Verify create and update records radio button on page");
			common.log("Step :: Verify  create and update records  button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create_and_update']");
		}

		else if (INV03URL.equals(inv3))

		{

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Verify Asset radio button on page");
			common.log("Step :: Verify Asset radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='assets']");

			System.out.println("Step :: Verify Inventory radio button on page");
			common.log("Step :: Verify Inventory radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='inventories']");

			System.out.println("Step :: Verify categories radio button on page");
			common.log("Step :: Verify categories radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='categories']");

			System.out.println("Step :: Verify locations radio button on page");
			common.log("Step :: Verify locatons radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='locations']");

			System.out.println("Step :: Verify companies radio button on page");
			common.log("Step :: Verify companies radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='companies']");

			System.out.println("Step :: Verify sites radio button on page");
			common.log("Step :: Verify sites radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='sites']");

			System.out.println("Step :: Verify contacts radio button on page");
			common.log("Step :: Verify contacts radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='contacts']");

			System.out.println("Step :: Verify users radio button on page");
			common.log("Step :: Verify users radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='users']");

			System.out.println("Step :: Verify Attach file  button on page");
			common.log("Step :: Verify  Attach file button on page");
			common.assertElementPresent("//span[@class='button btn-primary btn-default btn-file']");

			System.out.println("Step :: Verify create records radio button on page");
			common.log("Step :: Verify  Create records radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create']");

			System.out.println("Step :: Verify create and update records radio button on page");
			common.log("Step :: Verify  create and update records  button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create_and_update']");
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Verify Asset radio button on page");
			common.log("Step :: Verify Asset radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='assets']");

			System.out.println("Step :: Verify Inventory radio button on page");
			common.log("Step :: Verify Inventory radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='inventories']");

			System.out.println("Step :: Verify categories radio button on page");
			common.log("Step :: Verify categories radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='categories']");

			System.out.println("Step :: Verify locations radio button on page");
			common.log("Step :: Verify locatons radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='locations']");

			System.out.println("Step :: Verify companies radio button on page");
			common.log("Step :: Verify companies radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='companies']");

			System.out.println("Step :: Verify sites radio button on page");
			common.log("Step :: Verify sites radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='sites']");

			System.out.println("Step :: Verify contacts radio button on page");
			common.log("Step :: Verify contacts radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='contacts']");

			System.out.println("Step :: Verify users radio button on page");
			common.log("Step :: Verify users radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='users']");

			System.out.println("Step :: Verify Attach file  button on page");
			common.log("Step :: Verify  Attach file button on page");
			common.assertElementPresent("//span[@class='button btn-primary btn-default btn-file']");

			System.out.println("Step :: Verify create records radio button on page");
			common.log("Step :: Verify  Create records radio button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create']");

			System.out.println("Step :: Verify create and update records radio button on page");
			common.log("Step :: Verify  create and update records  button on page");
			common.assertElementPresent("//div[@class='radio-div']//input[@value='create_and_update']");
		}
	}

	public void Uploadfile_validation_Errormessage() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on next button");
			common.log("Step :: Click on next button");
			nextbutton.click();

			System.out.println("Step :: Verfiy the Error message");
			common.log("Step :: Verfiy the Error message");
			common.assertElementPresent("//div[@class='alert alert-danger']");
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on next button");
			common.log("Step :: Click on next button");
			nextbutton.click();

			System.out.println("Step :: Verfiy the Error message");
			common.log("Step :: Verfiy the Error message");
			common.assertElementPresent("//div[@class='alert alert-danger']");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on next button");
			common.log("Step :: Click on next button");
			nextbutton.click();

			System.out.println("Step :: Verfiy the Error message");
			common.log("Step :: Verfiy the Error message");
			common.assertElementPresent("//div[@class='alert alert-danger']");
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on next button");
			common.log("Step :: Click on next button");
			nextbutton.click();

			System.out.println("Step :: Verfiy the Error message");
			common.log("Step :: Verfiy the Error message");
			common.assertElementPresent("//div[@class='alert alert-danger']");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on next button");
			common.log("Step :: Click on next button");
			nextbutton.click();

			System.out.println("Step :: Verfiy the Error message");
			common.log("Step :: Verfiy the Error message");
			common.assertElementPresent("//div[@class='alert alert-danger']");
		}
	}

	public void Verify_Cancelbutton_of_Import_Section() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();

		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			System.out.println("Step :: Click on Cancel button");
			common.log("Step ::Click on Cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-gray-color']")).click();
		}
	}

	public void Attach_file_with_Assetcode_datatype() throws AWTException {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();

		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Asset radio button ");
			common.log("Step :: Click on Asset radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='assets']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}
	}

	public void Attach_file_with_inventorycode_datatype() throws AWTException {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='inventories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[text()='Inventory Code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='inventories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='inventories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='inventories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='inventories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}
	}

	public void Attach_file_with_categories_datatype() throws AWTException {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='categories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[text()='Category Name']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='categories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='categories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='Category Name']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='categories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();

		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='categories']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}
	}

	public void Verify_Attachfile_With_Location_DataType() throws AWTException {
		if (PREURL.equals(preurl))

		{

			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='locations']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='short_description']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='locations']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='Location Name']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='locations']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='locations']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: Click on Import Section");
			common.log("Step :: Click on Import Section");
			importsection.click();

			System.out.println("Step :: Click on Inventory radio button ");
			common.log("Step :: Click on Inventory radio button ");
			driver.findElement(By.xpath("//div[@class='radio-div']//input[@value='locations']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Attach file button ");
			common.log("Step :: Click on Attach file button ");
			Attachfilebutton.click();

			common.pause(20);

			String path = "C:\\data.xlsx";

			StringSelection filepath = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			Robot robot = new Robot();
			robot.delay(250);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			common.pause(20);

			System.out.println("Step :: Click on Created Records radio button ");
			common.log("Step :: Click on Created Records radio button ");
			driver.findElement(By.xpath("//input[@value='create']")).click();

			System.out.println("Step :: Click on Next button ");
			common.log("Step :: Click on Next radio button ");
			driver.findElement(By.xpath("//input[@id='btn-next']")).click();

			common.pause(10);

			System.out.println("Step :: Click Importname dropdown list ");
			common.log("Step ::  Click Importname dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']")).click();

			System.out.println("Step :: Select Importname from dropdown list ");
			common.log("Step ::  Select Importname from dropdown list");
			driver.findElement(By.xpath("//select[@name='Category name']//option[@value='asset_code']")).click();

			System.out.println("Step :: Click on save button ");
			common.log("Step :: Click on Savebutton ");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
		}
	}

	public void Verify_UPCAutomator_PageElements() {
		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: Verfiy Start Review button on the page");
			common.log("Step :: Verfiy Statrt review. button on the page");
			common.assertElementPresent("//a[@href='/admin/review-inventory']");

			System.out.println("Step :: Verfiy statusdropdown on the page");
			common.log("Step :: Verfiy statusdropdown on the page");
			common.assertElementPresent("//select[@name='source_loct']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Attachment  column header is present on table");
			common.log("Step :: Verify  Attachment is present on table");
			common.assertElementPresent("//tr//th[text()='Attachment']");

			System.out.println("Step :: Verify  Inventory Code column header is present on table");
			common.log("Step :: Verify  Inventory Code is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory Code']");

			System.out.println("Step :: Verify Product Code column header is present on table");
			common.log("Step :: Verify  Product Code is present on table");
			common.assertElementPresent("//tr//th[text()='Product Code']");

			System.out.println("Step :: Verify  Model column header is present on table");
			common.log("Step :: Verify  Model is present on table");
			common.assertElementPresent("//tr//th[text()='Model']");

			System.out.println("Step :: Verify  Brand column header is present on table");
			common.log("Step :: Verify Brand header is present on table");
			common.assertElementPresent("//tr//th[text()='Brand']");

			System.out.println("Step :: Verify Description column header is present on table");
			common.log("Step :: Verify Descriptionn header is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify UPC Status column header is present on table");
			common.log("Step :: Verify UPC Status is present on table");
			common.assertElementPresent("//tr//th[text()='UPC Status']");

			System.out.println("Step :: Verify Review column header is present on table");
			common.log("Step :: Verify Review present on table");
			common.assertElementPresent("//tr//th[text()='Review']");

		} else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: Verfiy Start Review button on the page");
			common.log("Step :: Verfiy Statrt review. button on the page");
			common.assertElementPresent("//a[@href='/admin/review-inventory']");

			System.out.println("Step :: Verfiy statusdropdown on the page");
			common.log("Step :: Verfiy statusdropdown on the page");
			common.assertElementPresent("//select[@name='source_loct']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Attachment  column header is present on table");
			common.log("Step :: Verify  Attachment is present on table");
			common.assertElementPresent("//tr//th[text()='Attachment']");

			System.out.println("Step :: Verify  Inventory Code column header is present on table");
			common.log("Step :: Verify  Inventory Code is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory Code']");

			System.out.println("Step :: Verify Product Code column header is present on table");
			common.log("Step :: Verify  Product Code is present on table");
			common.assertElementPresent("//tr//th[text()='Product Code']");

			System.out.println("Step :: Verify  Model column header is present on table");
			common.log("Step :: Verify  Model is present on table");
			common.assertElementPresent("//tr//th[text()='Model']");

			System.out.println("Step :: Verify  Brand column header is present on table");
			common.log("Step :: Verify Brand header is present on table");
			common.assertElementPresent("//tr//th[text()='Brand']");

			System.out.println("Step :: Verify Description column header is present on table");
			common.log("Step :: Verify Descriptionn header is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify UPC Status column header is present on table");
			common.log("Step :: Verify UPC Status is present on table");
			common.assertElementPresent("//tr//th[text()='UPC Status']");

			System.out.println("Step :: Verify Review column header is present on table");
			common.log("Step :: Verify Review present on table");
			common.assertElementPresent("//tr//th[text()='Review']");
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: Verfiy Start Review button on the page");
			common.log("Step :: Verfiy Statrt review. button on the page");
			common.assertElementPresent("//a[@href='/admin/review-inventory']");

			System.out.println("Step :: Verfiy statusdropdown on the page");
			common.log("Step :: Verfiy statusdropdown on the page");
			common.assertElementPresent("//select[@name='source_loct']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Attachment  column header is present on table");
			common.log("Step :: Verify  Attachment is present on table");
			common.assertElementPresent("//tr//th[text()='Attachment']");

			System.out.println("Step :: Verify  Inventory Code column header is present on table");
			common.log("Step :: Verify  Inventory Code is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory Code']");

			System.out.println("Step :: Verify Product Code column header is present on table");
			common.log("Step :: Verify  Product Code is present on table");
			common.assertElementPresent("//tr//th[text()='Product Code']");

			System.out.println("Step :: Verify  Model column header is present on table");
			common.log("Step :: Verify  Model is present on table");
			common.assertElementPresent("//tr//th[text()='Model']");

			System.out.println("Step :: Verify  Brand column header is present on table");
			common.log("Step :: Verify Brand header is present on table");
			common.assertElementPresent("//tr//th[text()='Brand']");

			System.out.println("Step :: Verify Description column header is present on table");
			common.log("Step :: Verify Descriptionn header is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify UPC Status column header is present on table");
			common.log("Step :: Verify UPC Status is present on table");
			common.assertElementPresent("//tr//th[text()='UPC Status']");

			System.out.println("Step :: Verify Review column header is present on table");
			common.log("Step :: Verify Review present on table");
			common.assertElementPresent("//tr//th[text()='Review']");
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: Verfiy Start Review button on the page");
			common.log("Step :: Verfiy Statrt review. button on the page");
			common.assertElementPresent("//a[@href='/admin/review-inventory']");

			System.out.println("Step :: Verfiy statusdropdown on the page");
			common.log("Step :: Verfiy statusdropdown on the page");
			common.assertElementPresent("//select[@name='source_loct']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Attachment  column header is present on table");
			common.log("Step :: Verify  Attachment is present on table");
			common.assertElementPresent("//tr//th[text()='Attachment']");

			System.out.println("Step :: Verify  Inventory Code column header is present on table");
			common.log("Step :: Verify  Inventory Code is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory Code']");

			System.out.println("Step :: Verify Product Code column header is present on table");
			common.log("Step :: Verify  Product Code is present on table");
			common.assertElementPresent("//tr//th[text()='Product Code']");

			System.out.println("Step :: Verify  Model column header is present on table");
			common.log("Step :: Verify  Model is present on table");
			common.assertElementPresent("//tr//th[text()='Model']");

			System.out.println("Step :: Verify  Brand column header is present on table");
			common.log("Step :: Verify Brand header is present on table");
			common.assertElementPresent("//tr//th[text()='Brand']");

			System.out.println("Step :: Verify Description column header is present on table");
			common.log("Step :: Verify Descriptionn header is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify UPC Status column header is present on table");
			common.log("Step :: Verify UPC Status is present on table");
			common.assertElementPresent("//tr//th[text()='UPC Status']");

			System.out.println("Step :: Verify Review column header is present on table");
			common.log("Step :: Verify Review present on table");
			common.assertElementPresent("//tr//th[text()='Review']");
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: Verfiy Start Review button on the page");
			common.log("Step :: Verfiy Statrt review. button on the page");
			common.assertElementPresent("//a[@href='/admin/review-inventory']");

			System.out.println("Step :: Verfiy statusdropdown on the page");
			common.log("Step :: Verfiy statusdropdown on the page");
			common.assertElementPresent("//select[@name='source_loct']");

			System.out.println("Step :: Verify search box is  present ");
			common.log("Step :: Verify search box is  present");
			common.assertElementPresent("//input[@type='search']");

			System.out.println("Step :: Verify View all item present in drop-down list");
			common.log("Step :: Verify View all item present in drop-down list");
			common.assertElementPresent("//select//option[@value='-1']");

			System.out.println("Step :: Verify  Attachment  column header is present on table");
			common.log("Step :: Verify  Attachment is present on table");
			common.assertElementPresent("//tr//th[text()='Attachment']");

			System.out.println("Step :: Verify  Inventory Code column header is present on table");
			common.log("Step :: Verify  Inventory Code is present on table");
			common.assertElementPresent("//tr//th[text()='Inventory Code']");

			System.out.println("Step :: Verify Product Code column header is present on table");
			common.log("Step :: Verify  Product Code is present on table");
			common.assertElementPresent("//tr//th[text()='Product Code']");

			System.out.println("Step :: Verify  Model column header is present on table");
			common.log("Step :: Verify  Model is present on table");
			common.assertElementPresent("//tr//th[text()='Model']");

			System.out.println("Step :: Verify  Brand column header is present on table");
			common.log("Step :: Verify Brand header is present on table");
			common.assertElementPresent("//tr//th[text()='Brand']");

			System.out.println("Step :: Verify Description column header is present on table");
			common.log("Step :: Verify Descriptionn header is present on table");
			common.assertElementPresent("//tr//th[text()='Description']");

			System.out.println("Step :: Verify UPC Status column header is present on table");
			common.log("Step :: Verify UPC Status is present on table");
			common.assertElementPresent("//tr//th[text()='UPC Status']");

			System.out.println("Step :: Verify Review column header is present on table");
			common.log("Step :: Verify Review present on table");
			common.assertElementPresent("//tr//th[text()='Review']");
		}
	}

	public void Verify_ProductCodefield_validation() {
		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill product code");
			common.log("Step ::  Click on Save button with out fill product code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill product code");
			common.log("Step ::  Click on Save button with out fill product code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill product code");
			common.log("Step ::  Click on Save button with out fill product code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill product code");
			common.log("Step ::  Click on Save button with out fill product code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill product code");
			common.log("Step ::  Click on Save button with out fill product code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		}
	}

	public void Verify_Inventorycodefield_validation() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		}
	}

	public void Verify_Modelfield_vaidation() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

			common.pause(10);
			common.assertElementPresent("//div[@id='errorsBox']");
		}
	}

	public void Review_Basic_Inventory() {
		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

		} else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

		} else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}
	}

	public void Verify_Advanced_ReviewInventory() {

		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}
	}

	public void Verify_Advanced_Extract_ReviewInventory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();

		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}
	}

	public void Verify_Review_Inventory_With_matchmode() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			System.out.println("Step :: Click on basic radio button");
			common.log("Step :: Click on Basic radio button");
			driver.findElement(By.xpath("//label[@for='basic']//input")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			System.out.println("Step :: Click on basic radio button");
			common.log("Step :: Click on Basic radio button");
			driver.findElement(By.xpath("//label[@for='basic']//input")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			System.out.println("Step :: Click on basic radio button");
			common.log("Step :: Click on Basic radio button");
			driver.findElement(By.xpath("//label[@for='basic']//input")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			System.out.println("Step :: Click on basic radio button");
			common.log("Step :: Click on Basic radio button");
			driver.findElement(By.xpath("//label[@for='basic']//input")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV04URL.equals(inv4))

		{

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			common.pause(10);
			System.out.println("Step :: Click on Extract radio button");
			common.log("Step :: Click on Extract radio button");
			driver.findElement(By.xpath("//label[@for='exact']//input[@name='match_mode']")).click();

			System.out.println("Step :: Click on basic radio button");
			common.log("Step :: Click on Basic radio button");
			driver.findElement(By.xpath("//label[@for='basic']//input")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

	}

	public void verify_Type_Product_inAdvanced_Review_invwntory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on product radio button");
			common.log("Step :: Click on product radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='product']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on product radio button");
			common.log("Step :: Click on product radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='product']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();
			
			common.pause(10);
			
			System.out.println("Step :: Click on product radio button");
			common.log("Step :: Click on product radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='product']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on product radio button");
			common.log("Step :: Click on product radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='product']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on product radio button");
			common.log("Step :: Click on product radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='product']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}
	}

	public void Verify_Type_Book_Reviewinventory() {

		if (PREURL.equals(preurl))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on Book radio button");
			common.log("Step :: Click on Book radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='book']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		} else if (INV01URL.equals(inv1))

		{

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			common.pause(10);
			
			System.out.println("Step :: Click on Book radio button");
			common.log("Step :: Click on Book radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='book']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV02URL.equals(inv2))

		{

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on Book radio button");
			common.log("Step :: Click on Book radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='book']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on Book radio button");
			common.log("Step :: Click on Book radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='book']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}

		else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//label[text()=' Advanced']//input")).click();

			System.out.println("Step :: Click on Book radio button");
			common.log("Step :: Click on Book radio button");
			driver.findElement(By.xpath("//label[@for='due_date']//input[@value='book']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Save button with out fill invnetory code");
			common.log("Step ::  Click on Save button with out fill invnetory code");
			UPCsavebutton.click();
		}
	}

	public void Verify_Skip_Review_Invnetory() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Skip button ");
			common.log("Step ::  Click on Skip button");
			driver.findElement(By.xpath("//input[@id='btnSkip']")).click();
		} else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Skip button ");
			common.log("Step ::  Click on Skip button");
			driver.findElement(By.xpath("//input[@id='btnSkip']")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Skip button ");
			common.log("Step ::  Click on Skip button");
			driver.findElement(By.xpath("//input[@id='btnSkip']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Skip button ");
			common.log("Step ::  Click on Skip button");
			driver.findElement(By.xpath("//input[@id='btnSkip']")).click();
		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on Skip button ");
			common.log("Step ::  Click on Skip button");
			driver.findElement(By.xpath("//input[@id='btnSkip']")).click();
		}
	}

	public void Verify_NAbutton_of_ReviewInventoy() {
		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on NA button ");
			common.log("Step ::  Click on NA button");
			driver.findElement(By.xpath("//input[@id='btnNA']")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on NA button ");
			common.log("Step ::  Click on NA button");
			driver.findElement(By.xpath("//input[@id='btnNA']")).click();
		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on NA button ");
			common.log("Step ::  Click on NA button");
			driver.findElement(By.xpath("//input[@id='btnNA']")).click();

		}

		else if (INV03URL.equals(inv3)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on NA button ");
			common.log("Step ::  Click on NA button");
			driver.findElement(By.xpath("//input[@id='btnNA']")).click();
		} else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on NA button ");
			common.log("Step ::  Click on NA button");
			driver.findElement(By.xpath("//input[@id='btnNA']")).click();
		}
	}

	public void Verify_cancelbutton() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Model  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step ::  Click on cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-green-gray']")).click();
		}

		else if (INV01URL.equals(inv1))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step ::  Click on cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-green-gray']")).click();
		} else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step ::  Click on cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-green-gray']")).click();
		}

		else if (INV03URL.equals(inv3)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step ::  Click on cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-green-gray']")).click();
		}

		else if (INV04URL.equals(inv4)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);

			String Invnetorycode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			common.log("Step ::  Enter Inventory code >>" + Invnetorycode);
			invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter Description >>" + brand);
			common.log("Step ::  Enter Description >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on cancel button ");
			common.log("Step ::  Click on cancel button");
			driver.findElement(By.xpath("//input[@class='button btn-green-gray']")).click();
		}
	}

	public void Verify_Status_Drop_downlist() {

		if (PREURL.equals(preurl)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: CLick on status Drop-Downlist");
			common.log("Step :: Click on Status Drop-down list");
			driver.findElement(By.xpath("//div[@id='location']//label//select")).click();
		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			
			System.out.println("Step :: CLick on status Drop-Downlist");
			common.log("Step :: Click on Status Drop-down list");
			driver.findElement(By.xpath("//div[@id='location']//label//select")).click();
		}

		else if (INV02URL.equals(inv2)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);

			System.out.println("Step :: CLick on status Drop-Downlist");
			common.log("Step :: Click on Status Drop-down list");
			driver.findElement(By.xpath("//div[@id='location']//label//select")).click();
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: CLick on status Drop-Downlist");
			common.log("Step :: Click on Status Drop-down list");
			driver.findElement(By.xpath("//div[@id='location']//label//select")).click();
		}

		else if (INV04URL.equals(inv4))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			System.out.println("Step :: CLick on status Drop-Downlist");
			common.log("Step :: Click on Status Drop-down list");
			driver.findElement(By.xpath("//div[@id='location']//label//select")).click();
		}
	}

	public void Verify_UPCpagination_button() {
		// verify second page element present or not
		if (PREURL.equals(preurl)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);

			if (!common.isElementPresent("//div[@id='upc-automator-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='upc-automator-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV01URL.equals(inv1)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			if (!common.isElementPresent("//div[@id='upc-automator-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='upc-automator-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV02URL.equals(inv2)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			if (!common.isElementPresent("//div[@id='upc-automator-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='upc-automator-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV03URL.equals(inv3))

		{
			if (!common.isElementPresent("//div[@id='upc-automator-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='upc-automator-table_paginate']//a[text()='2']")).click();
			}

		}

		else if (INV04URL.equals(inv4)) {

			if (!common.isElementPresent("//div[@id='upc-automator-table_paginate']//a[text()='2']")) {

				System.out.println("Step :: 2nd Page not present");
				common.log("Step :: 2nd Page Not Present");
			}

			else {

				System.out.println("Step :: Open Second page of Table");
				common.log("Step :: Open Second page of Table");
				driver.findElement(By.xpath("//div[@id='upc-automator-table_paginate']//a[text()='2']")).click();
			}

		}
	}

	public void Verfiy_Created_ReviewInventory() {

		if (PREURL.equals(preurl)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);
			//
			// String Invnetorycode = common.generateRandomNumber1();
			// System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			// common.log("Step :: Enter Inventory code >>" + Invnetorycode);
			// invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter brand >>" + brand);
			common.log("Step ::  Enter brand >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on save button ");
			common.log("Step ::  Click on save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

			common.pause(20);
			UPCautomatorsection.click();

			common.pause(30);
			System.out.println("Step ::Enter the reviewed inventory ");
			common.log("Step ::Enter the reviewed inventory");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(brand);

		}

		else if (INV01URL.equals(inv1)) {
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);
			//
			// String Invnetorycode = common.generateRandomNumber1();
			// System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			// common.log("Step :: Enter Inventory code >>" + Invnetorycode);
			// invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter brand >>" + brand);
			common.log("Step ::  Enter brand >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on save button ");
			common.log("Step ::  Click on save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

			common.pause(20);
			UPCautomatorsection.click();

			common.pause(30);
			System.out.println("Step ::Enter the reviewed inventory ");
			common.log("Step ::Enter the reviewed inventory");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(brand);
		} else if (INV02URL.equals(inv2))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);
			//
			// String Invnetorycode = common.generateRandomNumber1();
			// System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			// common.log("Step :: Enter Inventory code >>" + Invnetorycode);
			// invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter brand >>" + brand);
			common.log("Step ::  Enter brand >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on save button ");
			common.log("Step ::  Click on save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

			common.pause(20);
			UPCautomatorsection.click();

			common.pause(30);
			System.out.println("Step ::Enter the reviewed inventory ");
			common.log("Step ::Enter the reviewed inventory");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(brand);
		}

		else if (INV03URL.equals(inv3))

		{
			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);
			//
			// String Invnetorycode = common.generateRandomNumber1();
			// System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			// common.log("Step :: Enter Inventory code >>" + Invnetorycode);
			// invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter brand >>" + brand);
			common.log("Step ::  Enter brand >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on save button ");
			common.log("Step ::  Click on save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

			common.pause(20);
			UPCautomatorsection.click();

			common.pause(30);
			System.out.println("Step ::Enter the reviewed inventory ");
			common.log("Step ::Enter the reviewed inventory");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(brand);
		} else if (INV04URL.equals(inv4)) {

			System.out.println("Step :: CLick on UPC Automator Section");
			common.log("Step :: Click on UPC Automator Section");
			UPCautomatorsection.click();

			common.pause(10);
			System.out.println("Step :: Click on Start Review button");
			common.log("Step :: Click on Start Review button");
			StartReviewbutton.click();

			common.pause(10);

			System.out.println("Step :: Click on Advanced radio button");
			common.log("Step :: Click on Advanced radio button");
			driver.findElement(By.xpath("//input[@value='1']")).click();

			String productcode = common.generateRandomNumber1();
			System.out.println("Step :: Enter Inventory code >>" + productcode);
			common.log("Step ::  Enter Inventory code >>" + productcode);
			productcodefield.sendKeys(productcode);
			//
			// String Invnetorycode = common.generateRandomNumber1();
			// System.out.println("Step :: Enter Inventory code >>" + Invnetorycode);
			// common.log("Step :: Enter Inventory code >>" + Invnetorycode);
			// invnetorycodefield.sendKeys(Invnetorycode);

			String model = common.generateRandomNumber1();
			System.out.println("Step :: Enter model  >>" + model);
			common.log("Step ::  Enter Inventory  >>" + model);
			modelfield.sendKeys(model);

			String desc = common.generateRandomChars(5);
			System.out.println("Step :: Enter Description >>" + desc);
			common.log("Step ::  Enter Description >>" + desc);
			UPCdescriptionfield.sendKeys(desc);

			String brand = common.generateRandomChars(3);
			System.out.println("Step :: Enter brand >>" + brand);
			common.log("Step ::  Enter brand >>" + brand);
			Brandfield.sendKeys(brand);

			System.out.println("Step :: Click on save button ");
			common.log("Step ::  Click on save button");
			driver.findElement(By.xpath("//input[@id='btn-save']")).click();

			common.pause(20);
			UPCautomatorsection.click();

			common.pause(30);
			System.out.println("Step ::Enter the reviewed inventory ");
			common.log("Step ::Enter the reviewed inventory");
			driver.findElement(By.xpath("//input[@class='form-control input-sm search-input']")).sendKeys(brand);
		}
	}

}
