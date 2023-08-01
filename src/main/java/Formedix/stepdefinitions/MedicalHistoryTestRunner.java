package Formedix.stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:/Users/T600019626/IdeaProjects/Formedix/src/test/features",
        glue = {"Formedix.stepdefinitions"},
        monochrome=true,
        tags = "@VerifyMedicalHistoryDescription",
        plugin = {"pretty","html:target/cucumber-reports/cucumber.html"} )
public class MedicalHistoryTestRunner extends AbstractTestNGCucumberTests {

}
