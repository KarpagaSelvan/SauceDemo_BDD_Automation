package com.pageobjectmanager;

import com.pagaobject.LoginPageObject;
import com.pagaobject.ProductDetailsPageObject;
import com.pagaobject.ProductsPageObject;

public class PageObjectManager {

	private LoginPageObject loginPageObject;
	private ProductsPageObject productsPageObject;
	private ProductDetailsPageObject productDetailsPageObject;

	public LoginPageObject getLoginPageObject() {
		return (loginPageObject == null) ? loginPageObject = new LoginPageObject() : loginPageObject;

	}

	public ProductDetailsPageObject getProductDetailsPageObject() {
		return (productDetailsPageObject == null) ? productDetailsPageObject = new ProductDetailsPageObject()
				: productDetailsPageObject;
	}

	public ProductsPageObject getHomePageObject() {
		return (productsPageObject == null) ? productsPageObject = new ProductsPageObject() : productsPageObject;

	}

}
