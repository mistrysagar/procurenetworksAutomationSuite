package com.procurenetworks.verifications;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.procurenetworks.init.Common;
import com.procurenetworks.init.SeleniumInit;
import com.procurenetworks.pages.Main_Page;

public class ProcureNetworks extends SeleniumInit {

	Common common = new Common(driver);

	public ProcureNetworks() {
		super();
	}

	/**
	 * Procure Network
	 *     
	 * @throws InterruptedException
	 */
	@Test
	public void Procure() throws InterruptedException {

		// driver.get(PROCUREURL); // Open URL
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

	}

	/**
	 * Procure Network - Search Assets
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void Search_Asset() throws InterruptedException {

		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Search_Assets(); // Search From table

	}

	/**
	 * Procure Network - Invalid User Name
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void Invalid_Username() throws InterruptedException {

		// driver.get(PROCUREURL); // Open URL
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();

		mainpage.Invalid_Procure_login(); // Enter User name Wrong

	}

	/**
	 * Procure Network - Create new asset
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test
	public void Create_New_Asset() throws InterruptedException, AWTException {

		// Open procurenetworks.com
		String assetcode = common.generateRandomNumber1();

		// driver.get(PROCUREURL); // Open URL
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.New_Asset(assetcode);

	}

	/**
	 * Procure Network - Invalid User Name
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	@Test
	public void Search_Last_Created_Asset() throws InterruptedException, AWTException {

		// Open procurenetworks.com
		// driver.get(PROCUREURL);

		String assetcode = common.generateRandomNumber1();

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		String asset_code = mainpage.New_Asset(assetcode); // Enter User name Wrong
		mainpage.Search_Created_Asset(asset_code); // Search From table

	}

	/**
	 * Procure Network -Asset Search drop-down list
	 * 
	 */
	// Verify Asset search drop-down list
	@Test
	public void Asset_Search_Dropdownlist() {

		// Open procurenetworks.com
		// driver.get(PROCUREURL);

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Asset_Dropdown(); // Open Asset search page drop down list
	}

	// verify asset site drop-down list
	/**
	 * 
	 * 
	 */
	@Test
	public void Asset_site_Dropdownlist() {
		// Open procurenetworks.com

		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Asset_site(); // Open Asset site list
	}

	/**
	 * Procure Network -Click on pagination
	 * 
	 */
	@Test
	public void Table_Pagination() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Pagination(); // click on Pagination
	}

	/**
	 * Procure Network - Verify checkbox
	 * 
	 */
	@Test
	public void Check_table_checkbox() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Check_table(); // Verify Checkbox
	}

	/**
	 * Procure Network- Check Edit button
	 * 
	 * @throws AWTException
	 */
       
	@Test
	public void Check_Edit_button() throws AWTException {

		// driver.get(PROCUREURL);

		String assetcode = common.generateRandomNumber1();
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.New_Asset(assetcode); // Enter User name Wrong
         mainpage.Edit_Created_Asset(assetcode);
	}

	/**
	 * Procure Network-Edit Two record
	 * 
	 */
	@Test
	public void Edit_Twoassetform() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Edit_TwoAsset(); // Edit two record
	}

	/**
	 * Procure Network- Edit Parent Asset
	 * 
	 */
	@Test
	public void Edit_ParentAssetfield() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Edit_ParentAsset(); // Edit parent Asset
	}

	/**
	 * Procure Network-Edit Category
	 * 
	 */
	@Test
	public void Edit_CategoryAssetfield() {

		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Edit_Category(); // Edit Category
	}

	/**
	 * Edit Cost
	 * 
	 */
	@Test
	public void Edit_cost() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Cost(); // Edit Cost
	}

	/**
	 * Edit Depreciation Class
	 * 
	 */
	@Test
	public void Edit_Depreciation_Class() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Depreciation_Class(); // select Depreciation
	}

	/**
	 * Edit Model Number
	 * 
	 */
	@Test
	public void Edit_ModelNumber() {
		// Open procurenetworks.com

		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.ModelNumber(); // Enter Model number
	}

	/**
	 * Edit Purchase Date
	 * 
	 */
	@Test
	public void Edit_PurchaseDate() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.PurchaseDate(); // Select Purchase date
	}

	/**
	 * Edit Vendor
	 * 
	 */
	@Test
	public void Edit_Vendor() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Vendor(); // Select vendor
	}

	/**
	 * Edit Site
	 * 
	 */
	@Test
	public void Edit_Site() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Site(); // select site
	}

	/**
	 * Edit Save Button
	 * 
	 */
	@Test
	public void Edit_Savebutton() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Save(); // Click Save button
	}

	/**
	 * Edit Cancel Button
	 * 
	 */
	@Test
	public void Edit_Cancelbutton() {
		// Open procurenetworks.com
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Cancel(); // Click on cancel button
	}

	/**
	 * Asset Delete button
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Asset_Deletebutton() throws AWTException {

		String assetcode = common.generateRandomNumber1();
		// driver.get(PROCUREURL);
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.New_Asset(assetcode); // Enter User name Wrong

		mainpage.Search_Created_Asset(assetcode); // Search From table

		// Delete Asset

		mainpage.Asset_Delete(); // Delete Asset
	}

	/**
	 * Delete Asset No Button
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Delete_Asset_nobutton() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		String assetcode = common.generateRandomNumber1();
	
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		// Open procurenetworks.com

		mainpage.New_Asset(assetcode); // Enter User name Wrong

		mainpage.Search_Created_Asset(assetcode); // Search From table

		mainpage.Asset_Delete_nobutton(); // Select no button in delete
											// conformation
	}

	/**
	 * Verify User Account Page
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_User_Account_Page() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.User_Account();

		// Open procurenetworks.com

	}

	/**
	 * Verify User Logout
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_User_Logout() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.User_Logout();

		// Open procurenetworks.com

	}

	/**
	 * Verify Asset Code Validation
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Asset_Code_Validation() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.AssetCode_Validation();

		// Open procurenetworks.com

	}

	/**
	 * Verify Asset Code Validation
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Model_Validation() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Model_Validation();

		// Open procurenetworks.com

	}

	/**
	 * Verify Model Number Validation
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Model_Number_Validation() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Model_Number_Validation();

		// Open procurenetworks.com

	}

	/**
	 * Verify Vendor Validation
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Vendor_Validation() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Vendor_Validation();

		// Open procurenetworks.com

	}

	/**
	 * Verify Site Validation
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Site_Validation() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Site_Validation();

		// Open procurenetworks.com

	}

	/**
	 * Verify Depreciation class Validation
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Depreciation_Class_Validation() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Depreciation_Class_Validation();

		// Open procurenetworks.com

	}

	/**
	 * Verify Uplaod Image
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Upload_Asset_Image() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Asset_Image_Upload();

		// Open procurenetworks.com

	}

	/**
	 * Verify Cancel Button
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Cancel_Button() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Verify_Cancel();

		// Open procurenetworks.com

	}

	/**
	 * Verify Cancel Button
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Move_Asset() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Move_Assets();

		// Open procurenetworks.com

	}

	/**
	 * Verify Search Asset
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Search_Asset_Popup() throws AWTException {

		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Move_Assets_Searchbox();

		// Open procurenetworks.com

	}

	/**
	 * Verify Search Asset invalid values
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Search_Invalid_Values() throws AWTException {

		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Move_Assets_Invalid_Value_Search();

		// Open procurenetworks.com

	}

	/**
	 * Verify Search Asset Valid values
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Search_Valid_Values() throws AWTException {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Move_Assets_Valid_Value_Search();

	}

	/**
	 * Verify Add Assets from search Values
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Add_Asset_Values_Search() throws AWTException {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Add_Asset_Values_Search();

	}

	/**
	 * Verify Source Dropdown
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Source_Dropdown() throws AWTException {

		// Open procurenetworks.com
		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Move_Source_Dropdown();

		// Open procurenetworks.com

	}

	/**
	 * Verify Destination Dropdown
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Destination_Dropdown() throws AWTException {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Move_Destination_Dropdown();

		// Open procurenetworks.com

	}

	/**
	 * Verify Department Dropdown
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Department_Dropdown() throws AWTException {

		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Move_Department_DropDown();

		// Open procurenetworks.com

	}

	/**
	 * 
	 * 
	 */
	@Test
	public void Verify_Quantity_field() {

		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Move_Enter_Quantity();
	}

	/**
	 * Verify Move Asset Cancel Button
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Move_Asset_Cancel_Button() throws AWTException {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Verify_MoveAsset_Cancel_Button();

		// Open procurenetworks.com

	}

	/**
	 * 
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Verify_Move_Save_button() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Verify_MoveAsset_Save_Button();
	}

	/**
	 * Verify Remove Asset Code
	 * 
	 * @throws AWTException
	 */
	@Test
	public void Remove_Asset_Code() throws AWTException {
		// Open procurenetworks.com
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remove_Asset_Values_Search();

		// Open procurenetworks.com

	}

	/**
	 * Verify Remove Asset code popup-cancel button
	 * 
	 */
	@Test
	public void Remove_Asset_poupbox_cancelbutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Asset_poupbox_cancelbutton();

	}

	/**
	 * Verify Source field of remove asset
	 * 
	 */
	@Test
	public void Verify_Remvoe_Asset_Sourcefield() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remvoe_Asset_Sourcefield();
	}

	/**
	 * Verify Sale radio button
	 * 
	 */
	@Test
	public void Verify_RemoveAsset_Resonradiobutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remvoe_Asset_Sourcefield();
	
		mainpage.RemoveAsset_Sale_Reasonradiobutton();
	}

	/**
	 * Verify Damage Radio button
	 * 
	 */
	@Test
	public void Verify_RemoveAsset_Reason_Damageradiobutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remvoe_Asset_Sourcefield();
		
		
		mainpage.RemoveAsset_Reason_Damageradiobutton();
	}

	/**
	 * Verify Donation Radio button
	 * 
	 */
	@Test
	public void Verify_RemoveAsset_Reaon_Donationradiobutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remvoe_Asset_Sourcefield();
	
		mainpage.RemoveAsset_Reaon_Donationradiobutton();
	}

	/**
	 * Verify Other radio button
	 * 
	 */
	@Test
	public void Verify_RemoveAsset_Reason_Otherradiobutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remvoe_Asset_Sourcefield();
	
		mainpage.RemoveAsset_Reason_Otherradiobutton();
	}

	/**
	 * Verify Quantity field
	 * 
	 */
	@Test
	public void Verify_Quantity() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remvoe_Asset_Sourcefield();
		
		mainpage.RemoveAsset_Sale_Reasonradiobutton();
		mainpage.Remove_QuantityField();
	}

	/**
	 * Verify Add button
	 * 
	 */
	@Test
	public void Verify_Addbutton() {

		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		mainpage.Remvoe_Asset_Sourcefield();
		
		mainpage.RemoveAsset_Sale_Reasonradiobutton();
		mainpage.Remove_QuantityField();
		mainpage.Addbutton();
	}

	/**
	 * Verify Check in-out tab
	 * 
	 */
	@Test
	public void Verify_Checkinout_tab() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Checkinout_tab();
	}

	/**
	 * Verify Checkin-out Asset code field
	 * 
	 */
	@Test
	public void Verify_Checkinout_Assetcodefield() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Checkinout_tab();
		mainpage.Checkinout_Assetcodefield();
	}

	/**
	 * Verify Restock Asset
	 * 
	 */
	@Test
	public void Verify_Restock_Asset() {

		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
	}

	/**
	 * Verify Restock Asset code field
	 * 
	 */
	@Test
	public void Verify_Restock_Assetcodefield() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Assetcode();
	}

	/**
	 * Verify Restock Asset popup cancel button
	 * 
	 */
	@Test
	public void Verify_RestockAsset_Popup_cancelbutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.RestockAsset_Popup_cancel();
	}

	/**
	 * Verify Restock Asset Destination drop-down
	 * 
	 */
	@Test
	public void Verify_Restock_Destination_Dropdown() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Destination_Dropdown();
	}

	

	/**
	 * Verify Restock Asset Cost field
	 * 
	 */
	@Test
	public void Verify_Restock_Costfield() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Destination_Dropdown();
	
		
	}

	/**
	 * Verify Restock Asset Quantity
	 * 
	 */
	@Test
	public void Verify_Restock_Quantity() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Destination_Dropdown();
	
		
		
		mainpage.Restock_Quantity();

	}

	/**
	 * Verify Restock Asset Add button
	 * 
	 */
	@Test
	public void Verify_Restock_Add() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Destination_Dropdown();
	
		
		mainpage.Restock_Quantity();
		mainpage.Restock_Add();
	}

	/**
	 * Verify Restock Asset Table Remove button
	 * 
	 */
	@Test
	public void Verify_Restock_Removebutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Destination_Dropdown();
		
		
		mainpage.Restock_Quantity();
		mainpage.Restock_Add();
		mainpage.Restock_Table_Removebutton();
	}

	/**
	 * Verify Restock Asset Save button
	 * 
	 */
	@Test
	public void Verify_Restock_Savebutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Destination_Dropdown();
	
	
		mainpage.Restock_Quantity();
		mainpage.Restock_Add();
		mainpage.Restock_Save();

	}

	/**
	 * Verify Restock Asset Cancel button
	 * 
	 */
	@Test
	public void Verify_Restock_Cancelbutton() {
		// Open procurenetworks.com

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.Restock_Asset();
		mainpage.Restock_Destination_Dropdown();
	
	
		mainpage.Restock_Quantity();
		mainpage.Restock_Add();
		mainpage.Restock_Cancel();
	}
}

// @Test
// public void Verify_Inventory() {
// // Open procurenetworks.com
// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
// mainpage = indexpage.Verify_Login_Page_Elements();
// mainpage.Procure_login(); // Enter User name and Password
// mainpage.Inventory();
// }
//
// @Test
// public void Verify_Inventory_Searchtab() {
// // Open procurenetworks.com
// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
// mainpage = indexpage.Verify_Login_Page_Elements();
// mainpage.Procure_login(); // Enter User name and Password
// mainpage.Inventory();
// mainpage.Inventory_Searchtab();
// }
//
// @Test
// public void Verify_InventorySearch_Table() {
// // Open procurenetworks.com
// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
// mainpage = indexpage.Verify_Login_Page_Elements();
// mainpage.Procure_login(); // Enter User name and Password
// mainpage.Inventory();
// mainpage.InventorySearch_Table();
// }
//
// }
