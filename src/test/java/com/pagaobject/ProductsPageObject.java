package com.pagaobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilitybase.BaseClass;

public class ProductsPageObject extends BaseClass {

	public ProductsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Products']")
	private WebElement titleHomePage;

	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement productJacket;

	public WebElement getTitleHomePage() {
		return titleHomePage;
	}

	public WebElement getProductJacket() {
		return productJacket;
	}

	public String fetchingTitle() {

		String title = gettingText(getTitleHomePage());
		return title;
	}

	public void clcikingOnTheProduct() {

		elementClick(getProductJacket());
	}

}
