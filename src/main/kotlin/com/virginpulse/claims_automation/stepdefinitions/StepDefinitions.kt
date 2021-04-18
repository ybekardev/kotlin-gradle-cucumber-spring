package com.virginpulse.claims_automation.stepdefinitions

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.spring.CucumberContextConfiguration
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import java.io.File


@CucumberContextConfiguration
//@SpringBootConfiguration
@ContextConfiguration
@SpringBootTest
class StepDefinitions {

    @Test
    fun contextLoads() {
        println("Running the tests")


    }

    @Given("User navigates to the {string}")
    fun user_navigates_to_the(string: String?) {
        assertEquals(string, "website")
        println("Calling from the step...")
        val fileName = "/Users/yasinbekar/Downloads/claims_automation/src/main/resources/file.txt"
        var fileObject = File(fileName)
        // create a new file
        fileObject.writeText("Hello World!")
    }
}