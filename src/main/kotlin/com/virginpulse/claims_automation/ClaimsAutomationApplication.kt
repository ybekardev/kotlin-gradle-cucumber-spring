package com.virginpulse.claims_automation

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@RunWith(Cucumber::class)
@CucumberOptions(
        features = ["src/main/resources/features"],
        glue=["com/virginpulse/claims_automation/stepdefinitions"],
        tags = "@demo",
        dryRun = false,
        plugin = [
            "pretty",
            "html:build/reports/tests/test/cucumber.html",
            "json:build/reports/tests/test/cucumber.json",
            "junit:build/reports/tests/test/cucumber.xml"
        ]
)
@SpringBootApplication
class ClaimsAutomationApplication



/*
fun main() {
    //runApplication<ClaimsAutomationApplication>()
    println("Hello world")
}
*/
