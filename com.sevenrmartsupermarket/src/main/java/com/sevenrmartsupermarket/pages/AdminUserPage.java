package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.PageUtility;

public class AdminUserPage {

	WebDriver driver;
	PageUtility pageUtility;
	@FindBy(xpath = "//h1[text()='Admin Users']")
	WebElement adminUserTitle;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement adminUserNewBtn;
	@FindBy(xpath = "//input[@id='username']")
	WebElement newUserName;
	@FindBy(xpath = "//input[@id='password']")
	WebElement newUserPassword;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement userType;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement saveButton;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newUser;

	public AdminUserPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		pageUtility = new PageUtility(driver);
	}

	public String getTitleAdminUser() {

		return adminUserTitle.getText();

	}

	public void clickNewBtn() {

		adminUserNewBtn.click();

	}

	public void enterNewUserName(String newName) {
		newUserName.sendKeys(newName);
	}

	public void enterNewPassword(String newPassword) {
		newUserPassword.sendKeys(newPassword);
	}

	public void enterDetails(String uname, String password) {

		enterNewUserName(uname);
		enterNewPassword(password);
	}

	public void selectUserType() {

		pageUtility.selectDropDownByIndex(userType, 3);
	}

	public void clickSaveButton() {
		saveButton.click();

	}

	public void clickNewUser() {

		newUser.click();
	}

}