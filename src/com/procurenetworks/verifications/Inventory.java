package com.procurenetworks.verifications;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.procurenetworks.init.Common;
import com.procurenetworks.init.SeleniumInit;
import com.procurenetworks.pages.Main_Page;
import com.procurenetworks.pages.Procure_Inventory;

public class Inventory extends SeleniumInit {

	Common common = new Common(driver);

	public Inventory() {
		super();
	}

	/**
	 * Open Inventory tab
	 * 
	 */
    
	@Test
	public void Verify_Inventory() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure(); // Verify Procurepage
		procureinventory.Inventory(); // Verify Inventory Page Tab
	}

	/**
	 * Verify Inventory Search tab
	 * 
	 */
	@Test
	public void Verify_Inventory_Searchtab() {
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure(); // Verify Procure Page
		procureinventory.Inventory(); // Verify Inventory Page
		procureinventory.Inventory_Searchtab(); // Verify Inventory Search Tab
	}

	/**
	 * Verify Inventory Search table
	 * 
	 */
	@Test
	public void Verify_InventorySearch_Table() {
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure(); // Verify Procure Page
		procureinventory.Inventory(); // Verify Inventory Module
		procureinventory.InventorySearch_Table(); // Verify Inventory Search Table
	}

	/**
	 * Verify Inventory Site Dropdown list
	 * 
	 */
	@Test
	public void Verify_Inventorysite() {

		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory();
		procureinventory.Inventory_sitebox();
	}

	/**
	 * Verify Inventory Table check box
	 * 
	 */
	@Test
	public void Verify_Inventory_tablecheckbox() {

		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory();
		procureinventory.Inventory_tablecheckbox();
	}

	/**
	 * Verify Inventory Edit button
	 * 
	 */
	@Test
	public void Verify_Inventory_Edit_Button() {
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();

		procureinventory.Inventory();
		procureinventory.Inventory_Edit();
	}

	/**
	 * Verify Inventory Edit pop-up box
	 * 
	 */
	@Test
	public void Verify_Inventory_Edit_pop_up_box() {
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();

		procureinventory.Inventory();
		procureinventory.Inventory_Edit_popup_box();
	}

	/**
	 * Verify Inventory Edit Category
	 * 
	 */

	@Test
	public void Verify_Inventory_Edit_category() {
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory_Edit_category();
	}

	/**
	 * Verify Inventory Edit Vendor
	 * 
	 */
	@Test
	public void Verify_Inventory_Edit_Vendor() {
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory_Edit_Vendor();
	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_Inventory_Edit_save_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Edit_save_button();
	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_Edit_Cancel_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Edit_cancel_button();
	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_Inventory_Pagination_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Pagination_button();
	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_Inventory_Delete_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory_Delete_button();

	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_Yes_Delete_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory_Delete_button();
		procureinventory.Delte_yes_button();
	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_No_Delete_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory_Delete_button();
		procureinventory.Delete_No_button();
	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_New_Inventory_tab() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.New_inventory_tab();
	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_Inventory_No_checkbox() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory_No_checkbox();
	}

	/**
	 * Verify New Kit box
	 * 
	 */
	@Test
	public void Verify_New_kit_Box() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.New_kit_Box();
	}

	/**
	 * Verify Move inventory
	 * 
	 */
	@Test
	public void Verify_Move_Inventory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Inventory_Move();
	}

	/**
	 * Verify Move inventory with yes toggle button
	 * 
	 */
	@Test
	public void Verify_Move_inventory_Cancel_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Move_inventory_Yes_toogle_button();
	}

	/**
	 * Verify Remove Inventory
	 * 
	 */
	@Test
	public void Verify_Remove_invnetory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Remove_invnetory();
	}

	/**
	 * Verify Restock Inventory
	 * 
	 */
	@Test
	public void Verify_Restock_Inventory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		procureinventory = indexpage.procure();
		procureinventory.Restock_Inventroy();
	}

}