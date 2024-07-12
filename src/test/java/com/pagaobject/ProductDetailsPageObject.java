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

	@FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
	private WebElement ellipsisBtn;

	@FindBy(id = "logout_sidebar_link")
	private WebElement logOutBtn;

	public WebElement getEllipsisBtn() {
		return ellipsisBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getTitleProductDetailsPage() {
		return titleProductDetailsPage;
	}

	public String gettingTitleOfProductDetailsPage() {

		String gettingTitleOfProductDetailsPage = gettingText(getTitleProductDetailsPage());
		return gettingTitleOfProductDetailsPage;
	}

	public void clickingEllipsis() {

		elementClick(getEllipsisBtn());

	}

	public void clickingLogoutBtn() {

		elementClick(getLogOutBtn());
	}

}
