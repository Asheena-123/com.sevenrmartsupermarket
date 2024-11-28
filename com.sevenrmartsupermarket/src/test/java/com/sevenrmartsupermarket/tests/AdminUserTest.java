package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.AdminUserPage;
import com.sevenrmartsupermarket.pages.DashBoardPage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class AdminUserTest extends Base {
	DashBoardPage dashboardpage;
	LoginPage loginpage;
	AdminUserPage adminuserpage;

	@Test
	public void verifyClickNewUser() {

		loginpage = new LoginPage(driver);
		loginpage.login("admin", "admin");
		dashboardpage = new DashBoardPage(driver);
		adminuserpage = new AdminUserPage(driver);
		dashboardpage.clickAdminMoreInfo();
		adminuserpage.clickNewUser();			
		String nameOfUser = GeneralUtility.getRandomName();
		adminuserpage.enterDetails(nameOfUser, "newuser10");
		adminuserpage.selectUserType();
		adminuserpage.clickSaveButton();
		

	}

}