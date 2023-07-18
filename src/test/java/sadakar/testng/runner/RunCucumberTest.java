package sadakar.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SuceCheckOutStepTwo",

        features = "classpath:features", glue = { "sadakar.common", "sadakar.step-definitions",
        "sadakar.testng.runner" },

        plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, monochrome = true)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

}