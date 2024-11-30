package com.sevenrmartsupermarket.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubCategoryPage {

	WebDriver driver;

	@FindBy(xpath = "//div//h1[contains(text(),'List Sub Categories')]")
	WebElement listsubcategories;
	@FindBy(xpath = "//div//table//thead//tr//th[contains(text(),'Sub Category Name')]")
	WebElement subcategoryname;

	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitleListSubCategories() {
		return listsubcategories.getText();
	}
	
	public String getSubCategoryname()
	{
		return subcategoryname.getText();
	}
	
	/*public List<String> getAllCategoryNames() {
		List<String> actualCategoryNames = new ArrayList<String>();
		actualCategoryNames = generalutility.getTextOfElements(allCategory);
		return actualCategoryNames;
	}*/

}
