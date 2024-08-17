package com.utilitybase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement element;

	public void browserLaunch(String browserType) {

		switch (browserType.toLowerCase()) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless"); // Example argument for headless mode
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-dev-shm-usage");
			driver = new ChromeDriver();
			break;

		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--headless"); // Example arguments
			firefoxOptions.addArguments("--disable-gpu");
			driver = new FirefoxDriver();
			break;

		case "edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--headless"); // Example arguments
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

	public void waitImplicitly() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
