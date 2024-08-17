package com.stepdefinition;

import org.junit.Assert;

import com.pageobjectmanager.PageObjectManager;
import com.utilitybase.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends BaseClass {

	PageObjectManager manager = new PageObjectManager();

	

	@When("User perfroms login using the {string} and {string}")
	public void user_perfroms_login_using_the_and(String userName, String password) {

		manager.getLoginPageObject().login(userName, password);

	}

//	@Then("User verify the success message")
//	public void user_verify_the_success_message() {
//
//		String fetchingTitle = manager.getHomePageObject().fetchingTitle();
//		Assert.assertEquals(fetchingTitle, "Products");
//
//	}

	@Then("User verify the success message {string}")
	public void user_verify_the_success_message(String message) {

		String fetchingTitle = manager.getHomePageObject().fetchingTitle();
		Assert.assertEquals(fetchingTitle, message);
	}

	@Then("User verify the invalid credentials error message {string}")
	public void user_verify_the_invalid_credentials_error_message(String invalidLoginErrorMsg) {

		String invalidCredErrorMsg = manager.getLoginPageObject().gettingInvalidCredErrorMsg();
		Assert.assertEquals(invalidCredErrorMsg, invalidLoginErrorMsg);
	}

	@Then("User verify the empty credentials error message {string}")
	public void user_verify_the_empty_credentials_error_message(String emptyLoginErrorMsg) {

		String emptyCredErrorMsg = manager.getLoginPageObject().gettingEmptyCredErrorMsg();
		Assert.assertEquals(emptyCredErrorMsg, emptyLoginErrorMsg);
	}

}
