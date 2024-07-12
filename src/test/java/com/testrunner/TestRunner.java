package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, stepNotifications = true, glue = "com.stepdefinition", features = "src\\test\\resources\\Features", tags = "@ProductPage")

public class TestRunner {

}
