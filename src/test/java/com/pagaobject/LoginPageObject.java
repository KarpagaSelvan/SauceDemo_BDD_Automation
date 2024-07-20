package com.pagaobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utilitybase.BaseClass;

public class LoginPageObject extends BaseClass {

	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"user-name\"]")
	private WebElement usernameInput;

	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement passwordInput;

	@FindBy(xpath = "//input[@id=\"login-button\"]")
	private WebElement loginBtn;

	@FindBy(xpath = "//h3[text()='Epic sadface: Username and password do not match any user in this service']")
	private WebElement invalidCredErrorMsg;

	@FindBy(xpath = "//h3[text()='Epic sadface: Username is required']")
	private WebElement emptyCredErrorMsg;

	@FindBy(xpath = "//div[text()='Swag Labs']")
	private WebElement loginPageTitle;

	public WebElement getLoginPageTitle() {
		return loginPageTitle;
	}

	public WebElement getInvalidCredErrorMsg() {
		return invalidCredErrorMsg;
	}

	public WebElement getEmptyCredErrorMsg() {
		return emptyCredErrorMsg;
	}

	public WebElement getUsernameInput() {
		return usernameInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void login(String username, String password) {
		elementSendkeys(usernameInput, username);
		elementSendkeys(passwordInput, password);
		elementClick(loginBtn);

	}

	public String gettingInvalidCredErrorMsg() {

		String invalidCredsErrorMsg = gettingText(getInvalidCredErrorMsg());
		return invalidCredsErrorMsg;

	}

	public String gettingEmptyCredErrorMsg() {
		String emptyCredsErrorMsg = gettingText(getEmptyCredErrorMsg());
		return emptyCredsErrorMsg;

	}

	public String gettingLoginPageSuccessMsg() {

		String loginPageSuccessMsg = gettingText(getLoginPageTitle());
		return loginPageSuccessMsg;

	}

}
