package com.procurenetworks.verifications;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.procurenetworks.init.Common;
import com.procurenetworks.init.SeleniumInit;
import com.procurenetworks.pages.Main_Page;
import com.procurenetworks.pages.Procure_Contacts;
import com.procurenetworks.pages.Procure_Inventory;

public class Contacts extends SeleniumInit {

	Common common = new Common(driver);

	public Contacts() {
		super();
	}   

	/**    
	 * Verfiy Contacts tab form navigation bar
	 */
	@Test
	public void Verify_Contacts() {

		// driver.get("https://inv-pre.qa.procurenetworks.com/auth/login");
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Contacts();

	}

	/**
	 * Verify comapny tab from header menu
	 * 
	 */
	@Test
	public void Verify_Companiestab() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Contacts();
		contact.Companytab();
	}
/**
 * Verfiy company searchbox
 * 
 */
	@Test
	public void Verify_Comapny_Searchbox() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Contacts();
		contact.Comapny_Searchbox();
	}
/**
 * Create new comapny
 * 
 */
	@Test
	public void Verfiy_Create_New_company() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Create_Newcompany();

	}
	/**
	 * Edit company in companyheadermenu
	 * 
	 */
	@Test
	public void Verify_Edit_Company()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Edit_Comapny();
	}
	/**
	 * Delete company from companyheadermenu
	 * 
	 */
	@Test
	public void Verfiy_Delete_company()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Delete_Company();
	}
	/**
	 * Verfiy Create new contact in company header menu
	 * 
	 */
	@Test
	public void Verify_Create_Newcontact()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Create_Newcontact();
	}
	
	/**
	 * Verfiy Create new address in company header menu
	 * 
	 */
	@Test
	public void Verfiy_Create_NewAddress()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Create_NewAddress();
	}
	/**
	 * Verfiy Contacts tab header menu
	 * 
	 */
	@Test
	public void Verfiy_Contactstabpage()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Verfiy_Contactstab();
	}
	/**
	 * Verify Edit contacts
	 * 
	 */
	@Test
	public void Verfiy_Editcontactsincontacttab()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Edit_ContactfromContacttab();
	}
	
	/**
	 * Verfiy Delete contact from contact tab
	 * 
	 */
	@Test
	public void Verify_Delete_contact()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		contact = indexpage.procure1();
		contact.Delete_contact_fromcontactstab();
	}
}