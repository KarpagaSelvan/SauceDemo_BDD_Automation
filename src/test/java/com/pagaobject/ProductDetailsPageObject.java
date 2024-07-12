package com.pagaobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilitybase.BaseClass;

public class ProductDetailsPageObject extends BaseClass {

	public ProductDetailsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Back to products']")
	private WebElement titleProductDetailsPage;

	public WebElement getTitleProductDetailsPage() {
		return titleProductDetailsPage;
	}

	public String gettingTitleOfProductDetailsPage() {

		String gettingTitleOfProductDetailsPage = gettingText(getTitleProductDetailsPage());
		return gettingTitleOfProductDetailsPage;
	}

}
