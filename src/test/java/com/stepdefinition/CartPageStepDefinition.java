package com.stepdefinition;

import org.junit.Assert;

import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CartPageStepDefinition {

	PageObjectManager manager = new PageObjectManager();

	@Then("User clicks on the cart button")
	public void user_clicks_on_the_cart_button() {

		manager.getCartDetailsPageObject().clickingCartBtn();

	}

	@Then("User verify the cart details page success message {string}")
	public void user_verify_the_cart_details_page_success_message(String cartPageSuccessMsg) {

		Assert.assertEquals(cartPageSuccessMsg, manager.getCartDetailsPageObject().fetchingCartPageMsgSuccessMsg());
		System.out.println(manager.getCartDetailsPageObject().fetchingCartPageMsgSuccessMsg());

	}

}
