package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.utilitybase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {

	public static String browserType;

	@Before
	public void beforeScenario() {

		browserLaunch(browserType = "chrome");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		waitImplicitly();

	}

	@After
	public  void afterScenario(Scenario scenario) {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);

		scenario.attach(screenshotAs, "SwagLabs.png", "Screenshot after the completion of every scenario");

		driver.quit();

	}

}
