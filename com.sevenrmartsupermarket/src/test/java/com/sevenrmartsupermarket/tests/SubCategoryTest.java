package com.sevenrmartsupermarket.tests;

import java.sql.Driver;
import java.util.Base64;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.SubCategoryPage;

public class SubCategoryTest extends Base {
	LoginPage loginpage;
	SubCategoryPage subcategorypage;
	SoftAssert softassert = new SoftAssert();

	@Test

	public void verifyClickListSubCategories() {
		subcategorypage = new SubCategoryPage(driver);

		String expectedlistsubcategories = "List Sub Categories";
		String actuallistsubcategories = subcategorypage.getTitleListSubCategories();
		softassert.assertEquals(expectedlistsubcategories, actuallistsubcategories);
		System.out.println(expectedlistsubcategories);
		System.out.println(actuallistsubcategories);
		softassert.assertAll();

	}
	@Test
	
	public void verifySubCategoryName()
	{
		subcategorypage = new SubCategoryPage(driver);
		String expectedsubcategoryname = "Sub Category Name";
		String actualsubcategoryname = subcategorypage.getTitleListSubCategories();
		softassert.assertEquals(expectedsubcategoryname, actualsubcategoryname);
		System.out.println(expectedsubcategoryname);
		System.out.println(actualsubcategoryname);
		softassert.assertAll();
	}
	
	/*@Test
	
	public void verifyAllCategoryName()
	{
		
	}*/
	

}
