package com.stepdefinition;

import org.junit.Assert;

import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDefinitions {

	PageObjectManager manager = new PageObjectManager();

	@Given("User is on SwagLabs home page")
	public void user_is_on_swag_labs_home_page() {
	}

	@Then("User perfrom logout")
	public void user_perfrom_logout() {
		manager.getProductDetailsPageObject().clickingEllipsis();
		manager.getProductDetailsPageObject().clickingLogoutBtn();

	}

	@Then("User verify the login page success message {string}")
	public void user_verify_the_login_page_success_message(String loginPageSuccessMsg) {

		Assert.assertEquals(manager.getLoginPageObject().gettingLoginPageSuccessMsg(), loginPageSuccessMsg);

	}

}
