package com.procurenetworks.verifications;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.procurenetworks.init.Common;
import com.procurenetworks.init.SeleniumInit;
import com.procurenetworks.pages.Main_Page;
import com.procurenetworks.pages.Procure_Contacts;
import com.procurenetworks.pages.Procure_Inventory;

public class Admin extends SeleniumInit {

	Common common = new Common(driver);

	public Admin() {
		super();
	}

	/**
	 * 
	 * 
	 * @throws AWTException
	 */

	@Test
	public void Verify_Admin_Page_Elements() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		admin = indexpage.clickOnAdminPage();
		admin.Verify_Admin_Module();
	}

	@Test
	public void Verify_New_Asset_Category() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		admin = indexpage.clickOnAdminPage();
		admin.Verify_New_AssetCategory();

	}

	@Test
	public void Verify_New_Inventory_Category() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		admin = indexpage.clickOnAdminPage();
		admin.Verify_New_Inventorycategory();

	}

	@Test
	public void Verify_Created_AssetCategory() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_AssetCategory_Intable();

	}

	@Test
	public void Verify_Created_Inventorycategory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_Created_Invnetory_Intable();

	}

	@Test
	public void Verify_Edit_Assetcategory() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		admin = indexpage.clickOnAdminPage();
		admin.Verify_Created_AssetCategory_Intable();

		admin.Edit_Assetcategory();

	}

	@Test
	public void Verify_Edit_Invnetorycategory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_Created_Invnetory_Intable();
		admin.Edit_Inventorycategory();
	}

	@Test
	public void Verify_Locationtab_Elements() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Locationpage_Elements();

	}

	@Test
	public void Verify_NewAssetlocationpage() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_NewAssetLocation();
	}

	@Test
	public void Verify_NewInventoryLocaiton() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_NewInventoryLocaiton();
	}

	@Test

	public void Verify_Createdassetlocationintable() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Createdassetlocation_Intable();
	}

	@Test
	public void Verify_Createdinventorylocationintable() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_Inventorylocation_Intable();
	}

	@Test
	public void Verify_Edit_AssetLocation() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Createdassetlocation_Intable();
		admin.Edit_AssetLocation();
	}

	@Test

	public void Verify_Edit_Inventorylocation() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_Inventorylocation_Intable();
		admin.Edit_Invnetorylocation();
	}

	@Test
	public void Verify_Delete_location() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_Inventorylocation_Intable();

		admin.Delete_Created_Location();
	}

	@Test
	public void Verify_Cancelbutton() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_Inventorylocation_Intable();
		admin.Verify_Cancelbutton_In_Newlocationpage();
	}

	@Test
	public void Verify_Editbutton_of_Locaitonpage() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Editbutton_of_Locationspage();
	}

	@Test
	public void Verify_Editbox_cancelbutton() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verfiy_Editbox_Cancelbutton();
	}

	@Test
	public void Verfiy_Editbutton_without_selectlocation() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verfiy_Editbutton_without_select_Location();
	}

	@Test
	public void Verify_Locationpage_Deletebutton() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Deletebutton_of_Locationpage();

	}

	@Test
	public void Verify_Yesbutton_Deleteconfirmbox() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Yesbutton_of_Deleteconfirmationbox();
	}

	@Test
	public void Verify_Nobutton_Deleteconfirmbox() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.verify_Nobutton_of_delete_confirmationbox();
	}

	@Test
	public void Verify_Location_pagination_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Location_Pagination();
	}

	@Test
	public void Verify_Departmentpage_Elements() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verfiy_Departmentpage_Elements();
	}

	@Test
	public void Verify_Create_NewDepartment() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.New_Department();
	}

	@Test
	public void Verify_Cancelbutton_NewDepartment() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_cancelbutton_of_NewDepartment();

	}

	@Test
	public void Verify_Created_Department() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_Department_intable();
	}

	@Test
	public void Verify_Edit_Created_Depertment() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_Department_intable();

		admin.Edit_Created_Department();
	}

	@Test
	public void Verify_delete_department_From_Editform() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Created_Department_intable();
		common.pause(15);

		admin.Delete_Departmentfrom_Editform();

	}

	@Test
	public void Verify_Department_pagination() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Department_Pagination();

	}

	@Test
	public void Verify_projects_section() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Create_New_Project();
	}

	@Test
	public void Verify_Created_project() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Search_Created_project();
	}

	@Test
	public void Verify_Edit_created_project() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Search_Created_project();

		admin.Edit_Project();
	}

	@Test
	public void Verify_Project_pagination() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Project_Pagination();
	}

	@Test
	public void Verify_Site_Section() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Sites();
	}

	@Test
	public void Verify_Create_NewSite() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewSite();
	}

	@Test
	public void Verify_Created_site() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Created_Site_intable();
	}

	@Test
	public void Verify_Edit_site() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Created_Site_intable();
		admin.Edit_Created_site();

	}

	@Test
	public void Verfiy_Delete_site() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Created_Site_intable();
		admin.Delete_Created_site();
	}

	@Test
	public void Verify_Edit_cancel_button() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Edit_cancelbutton();
	}

	/**
	 * Verify Depreciation section
	 */

	@Test
	public void Verify_Depreciation_Section() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verfiy_Depreciation_section_PageElements();
	}

	@Test
	public void Verify_Create_NewDepreciation_With_FullyDepreciate() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Create_New_DepreciationClass_With_FullyDepreciate();

	}

	@Test
	public void Verfiy_Create_NewDepreciation_Without_FullyDepreciate() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Create_New_Depreciationclass_Without_Fullydepreciuate();
	}

	@Test
	public void Verify_Created_Depreciation_intable() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Created_Depreciattionclass_Intable();
	}

	@Test
	public void Verify_Edit_Created_Depreciationclass() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Created_Depreciattionclass_Intable();
		admin.Edit_Created_Depreciationclass();
	}

	@Test
	public void Verify_Delete_Created_depreciationclass() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Created_Depreciattionclass_Intable();

		admin.Delete_Created_Depreciationclass();
	}

	@Test
	public void Verify_Depreciation_Cancelbutton() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Cancelbutton();
	}

	@Test
	public void Verify_Depreciation_paginationbutton() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Verify_Depreciationclass_Pagination();
	}

	@Test
	public void Verify_Label_page_Elements() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Label_Section_page_Elements();
	}

	@Test
	public void Verify_LabelType_Inventory_Items_Print() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.LabelType_Inventory_Items_Print();

	}

	@Test
	public void Verify_Label_Asset_Item_Print() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Label_Asset_Item_Print();

	}

	@Test
	public void Verify_Label_Location_item_print() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Label_Location_item_print();
	}

	@Test
	public void Verify_Label_WarehouseSetup_print_Validation() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Label_WarehouseSetup_print_Validation();

	}

	@Test
	public void Verify_Warehouse_setupfields() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();

		admin.Warehouse_setupfields();
	}

	@Test
	public void Verify_UserRoles_Section() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_UserRoles_page_Elements();
	}

	@Test
	public void Verify_Create_NewRole() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_New_Role();

	}

	@Test
	public void Verify_Create_NewRole_With_AssetMenuPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewRole_With_Asset_Menupermission();

	}

	@Test
	public void Verify_Create_NewRole_WithInventoryMenuPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Created_NewRole_With_Inventory_Menu_permission();
	}

	@Test
	public void Verify_Create_NewRole_With_ContactsMenuPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewRole_With_Contact_MenuPermission();
	}

	@Test
	public void Verify_Create_NewRole_WithShipping_MenuPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewRole_With_Shipping_MenuPermission();
	}

	@Test
	public void Verify_Create_NewRole_With_ReceivingMenuPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewRole_With_Reciving_MenuPermission();
	}

	@Test
	public void Verify_Create_NewRole_With_ReportsMenuPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewRole_With_Reports_Menupermission();
	}

	@Test
	public void Verify_Create_NewRole_With_AdminMenuPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewRole_With_Admin_MenuPermission();
	}

	@Test
	public void Verify_Create_NewRole_With_Asset_TransactionPermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_All_Asset_Transactionpermission();
	}

	@Test
	public void Verify_Create_NewRole_With_Inventory_Transactionpermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_Role_With_Inventory_TrnasactionPermission();

	}

	@Test
	public void Verify_Create_NewRole_With_Adminpermission() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewRole_With_AdminPermission();

	}

	@Test
	public void Verify_Delete_UserRole() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Delete_CreatedRole();
	}

	@Test
	public void Verify_Cancelbutton_ofNewRole() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_Cancelbutton_ofNewRole();
	}

	@Test
	public void Edit_Rolename() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Edit_Created_Rolename();

	}

	@Test
	public void Verify_Pagination_button_Of_UserRoles() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_Paginationbutton_of_UserRoles();
	}

	@Test
	public void Verify_UserAccounts() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_UserAccounts_pageElements();

	}

	@Test
	public void Verify_UserAccount_Pagination() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.UserAccount_Pagination_Button();
	}

	@Test
	public void Verify_NewUser_Form_Field_validation() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_NewUser_form_validatoin();
	}

	@Test
	public void Verify_Create_NewUserAccount() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewUser_Account();
	}

	@Test
	public void Verify_Created_UserAccount_Intable_By_Searchbox() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_Created_UserAccount_intable();
	}

	@Test
	public void Verify_Create_New_User_With_categorymanager() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_UserAccount_With_CategoryManager();
	}

	@Test
	public void Verify_Create_NewUseraccount_With_Sitemanager() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Create_NewUserAccount_With_Sitemanager();
	}

	@Test
	public void Verfiy_cancelbutton_of_NewUserForm() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_cancel_button_of_NewUserForm();

	}

	@Test
	public void Verify_Created_UserAccount_with_categorymanager_intalbe_Bysearchbox() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_Created_UserAccount_with_categorymanager_intalbe();

	}

	@Test
	public void Verify_Created_UserAccount_with_sitemanager_intable_BySearchbox() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Created_Useraccount_with_sitemanager_Intable();
	}

	@Test
	public void Verify_Importsection_pageElements_() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Importsection_pageElements();

	}

	@Test
	public void Verify_Attachfile_with_AssetDataType() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Uploadfile_validation_Errormessage();
	}

	@Test
	public void Verify_Cancelbutton_of_Importsection() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Cancelbutton_of_Import_Section();
	}

	@Test
	public void Verify_Attach_file_with_Assetcode_datatype() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Attach_file_with_Assetcode_datatype();
	}

	@Test
	public void Verify_Attach_file_with_Inventory_datatype() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Attach_file_with_inventorycode_datatype();
	}

	@Test
	public void Verify_Attach_file_with_category_datatype() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Attach_file_with_categories_datatype();

	}

	@Test
	public void Verfiy_Verify_Attachfile_With_Location_DataType() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Attachfile_With_Location_DataType();
	}

	@Test
	public void Verify_UPCAutomator_pageElements() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_UPCAutomator_PageElements();
	}

	@Test
	public void Verify_Productcode_validation() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_ProductCodefield_validation();
	}

	@Test
	public void Verify_Inventorycode_validation() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Inventorycodefield_validation();
	}

	@Test
	public void Verify_Modelfield_Validation() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Modelfield_vaidation();
	}

	@Test
	public void Verify_Basic_Review_Inventory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Review_Basic_Inventory();
	}

	@Test
	public void Verify_Advanced_review_inventory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Advanced_ReviewInventory();
	}

	@Test
	public void Verify_Advanced_Extract_reviewinventory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Advanced_Extract_ReviewInventory();
	}

	@Test
	public void Verify_Advanced_Matchmode_Reviewinventory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Review_Inventory_With_matchmode();
	}
	@Test
	public void Verify_Advanced_Product_Type_ReviewInventory()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.verify_Type_Product_inAdvanced_Review_invwntory();
		
	}
	@Test
	public void Verify_Advanced_product_type_Book_ReviewInventory()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Type_Book_Reviewinventory();
	}
	@Test
	public void Verify_Skip_inveentory()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
	mainpage.Procure_login(); // Enter User name and Password
	admin = indexpage.clickOnAdminPage();
		admin.Verify_Skip_Review_Invnetory();
	}
	
	@Test
	public void Verify_NA_button_of_ReviewInventory()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_NAbutton_of_ReviewInventoy();
		
	}
	@Test
	public void Verify_cancelbutton_of_ReviewInventory()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_cancelbutton();
	}
	@Test
	public void Verify_Status_Dropdownlist()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_Status_Drop_downlist();
	}
	@Test
	public void Verify_UPCAutomator_Paginationbutton()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verify_UPCpagination_button();
	}
	@Test
	public void Verify_Created_invnetory_in_Seachbox()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password
		admin = indexpage.clickOnAdminPage();
		admin.Verfiy_Created_ReviewInventory();
		
	}
}
