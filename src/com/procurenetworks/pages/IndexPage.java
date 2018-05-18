package com.procurenetworks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.procurenetworks.init.Common;
import com.procurenetworks.pages.abstractpage.AbstractPage;

public class IndexPage extends AbstractPage {

	Common common = new Common(driver);

	public IndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Procure_Inventory procure() {
		common.pause(15);
		System.out.println("Step :: Click on Inventory tab");
		common.log("Step :: Click on Inventory tab");
		driver.findElement(By.xpath("//a[text()='Inventory']")).click();

		common.pause(5);
		return new Procure_Inventory(driver);

	}

	public Procure_Contacts procure1() {
		common.pause(15);
		System.out.println("Step :: Click on Contacts tab");
		common.log("Step :: Click on Contacts tab");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		common.pause(5);
		return new Procure_Contacts(driver);
	}

	public Procure_Report procure2() {
		common.pause(15);
		System.out.println("Step :: Click on Contacts tab");
		common.log("Step :: Click on Contacts tab");
		driver.findElement(By.xpath("//a[text()='Reports']")).click();

		common.pause(5);
		return new Procure_Report(driver);
	}

	/**
	 * Verify and Click on Admin Page
	 * 
	 * @return
	 */
	public Procure_Admin clickOnAdminPage() {
		common.pause(15);
		System.out.println("Step :: Click on Admin tab");
		common.log("Step :: Click on Admin tab");
		driver.findElement(By.xpath("//a[text()='Admin']")).click();

		common.pause(5);
		return new Procure_Admin(driver);
	}

	public Main_Page Verify_Login_Page_Elements()

	{

		return new Main_Page(driver);
	}
}