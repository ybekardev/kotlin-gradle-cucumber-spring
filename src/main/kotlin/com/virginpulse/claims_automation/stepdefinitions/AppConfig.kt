package com.virginpulse.claims_automation.stepdefinitions

import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@PropertySources(value = [PropertySource("classpath:application.properties", ignoreResourceNotFound = true)])
class AppConfig {

}