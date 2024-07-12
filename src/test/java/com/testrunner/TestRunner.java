package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.TestReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, stepNotifications = true, glue = "com.stepdefinition", features = "src\\test\\resources\\Features", tags = "@ProductPage", monochrome = true, plugin = {
		"pretty", "json:\\target\\SauceDemo.json" })

public class TestRunner {

	@AfterClass
	public static void afterClass() {

		TestReport.generateJvmReport("\\target\\SauceDemo.json");
	}

}
