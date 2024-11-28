package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.HomePage;
import com.sevenrmartsupermarket.utilities.ExcelReader;
import com.sevenrmartsupermarket.utilities.ScreenshotCapture;

public class HomeTest extends Base {
	ExcelReader excelreader = new ExcelReader();

	@Test(groups = { "smoke", "regression" }, retryAnalyzer = com.sevenrmartsupermarket.listeners.RetryAnalyzer.class)

	public void readExcel() {
		excelreader.setExcelFile("LoginDetails", "LoginDetails");
		String userName = excelreader.getCellData(0, 1);
		String password = excelreader.getCellData(1, 1);
		System.out.println(password);
		System.out.println(userName);

	}

}
