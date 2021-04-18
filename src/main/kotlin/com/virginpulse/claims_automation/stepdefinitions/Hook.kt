package com.virginpulse.claims_automation.stepdefinitions

import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java.Scenario
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Value

@Slf4j
class Hook {

    //@Value("\${environment}")
    //private lateinit var environment: String

    @Before
    fun setUp(scenario: Scenario){
        println("${scenario.name}")
        //println(environment)
    }

    @After
    fun tearDown(scenario: Scenario){
        println("${scenario.status}")
    }
}