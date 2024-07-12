package com.stepdefinition;

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

}
