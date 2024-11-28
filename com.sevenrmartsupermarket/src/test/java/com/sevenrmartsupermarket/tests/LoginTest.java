package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.GeneralUtility;
import com.sevenrmartsupermarket.utilities.ScreenshotCapture;

public class LoginTest extends Base {
	LoginPage loginpage;
	HomePage homepage;
	ScreenshotCapture screenshotCapture = new ScreenshotCapture();

	@Test(groups = "Sanity")

	public void verifAdminUserLogin() {
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);
		loginpage.login("admin2", "admin");
		System.out.println(GeneralUtility.getRandomName());
		System.out.println(GeneralUtility.getRandomAddress());
		String actualProfileName = homepage.getProfileName();
		String expectedProfileName = "Admin";
		Assert.assertEquals(actualProfileName, expectedProfileName);
		

	}

}
