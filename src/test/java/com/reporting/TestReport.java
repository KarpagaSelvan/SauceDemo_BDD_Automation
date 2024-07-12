package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.utilitybase.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class TestReport extends BaseClass {

	public static void generateJvmReport(String jsonFile) {

		File file = new File(System.getProperty("user.dir") + "target");

		Configuration configuration = new Configuration(file, "SauceDemo - Automation Execution Report");

		configuration.addClassifications("Browser", com.stepdefinition.HooksClass.browserType);
		configuration.addClassifications("OS", "Windows 11");
		configuration.addClassifications("Testing", "Regression Retesting");
		configuration.addClassifications("Release", "PRE-PROD-2");
		configuration.addClassifications("UserAccount", "SauceDemo");

		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
