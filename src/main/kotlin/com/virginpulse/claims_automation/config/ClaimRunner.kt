package com.virginpulse.claims_automation.config

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith
import org.springframework.boot.autoconfigure.SpringBootApplication

@RunWith(Cucumber::class)
@CucumberOptions(
        features = ["src/main/resources/features"],
        glue=["com/virginpulse/claims_automation/stepdefinitions/StepDefinitions.kt"],
        tags = "not @ignored",
        dryRun = true,
        plugin = [
        "pretty",
        "html:build/reports/tests/test/cucumber.html",
        "json:build/reports/tests/test/cucumber.json",
        "junit:build/reports/tests/test/cucumber.xml"
        ]
)

@SpringBootApplication
class ClaimRunner {

}