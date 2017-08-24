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

		// Open procurenetworks.com

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

		// Open procurenetworks.com

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
		mainpage.Procure_login(); // Enter User name and Password
		mainpage.New_Asset(); // Enter User name Wrong

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
		mainpage.Procure_login(); // Enter User name and Password
		String assetcode = mainpage.New_Asset(); // Enter User name Wrong

		mainpage.Search_Created_Asset(assetcode); // Search From table

	}

}