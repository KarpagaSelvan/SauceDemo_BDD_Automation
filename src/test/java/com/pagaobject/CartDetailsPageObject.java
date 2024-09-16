package com.pagaobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilitybase.BaseClass;

public class CartDetailsPageObject extends BaseClass {

	public CartDetailsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id=\"shopping_cart_container\"]")
	private WebElement cartBtn;

	@FindBy(xpath = "//span[text()=\"Your Cart\"]")
	private WebElement cartPageSuccessMsg;

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getCartPageSuccessMsg() {
		return cartPageSuccessMsg;
	}

	public void clickingCartBtn() {
		elementClick(getCartBtn());
	}

	public String fetchingCartPageMsgSuccessMsg() {

		return gettingText(getCartPageSuccessMsg());

	}

}
