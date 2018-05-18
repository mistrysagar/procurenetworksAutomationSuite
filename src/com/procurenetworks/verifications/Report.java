package com.procurenetworks.verifications;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.procurenetworks.init.Common;
import com.procurenetworks.init.SeleniumInit;
import com.procurenetworks.pages.Main_Page;
import com.procurenetworks.pages.Procure_Contacts;
import com.procurenetworks.pages.Procure_Inventory;

public class Report extends SeleniumInit {

	Common common = new Common(driver);

	public Report() {
		super();
	}

	/**
	 * Verfiy Audit Reports Asset tab form navigation bar
	 * 
	 * @throws AWTException
	 */

	@Test

	public void Verify_Report() throws AWTException {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Reports();

	}

	/**
	 * Verify pagination button
	 * 
	 */
	@Test
	public void Verify_Asset_Audit_Pagination()
	{
		
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Asset_AuditPagination_button();
		
	}
	
	
	/**
	 * Verfiy Audit report Invnetory
	 * 
	 * @throws AWTException
	 */
	@Test

	public void Verfiy_AuditreportInventory() throws AWTException {   
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Auditreport_Inventory();
	}
	  
	
/**
 * Verify Audit report Inventory pagination button
 * 	
 */
	
	@Test
	
	public void Verify_AuditreportInventory_Paginationbutton()
	{
		
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Inventory_Pagination_button();
	}

	/**   
	 * Verfiy Cost report Asset tab
	 * 
	 */

	@Test

	public void Verfiy_Cost_reportasset() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Costreports_Assets();
	}

	/**
	 * Verify_Cost_Report_GenerateCSVReport()
	 * 
	 */

	@Test

	public void Verify_Cost_Report_GenerateCSVReport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Costreport_Asset_GenerateCSVreport();
	}

	/**
	 * Verify_Cost_Report_GeneratePDFReport
	 * 
	 */
	@Test

	public void Verify_Cost_Report_GeneratePDFReport() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Costreport_GeneratePDFReport();
	}

	/**
	 * Verfiy CostreportInventory tab
	 * 
	 */

	@Test

	public void Verify_Cost_reportInventory() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Costreports_Inventory();
	}

	/**
	 * Verfiy_CostreportInvnetory_GenerateCSVExport
	 * 
	 */

	@Test

	public void Verfiy_CostreportInvnetory_GenerateCSVExport() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.CostInventory_GenerateCSVReport();
	}

	/**
	 * Verfiy_CostreportInvnetory_GeneratePDFExport
	 * 
	 */
	@Test

	public void Verfiy_CostreportInvnetory_GeneratePDFExport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.CostInventory_GeneratePDFReport();
	}

	/**
	 * Verfiy Depraciation report asset tab
	 * 
	 */
	@Test

	public void Verfiy_DepreciationReportAsset() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Depreciation_ReportAsset();
	}

	/**
	 * Verfiy Depreciation Asset CSV Report
	 * 
	 */

	@Test

	public void Verify_DepreciationAssetReport_GenerateCSVExport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.DepreciationAssetReport_GenerateCSVReport();
	}

	/**
	 * Verify Depreaciation Asset PDF Report
	 */
	@Test

	public void Verify_DepreciationAssetReport_GeneratePDFExport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.DepreciationAssetReport_GeneratePDFReport();
	}

	/**
	 * 
	 * Verify Site Report Asset Assets
	 */

	@Test

	public void Verifiy_SiteReportAsset() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Site_ReportAsset();
	}

	/**
	 * 
	 * Verify Site Report Asset Generate CSV Report
	 */

	@Test

	public void Verify_SiteReportAsset_GenerateCSVExport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.SiteReport_Asset_GenerateCSVReport();

	}

	/**
	 * Verifyt_Report_GeneratePDFExport
	 * 
	 */

	@Test

	public void Verify_SiteReportAsset_GeneratePDFExport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Site_Asset_GeneratePDFReport();
	}

	/**
	 * Verify Site report asset clear button
	 * 
	 * 
	 */
	@Test
	public void Verify_Site_Report_Asset_Clearbutton()
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Site_Report_Asset_Clearbutton();
	}
	
	/**
	 * Verify Site report Inventory
	 * 
	 */
	@Test

	public void Verify_SiteReportInvnetory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Site_Report_Inventory();

	}

	/**
	 * Verify Site report inventory Generate CSV report
	 * 
	 */

	@Test

	public void Verify_SiteReportInventory_GenerateCSVReport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Site_ReportInventory_GenerateCSVReport();
	}

	/**
	 * Verify Site report inventory Generate PDF report
	 * 
	 */
	@Test
	public void Verify_SiteReportInventory_GeneratePDFReport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.SiteReport_Inventory_GeneratePDFReport();
	}

	/**
	 * Verify Site Report inventory Clear button
	 * 
	 */
	@Test
	public void Verify_Site_Report_Invnetory_Clearbutton() 
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Site_Report_Invnetory_Clearbutton();
	}
	
	
	
	/**
	 * Verfiy Transaction Report Assets
	 * 
	 */
	@Test
	public void Verfiy_Transaction_Report_Assets() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.TransactionReport_Asset();

	}

	/**
	 * Verify Transaction Asset Generate CSV report
	 * 
	 */

	@Test
	public void Verfiy_Transaction_Report_Asset_GenerateCSVReport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Transaction_Report_Asset_GenerateCSVReport();
	}

	/**
	 * Verifiy Transaction Asset Generate PDF Report
	 * 
	 */
	@Test
	public void Verify_Transacton_Report_Asset_GeneratePDFReport() {

		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Transaction_Report_Asset_GeneratePDFReport();

	}
/**
 * Verify Transaction Report Asset clear button
 * 
 */
	@Test
	public void Verify_Transaction_Report_Asset_Clearbutton()    
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Transaction_Report_Asset_clearbutton();
	}
	
	/**
	 * Verify Transaction Report Inventory
	 * 
	 */
	@Test
	public void Verify_Transaction_Report_Invnetory() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Transaction_Report_Inventory();
	}

	/**
	 * Verify Transaction Report Inventory Generate CSV report
	 * 
	 */

	@Test
	public void Verify_Transaction_Report_Inventory_GenerateCSVreport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Transaction_Report_Inventory_GenerateCSVReport();

	}

	/**
	 * Verify Transaction Report Inventory Generate PDF report
	 * 
	 */
	@Test

	public void Verify_Transaction_Report_Inventory_GeneratePDFreport() {
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Transaction_Report_Inventory_GeneratePDFReport();
	}
	  
	/**
	 * Verify Trasaction Report inventory clear button
	 * 
	 */
	
	@Test 
	
	public void Verify_Transaction_Report_clearbutton() 
	{
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Trasaction_Report_Invnetory_Clearbutton();
	}
	
	/**
	 * Verify Depreciation Asset clear button
	 * 
	 */
	
	@Test
	
	  public void Verify_Depreciation_Rport_Asset_Clearbutton()
	  {
		
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.Depreciation_Report_Asset_Clearbutton();
		
	  }
	
	/**
	 * Verify cot report inventory
	 * 
	 */
	@Test
	
	public void Verify_Costreportinventory_clearbutton()
	{
		
		mainpage = indexpage.Verify_Login_Page_Elements();
		mainpage.Procure_login(); // Enter User name and Password

		report = indexpage.procure2();
		report.CostReport_inventory_clearbutton();
	}
	

}