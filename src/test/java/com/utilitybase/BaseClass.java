package com.utilitybase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement element;

	public void browserLaunch(String browserType) {

		switch (browserType) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			break;
		}
	}

	public void elementClick(WebElement element) {

		element.click();

	}

	public void elementSendkeys(WebElement element, String key) {

		element.sendKeys(key);
	}

	public String getAttributeValue(WebElement element, String attributeName) {

		String attribute = element.getAttribute(attributeName);
		return attribute;

	}

	public String gettingText(WebElement element) {
		String text = element.getText();
		return text;

	}

}
