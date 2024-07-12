package com.stepdefinition;

import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class ProductsPageStepDefinitions {

	PageObjectManager manager = new PageObjectManager();

	@Then("User clicks on the products from the products page list")
	public void user_clicks_on_the_products_from_the_products_page_list() {

		manager.getHomePageObject().clcikingOnTheProduct();

	}

	@Then("User verify the product details page success message {string}")
	public void user_verify_the_product_details_page_success_message(String productsDetailsPageTitle) {

		String gettingTitleOfProductDetailsPage = manager.getProductDetailsPageObject()
				.gettingTitleOfProductDetailsPage();
		Assert.assertEquals(gettingTitleOfProductDetailsPage, productsDetailsPageTitle);

	}

}
